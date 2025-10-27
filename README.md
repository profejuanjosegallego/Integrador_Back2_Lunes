# Asistencia — módulo independiente

Este proyecto **solo** contiene el módulo de Asistencia, desacoplado de Estudiante, Grupo y demás entidades.
En la entidad usamos `grupoId` y `estudianteId` como `Integer` para evitar dependencias.

## Requisitos
- Java 17+
- Maven 3.9+

## Ejecutar
```bash
mvn spring-boot:run
```
Abrir la consola H2 en: <http://localhost:8080/h2> (JDBC: `jdbc:h2:mem:asistencia`)

## API
- `POST /api/asistencias` — crea una asistencia
- `GET  /api/asistencias` — lista todas
- `GET  /api/asistencias/{id}` — busca por id
- `GET  /api/asistencias/estudiante/{estudianteId}` — lista por estudiante
- `GET  /api/asistencias/grupo/{grupoId}` — lista por grupo
- `PUT  /api/asistencias/{id}` — actualiza
- `DELETE /api/asistencias/{id}` — elimina

### JSON ejemplo (crear)

```json
{
  "fecha": "2025-10-26",
  "grupoId": 101,
  "estudianteId": 555,
  "observacion": "Llegó tarde por tráfico",
  "estado": "TARDE"
}
```

### Notas
- Si tu front ya hace `fetch` a `/asistencias`, cambia la base a `/api/asistencias` o ajusta el `@RequestMapping`.
- Si luego quieres conectar con tablas reales de `Grupo` y `Estudiante`, cambia `grupoId`/`estudianteId` a relaciones JPA.


## Usar con XAMPP (MySQL/MariaDB)

1. Abre **XAMPP Control Panel** y **Start** en *MySQL* (Apache es opcional).
2. Entra a **phpMyAdmin** → crea la base `bd_lunes` (vacía).
3. Ejecuta el backend:
   ```bash
   mvn spring-boot:run
   ```
4. Prueba con Postman los endpoints (ver sección API).

> El proyecto ya se conecta a `jdbc:mysql://localhost:3306/bd_lunes` con usuario `root` y contraseña vacía (configuración típica de XAMPP). Si tu `root` tiene contraseña, cámbiala en `src/main/resources/application.properties`.
