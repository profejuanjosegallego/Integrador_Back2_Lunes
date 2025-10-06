package com.example.FrankySabado.controladores;

import com.example.FrankySabado.modelos.Usuario;
import com.example.FrankySabado.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    private final UsuarioServicio servicio;

    @Autowired
    public UsuarioControlador(UsuarioServicio servicio) {
        this.servicio = servicio;
    }

    // Crear/guardar usuario
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Usuario usuario) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(servicio.guardarUsuario(usuario));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Listar todos
    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        try {
            return ResponseEntity
                    .ok(servicio.buscarUsuarios());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        try {
            return ResponseEntity
                    .ok(servicio.buscarUsuarioPorId(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Buscar por correo (GET con query param: /usuarios/correo?correo=alguien@dominio.com)
    @GetMapping("/correo")
    public ResponseEntity<?> buscarPorCorreo(@RequestParam String correo) {
        try {
            return ResponseEntity
                    .ok(servicio.buscarUsuarioPorCorreo(correo));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}

