import { useEffect, useState } from "react";
import ForoCard from "../../componentes/tarjetaForo";
import { apiFetch } from "../../services/api";
import { useNavigate } from "react-router-dom";
import "./foro.css";
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
        <main className="container my-5">
            <div className="cabecera-foros">
                <h1>Foros</h1>
                <div className="acciones-foros">
                    <input
                        type="text"
                        placeholder="Buscar foro"
                        value={busqueda}
                        onChange={(e) => buscarForos(e.target.value)}
                        className="buscador-foros"
                    />
                    <button
                        className="btn-crear-foro"
                        onClick={() => navigate("/crear-foro")}
                    >
                        Crear foro
                    </button>
                </div>
            </div>

            <div className="lista-foros">
                {
                    foros.map((foro) => (
                        <ForoCard
                            key={foro.idForos}
                            foro={foro}
                        />
                    ))
                }
            </div>
        </main>
    );
}

export default Foros;