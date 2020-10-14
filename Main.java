/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseNegocios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Conectar con la base de datos
       /**
        Map<String, String> emfProperties = new HashMap<String, String>();
        emfProperties.put("javax.persistence.schema-generation.database.action", "create");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("baseNegociosPU",emfProperties); 
        EntityManager em = emf.createEntityManager();
        
        // REALIZAR AQUÍ LAS OPERACIONES SOBRE LA BASE DE DATOS
       
        // Cerrar la conexión con la base de datos
        em.close(); 
        emf.close(); 
        try { 
            DriverManager.getConnection("jdbc:derby:baseDeDatos;shutdown=true"); 
        } catch (SQLException ex) { 
        }
        **/
        
    }    
}
