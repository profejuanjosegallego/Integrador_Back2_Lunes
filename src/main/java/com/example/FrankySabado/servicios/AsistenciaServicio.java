package com.example.FrankySabado.servicios;

import com.example.FrankySabado.modelos.Asistencia;
import com.example.FrankySabado.dtos.AsistenciaDTO;
import com.example.FrankySabado.mappers.AsistenciaMapper;
import com.example.FrankySabado.repositorios.AsistenciaRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AsistenciaServicio {

    private final AsistenciaRepositorio repo;

    public AsistenciaServicio(AsistenciaRepositorio repo) {
        this.repo = repo;
    }

    public AsistenciaDTO crear(AsistenciaDTO dto) {
        Asistencia saved = repo.save(AsistenciaMapper.toEntity(dto));
        return AsistenciaMapper.toDTO(saved);
    }

    public AsistenciaDTO actualizar(Integer id, AsistenciaDTO dto) {
        Asistencia existente = repo.findById(id).orElseThrow(() -> new RuntimeException("Asistencia no encontrada"));
        existente.setFecha(dto.fecha);
        existente.setGrupoId(dto.grupoId);
        existente.setEstudianteId(dto.estudianteId);
        existente.setObservacion(dto.observacion);
        existente.setEstado(dto.estado);
        return AsistenciaMapper.toDTO(repo.save(existente));
    }

    public List<AsistenciaDTO> listar() {
        return repo.findAll().stream().map(AsistenciaMapper::toDTO).toList();
    }

    public AsistenciaDTO buscarPorId(Integer id) {
        return repo.findById(id).map(AsistenciaMapper::toDTO).orElse(null);
    }

    public List<AsistenciaDTO> listarPorEstudiante(Integer estudianteId) {
        return repo.findByEstudianteId(estudianteId).stream().map(AsistenciaMapper::toDTO).toList();
    }

    public List<AsistenciaDTO> listarPorGrupo(Integer grupoId) {
        return repo.findByGrupoId(grupoId).stream().map(AsistenciaMapper::toDTO).toList();
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
