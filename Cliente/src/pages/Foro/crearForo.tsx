import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { apiFetch } from "../../services/api";
import "./crearForo.css";
function CrearForo() {

    const navigate = useNavigate();
    const [nombre, setNombre] = useState("");
    const [descripcion, setDescripcion] = useState("");
    const [img, setImg] = useState("");
    const crearForo = async () => {
        await apiFetch("/foro?idUser=1",
            {
                method: "POST",
                body: JSON.stringify({
                    nombre,
                    descripcion,
                    img
                })
            }
        );
        navigate("/foro");
    }

    return (
        <div>
            <h1>Crear foro</h1>

            <input type="text" placeholder="Nombre" value={nombre}
                onChange={(e) => setNombre(e.target.value)
                }
            />

            <textarea placeholder="Descripción" value={descripcion}
                onChange={(e) => setDescripcion(e.target.value) }
            />

            <input type="text" placeholder="Imagen" value={img}
                onChange={(e) => setImg(e.target.value)}
            />

            <button onClick={crearForo}> Crear </button>
        </div>
    )
}

export default CrearForo;