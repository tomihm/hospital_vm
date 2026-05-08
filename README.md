# Citas VM - Microservicio de Citas

Microservicio REST para gestionar citas médicas. Se comunica con hospital-vm mediante Feign Client para verificar que el paciente existe antes de agendar una cita.

## Stack
- Spring Boot 4.0.6 + Java 25
- Spring Data JPA + Hibernate
- MySQL 8.4 (Laragon) + Flyway para migraciones
- Lombok + OpenFeign
- Puerto: 8081

## Endpoints
| Método | URL | Descripción |
|--------|-----|-------------|
| GET | /api/v1/citas | Listar citas |
| POST | /api/v1/citas | Crear cita |
| DELETE | /api/v1/citas/{id} | Eliminar cita |

## Comunicación entre microservicios
Usa Feign Client apuntando a `http://localhost:8080/api/v1` para consultar el microservicio hospital-vm y validar que el paciente existe antes de guardar la cita.

## Migraciones Flyway
- `V1__init_cita.sql` — Crea la tabla cita
