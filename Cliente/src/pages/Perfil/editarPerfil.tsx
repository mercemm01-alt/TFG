import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { apiFetch } from "../../services/api";

function EditarPerfil() {

    const [formData, setFormData] = useState({
        user: "",
        contrasena: "",
        confirmarContrasena: "",
        descripcion: "",
        generos: [] as string[]
    });

    const [imagen, setImagen] = useState<File | null>(null);
    const [error, setError] = useState("");
    const [preview, setPreview] = useState("");

    const [generosDisponibles, setGenerosDisponibles] = useState<string[]>([]);

    const navigate = useNavigate();
    const idUser = Number(localStorage.getItem("idUser"));

    useEffect(() => {
        const cargarUsuario = async () => {
            try {
                const data = await apiFetch(`/verPerfil/${idUser}`);

                setFormData({
                    user: data.user,
                    contrasena: "",
                    confirmarContrasena: "",
                    descripcion: data.descripcion,
                    generos: data.generos || []
                });

                if (data.imagen) {
                    setPreview(`http://localhost:8080/img/${data.imagen}`);
                }

            } catch {
                setError("Error al cargar perfil");
            }
        };

        if (idUser) {
            cargarUsuario();
        }
    }, [idUser]);

    useEffect(() => {
        const cargarGeneros = async () => {
            try {

                const data = await apiFetch("/libros/generos");

                console.log("Generos:", data);

                setGenerosDisponibles(
                    Array.isArray(data) ? data : []
                );

            } catch (err) {
                console.error(err);
                setError("Error al cargar géneros");
            }
        };

        cargarGeneros();
    }, []);

    const handleChange = (
        e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>
    ) => {

        const { name, value } = e.target;

        setFormData(prev => ({
            ...prev,
            [name]: value
        }));
    };

    const toggleGenero = (genero: string) => {

        setFormData(prev => ({
            ...prev,

            generos: prev.generos.includes(genero)
                ? prev.generos.filter(g => g !== genero)
                : [...prev.generos, genero]
        }));
    };

    const envio = async (e: React.FormEvent) => {

        e.preventDefault();

        setError("");

        if (formData.contrasena !== formData.confirmarContrasena) {
            setError("Las contraseñas no coinciden");
            return;
        }

        try {

            const usuarioActualizar = {
                user: formData.user,
                contrasena: formData.contrasena,
                descripcion: formData.descripcion,
                generos: formData.generos
            };

            const form = new FormData();

            form.append(
                "userJson",
                JSON.stringify(usuarioActualizar)
            );

            if (imagen) {
                form.append("imagen", imagen);
            }

            await fetch(
                `http://localhost:8080/api/editarPerfil/${idUser}`,
                {
                    method: "PUT",
                    body: form
                }
            );

            navigate("/");

        } catch (err: any) {
            setError(err.message || "Error al actualizar perfil");
        }
    };

    return (
        <form onSubmit={envio}>

            <h2>Editar perfil</h2>

            {error && <p>{error}</p>}

            <div>
                <label>Nombre de usuario</label>

                <input
                    name="user"
                    value={formData.user}
                    onChange={handleChange}
                />
            </div>

            <div>
                <label>Nueva contraseña</label>

                <input
                    type="password"
                    name="contrasena"
                    value={formData.contrasena}
                    onChange={handleChange}
                />
            </div>

            <div>
                <label>Confirmar contraseña</label>

                <input
                    type="password"
                    name="confirmarContrasena"
                    value={formData.confirmarContrasena}
                    onChange={handleChange}
                />
            </div>

            <div>
                <label>Imagen</label>

                <input
                    type="file"
                    accept="image/*"
                    onChange={(e) => {

                        if (
                            e.target.files &&
                            e.target.files[0]
                        ) {

                            const file = e.target.files[0];

                            setImagen(file);
                            setPreview(
                                URL.createObjectURL(file)
                            );
                        }
                    }}
                />

                {preview && (
                    <img
                        src={preview}
                        alt="preview"
                        width="150"
                    />
                )}
            </div>

            <div>
                <label>Descripción</label>

                <textarea
                    name="descripcion"
                    value={formData.descripcion}
                    onChange={handleChange}
                />
            </div>

            <div>
                <label>Géneros</label>

                <div>
                    {generosDisponibles.map(g => (

                        <button
                            key={g}
                            type="button"
                            onClick={() => toggleGenero(g)}
                            style={{
                                margin: "5px",
                                backgroundColor:
                                    formData.generos.includes(g)
                                        ? "#6c757d"
                                        : "#e9ecef"
                            }}
                        >
                            {g}
                        </button>

                    ))}
                </div>
            </div>

            <button type="submit">
                Guardar cambios
            </button>

        </form>
    );
}

export default EditarPerfil;