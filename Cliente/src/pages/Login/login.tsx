import { useNavigate } from 'react-router-dom';
import type { LoginDTO } from '../../types/loginDto';
import { apiFetch } from '../../services/api';
import { useState } from 'react';
import './login.css'

export const loginUser = (datos: LoginDTO) => {
    return apiFetch("/login", {
        method: "POST",
        body: JSON.stringify({
            user: datos.user.trim(),
            contrasena: datos.contrasena.trim()
        })
    });
};

function Login() {
    
    const [user, setUser] = useState("");
    const [contrasena, setContrasena] = useState("");
    const [error, setError] = useState("");
    const navigate = useNavigate();

    const envio = async (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        setError("");

        try{
            const data = await loginUser({
                user,
                contrasena
            });

            console.log("LOGIN:", data);

            //Guardar datos
            localStorage.setItem("idUser", data.idUser);
            localStorage.setItem("user", data.user);

            // Redirigir
            navigate("/");

        } catch (err: any) {
            setError(err.message || "Error en el login");
        }
    };

    return(
        <main className='login-registre'>
            <div className="nuestra-pagina">
                <img src="/Recursos/Img/Logo22.png" alt="logo" />
                <p>¿Estas preparado para adentrarte en el mundo de los libros?</p>
            </div>

            <div className="inicio-sesion row">
                <form className="col-12" onSubmit={envio}>

                    <img src="/Recursos/Img/usuarioContraseña.png" alt="img_Usuario" />

                    {/* USUARIO */}
                    <div className="campo">
                        <svg xmlns="http://www.w3.org/2000/svg" 
                            viewBox="0 -960 960 960" >
                            <path d="M480-480q-66 0-113-47t-47-113q0-66 47-113t113-47q66 0 113 47t47 113q0 66-47 113t-113 
                            47ZM160-160v-112q0-34 17.5-62.5T224-378q62-31 126-46.5T480-440q66 0 130 15.5T736-378q29 15 46.5 
                            43.5T800-272v112H160Zm80-80h480v-32q0-11-5.5-20T700-306q-54-27-109-40.5T480-360q-56 0-111 13.5T260-306q-9 
                            5-14.5 14t-5.5 20v32Zm240-320q33 0 56.5-23.5T560-640q0-33-23.5-56.5T480-720q-33 0-56.5 23.5T400-640q0 33 23.5 
                            56.5T480-560Zm0-80Zm0 400Z"/>
                        </svg>

                        <input
                            type="text"
                            placeholder="Usuario"
                            value={user}
                            onChange={(e) => setUser(e.target.value)}
                        />
                    </div>

                    {/* CONTRASEÑA */}
                    <div className="campo">
                        <svg xmlns="http://www.w3.org/2000/svg" 
                            viewBox="0 -960 960 960" >
                            <path d="M80-200v-80h800v80H80Zm46-242-52-30 34-60H40v-60h68l-34-58 52-30 34 58 34-58 52 30-34 
                            58h68v60h-68l34 60-52 30-34-60-34 60Zm320 0-52-30 34-60h-68v-60h68l-34-58 52-30 34 58 34-58 52 30-34 
                            58h68v60h-68l34 60-52 30-34-60-34 60Zm320 0-52-30 34-60h-68v-60h68l-34-58 52-30 34 58 34-58 52 30-34 
                            58h68v60h-68l34 60-52 30-34-60-34 60Z"/>
                        </svg>

                        <input
                            type="password"
                            placeholder="Contraseña"
                            value={contrasena}
                            onChange={(e) => setContrasena(e.target.value)}
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
                        <button type="submit">Iniciar sesión</button>
                    </div>

                    {/* REGISTRO */}
                    <a className="enlace" href="/registro">
                        ¿No tienes cuenta? Regístrate ahora
                    </a>
                    
                </form>
            </div>
        </main>
    );
}

export default Login;


