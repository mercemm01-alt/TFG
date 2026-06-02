import { useEffect, useState } from "react";
import TarjetaForo from "../../componentes/tarjetaForo";
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
            const data = await apiFetch(`/foro?idUser=${localStorage.getItem("idUser")}`);
            setForos(data);
        } catch(error) {
        }
    }

    const buscarForos = async (texto: string) => {
        setBusqueda(texto);

        try {
            const data = await apiFetch(`/foro/buscar?nombre=${texto}&idUser=${localStorage.getItem("idUser")}`);
            setForos(data);
        } catch(error) {
        }
    }

    return (
        <main className="container my-5">
            <div className="contenedor-buscador-foros">
                <input
                    type="text"
                    placeholder="Buscar foro..."
                    value={busqueda}
                    onChange={(e) =>
                        buscarForos(e.target.value)
                    }
                    className="buscador-foros"
                />
            </div>

            {/* CABECERA */}
            <div className="cabecera-foros">
                <h1 className="titulo-foros"> Foros </h1>
                <button className="btn-crear-foro" onClick={() => navigate("/crear-foro")}>
                    Crear foro
                </button>
            </div>

            {/* LISTA DE FOROS */}
            {
                foros.length > 0 ? (

                    <div className="lista-foros">
                        {
                            foros.map((foro) => (
                                <TarjetaForo key={foro.idForos} foro={foro} onEliminar={cargarForos}/>
                            ))
                        }
                    </div>
                ) : (
                    <div className="sin-foros">
                        <p> Aún no hay ningún foro creado. </p>
                    </div>
                )
            }
        </main>
    );
}

export default Foros;