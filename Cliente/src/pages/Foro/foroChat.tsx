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
        <div className="foro-chat">
            <h2>Chat del foro</h2>

            <div className="chat-mensajes">
                {
                    mensajes.length > 0 ? (
                        mensajes.map((mensaje) => (
                            <MensajeCard key={mensaje.idMensaje} mensaje={mensaje}/>
                        ))
                    ) : (
                        <p className="chat-vacio"> Aún no hay mensajes en este foro.</p>
                    )
                }
            </div>

            <div className="chat-envio">
                <input
                    className="chat-input"
                    type="text"
                    placeholder="Escribe un mensaje..."
                    value={contenido}
                    onChange={(e) =>
                        setContenido(e.target.value)
                    }
                />

                <button className="btn-enviar" onClick={enviarMensaje}>Enviar</button>
            </div>
        </div>
    )
}

export default ForoChat;