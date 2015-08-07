/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miro_vidal.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import miro_vidal.db.AccesoDB;

/**
 *
 * @author wrd14n1
 */
public class MostrarEquipoModel {
   
    public String[] MostrarEquipo (String registro_equipo) throws SQLException {
               
        Statement st = null;
        ResultSet rs;
        String datos[] = new String [11] ; 
        Connection Mostrar =(Connection) AccesoDB.getConnection();
                                             
        try {
            st=(Statement)Mostrar.createStatement();
            rs=st.executeQuery("select * from equipo_pesado where registro = '" + registro_equipo + "'");
               if (rs.next()) {
                  datos[0]=rs.getString("ubicacion");
                  datos[1]=rs.getString("descripcion");
                  datos[2]=rs.getString("mode_cap");
                  datos[3]=rs.getString("marca");
                  datos[4]=rs.getString("a_fab");
                  datos[5]=rs.getString("nro_serie");
                  datos[6]=rs.getString("capacidad");
                  datos[7]=rs.getString("propietario");
                  datos[8]=rs.getString("estado");
                  datos[9]=rs.getString("fecha_llegada");
                  datos[10]=rs.getString("horometro");
               } else {
                   JOptionPane.showMessageDialog(null, "No existe el registro " + registro_equipo);
               }
               } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            try {
                st.close();
                Mostrar.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
               return datos;
   }
    
   public String[] CargarDatos () throws SQLException {
       
       String equipos [] = new String[50];
       
       Statement st=null;
       ResultSet rs;
       int i=0;
       
       Connection conectar =(Connection) AccesoDB.getConnection();
       
       
       try {
           
           st=(Statement)conectar.createStatement();
           rs=st.executeQuery("select registro from equipo_pesado");
           while(rs.next()){
               equipos[i]=rs.getString("registro");
               i=i+1;
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       finally{
            try {
                st.close();
                conectar.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
       
       return equipos; 
   }
}
