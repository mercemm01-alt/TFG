import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { apiFetch } from "../../services/api";
import type { UserDTO } from '../../types/editPerfilDto';
//import "./editarPerfil.css";

function EditarPerfil() {

    const [formData, setFormData] = useState<UserDTO>({
        idUser: 0,
        user: "",
        contrasena: "",
        imagen: "",
        descripcion: "",
        generos: []
    });

    const [generoInput, setGeneroInput] = useState("");
    const [error, setError] = useState("");

    const navigate = useNavigate();

    const idUser = Number(localStorage.getItem("idUser"));

    useEffect(() => {
        const cargarUsuario = async () => {
        try {
            const data = await apiFetch(`/usuarios/${idUser}`);
            setFormData(data);
        } catch (err: any) {
            setError("Error al cargar el perfil");
        }
        };

        if (idUser) cargarUsuario();
    }, [idUser]);

    const handleChange = (e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>) => {
        const { name, value } = e.target;

        setFormData({
        ...formData,
        [name]: value
        });
    };

    const addGenero = () => {
        if (generoInput && !formData.generos.includes(generoInput)) {
        setFormData({
            ...formData,
            generos: [...formData.generos, generoInput]
        });
        setGeneroInput("");
        }
    };

    const removeGenero = (genero: string) => {
        setFormData({
        ...formData,
        generos: formData.generos.filter(g => g !== genero)
        });
    };

    const envio = async (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        setError("");

        try {
        const data = await apiFetch(`/usuarios/${idUser}`, {
            method: "PUT",
            body: JSON.stringify(formData)
        });

        console.log("ACTUALIZADO:", data);

        navigate("/"); // o perfil

        } catch (err: any) {
        setError(err.message || "Error al actualizar perfil");
        }
    };

    return (
        <form onSubmit={envio}>

        <h2>Editar perfil</h2>

        {error && <p>{error}</p>}

        {/* Usuario */}
        <div>
            <label>Nombre de usuario:</label>
            <input
            type="text"
            name="user"
            value={formData.user}
            onChange={handleChange}
            />
        </div>

        {/* Contraseña */}
        <div>
            <label>Contraseña:</label>
            <input
            type="password"
            name="contrasena"
            value={formData.contrasena}
            onChange={handleChange}
            />
        </div>

        {/* Imagen */}
        <div>
            <label>Imagen (URL):</label>
            <input
            type="text"
            name="imagen"
            value={formData.imagen}
            onChange={handleChange}
            />
        </div>

        {/* Descripción */}
        <div>
            <label>Descripción:</label>
            <textarea
            name="descripcion"
            value={formData.descripcion}
            onChange={handleChange}
            />
        </div>

        {/* Géneros */}
        <div>
            <label>Géneros:</label>

            <input
            type="text"
            value={generoInput}
            onChange={(e) => setGeneroInput(e.target.value)}
            />
            <button type="button" onClick={addGenero}>
            Añadir
            </button>

            <ul>
            {formData.generos.map((g, index) => (
                <li key={index}>
                {g}
                <button type="button" onClick={() => removeGenero(g)}>
                    X
                </button>
                </li>
            ))}
            </ul>
        </div>

        <button type="submit">Guardar cambios</button>

        </form>
    );
}

export default EditarPerfil;