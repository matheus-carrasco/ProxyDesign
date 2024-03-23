package com.finan.orcamento.model;

public class UsuarioModelProxy extends UsuarioModel {

    private Long id;

    private String nomeUsuario;

    private UsuarioModel usuario;

    public UsuarioModelProxy (UsuarioModel usuario){
        this.usuario = usuario;
    }

    @Override
    public Long getId() {
        if(id ==null){
            this.id = usuario.getId();
        }
        return id;
    }

    @Override
    public String getNomeUsuario() {
        if(nomeUsuario == null){
            this.nomeUsuario = usuario.getNomeUsuario();
        }
        return nomeUsuario;
    }
}
