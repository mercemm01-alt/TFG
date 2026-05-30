import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { apiFetch } from "../../services/api";
import "./infoLibros.css";

function InfoLibro() {

    const { id } = useParams();

    const [libro, setLibro] = useState<any>(null);
    const [error, setError] = useState("");
    const [estado, setEstado] = useState("");

    useEffect(() => {

        const cargarLibro = async () => {

            try {

                const data = await apiFetch(`/libros/${id}`);

                setLibro(data);

                const idUser = Number(
                    localStorage.getItem("idUser")
                );

                const respuesta = await apiFetch(`/mis-libros/${id}/estado?idUser=${idUser}`);

                setEstado(respuesta.estado || "");

            } catch (err) {

                console.error(err);
                setError("Error al cargar libro");

            }
        };

        if (id) {
            cargarLibro();
        }

    }, [id]);

    const cambiarEstado = async (
        e: React.ChangeEvent<HTMLSelectElement>
    ) => {

        const nuevoEstado = e.target.value;

        setEstado(nuevoEstado);

        const idUser = Number(
            localStorage.getItem("idUser")
        );

        try {

            await apiFetch(
                `/mis-libros/${id}/estado?idUser=${idUser}&estado=${nuevoEstado}`,
                {
                    method: "POST"
                }
            );

            console.log("Estado guardado");

        } catch (error) {

            console.error(error);

        }
    };

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

                        <select
                            value={estado}
                            onChange={cambiarEstado}
                        >

                            <option value="">
                                Estado
                            </option>

                            <option value="PENDIENTE">
                                Pendiente
                            </option>

                            <option value="LEYENDO">
                                Leyendo
                            </option>

                            <option value="LEIDO">
                                Leído
                            </option>

                        </select>

                    </div>

                    <div className="contenido-derecha">

                        <div className="sinopsis">

                            <h4>Sinopsis</h4>

                            <p>
                                {
                                    libro.sinopsis ||
                                    "Sin sinopsis disponible"
                                }
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