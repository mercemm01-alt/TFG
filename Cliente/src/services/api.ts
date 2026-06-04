const API_URL = "https://tfg-1-d2h7.onrender.com/api";

export const apiFetch = async (endpoint: string, options: RequestInit = {}) => {
    const response = await fetch(`${API_URL}${endpoint}`, {
        headers: {
            "Content-Type": "application/json",
            ...options.headers
        },
        ...options
    });

    if (!response.ok) {
        throw new Error("Error en la petición");
    }

    const text = await response.text();

    return text ? JSON.parse(text) : null;
};