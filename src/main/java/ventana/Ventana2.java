/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author TUF GAMING
 */
public class Ventana2 extends JFrame{ 
    public JPanel panel;

    /**
     *
     */
    public Ventana2(){
        
       setSize(500,700);
        setTitle("Ventana 2"); //Titulo
        setLocationRelativeTo(null);
        iniciarComponentes();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        
    }
    private void iniciarComponentes(){
        
        colocarPaneles();
    
        colocarEtiquetas();
        
        colocarCajasDeTexto();
      
        
        
    }
        
        private void colocarPaneles(){
        panel = new JPanel(); //Creacion panel
        panel.setLayout(null);//Desactivar el diseño del panel
        this.getContentPane().add(panel);//Agregar panel
        }
        private void colocarEtiquetas(){
        //Etiqueta 1
        JLabel etiqueta = new JLabel("DATOS PERSONALES",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta.setBounds(0, 10, 500, 50);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setOpaque(true); //Establecer el fondo para pintar
        etiqueta.setBackground(Color.blue);//Color de fondo
        etiqueta.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta); //Agregar la etiqueta al panel
        
        
         //Etiqueta n
        JLabel etiquetan = new JLabel("Personal",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiquetan.setBounds(0, 70, 80, 50);
        etiquetan.setForeground(Color.WHITE);
        etiquetan.setOpaque(true); //Establecer el fondo para pintar
        etiquetan.setBackground(Color.blue);//Color de fondo
        etiquetan.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiquetan); //Agregar la etiqueta al panel
        
        //Etiqueta 2
        JLabel etiqueta2 = new JLabel("Apellidos:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta2.setBounds(0, 120, 500, 50);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta2); //Agregar la etiqueta al panel
        
        //Etiqueta 3
         JLabel etiqueta3 = new JLabel("Nombres:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta3.setBounds(0, 180, 500, 50);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta3); //Agregar la etiqueta al panel
        
        //Etiqueta 4
          JLabel etiqueta4 = new JLabel("Nacionalidad:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta4.setBounds(0, 240, 500, 50);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta4); //Agregar la etiqueta al panel
        
        //Etiqueta 5
        
         JLabel etiqueta5 = new JLabel("Genero:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta5.setBounds(0, 300, 500, 50);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setOpaque(true); //Establecer el fondo para pintar
        etiqueta5.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta5); //Agregar la etiqueta al panel
        
        //Etiqueta 6
        
          JLabel etiqueta6 = new JLabel("Correo electronico personal:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta6.setBounds(0, 360, 500, 50);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setOpaque(true); //Establecer el fondo para pintar
        etiqueta6.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta6); //Agregar la etiqueta al panel
        
          //Etiqueta 7
           JLabel etiqueta7 = new JLabel("Fecha de nacimiento:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta7.setBounds(0, 360, 500, 50);
        etiqueta7.setForeground(Color.BLACK);
        etiqueta7.setOpaque(true); //Establecer el fondo para pintar
        etiqueta7.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta7); //Agregar la etiqueta al panel
        
        //Etiqueta 8
         JLabel etiqueta8 = new JLabel("Telefono Domicilio:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta8.setBounds(0, 420, 500, 50);
        etiqueta8.setForeground(Color.BLACK);
        etiqueta8.setOpaque(true); //Establecer el fondo para pintar
        etiqueta8.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta8); //Agregar la etiqueta al panel
        
        //Etiqueta 9

         JLabel etiqueta9 = new JLabel("Telefono celular:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta9.setBounds(0, 480, 500, 50);
        etiqueta9.setForeground(Color.BLACK);
        etiqueta9.setOpaque(true); //Establecer el fondo para pintar
        etiqueta9.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta9); //Agregar la etiqueta al panel
        
         //Etiqueta 10
         JLabel etiqueta10 = new JLabel("Whatsapp:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta10.setBounds(0, 540, 500, 50);
        etiqueta10.setForeground(Color.BLACK);
        etiqueta10.setOpaque(true); //Establecer el fondo para pintar
        etiqueta10.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta10); //Agregar la etiqueta al panel
        
              //Etiqueta 11
        JLabel etiqueta11 = new JLabel("ORTIZ TERREROS",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta11.setBounds(230, 100, 150,50);
        etiqueta11.setForeground(Color.BLACK);
        etiqueta11.setOpaque(true); //Establecer el fondo para pintar
        etiqueta11.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta11); //Agregar la etiqueta al panel
        
        //Etiqueta 12
         JLabel etiqueta12 = new JLabel("JOSUE BENIGNO",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta12.setBounds(230, 180, 50, 50);
        etiqueta12.setForeground(Color.BLACK);
        etiqueta12.setOpaque(true); //Establecer el fondo para pintar
        etiqueta12.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta12); //Agregar la etiqueta al panel
        
        //Etiqueta 13
          JLabel etiqueta13 = new JLabel("Ecuatoriana",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta13.setBounds(230, 240, 50, 50);
        etiqueta13.setForeground(Color.BLACK);
        etiqueta13.setOpaque(true); //Establecer el fondo para pintar
        etiqueta13.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta13); //Agregar la etiqueta al panel
        
        //Etiqueta 14
        
         JLabel etiqueta14 = new JLabel("Masculino",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta14.setBounds(230, 50, 50, 50);
        etiqueta14.setForeground(Color.BLACK);
        etiqueta14.setOpaque(true); //Establecer el fondo para pintar
        etiqueta14.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta14); //Agregar la etiqueta al panel
        
        //Etiqueta 15
        
          JLabel etiqueta15 = new JLabel("mortizo@yahoo.com",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta15.setBounds(230, 50, 50, 50);
        etiqueta15.setForeground(Color.BLACK);
        etiqueta15.setOpaque(true); //Establecer el fondo para pintar
        etiqueta15.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta15); //Agregar la etiqueta al panel
        
          //Etiqueta 16
           JLabel etiqueta16 = new JLabel("01-09-1940",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta16.setBounds(230, 360, 500, 50);
        etiqueta16.setForeground(Color.BLACK);
        etiqueta16.setOpaque(true); //Establecer el fondo para pintar
        etiqueta16.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta16); //Agregar la etiqueta al panel
        
        //Etiqueta 17
         JLabel etiqueta17 = new JLabel("07281814",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta17.setBounds(230, 420, 50, 50);
        etiqueta17.setForeground(Color.BLACK);
        etiqueta17.setOpaque(true); //Establecer el fondo para pintar
        etiqueta17.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta17); //Agregar la etiqueta al panel
        
        //Etiqueta 18

         JLabel etiqueta18 = new JLabel("0984357604",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta18.setBounds(230, 480, 50, 50);
        etiqueta18.setForeground(Color.BLACK);
        etiqueta18.setOpaque(true); //Establecer el fondo para pintar
        etiqueta18.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta18); //Agregar la etiqueta al panel
        
         
        }   
      
      
      private void colocarCajasDeTexto(){
          JTextField cajaTexto = new JTextField();
          cajaTexto.setBounds(200, 550, 200, 20);
          panel.add(cajaTexto);        
          
      }
}
 
