package com.example.FrankySabado.servicios;

import com.example.FrankySabado.modelos.Usuario;
import com.example.FrankySabado.modelos.dtos.UsuarioGenericoDTO;
import com.example.FrankySabado.modelos.mapas.IMapaUsuarioDTO;
import com.example.FrankySabado.repositorios.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    //1. Llamar al repositorio
    //INYECTAR UNA DEPENDENCIA AL REPO
    @Autowired
    IUsuarioRepositorio repositorio;

    @Autowired
    IMapaUsuarioDTO mapa;

    //1. Servicio para guardar un usuario
    public UsuarioGenericoDTO guardarUsuario(Usuario datosUsuario)throws Exception{
        try{
            return this.mapa.convertirADTO(this.repositorio.save(datosUsuario));

        }catch(Exception error){
            throw new Exception("upss fallamos "+error.getMessage());
        }
    }


}
