const API_URL = "http://localhost:8080/api";

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

    return response.json();
};