import { useEffect, useState } from "react";
import { apiFetch } from "../services/api";
import type { UserPerfilDTO } from "../types/verPerfilDto";

function Inicio() {

    const [user, setUser] = useState<UserPerfilDTO | null>(null);
    const [error, setError] = useState("");

    const idUser = Number(localStorage.getItem("idUser"));

    useEffect(() => {
        const cargarPerfil = async () => {
        try {
            const data = await apiFetch(`/verPerfil/${idUser}`);
            setUser(data);
        } catch (err: any) {
            setError("Error al cargar perfil");
        }
        };

        if (idUser) cargarPerfil();
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
                        user.imagen ? `http://localhost:8080/img/${user.imagen}` : "/Recursos/Img/default.jpg"}
                    alt="Img Perfil"
                />
            </div>
            </div>

            {/* INFO */}
            <div className="col-6 col-md-8 col-lg-3 col-xl-4 info-perfil">
            <div className="btns-perfil">
                <a className="bt-perfil" href="/misLibros">Mis Libros</a>
                <a className="bt-perfil" href="/foro">Foros</a>
            </div>

            <div className="descripcion">
                {user.descripcion}
            </div>
            </div>

            {/* LECTURA ACTUAL (placeholder de momento) */}
            <div className="col-12 col-lg-5 col-xl-4 lectura-actual">
            <h3>Lectura Actual</h3>
            <img src="/Recursos/Img/Casa-de-tierra-y-sangre.jpg" alt="Lectura actual" />
            <p className="titulo">Próximamente dinámico</p>
            </div>

        </div>

        {/* LIBROS INICIADOS (placeholder) */}
        <section className="recomen row">
            <h2>LECTURAS INICIADAS</h2>
            <div className="reco-lista">
            <p>Próximamente dinámico...</p>
            </div>
        </section>

        </main>
    );
}

export default Inicio;