/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Models.*;
import java.sql.*;
import java.util.ArrayList;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author MarioGastonFerrufino
 */
public class JDBCConn {
    
    private Connection conn;
    
    private void openConn() {
        try {
            String url = "";
            Class.forName("").newInstance();
            conn = DriverManager.getConnection(url, "sa", "pass1");
        } catch (Exception ex) {
            System.out.println("Error at DB Connection.\nError Message: " + ex);
        }
    }
    
    private void closeConn() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception ex) {
            System.out.println("Couldn't close DB.\nError Message: " + ex);
        }
    }
    
    public ArrayList get(String table) {
        ArrayList<Usuario> list = new ArrayList<Usuario>();
        try {
            this.openConn();
            String sql = "SELECT * FROM " + table;
            Statement st = conn.createStatement();
            ResultSet rt = st.executeQuery(sql);
            while (rt.next()) {
                Usuario u = new Usuario();
            }
        } catch (Exception ex) {
            System.out.println("Coulnd't get Usuarios.Error Message: " + ex);
        } finally {
            this.closeConn();
        }
        
        return list;
    };
    
    public void postUser(Usuario u) {
        
    }
    
    public boolean login(Usuario user) {
        return true;
    }
}
