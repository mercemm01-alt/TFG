type Props = {
    mensaje: any;
}

function TarjetaMensaje({mensaje}: Props) {

    return (
        <div style={{textAlign: mensaje.esMio ? "right" : "left" }}>
            <strong> {mensaje.username} </strong>

            {mensaje.esCreador &&<span> @creador</span>}

            <p> {mensaje.contenido} </p>
        </div>
    )
}

export default TarjetaMensaje;