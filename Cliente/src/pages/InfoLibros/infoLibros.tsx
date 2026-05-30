import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { apiFetch } from "../../services/api";
import "./infoLibros.css";

function InfoLibro() {

    const { id } = useParams();

    const [libro, setLibro] = useState<any>(null);
    const [error, setError] = useState("");

    useEffect(() => {

        const cargarLibro = async () => {

            try {

                const data = await apiFetch(`/libros/${id}`);

                console.log("DATA:", data);

                setLibro(data);

            } catch (err) {

                console.error(err);
                setError("Error al cargar libro");

            }
        };

        if (id) {
            cargarLibro();
        }

    }, [id]);

    if (error) {
        return <p>{error}</p>;
    }

    if (!libro) {
        return <p>Cargando...</p>;
    }

    return (
        <main className="container my-5">

            <article className="ficha-libro">

                <div className="cabecera-libro">

                    <div className="portada-libro">
                        <img
                            src={libro.imagen}
                            alt={libro.titulo}
                        />
                    </div>

                    <div className="datos-libro">

                        <h2>{libro.titulo}</h2>

                        <table className="info">
                            <tbody>

                                <tr>
                                    <th>Autor:</th>
                                    <td>{libro.autor || "Desconocido"}</td>
                                </tr>

                                <tr>
                                    <th>Género:</th>
                                    <td>
                                        {
                                            libro.generos?.length > 0
                                                ? libro.generos.join(", ")
                                                : "Sin género"
                                        }
                                    </td>
                                </tr>

                                <tr>
                                    <th>Valoración:</th>
                                    <td>{libro.valoracion || "Sin datos"}</td>
                                </tr>

                                <tr>
                                    <th>Número páginas:</th>
                                    <td>{libro.numPaginas || "Sin datos"}</td>
                                </tr>

                                <tr>
                                    <th>Editorial:</th>
                                    <td>{libro.editorial || "Sin datos"}</td>
                                </tr>

                                <tr>
                                    <th>Fecha publicación:</th>
                                    <td>{libro.fechaPublicacion || "Sin datos"}</td>
                                </tr>

                                <tr>
                                    <th>Mi valoración:</th>
                                    <td>☆☆☆☆☆</td>
                                </tr>

                            </tbody>
                        </table>

                    </div>

                </div>

                <div className="parte-inferior">

                    <div className="estado-libro">

                        <select>
                            <option>Estado</option>
                            <option>Pendiente</option>
                            <option>Leyendo</option>
                            <option>Leído</option>
                        </select>

                    </div>

                    <div className="contenido-derecha">

                        <div className="sinopsis">

                            <h4>Sinopsis</h4>

                            <p>
                                {libro.sinopsis || "Sin sinopsis disponible"}
                            </p>

                        </div>

                        <div className="notas">

                            <input
                                type="text"
                                placeholder="Notas:"
                            />

                        </div>

                    </div>

                </div>

            </article>

        </main>
    );
}

export default InfoLibro;