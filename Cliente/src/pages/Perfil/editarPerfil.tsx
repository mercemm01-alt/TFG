import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { apiFetch } from "../../services/api";
import "./editarPerfil.css";
function EditarPerfil() {
    const BACKEND_URL = "https://tfg-z11h.onrender.com";
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
    const [mostrarConfirmacionEliminar, setMostrarConfirmacionEliminar] = useState(false);
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
                    setPreview(`${BACKEND_URL}/img/${data.imagen}`);
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
                setGenerosDisponibles(Array.isArray(data) ? data : []);

            } catch (err) {
                console.error(err);
                setError("Error al cargar géneros");
            }
        };

        cargarGeneros();
    }, []);

    const handleChange = (e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>) => {

        const { name, value } = e.target;
        setFormData(prev => ({
            ...prev,
            [name]: value
        }));
    };

    const toggleGenero = (genero: string) => {

        setFormData(prev => ({
            ...prev,
            generos: prev.generos.includes(genero) ? prev.generos.filter(g => g !== genero) : [...prev.generos, genero]
        }));
    };

    const envio = async (e: React.FormEvent) => { e.preventDefault();

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

            form.append("userJson", JSON.stringify(usuarioActualizar));

            if (imagen) {
                form.append("imagen", imagen);
            }

            await fetch(`${BACKEND_URL}/api/editarPerfil/${idUser}`,
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

    const eliminarCuenta = async () => {
        try {
            await apiFetch(`/usuario/${idUser}`,
                {
                    method: "DELETE"
                }
            );
            localStorage.clear();
            navigate("/login", { replace: true });
        } catch (error) {
            console.error("ERROR:", error);
            setError("Error al eliminar la cuenta");
        }
    };

    return (
        <form className="editar-perfil-form" onSubmit={envio}>

            <h2>Editar perfil</h2>
            {
                error && (
                    <p className="mensaje-error"> {error}</p>
                )
            }

            {/* IMAGEN */}
            <div className="campo-formulario-imagen">
                {
                    preview && (
                        <img className="preview-imagen" src={preview} alt="Vista previa"/>
                    )
                }

                <input type="file" accept="image/*"
                    onChange={(e) => {
                        
                        if (e.target.files && e.target.files[0]) {

                            const file = e.target.files[0];
                            setImagen(file);
                            setPreview( URL.createObjectURL(file));
                        }
                    }}
                />
            </div>

            {/* USUARIO */}
            <div className="campo-formulario">
                <label htmlFor="user"> Nombre de usuario</label>
                <input
                    id="user"
                    type="text"
                    name="user"
                    value={formData.user}
                    onChange={handleChange}
                />

            </div>

            {/* CONTRASEÑA */}
            <div className="campo-formulario">
                <label htmlFor="password"> Nueva contraseña</label>
                <input
                    id="password"
                    type="password"
                    name="contrasena"
                    value={formData.contrasena}
                    onChange={handleChange}
                />

            </div>

            {/* CONFIRMAR CONTRASEÑA */}
            <div className="campo-formulario">
                <label htmlFor="passConfirm"> Confirmar contraseña</label>
                <input
                    id="passConfirm"
                    type="password"
                    name="confirmarContrasena"
                    value={formData.confirmarContrasena}
                    onChange={handleChange}
                />

            </div>

            {/* DESCRIPCION */}
            <div className="campo-formulario">
                <label htmlFor="descrip">  Descripción</label>
                <textarea
                    id="descrip"
                    name="descripcion"
                    value={formData.descripcion}
                    onChange={handleChange}
                />
            </div>

            {/* GENEROS */}
            <div className="campo-formulario">

                <label htmlFor="generosFav">Géneros favoritos</label>
                <div className="lista-generos" >
                    {
                        generosDisponibles.map(
                            (genero) => (
                                <button key={genero} type="button"
                                    className={
                                        formData.generos.includes( genero ) ? "btn-genero activo": "btn-genero"
                                    }
                                    onClick={() =>
                                        toggleGenero(genero)
                                    }
                                >
                                    {genero}
                                </button>
                            )
                        )
                    }
                </div>
            </div>

            <div className="acciones-perfil">
                <button type="submit" className="btn-guardar-perfil"> Guardar cambios</button>
                <button type="button" className="btn-eliminar-cuenta" onClick={() => setMostrarConfirmacionEliminar(true)}>Eliminar cuenta</button>
            </div>
            {
                mostrarConfirmacionEliminar && (
                    <div
                        className="modal-overlay"
                        onClick={() =>  setMostrarConfirmacionEliminar(false)}
                    >

                        <div
                            className="modal-confirmacion"
                            onClick={(e) =>e.stopPropagation()}
                        >

                            <h3> Eliminar cuenta </h3>
                            <p> ¿Seguro que deseas eliminar tu cuenta? Esta acción no se puede deshacer. </p>

                            <div className="acciones-modal">
                                <button
                                    type="button"
                                    className="btn-cancelar"
                                    onClick={() =>
                                        setMostrarConfirmacionEliminar(false)
                                    }
                                >
                                    Cancelar
                                </button>

                                <button
                                    type="button"
                                    className="btn-confirmar-eliminar"
                                    onClick={async () => {await eliminarCuenta();
                                        setMostrarConfirmacionEliminar(false);
                                    }}
                                > Eliminar </button>
                            </div>
                        </div>
                    </div>
                )
            }
        </form>
    );
}

export default EditarPerfil;