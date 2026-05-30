import { useEffect, useState } from "react";
import { useParams } from "react-router-dom"
import { apiFetch } from "../../services/api";
import MensajeCard from "../../componentes/tarjetaMensaje";
import "./foroChat.css";
function ForoChat() {
    const { idForo } = useParams();
    const [mensajes, setMensajes] =useState<any[]>([]);
    const [contenido, setContenido] = useState("");
    const idUser = localStorage.getItem("idUser");

    useEffect(() => {cargarMensajes();

        const interval = setInterval(()=>{
            cargarMensajes();
        }, 2000);
        return () => clearInterval(interval);
    }, []);

    const cargarMensajes = async () => {
        const data = await apiFetch( `/mensaje-foro/${idForo}?idUser=${idUser}`);

        setMensajes(data);
    }

    const enviarMensaje = async () => {
        if (!contenido.trim()) return;

        setContenido("");

        // Enviar al servidor
        try {
            const mensajeCreado = await apiFetch(`/mensaje-foro?idUser=${idUser}`,
                {
                    method: "POST",
                    body: JSON.stringify({
                        idForo,
                        contenido
                    })
                }
            );
            // Agregar el mensaje devuelto por el servidor directamente
            setMensajes([...mensajes, mensajeCreado]);
        } catch (error) {
            console.error("Error al enviar mensaje:", error);
            // Aquí podrías mostrar un error al usuario
        }
    }

    return (
        <div>
            <h2>Chat foro</h2>
            <div>{mensajes.map((mensaje) => (
                    <MensajeCard key={mensaje.idMensaje} mensaje={mensaje}/>
                ))}
            </div>

            <input type="text" value={contenido}
                onChange={(e) => setContenido(e.target.value)}
            />

            <button onClick={enviarMensaje}> Enviar </button>
        </div>
    )
}

export default ForoChat;