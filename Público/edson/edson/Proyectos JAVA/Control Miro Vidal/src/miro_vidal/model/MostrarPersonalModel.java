package miro_vidal.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import miro_vidal.db.AccesoDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edson
 */
public class MostrarPersonalModel {
    public String [][] TodoPersonal () throws SQLException{
        String personal[][] = new String[11][200];
        Statement st = null;
        ResultSet rs;
        Connection mpersonal = (Connection)AccesoDB.getConnection();       
        try {
            st=(Statement)mpersonal.createStatement();
            rs= st.executeQuery("select * from personal");
            for (int i=0 ; i<11;i++){
                for (int j=0; j<200 ;j++ ){
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return personal;
    }
}
