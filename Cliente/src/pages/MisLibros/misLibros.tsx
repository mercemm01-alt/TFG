import { useEffect, useState } from "react";
import { apiFetch } from "../../services/api";
import TarjetaLibroReco from "../../componentes/tarjetaLibroReco";

function MisLibros() {

    const [libros, setLibros] = useState<any[]>([]);
    const [error, setError] = useState("");
    const idUser = Number(localStorage.getItem("idUser"));

    useEffect(() => {
        const cargarLibros = async () => {
            try {
                const data = await apiFetch(`/mis-libros/${idUser}`);
                setLibros(data);
            } catch (error) {
                console.error(error);
                setError("Error al cargar mis libros");
            }
        };

        if(idUser){cargarLibros();}
    }, [idUser]);

    return (
        <main className="container my-5">
            <div className="info-bt">
                <p> <b>Cantidad </b> {libros.length} </p>
            </div>

            {error && <p>{error}</p>}

            <div className="row g-4">
                {
                    libros.map((libro, index) => (

                        <TarjetaLibroReco key={libro.idLibro || index} libro={libro}/>

                    ))
                }
            </div>
        </main>

    );
}

export default MisLibros;