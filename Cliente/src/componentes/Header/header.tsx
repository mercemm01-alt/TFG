import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { apiFetch } from "../../services/api";
import "./header.css";

function Header() {

    const [menuAbierto, setMenuAbierto] = useState(false);
    const [busqueda, setBusqueda] = useState(""); 
    const [sugerencias, setSugerencias] = useState<any[]>([]);
    const navigate = useNavigate();

    const abrirMenu = () => setMenuAbierto(true);
    const cerrarMenu = () => setMenuAbierto(false);

    const buscarLibros = async (texto: string) => { 
        setBusqueda(texto); 
        
        if (texto.length < 2) { 
            setSugerencias([]); return; 
        } 
        try { 
            const data = await apiFetch( `/libros/sugerencias?titulo=${texto}` ); 
            setSugerencias(data); 

        } catch (error) { 
            console.error(error); 
        } }; 
        
        const seleccionarLibro = (idLibro: number) => { 
            setBusqueda(""); 
            setSugerencias([]); 
            navigate(`/libro/${idLibro}`); 
        };

        const cerrarSesion = () => {

            localStorage.clear();

            navigate("/");
        };

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
                    <Link to="/inicio" className="logo">
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
                        <Link to="/inicio" className="link-nav">Inicio</Link>
                        <Link to="/mis-libros" className="link-nav">Mis Libros</Link>
                        <Link to="/recomendaciones" className="link-nav">Recomendaciones</Link>
                        <Link to="/foro" className="link-nav">Foro</Link>
                        <button className="btn-cerrar-sesion" onClick={cerrarSesion}> Cerrar sesión </button>

                        {/* Buscador */}
                        <div className="contenedor-buscador">
                            <form className="buscador" onSubmit={(e) => e.preventDefault()} > 
                                <input 
                                    className="bus" 
                                    type="search" 
                                    placeholder="Título del libro" 
                                    value={busqueda} onChange={(e) => 
                                    buscarLibros(e.target.value) } 
                                /> 

                                <button type="submit" className="lupa" > 
                                <img src="/Recursos/svg/lupa.svg" alt="lupa" /> 
                                
                                </button> 
                            </form> 

                            { 
                                sugerencias.length > 0 && ( 
                                    <div className="dropdown-libros"> 
                                        { sugerencias.map((libro) => ( 
                                            <div key={libro.idLibro} 
                                                className="resultado-libro" 
                                                onClick={() => seleccionarLibro( libro.idLibro) } 
                                            > 
                                                <img src={libro.imagen} alt={libro.titulo} /> 
                                                <span> {libro.titulo} </span> 
                                        </div> )) } 
                                    </div> 
                                )
                            } 
                        </div>
                    </div>
                </div>
            </nav>
        </header>
    );
}

export default Header;