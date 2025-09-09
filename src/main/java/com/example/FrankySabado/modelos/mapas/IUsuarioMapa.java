package com.example.FrankySabado.modelos.mapas;

import com.example.FrankySabado.modelos.Usuario;
import com.example.FrankySabado.modelos.dtos.UsuarioEspecialDTO;
import com.example.FrankySabado.modelos.dtos.UsuarioGenericoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUsuarioMapa {

    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "rol", target = "rol")
    UsuarioGenericoDTO convertir_a_generico_dto(Usuario usuario);

    List<UsuarioGenericoDTO> convertir_a_lista_generico_dto(List<Usuario> lista);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "contraseña", target = "contraseña")
    UsuarioEspecialDTO convertir_a_especial_dto(Usuario usuario);

    List<UsuarioEspecialDTO> convertir_a_lista_e_especial_dto(List<Usuario> usuario);
}
