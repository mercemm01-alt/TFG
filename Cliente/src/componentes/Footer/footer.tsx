import { Link } from "react-router-dom";
import "./footer.css";

function Footer() {
    return (
        <footer className="footer text-center">

            <div className="footer-container">

                {/* Legal */}
                <div className="footer-legal">
                    <h3>Legal</h3>
                    <ul>
                        <li><Link to="/avisos-legales#aviso-legal">Aviso Legal</Link></li>
                        <li><Link to="/avisos-legales#politica-privacidad">Política de Privacidad</Link></li>
                        <li><Link to="/avisos-legales#politica-cookies">Política de Cookies</Link></li>
                        <li><Link to="/avisos-legales#accesibilidad">Declaración de Accesibilidad</Link></li>
                        <li><Link to="/avisos-legales#terminos">Términos y Condiciones</Link></li>
                    </ul>
                </div>

                {/* Redes */}
                <div className="footer-social">
                    <h3>Redes Sociales</h3>
                    <div className="social-icons">
                        <a href="https://www.facebook.com/?locale=es_ES" target="_blank" rel="noopener noreferrer">
                            <img src="/Recursos/svg/facebook.svg" alt="Facebook" />
                        </a>
                        <a href="https://www.instagram.com/" target="_blank" rel="noopener noreferrer">
                            <img src="/Recursos/svg/instagram.svg" alt="Instagram" />
                        </a>
                        <a href="https://x.com/?lang=es" target="_blank" rel="noopener noreferrer">
                            <img src="/Recursos/svg/twitter-x.svg" alt="Twitter" />
                        </a>
                    </div>
                </div>

            </div>

            {/* Parte inferior */}
            <div className="footer-bottom">
                <p>© 2026 Comunidad Lectora. Todos los derechos reservados.</p>
            </div>

            {/* Validador */}
            <p>
                <a href="https://jigsaw.w3.org/css-validator/check/referer">
                    <img
                        style={{ border: 0, width: "88px", height: "31px" }}
                        src="https://jigsaw.w3.org/css-validator/images/vcss-blue"
                        alt="¡CSS Válido!"
                    />
                </a>
            </p>

        </footer>
    );
}

export default Footer;