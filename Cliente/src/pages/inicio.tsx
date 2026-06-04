import { useEffect, useState } from "react";
import { apiFetch } from "../services/api";
import type { UserPerfilDTO } from "../types/verPerfilDto";
import { Link } from "react-router-dom";
import "./inicio.css";
function Inicio() {

    const [user, setUser] = useState<UserPerfilDTO | null>(null);
    const [lecturaActual, setLecturaActual] = useState<any>(null);
    const [ultimasLecturas, setUltimasLecturas] = useState<any[]>([]);
    const [error, setError] = useState("");
    const BACKEND_URL = "https://tfg-1-d2h7.onrender.com/api";
    const idUser = Number(localStorage.getItem("idUser"));

    useEffect(() => {
        const cargarDatos = async () => {
            try {
                
                const perfil = await apiFetch(`/verPerfil/${idUser}`);
                setUser(perfil);

                const lectura = await apiFetch(`/mis-libros/lectura-actual/${idUser}`);
                setLecturaActual(lectura);

                const ultimas = await apiFetch(`/mis-libros/ultimas-lecturas/${idUser}`);
                setUltimasLecturas(ultimas);

            } catch (err) {

                console.error(err);
                setError("Error al cargar perfil");

            }
        };

        if (idUser) {
            cargarDatos();
        }

    }, [idUser]);

    if (error) return <p>{error}</p>;
    if (!user) return <p>Cargando...</p>;

    return (
        <main className="container my-5">

            <div className="main-superior row g-2">

                {/* PERFIL */}
                <div className="col-6 col-md-4 col-lg-4 col-xl-3 perfil">
                <div className="nom-perfil">
                    <h2 className="user">{user.user}</h2>
                </div>

                <div className="img-perfil">
                    <img src={
                            user.imagen ? `${BACKEND_URL}/img/${user.imagen}` : "/Recursos/Img/default.jpg"}
                        alt="Img Perfil"
                    />
                </div>
                </div>

                {/* INFO */}
                <div className="col-6 col-md-8 col-lg-3 col-xl-4 info-perfil">
                <div className="btns-perfil">
                    <Link className="bt-perfil" to="/editarPerfil">Editar Perfil</Link>
                    <Link className="bt-perfil" to="/mis-libros">Mis Libro</Link>
                    <Link className="bt-perfil" to="/foro">Foro</Link>
                </div>

                <div className="descripcion">
                    {user.descripcion}
                </div>
                </div>

                {/* LECTURA ACTUAL */}
                <div className="col-12 col-lg-5 col-xl-4 lectura-actual">
                    <h3>Lectura Actual</h3>
                    {
                        lecturaActual ? (
                            <Link to={`/libro/${lecturaActual.idLibro}`}  className="link-ultima-lectura">
                                <div className="card-lectura-actual">
                                    <img
                                        src={lecturaActual.imagen}
                                        alt={lecturaActual.titulo}
                                    />
                                    <h4>{lecturaActual.titulo}</h4>
                                    <p>{lecturaActual.autor}</p>
                                </div>
                            </Link>
                        ) : (
                            <p>No tienes ninguna lectura en curso</p>
                        )
                    }
                </div>
            </div>

            {/* LIBROS INICIADOS (placeholder) */}
            <section className="recomen row">
                <h2>ÚLTIMAS LECTURAS</h2>
                {
                    ultimasLecturas.length > 0 ? (
                        <div className="ultimas-lecturas-lista">
                            {
                                ultimasLecturas.map((libro) => (

                                    <Link key={libro.idLibro} to={`/libro/${libro.idLibro}`} className="link-ultima-lectura">
                                        <div className="card-ultima-lectura">
                                            <img
                                                src={libro.imagen}
                                                alt={libro.titulo}
                                            />
                                            <h4>{libro.titulo}</h4>
                                            <p>{libro.autor}</p>
                                        </div>
                                    </Link>
                                ))
                            }
                        </div>
                    ) : (
                        <p className="sin-lecturas">  Aún no hay lecturas terminadas</p>
                    )
                }
            </section>
        </main>
    );
}

export default Inicio;