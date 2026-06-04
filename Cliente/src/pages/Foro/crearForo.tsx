import { useState, useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { apiFetch } from "../../services/api";
import "./crearForo.css";

function CrearForo() {

    const navigate = useNavigate();
    const { idForo } = useParams();
    const BACKEND_URL = "https://tfg-z11h.onrender.com";
    const [nombre, setNombre] = useState("");
    const [descripcion, setDescripcion] = useState("");
    const [imagen, setImagen] = useState<File | null>(null);
    const [preview, setPreview] = useState("");

    useEffect(() => {
        
        const cargarForo = async () => {

            if (!idForo) return;

            try {
                const data = await apiFetch(`/foro/${idForo}?idUser=${localStorage.getItem("idUser")}`);

                setNombre(data.nombre);
                setDescripcion(data.descripcion);

                if (data.img) {
                    setPreview(`${BACKEND_URL}/img/${data.img}`);
                }

            } catch (error) {
                console.error(error);
            }
        };
        cargarForo();
    }, [idForo]);

    const crearForo = async () => {

        try {
            const foro = { nombre, descripcion};
            const form = new FormData();

            form.append("foroJson", JSON.stringify(foro));

            if (imagen) {
                form.append("imagen", imagen);
            }

            const url = idForo ? `${BACKEND_URL}/api/foro/${idForo}?idUser=${localStorage.getItem("idUser")}`
                : `${BACKEND_URL}/api/foro?idUser=${localStorage.getItem("idUser")}`;

            const metodo = idForo ? "PUT"
                : "POST";

            const respuesta = await fetch(
                url,
                {
                    method: metodo,
                    body: form
                }
            );

            if (!respuesta.ok) {
                throw new Error("Error al crear el foro");
            }
            navigate("/foro");

        } catch (error) {
            console.error(error);
        }
    };

    return (
        <div className="crear-foro">
            <h1> { idForo ? "Editar foro" : "Crear foro"} </h1>

            {
                preview && ( <img className="preview-imagen" src={preview} alt="Vista previa" />)
            }

            <label htmlFor="nombreForo"> Nombre del foro </label>
            <input
                id="nombreForo"
                type="text"
                placeholder="Nombre"
                value={nombre}
                onChange={(e) =>
                    setNombre(e.target.value)
                }
            />

            <label htmlFor="descripcionForo"> Descripción </label>
            <textarea
                id="descripcionForo"
                placeholder="Descripción"
                value={descripcion}
                onChange={(e) =>
                    setDescripcion(
                        e.target.value
                    )
                }
            />

            <label htmlFor="imagenForo"> Imagen </label>
            <input
                id="imagenForo"
                type="file"
                accept="image/*"
                onChange={(e) => {

                    const archivo = e.target.files?.[0];

                    if (!archivo) return;

                    setImagen(archivo);
                    setPreview( URL.createObjectURL(archivo) );
                }}
            />

            <button type="button" onClick={crearForo}>
                { idForo ? "Guardar cambios" : "Crear foro" }
            </button>
        </div>
    );
}

export default CrearForo;