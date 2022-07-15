/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Semana5;

/**
 * @scalapp.co ITOS 12/07/2022
 * @DiegoIvánOliverosAcosta
 */
import java.sql.*;

public class Baseconec {
    private String Url="jdbc:mysql://127.0.0.1:3306/mydb";
    private String User="root";
    private String Pass="qwertyA12345*";
    
    public Connection coneccion() throws ClassNotFoundException, SQLException{
            Class.forName("com.mysql.cj.jdbc.Driver");//https://dev.mysql.com/downloads/windows/installer/8.0.html
            Connection conexion = DriverManager.getConnection(Url, User, Pass);
            return conexion;
    } 

    public static void main(String[] args) {
        Baseconec b = new Baseconec();
        b.leer();
        b.insertar();
    }
    public void leer(){
      try {
            int idfactura, cantidad, Persona_idpersona;
            String fecha, fecha2, Producto_idProducto;
            String sentencia = "SELECT * FROM factura;";
            Baseconec b = new Baseconec();
            Connection conexion=b.coneccion();
            Statement consulta = conexion.createStatement();
            ResultSet resultados = consulta.executeQuery(sentencia);
            System.out.println("Listado de compras");
            while (resultados.next()) {
                idfactura = resultados.getInt("idfactura");
                fecha = resultados.getString("fecha");
                fecha2 = resultados.getString("fecha2");
                Producto_idProducto = resultados.getString("Producto_idProducto");
                cantidad = resultados.getInt("cantidad");
                Persona_idpersona= resultados.getInt("Persona_idpersona");
                System.out.println("idfactura: " + idfactura +
                        " Hora: " + fecha +
                        " Fecha: " + fecha2 +
                        " Producto_idProducto: " + Producto_idProducto +
                        " Persona_idpersona: " + Persona_idpersona +
                        " cantidad: " + cantidad);
            }
            conexion.close();
        } catch (ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver.");
        } catch (SQLException e) {
            System.out.println("Hubo un error al acceder a la base de datos: " + e.getMessage());
        }
    }
    public void insertar(){
     try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(this.Url, this.User, this.Pass);
            String sentencia = "INSERT INTO factura VALUES (50, \'18:59:00\', \'2021-08-17 18:59:00.0\', 7,123,15);";
            Statement consulta = conexion.createStatement();
            consulta.executeUpdate(sentencia);
            conexion.close();
        } catch (ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver.");
        } catch (SQLException e) {
            System.out.println("Hubo un error al acceder a la base de datos: " + e.getMessage());
        }
    }
}
