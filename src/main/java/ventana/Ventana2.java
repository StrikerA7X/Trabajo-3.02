/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
        
       setSize(500,300);
        setTitle("Ventana 2"); //Titulo
        setLocationRelativeTo(null);
        iniciarComponentes();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        
    }
    private void iniciarComponentes(){
        
        colocarPaneles();
    
        colocarEtiquetas();
        
        colocarBotones();
        
        colocarCajasDeTexto();
        
        colocarListasDesplegables();
        
        
    }
        
        private void colocarPaneles(){
        panel = new JPanel(); //Creacion panel
        panel.setLayout(null);//Desactivar el diseño del panel
        this.getContentPane().add(panel);//Agregar panel
        }
        private void colocarEtiquetas(){
        //Etiqueta 1
        JLabel etiqueta = new JLabel("INSCRIBETE",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta.setBounds(0, 10, 500, 50);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setOpaque(true); //Establecer el fondo para pintar
        etiqueta.setBackground(Color.blue);//Color de fondo
        etiqueta.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta); //Agregar la etiqueta al panel
        
        //Etiqueta 2
        JLabel etiqueta2 = new JLabel("Seleccione una sede*",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta2.setBounds(0, 50, 500, 50);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta2); //Agregar la etiqueta al panel
        
        //Etiqueta 3
         JLabel etiqueta3 = new JLabel("Tipo de documento",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta3.setBounds(0, 100, 500, 50);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta3); //Agregar la etiqueta al panel
        
        //Etiqueta 4
          JLabel etiqueta4 = new JLabel("Ingrese su identificacion*",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta4.setBounds(0, 150, 500, 50);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta4); //Agregar la etiqueta al panel
        
        //
    }
      private void colocarBotones(){
          JButton boton1 = new JButton("Ingresar");
          boton1.setBounds(200, 200, 100, 40);
          panel.add(boton1);
          boton1.setForeground(Color.BLACK);
          boton1.setFont(new Font("verdana",Font.BOLD,12));//FUENTE LETRA BOTON
      }
      
      private void colocarCajasDeTexto(){
          JTextField cajaTexto = new JTextField();
          cajaTexto.setBounds(200,160,200,20);
          panel.add(cajaTexto);        
          
      }
       
    
      private void colocarListasDesplegables(){
       
        
          
        JComboBox listaDesplegable = new JComboBox();
        listaDesplegable.setBounds(20, 20, 100, 30);
         panel.add(listaDesplegable);
     
          
      }
      
}
