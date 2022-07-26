package Semana5_6;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
//        conectorBaseBibliotk.insertar();
//        
        String clave = "123*";
        System.out.println(conectorBaseBibliotk.md5(clave));
        System.out.println(conectorBaseBibliotk.SHA1(clave));
        conectorBaseBibliotk.insertar(13, "usuarioencriptado", "123*");
        conectorBaseBibliotk.leer();
    }

    public void leer() {
        try {
            int idusuariojv;
            String nombre, password;

            BaseBibliotk bc = new BaseBibliotk();
            Connection conexion = bc.coneccion();
            String sentencia = "SELECT * from usuario";
            Statement consulta = conexion.createStatement();
            ResultSet resultados = consulta.executeQuery(sentencia);

            while (resultados.next()) {
                idusuariojv = resultados.getInt("idusuario"); //idusuario es el nombre de la columna 
                nombre = resultados.getString("nombre");
                password = resultados.getString("password");

                System.out.println("idusuariojv = " + idusuariojv);
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

    public void insertar(int idusuariojv, String nombre, String password) {
        try {
            BaseBibliotk bc = new BaseBibliotk();
            Connection conexion = bc.coneccion();
            password=md5(password);
//            int idusuariojv = 7;
//            String nombre = "Lucia 7";
//            String password = "1";
            String sentencia = "INSERT INTO `biblioteca`.`usuario` "
                    + "(`idusuario`, `nombre`, `password`, `biblioteca_idbiblioteca`)"
                    + " VALUES ('" + idusuariojv + "', '" + nombre + "', '" + password + "', '1');";
            Statement consulta = conexion.createStatement();
            consulta.executeUpdate(sentencia);
            conexion.close();
        } catch (ClassNotFoundException e) {
            System.out.println("No fue posible cargar el driver" + e.getMessage());
        } catch (SQLException sql) {
            System.out.println("hubo un error en la consulta a la base: " + sql.getMessage());
        }

    }

    public static String  getHash(String txt, String tipohash) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance(tipohash);
            byte[] arreglo = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
//            for (int i = 0; i < arreglo.length; ++i) {
//                sb.append(Integer.toHexString((arreglo[i] & 0xFF) | 0x100)
//                        .substring(1, 3));
//                return sb.toString();
//            }
            BigInteger no = new BigInteger(1, arreglo);
            String hashtext = no.toString(16);
            while (hashtext.length()<40) {
                    hashtext ="0"+hashtext;            
            }
            return hashtext;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(BaseBibliotk.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /*Retornar el hash en MD5*/
    public static String md5(String txt) {
        return getHash(txt, "MD5");
    }

    /*Retornar el hash en SHA1*/
    public static String SHA1(String txt) {
        return getHash(txt, "SHA1");
    }

}
