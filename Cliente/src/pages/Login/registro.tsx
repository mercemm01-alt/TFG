import { useNavigate } from 'react-router-dom';
import { useState } from "react";
import type { RegistroDTO } from '../../types/registroDto';
import { apiFetch } from '../../services/api';
import "./login.css";

export const registerUser = (datos: RegistroDTO) => {
    return apiFetch("/registro", {
        method: "POST",
        body: JSON.stringify({
            user: datos.user.trim(),
            contrasena: datos.contrasena.trim(),
            correo: datos.correo.trim(),
            fechaNacimiento: datos.fechaNacimiento.trim()
        })
    });
};

function Registro() {
    
    const [user, setUser] = useState("");
    const [contrasena, setContrasena] = useState("");
    const [confirmarContrasena, setConfirmarContrasena] = useState("");
    const [correo, setCorreo] = useState("");
    const [fechaNacimiento, setFechaNacimiento] = useState("");
    const [error, setError] = useState("");
    const [condiciones, setCondiciones] = useState(false);
    const navigate = useNavigate();

    const envio =async (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        setError("");

        if (!condiciones) {
            setError("Debes aceptar las condiciones");
            return;
        }

        if (contrasena !== confirmarContrasena) {
            setError("Las contraseñas no coinciden");
            return;
        }

        try{
            const data = await registerUser({
                user,
                contrasena,
                correo,
                fechaNacimiento
            });
            
            console.log("REGISTRO:", data);

            //Guarda
            localStorage.setItem("idUser", data.idUser);
            localStorage.setItem("user", data.user);

            //Redirige
            navigate("/");
        } catch (err: any) {
            setError(err.message || "Error en el registro");
        }
    };

    return (
        <main>
            <div className="nuestra-pagina">
                <img src="/Recursos/Img/Logo22.png" alt="logo" />
                <p>¿Estas preparado para adentrarte en el mundo de los libros?</p>
            </div>

            <div className="inicio-sesion">
                <form onSubmit={envio}>
                    <img src="/Recursos/Img/usuarioContraseña.png" alt="img Usuario" />

                    {/* USUARIO */}
                    <div className="campo">
                        <svg xmlns="http://www.w3.org/2000/svg" 
                            viewBox="0 -960 960 960">
                            <path d="M480-480q-66 0-113-47t-47-113q0-66 47-113t113-47q66 0 113 47t47 113q0 66-47 
                            113t-113 47ZM160-160v-112q0-34 17.5-62.5T224-378q62-31 126-46.5T480-440q66 0 130 15.5T736-378q29 
                            15 46.5 43.5T800-272v112H160Zm80-80h480v-32q0-11-5.5-20T700-306q-54-27-109-40.5T480-360q-56 0-111 
                            13.5T260-306q-9 5-14.5 14t-5.5 20v32Zm240-320q33 0 56.5-23.5T560-640q0-33-23.5-56.5T480-720q-33 0-56.5 
                            23.5T400-640q0 33 23.5 56.5T480-560Zm0-80Zm0 400Z" />
                        </svg>
                        <input 
                            type="text" 
                            placeholder="Usuario"
                            value={user}
                            onChange={(e) => setUser(e.target.value)}
                        />
                    </div>

                    {/* CORREO */}
                    <div className="campo">
                        <svg xmlns="http://www.w3.org/2000/svg" 
                            viewBox="0 -960 960 960">
                            <path d="M160-160q-33 0-56.5-23.5T80-240v-480q0-33 23.5-56.5T160-800h640q33 0 56.5 
                            23.5T880-720v480q0 33-23.5 56.5T800-160H160Zm320-280L160-640v400h640v-400L480-440Zm0-80 
                            320-200H160l320 200ZM160-640v-80 480-400Z" />
                        </svg>
                        <input 
                            id="email" 
                            type="email" 
                            placeholder="Correo"
                            value={correo}
                            onChange={(e) => setCorreo(e.target.value)}
                        />
                    </div>

                    {/* FECHA DE NACIMIENTO */}
                    <div className="campo">
                        <svg xmlns="http://www.w3.org/2000/svg" 
                            viewBox="0 -960 960 960">
                            <path d="M200-80q-33 0-56.5-23.5T120-160v-560q0-33 23.5-56.5T200-800h40v-80h80v80h320v-80h80v80h40q33 
                            0 56.5 23.5T840-720v560q0 33-23.5 56.5T760-80H200Zm0-80h560v-400H200v400Zm0-480h560v-80H200v80Zm0 0v-80 80Zm280 
                            240q-17 0-28.5-11.5T440-440q0-17 11.5-28.5T480-480q17 0 28.5 11.5T520-440q0 17-11.5 28.5T480-400Zm-160 0q-17 
                            0-28.5-11.5T280-440q0-17 11.5-28.5T320-480q17 0 28.5 11.5T360-440q0 17-11.5 28.5T320-400Zm320 0q-17 
                            0-28.5-11.5T600-440q0-17 11.5-28.5T640-480q17 0 28.5 11.5T680-440q0 17-11.5 28.5T640-400ZM480-240q-17 
                            0-28.5-11.5T440-280q0-17 11.5-28.5T480-320q17 0 28.5 11.5T520-280q0 17-11.5 28.5T480-240Zm-160 0q-17 
                            0-28.5-11.5T280-280q0-17 11.5-28.5T320-320q17 0 28.5 11.5T360-280q0 17-11.5 28.5T320-240Zm320 0q-17 
                            0-28.5-11.5T600-280q0-17 11.5-28.5T640-320q17 0 28.5 11.5T680-280q0 17-11.5 28.5T640-240Z" />
                        </svg>
                        <input 
                            id="cumple" 
                            type="date"
                            value={fechaNacimiento}
                            onChange={(e) => setFechaNacimiento(e.target.value)}
                        />
                    </div>

                    {/* CONTRASEÑA */}
                    <div className="campo">
                        <svg xmlns="http://www.w3.org/2000/svg" 
                            viewBox="0 -960 960 960">
                            <path d="M80-200v-80h800v80H80Zm46-242-52-30 34-60H40v-60h68l-34-58 52-30 34 58 34-58 52 
                            30-34 58h68v60h-68l34 60-52 30-34-60-34 60Zm320 0-52-30 34-60h-68v-60h68l-34-58 52-30 34 
                            58 34-58 52 30-34 58h68v60h-68l34 60-52 30-34-60-34 60Zm320 0-52-30 34-60h-68v-60h68l-34-58 
                            52-30 34 58 34-58 52 30-34 58h68v60h-68l34 60-52 30-34-60-34 60Z" />
                        </svg>
                        <input 
                            type="password" 
                            placeholder="Contraseña"
                            value={contrasena}
                            onChange={(e) => setContrasena(e.target.value)}
                        />
                    </div>

                    {/* CONFIRMAR CONTRASEÑA */}
                    <div className="campo">
                        <svg xmlns="http://www.w3.org/2000/svg" 
                            viewBox="0 -960 960 960">
                            <path d="M638-80 468-250l56-56 114 114 226-226 56 56L638-80ZM480-520l320-200H160l320 
                            200Zm0 80L160-640v400h206l80 80H160q-33 0-56.5-23.5T80-240v-480q0-33 23.5-56.5T160-800h640q33 
                            0 56.5 23.5T880-720v174l-80 80v-174L480-440Zm0 0Zm0-80Zm0 80Z" />
                        </svg>
                        <input 
                            id="password_confirm" 
                            type="password" 
                            placeholder="Confirmar Contraseña"
                            value={confirmarContrasena}
                            onChange={(e) => setConfirmarContrasena(e.target.value)}
                        />
                    </div>

                    {/* ERROR */}
                    {error && (
                        <p style={{ color: "red", marginTop: "10px" }}>
                            {error}
                        </p>
                    )}

                    {/* BOTÓN */}
                    <div className="boton">
                        <button type="submit">Registrarse</button>
                    </div>

                    {/* CONDICIONES */}
                    <p className="condiciones">
                        <input 
                            type="checkbox" 
                            id="checkbox"
                            checked={condiciones}
                            onChange={(e) => setCondiciones(e.target.checked)}
                        />
                        Acepta las condiciones de nuestra página web
                    </p>

                    {/* ENLACE LOGIN */}
                    <a className="enlace" href="/login">
                        ¿Ya tienes cuenta? Inicia sesión
                    </a>
                </form>
            </div>
        </main>
    );
}

export default Registro;