/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miro_vidal.controller;

import java.sql.SQLException;
import miro_vidal.model.MostrarEquipoModel;

/**
 *
 * @author wrd14n1
 */
public class MostrarEquipoController {
    public String [] MostrarEquipo (String registro) throws SQLException{
        
        String datos[] = new String[11];
        MostrarEquipoModel model = new MostrarEquipoModel();
        
        datos[0]=model.MostrarEquipo(registro)[0];
        datos[1]=model.MostrarEquipo(registro)[1];
        datos[2]=model.MostrarEquipo(registro)[2];
        datos[3]=model.MostrarEquipo(registro)[3];
        datos[4]=model.MostrarEquipo(registro)[4];
        datos[5]=model.MostrarEquipo(registro)[5];
        datos[6]=model.MostrarEquipo(registro)[6];
        datos[7]=model.MostrarEquipo(registro)[7];
        datos[8]=model.MostrarEquipo(registro)[8];
        datos[9]=model.MostrarEquipo(registro)[9];
        datos[10]=model.MostrarEquipo(registro)[10];
        return datos;
    }
    
    public String[] CargarEquipo () throws SQLException{
        String equipos[] = new String[50];
        MostrarEquipoModel modelo = new MostrarEquipoModel();
        int i = 0;
        while (i<50){
            equipos[i]=modelo.CargarDatos()[i];
            i=i+1;
        }
        return equipos;
    }
}
