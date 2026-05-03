import { useState } from "react";
import { Link } from "react-router-dom";
import "./header.css";

function Header() {

    const [menuAbierto, setMenuAbierto] = useState(false);

    const abrirMenu = () => setMenuAbierto(true);
    const cerrarMenu = () => setMenuAbierto(false);

    return (
        <header>

            {/* Banner */}
            <div className="banner">
                <img src="/Recursos/Img/bannerConLogo.png" alt="banner" />
            </div>

            {/* Navbar */}
            <nav className="navbar navbar-expand-lg">
                <div className="menu">

                    {/* Logo */}
                    <Link to="/" className="logo">
                        <img src="/Recursos/Img/Logo22.png" alt="Logo 22" />
                    </Link>

                    {/* Botón abrir */}
                    <button onClick={abrirMenu} className="abrir-menu">
                        <svg className="icono-menu" viewBox="0 0 16 16">
                            <path
                                fillRule="evenodd"
                                d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 
                                0 0 1-.5-.5m0-4a.5.5 0 0 1 .5-.5h10a.5.5 
                                0 0 1 0 1H3a.5.5 0 0 1-.5-.5m0-4a.5.5 
                                0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5"
                            />
                        </svg>
                    </button>

                    {/* Menú */}
                    <div className={`links ${menuAbierto ? "visible" : ""}`}>

                        {/* Botón cerrar */}
                        <button onClick={cerrarMenu} className="cerrar-menu">
                            <svg className="icono-x" viewBox="0 0 16 16">
                                <path d="M2.146 2.854a.5.5 0 1 1 .708-.708L8 7.293l5.146-5.147a.5.5 
                                0 0 1 .708.708L8.707 8l5.147 5.146a.5.5 
                                0 0 1-.708.708L8 8.707l-5.146 5.147a.5.5 
                                0 0 1-.708-.708L7.293 8z"/>
                            </svg>
                        </button>

                        {/* Links */}
                        <Link to="/" className="link-nav">Inicio</Link>
                        <Link to="/misLibros" className="link-nav">Mis Libros</Link>
                        <Link to="/recomendaciones" className="link-nav">Recomendaciones</Link>
                        <Link to="/foro" className="link-nav">Foro</Link>

                        {/* Buscador */}
                        <form className="buscador">
                            <input className="bus" type="search" placeholder="Nombre del libro" />
                            <button type="submit" className="lupa">
                                <img src="/Recursos/svg/lupa.svg" alt="lupa" />
                            </button>
                        </form>

                    </div>
                </div>
            </nav>
        </header>
    );
}

export default Header;