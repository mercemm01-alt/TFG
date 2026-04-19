# 📚 Plataforma Web para Gestión de Lecturas

## 📖 Descripción del Proyecto

Este Trabajo de Fin de Grado consiste en el desarrollo de una aplicación web dirigida a lectores, cuyo objetivo es facilitar la organización, seguimiento e interacción en torno a la lectura de libros.

La aplicación permite a los usuarios crear su propio catálogo personalizado de libros utilizando la API de Google Books, ofreciendo una interfaz intuitiva y atractiva que mejora la experiencia de usuario.

Además, se fomenta la interacción entre lectores mediante funcionalidades sociales como foros y mensajería privada.

---

## 🎯 Objetivos

* Desarrollar una aplicación web completa con arquitectura cliente-servidor.
* Permitir a los usuarios gestionar su biblioteca personal de libros.
* Integrar una API externa (Google Books) para la obtención de información.
* Implementar funcionalidades sociales para la interacción entre usuarios.
* Desplegar la aplicación utilizando contenedores Docker.

---

## 🛠️ Tecnologías Utilizadas

### Backend (Servidor)

* Java
* Spring Tools

### Frontend (Cliente)

* React
* TypeScript
* HTML5
* CSS3

### Base de Datos

* MySQL

### Despliegue

* Docker (contenedor que incluye cliente, servidor y base de datos)

---

## ⚙️ Funcionalidades Principales

### 📚 Gestión de Libros

* Búsqueda de libros mediante la API de Google Books.
* Creación de un catálogo personalizado.
* Clasificación de libros en:

  * Leídos
  * Pendientes
  * En proceso
* Valoración personal mediante sistema de estrellas.

### 👤 Gestión de Usuarios

* Registro e inicio de sesión.
* Gestión de perfil de usuario.

### 💬 Interacción Social

* Participación en foros de discusión.
* Envío y recepción de mensajes privados entre usuarios.

---

## 🧩 Estructura del Sistema

La aplicación sigue una arquitectura cliente-servidor:

* **Cliente**: Interfaz desarrollada con React y TypeScript.
* **Servidor**: API REST desarrollada con Java y Spring.
* **Base de Datos**: MySQL para almacenamiento persistente de datos.
* **Despliegue**: Todo el sistema se ejecuta en un entorno containerizado.

---

## 🗄️ Modelo de Datos

La base de datos está compuesta por las siguientes tablas:

* USUARIO
* LIBRO
* USER_LIBRO
* OPINION
* FORO
* USUARIO_FORO
* MENSAJE_FORO
* MENSAJE_PRIVADO

Estas tablas permiten gestionar tanto la información de los libros como la interacción entre usuarios.

---

## 🌐 Características Destacadas

* Interfaz moderna y accesible.
* Integración con API externa.
* Sistema de valoración personalizado.
* Funcionalidades sociales completas.
* Arquitectura escalable y desacoplada.

---

## 🚀 Despliegue

La aplicación se desplegará en un entorno basado en contenedores, donde se integran:

* El servidor
* El cliente
* La base de datos

Esto permite una mayor portabilidad y facilidad de ejecución en distintos entornos.

---

## 📌 Conclusión

Este proyecto combina desarrollo frontend y backend con integración de servicios externos y funcionalidades sociales, ofreciendo una solución completa para la gestión de lecturas.

Además, pone en práctica tecnologías actuales del desarrollo web y conceptos clave como la arquitectura cliente-servidor y el despliegue en contenedores.

---
