package intergraf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 *
 * @author Diego Iván Oliveros Acosta
 */
public class InterGraf extends JFrame {

    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
        miVentana.setTitle("otro Titulo");
        //miVentana.setSize(500,500);
        //miVentana.setLocation(500, 100);
        int ancho = Toolkit.getDefaultToolkit().getScreenSize().width; // 
        int alto = Toolkit.getDefaultToolkit().getScreenSize().height;
        int anchoVentana = ancho / 3; //toma el ancho de la ventana.
        int altoVentana = alto / 3;
        miVentana.setSize(anchoVentana, altoVentana);
        miVentana.setLocationRelativeTo(null); // esto hace que aparezca en el centro.
//        int x=200;
//        int y=100;
//        miVentana.setBounds(x, y, 500, 500);
        miVentana.setMinimumSize(new Dimension(200, 200));
        miVentana.setResizable(true);
        miVentana.setVisible(true); //debe ir al final
        miVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        miVentana.getContentPane().setBackground(Color.BLUE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        miVentana.add(panel);
        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2 = new JLabel("Etiqueta 2");
        etiqueta1.setText("Etiqueta 1");

        etiqueta1.setOpaque(true);
        etiqueta2.setOpaque(true);

        etiqueta1.setBackground(Color.BLACK);
        etiqueta2.setBackground(Color.CYAN);
        etiqueta1.setBounds(20, 20, 100, 100);
        etiqueta2.setBounds(10, 10, 50, 500);
        etiqueta1.setForeground(Color.white);
        etiqueta2.setFont(new Font("verdana", Font.PLAIN, 50));
        etiqueta1.setFont(new Font("Georgia", Font.BOLD, 100));

        ImageIcon imagen1 = new ImageIcon("..\\CodigosClase\\src\\Imagenes\\imagenpng.png"); //desde otra ubicación  
        JLabel etiqueta3 = new JLabel(imagen1); //unIcono.png

        ImageIcon sinEscalar = new ImageIcon("C:\\Users\\diego\\Documents\\GitHub\\MisionTIC2022-Ciclo2\\CodigosClase\\src\\Imagenes\\star0.gif"); //La url completa * no recomendado
        JLabel etiqueta4 = new JLabel(sinEscalar);
        //Un escalado de 10 10 casi no se percibe. 
        ImageIcon imageIcoEscalada = new ImageIcon(sinEscalar.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        JLabel etiqueta5 = new JLabel(imageIcoEscalada);

        JLabel etiqueta6 = new JLabel("Etiqueta 6 con nombre", new ImageIcon("..\\CodigosClase\\src\\Imagenes\\a.jpg"), JLabel.CENTER);

        JLabel etiqueta7 = new JLabel("Etiqueta 7 con nombre", new ImageIcon("..\\CodigosClase\\src\\intergraf\\download.png"), JLabel.CENTER);

        panel.add(etiqueta1); //texto 1
        panel.add(etiqueta2); //texto 2
        panel.add(etiqueta3); //png
        panel.add(etiqueta4); //sin escalar gif
        panel.add(etiqueta5); //escalada gif 
        panel.add(etiqueta6); //sin escalar jpg otra carpeta
        panel.add(etiqueta7); //sin escalar ppg local 
    }

}
