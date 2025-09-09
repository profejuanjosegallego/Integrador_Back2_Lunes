package com.example.FrankySabado.modelos.mapas;

import com.example.FrankySabado.modelos.Estudiante;
import com.example.FrankySabado.modelos.dtos.EstudianteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IEstudianteMapa {

    @Mapping(source = "usuario.nombre", target = "nombre")
    @Mapping(source = "usuario.correo", target = "correo") // usuario es el atributo de Estudiante que referencia a Usuario
    @Mapping(source = "promedio", target = "promedio")
    @Mapping(source = "fechaNacimiento", target = "fechaNacimiento")
    EstudianteDTO convertir_a_dto(Estudiante estudiante);

    // DTO para devolver una lista
    List<EstudianteDTO> convertir_a_lista_dto(List<Estudiante> lista);

}
