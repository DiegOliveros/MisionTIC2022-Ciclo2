package Semana5;

import java.sql.*;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 15/07/2022
 */
public class BaseBibliotk {

    private String url = "jdbc:mysql://127.0.0.1:3306/biblioteca";
    private String user = "JAVA";
    private String pass = "JAVAadmin2022**_";

    public Connection coneccion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexion = DriverManager.getConnection(url, user, pass);
        return conexion;
    }

    public static void main(String args[]) {
        BaseBibliotk conectorBaseBibliotk = new BaseBibliotk();
        conectorBaseBibliotk.leer();

    }

    public void leer() {
        try {
            int idusuario;
            String nombre, password;

            BaseBibliotk bc = new BaseBibliotk();
            Connection conexion = bc.coneccion();
            String sentencia = "SELECT * from usuario";
            Statement consulta = conexion.createStatement();
            ResultSet resultados = consulta.executeQuery(sentencia);

            while (resultados.next()) {
                idusuario = resultados.getInt("idusuario");
                nombre = resultados.getString("nombre");
                password = resultados.getString("password");

                System.out.println("idusuario = " + idusuario);
                System.out.println("nombre = " + nombre);
                System.out.println("password = " + password);
            }
            conexion.close();
        } catch (ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver" + e.getMessage());
        } catch (SQLException sql) {
            System.out.println("hubo un error en la consulta a la base: " + sql.getMessage());
        }

    }
}
