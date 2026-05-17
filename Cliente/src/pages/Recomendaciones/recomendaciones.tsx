import { useEffect, useState } from "react";
import { apiFetch } from "../../services/api";
import TarjetaLibroReco from "../../componentes/tarjetaLibroReco";

function Recomendaciones() {
    const [libros, setLibros] = useState([]);
    const [error, setError] = useState("");
    const idUser = Number(localStorage.getItem("idUser"));

    useEffect(() => {
        const cargarLibros = async () => {
            try {
                const data = await apiFetch(`/recomendaciones/${idUser}`);

                setLibros(data);
            } catch {
                setError("Error al cargar recomendaciones");
            }
        };
        if(idUser){
            cargarLibros();
        }
    }, [idUser]);

    return(
        <main className="container my-5">
            {error && <p>{error}</p>}

            <div className="row g-4"> {libros.map((libro:any,index)=>(
                <TarjetaLibroReco key={ libro.apiLibrosId || index } libro={libro}/>
            ))}
            </div>
        </main>
    )
}

export default Recomendaciones;