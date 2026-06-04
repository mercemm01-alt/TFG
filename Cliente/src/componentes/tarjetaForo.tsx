import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { apiFetch } from "../services/api";
import "./tarjetaForo.css";

type Props = {
    foro: any;
    onEliminar: () => void;
}

function TarjetaForo({ foro, onEliminar }: Props) {

    const BACKEND_URL = "https://tfg-z11h.onrender.com";
    const navigate = useNavigate();
    const [mostrarConfirmacion, setMostrarConfirmacion] = useState(false);
    const imagenForo = foro.img ? `${BACKEND_URL}/img/${foro.img}` : "/default-foro.png";

    const eliminarForo = async (idForo: number) => {

        try {

            await apiFetch(`/foro/${idForo}?idUser=${localStorage.getItem("idUser")}`,
                {
                    method: "DELETE"
                }
            );
            setMostrarConfirmacion(false);
            onEliminar();

        } catch (error) {
            console.error(error);
        }
    };

    return (
        <>
            <div
                className="tarjeta-foro"
                onClick={() =>
                    navigate(`/foro/${foro.idForos}`)
                }
            >

                <img
                    className="imagen-foro"
                    src={imagenForo}
                    alt={foro.nombre}
                />

                <div className="contenido-foro">

                    <h3 className="titulo-foro">
                        {foro.nombre}
                    </h3>

                    <p className="descripcion-foro">
                        {foro.descripcion}
                    </p>

                </div>

                {
                    foro.esMio && (
                        <div className="acciones-foro">

                            <button
                                className="btn-editar-foro"
                                onClick={(e) => {

                                    e.stopPropagation();

                                    navigate(
                                        `/editar-foro/${foro.idForos}`
                                    );
                                }}
                            >
                                Editar
                            </button>

                            <button
                                className="btn-eliminar-foro"
                                onClick={(e) => {

                                    e.stopPropagation();

                                    setMostrarConfirmacion(true);
                                }}
                            >
                                Eliminar
                            </button>

                        </div>
                    )
                }

            </div>

            {
                mostrarConfirmacion && (
                    <div
                        className="modal-overlay"
                        onClick={() =>
                            setMostrarConfirmacion(false)
                        }
                    >

                        <div
                            className="modal-confirmacion"
                            onClick={(e) =>
                                e.stopPropagation()
                            }
                        >

                            <h3>
                                Eliminar foro
                            </h3>

                            <p>
                                ¿Seguro que deseas eliminar este foro?
                            </p>

                            <div className="acciones-modal">

                                <button
                                    className="btn-cancelar"
                                    onClick={() =>
                                        setMostrarConfirmacion(false)
                                    }
                                >
                                    Cancelar
                                </button>

                                <button
                                    className="btn-confirmar-eliminar"
                                    onClick={() =>
                                        eliminarForo(
                                            foro.idForos
                                        )
                                    }
                                >
                                    Eliminar
                                </button>

                            </div>

                        </div>

                    </div>
                )
            }
        </>
    );
}

export default TarjetaForo;