# 📘 Proyecto de Reservas — Arquitectura de Microservicios Distribuida

Este proyecto es una implementación completa de un **Sistema de Gestión de Usuarios y Reservas** basado en una arquitectura de **Microservicios** y orquestado enteramente con **Docker Compose**.

Se ha priorizado el **aislamiento** y la **independencia** de los componentes, asegurando que cada microservicio tenga su propia base de datos dedicada. Un **API Gateway** centraliza el acceso y enrutamiento a los servicios backend.

---

## 💡 Conceptos Clave de Arquitectura

El sistema se compone de los siguientes elementos principales:

1.  **Frontend:** Una aplicación web moderna para la interacción del usuario.
2.  **API Gateway:** Punto de entrada único para todas las peticiones externas.
3.  **Microservicios Aislados:** Lógica de negocio separada por dominios (`Usuarios` y `Reservas`).
4.  **Bases de Datos Independientes:** Una instancia de MySQL por microservicio para garantizar la autonomía.

---

## 🛠️ Tecnologías Utilizadas

| Componente | Tecnología | Propósito |
| :--- | :--- | :--- |
| **Frontend** | **Angular** | Interfaz de Usuario (Servido por **NGINX**) |
| **Backend** | **Spring Boot 3** | Desarrollo de Microservicios (`Usuarios` y `Reservas`) |
| **Enrutamiento** | **Spring Cloud Gateway** | Enrutamiento centralizado y capa de seguridad unificada |
| **Persistencia** | **MySQL** | Base de datos relacional para cada microservicio |
| **Orquestación** | **Docker & Docker Compose** | Despliegue, gestión y ejecución reproducible de todos los servicios |

---

## 🚀 Cómo Iniciar el Proyecto

Sigue estos sencillos pasos para levantar toda la arquitectura en tu entorno local.

### 1. Clonar el Repositorio

```bash
git clone https://github.com/emersonStiver/booking-distributed.git
cd booking-distributed
```
### 2. En un buscador (chrome, edge, etc) ingresa
```bash
http://localhost:4200
```
