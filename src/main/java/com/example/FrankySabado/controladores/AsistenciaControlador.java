package com.example.FrankySabado.controladores;

import com.example.FrankySabado.dtos.AsistenciaDTO;
import com.example.FrankySabado.servicios.AsistenciaServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/asistencias", "/api/asistencias"})
@CrossOrigin // por si el front corre en otro host/puerto
public class AsistenciaControlador {

    private final AsistenciaServicio servicio;

    public AsistenciaControlador(AsistenciaServicio servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public ResponseEntity<AsistenciaDTO> crear(@RequestBody AsistenciaDTO dto) {
        return ResponseEntity.ok(servicio.crear(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AsistenciaDTO> actualizar(@PathVariable Integer id, @RequestBody AsistenciaDTO dto) {
        return ResponseEntity.ok(servicio.actualizar(id, dto));
    }

    @GetMapping
    public ResponseEntity<List<AsistenciaDTO>> listar() {
        return ResponseEntity.ok(servicio.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AsistenciaDTO> buscarPorId(@PathVariable Integer id) {
        AsistenciaDTO dto = servicio.buscarPorId(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @GetMapping("/estudiante/{estudianteId}")
    public ResponseEntity<List<AsistenciaDTO>> listarPorEstudiante(@PathVariable Integer estudianteId) {
        return ResponseEntity.ok(servicio.listarPorEstudiante(estudianteId));
    }

    @GetMapping("/grupo/{grupoId}")
    public ResponseEntity<List<AsistenciaDTO>> listarPorGrupo(@PathVariable Integer grupoId) {
        return ResponseEntity.ok(servicio.listarPorGrupo(grupoId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
