import { Link } from "react-router-dom";
import "./tarjetaLibroReco.css";

type Props={ libro:any }

function TarjetaLibroReco({libro}:Props){
    return(
        <article className="col-12 col-md-6 col-xl-3">
            <Link to={`/libro/${encodeURIComponent(libro.apiLibrosId)}`}>
                <div className="tj-libros">
                    <img src={libro.imagen} alt={libro.titulo}/>

                    <h3> {libro.titulo} </h3>

                    <p> <b>Autor:</b> {libro.autores?.[0] || "Desconocido" }</p>

                    <p> <b>Género:</b> { libro.generos?.[0] || "Sin género" }</p>
                </div>
            </Link>
        </article>
    )
}

export default TarjetaLibroReco;