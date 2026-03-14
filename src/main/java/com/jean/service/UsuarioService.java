package com.jean.service;

import com.jean.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrar(Usuario u){
        usuarios.add(u);
    }

    public void listar(){
        for (Usuario u : usuarios ){
            System.out.println(u.getName() + "-" + u.getEmail());
        }
    }
}
