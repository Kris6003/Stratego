package Stratego;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenniferbueso
 */
public class UsuariosEliminadosInfo {
    private String usuariosEliminadoG, contraEliminadaG;
    
    public UsuariosEliminadosInfo(String usuarioEliminado, String contraEliminada) {
        usuariosEliminadoG = usuarioEliminado;
        contraEliminadaG = contraEliminada;
    }

    public String getUsuariosEliminado() {
        return usuariosEliminadoG;
    }

    public void setUsuariosEliminado(String usuariosEliminado) {
        usuariosEliminadoG = usuariosEliminado;
    }

    public String getContraEliminada() {
        return contraEliminadaG;
    }

    public void setContraEliminada(String contraEliminada) {
        contraEliminadaG = contraEliminada;
    }
}
