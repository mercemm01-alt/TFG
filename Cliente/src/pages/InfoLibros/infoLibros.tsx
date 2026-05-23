import { useEffect,useState } from "react";
import { useParams } from "react-router-dom";
import { apiFetch } from "../../services/api";
import "./infoLibros.css";

function InfoLibro(){

    const {id}=useParams();
    const [libro,setLibro]=useState<any>(null);
    const [error,setError]=useState("");

    useEffect(()=>{
        const cargarLibro=async()=>{
            try{
                const data= await apiFetch(`/libros?id=/${id}`);
                console.log("DATA:",data);

                setLibro(data);
            }catch{
                setError("Error al cargar libro");
            }
        };

        if(id){cargarLibro();}

    },[id]);

    //if(error) return <p>{error}</p>;

    if(!libro) return <p>Cargando...</p>;

    return(
        <main className="container my-5">
            <div>
                <article className="ficha-libro row g-2">
                    <div className="col-6 col-md-3 tj-libro">
                        <img src={libro.imagen} alt={libro.titulo}/>
                    </div>

                    <div className="col-6 col-md-6 info-libro">
                        <h3>{libro.titulo}</h3>

                        <table className="info">
                            <tbody>
                                <tr>
                                    <th>Autor:</th>
                                    <td> {libro.autores?.join(", ") ||"Desconocido"}</td>
                                </tr>

                                <tr>
                                    <th>Género:</th>
                                    <td> {libro.generos?.join(", ") ||"Sin género"}</td>
                                </tr>

                                <tr>
                                    <th>Valoración:</th>
                                    <td>{libro.valoracion || "Sin datos"}</td>
                                </tr>

                                <tr>
                                    <th>Número páginas:</th>
                                    <td>{libro.paginas || "Sin datos"}</td>
                                </tr>

                                <tr>
                                    <th>Tipo:</th>
                                    <td>{libro.tipo || "Libro"}</td>
                                </tr>

                                <tr>
                                    <th>Mi valoración:</th>
                                    <td>☆☆☆☆☆</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <div className="parte-inferior">
                        <div className="estado-libro">
                            <select>
                                <option> Estado</option>
                                <option>Pendiente</option>
                                <option>Leyendo</option>
                                <option>Leído</option>
                            </select>
                        </div>

                        <div className="sinopsis">
                            <p>{libro.sinopsis || "Sin sinopsis disponible"}</p>
                        </div>
                    </div>

                    <div className="notas">
                        <input type="text" placeholder="Notas:"/>
                    </div>
                </article>
            </div>
        </main>
    );
}

export default InfoLibro;