import { useNavigate } from "react-router-dom";
import "./tarjetaForo.css";
type Props = {
    foro: any;
}
function TarjetaForo({foro}: Props) {

    const navigate = useNavigate();

    return (
        <div onClick={() => navigate(`/foro/${foro.idForos}`)}>
            <img  src={foro.img || "/default-foro.png"} width="100"/>

            <h3>{foro.nombre}</h3>

            <p>{foro.descripcion}</p>
        </div>
    )
}


export default TarjetaForo;