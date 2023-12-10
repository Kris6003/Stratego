package Stratego;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenniferbueso
 */

public class ManejoDeSesion implements Serializable {
    private static UsuariosInfo usuarioLogueado;

    public static UsuariosInfo getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public static void setUsuarioLogueado(UsuariosInfo usuario) {
        usuarioLogueado = usuario;
    }
}
