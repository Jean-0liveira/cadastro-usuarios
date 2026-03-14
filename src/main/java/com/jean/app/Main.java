package com.jean.app;

import com.jean.model.Usuario;
import com.jean.service.UsuarioService;

public class Main {

    public static void main(String[] args) {

        UsuarioService service = new UsuarioService();

        service.cadastrar(new Usuario("Jean", "jean@000"));
        service.cadastrar(new Usuario("Ana", "ana@000"));

        service.listar();
    }
}