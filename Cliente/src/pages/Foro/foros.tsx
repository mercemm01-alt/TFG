import { useEffect, useState } from "react";
import ForoCard from "../../componentes/tarjetaForo";
import { apiFetch } from "../../services/api";
import { useNavigate } from "react-router-dom";

function Foros() {

    const navigate = useNavigate();
    const [foros, setForos] = useState<any[]>([]);
    const [busqueda, setBusqueda] = useState("");

    useEffect(() => {cargarForos();}, []);

    const cargarForos = async () => {
        try {
            const data = await apiFetch( "/foro?idUser=1");
            setForos(data);
        } catch(error) {
            console.log(error);
        }
    }

    const buscarForos = async (texto: string) => {
        setBusqueda(texto);

        try {
            const data = await apiFetch(`/foro/buscar?nombre=${texto}&idUser=1`);
            setForos(data);
        } catch(error) {
            console.log(error);
        }
    }

    return (
        <div>
            <h1>Foros</h1>

            <input type="text" placeholder="Buscar foro" value={busqueda}
                onChange={(e) => buscarForos(e.target.value)}
            />

            <button onClick={() => navigate("/crear-foro")}> Crear foro </button>

            <div>
                {foros.map((foro) => (
                    <ForoCard key={foro.idForos} foro={foro}/>
                ))}
            </div>
        </div>
    )
}

export default Foros;