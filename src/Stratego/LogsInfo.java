package Stratego;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jenniferbueso
 */
public class LogsInfo {
    String Ganador;
    String Perdedor; 
    String RazondeVictoria;
    String Fecha;
    boolean Heroe_Villano;
    
    public LogsInfo(String ganador, String perdedor, String razon, boolean heroe_villano){
        Heroe_Villano=heroe_villano;
        Ganador = ganador;
        Perdedor = perdedor; 
        RazondeVictoria = razon;
    }
    
    public String obtenerLogCompleto(String Usuario){
     String LogCompleto ="";
        if(this.Ganador == Usuario || this.Perdedor == Usuario ){
             LogCompleto = this.RazondeVictoria;
        }
        return LogCompleto;
    }
    
    public String obtenerLogHeroes_Ganados(){
     String LogCompleto ="";
        if(this.Heroe_Villano==true){
             LogCompleto = this.Ganador+" - "+this.Perdedor+" - "+this.RazondeVictoria+" - "+this.Fecha;
        }
        return LogCompleto;
    }
    
     public String obtenerLogVillanos_Ganados(){
     String LogCompleto ="";
        if(this.Heroe_Villano==false){
             LogCompleto = this.Ganador+" - "+this.Perdedor+" - "+this.RazondeVictoria+" - "+this.Fecha;
        }
        return LogCompleto;
    }
}
