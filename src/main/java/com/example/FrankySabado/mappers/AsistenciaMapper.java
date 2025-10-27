package com.example.FrankySabado.mappers;

import com.example.FrankySabado.dtos.AsistenciaDTO;
import com.example.FrankySabado.modelos.Asistencia;

public class AsistenciaMapper {
    public static Asistencia toEntity(AsistenciaDTO dto) {
        if (dto == null) return null;
        return new Asistencia(
            dto.id,
            dto.fecha,
            dto.grupoId,
            dto.estudianteId,
            dto.observacion,
            dto.estado
        );
    }

    public static AsistenciaDTO toDTO(Asistencia entity) {
        if (entity == null) return null;
        AsistenciaDTO dto = new AsistenciaDTO();
        dto.id = entity.getId();
        dto.fecha = entity.getFecha();
        dto.grupoId = entity.getGrupoId();
        dto.estudianteId = entity.getEstudianteId();
        dto.observacion = entity.getObservacion();
        dto.estado = entity.getEstado();
        return dto;
    }
}
