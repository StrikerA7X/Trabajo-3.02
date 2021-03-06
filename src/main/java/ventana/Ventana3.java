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
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author TUF GAMING
 */
public class Ventana3 extends JFrame{ 
    public JPanel panel;

    /**
     *
     */
    public Ventana3(){
        
       setSize(500,600);
        setTitle("Ventana 3"); //Titulo
        setLocationRelativeTo(null);
        iniciarComponentes();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        
    }
    private void iniciarComponentes(){
        
        colocarPaneles();
    
        colocarEtiquetas();
        
        colocarListasDesplegables();
        
        colocarBotones();
           
        
    }
        
        private void colocarPaneles(){
        panel = new JPanel(); //Creacion panel
        panel.setLayout(null);//Desactivar el diseño del panel
        this.getContentPane().add(panel);//Agregar panel
        }
        private void colocarEtiquetas(){
        //Etiqueta 1
        JLabel etiqueta1 = new JLabel("INFORMACION DE CARRERA",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta1.setBounds(0, 10, 500, 50);
        etiqueta1.setForeground(Color.WHITE);
        etiqueta1.setOpaque(true); //Establecer el fondo para pintar
        etiqueta1.setBackground(Color.blue);//Color de fondo
        etiqueta1.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta1); //Agregar la etiqueta al panel
        
         //Etiqueta 1
        JLabel etiqueta = new JLabel("Periodo Academico:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta.setBounds(0, 80, 150, 50);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setOpaque(true); //Establecer el fondo para pintar
    
        etiqueta.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta); //Agregar la etiqueta al panel
        
         //Etiqueta q
        JLabel etiquetaq = new JLabel("Carrera: *",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiquetaq.setBounds(0, 130, 500, 50);
        etiquetaq.setForeground(Color.BLACK);
        etiquetaq.setOpaque(true); //Establecer el fondo para pintar
        
        etiquetaq.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiquetaq); //Agregar la etiqueta al panel
        
        //Etiqueta 2
        JLabel etiqueta2 = new JLabel("Modalidad: *",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta2.setBounds(0, 180, 500, 50);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta2); //Agregar la etiqueta al panel
        
        //Etiqueta 3
         JLabel etiqueta3 = new JLabel("Sede: *",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta3.setBounds(0, 240, 500, 50);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta3); //Agregar la etiqueta al panel
        
        //Etiqueta 4
          JLabel etiqueta4 = new JLabel("Campus: *",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta4.setBounds(0, 300, 500, 50);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta4); //Agregar la etiqueta al panel
        
        //Etiqueta 5
        
         JLabel etiqueta5 = new JLabel("Jornada:*",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta5.setBounds(0, 360, 500, 50);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setOpaque(true); //Establecer el fondo para pintar
        etiqueta5.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta5); //Agregar la etiqueta al panel
        
        //Etiqueta 6
          JLabel etiqueta6 = new JLabel(" Fecha de registro:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta6.setBounds(0, 420, 150, 50);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setOpaque(true); //Establecer el fondo para pintar
        etiqueta6.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta6);
        
              //Etiqueta 7
          JLabel etiqueta7 = new JLabel(" 29/04/2022",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta7.setBounds(200, 420, 150, 50);
        etiqueta7.setForeground(Color.BLACK);
        etiqueta7.setOpaque(true); //Establecer el fondo para pintar
        etiqueta7.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta7);
  
          //Etiqueta 8
          JLabel etiqueta8 = new JLabel(" 2022-2022",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta8.setBounds(200, 80, 150, 50);
        etiqueta8.setForeground(Color.BLACK);
        etiqueta8.setOpaque(true); //Establecer el fondo para pintar
        etiqueta8.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta8);
  
        
        }
        
        
        private void colocarListasDesplegables(){
       
        
      
    
        JComboBox listaDesplegable = new JComboBox();
        listaDesplegable.setBounds(200, 130, 200, 30);
        
         listaDesplegable.addItem("Arquitectura");
         listaDesplegable.addItem("Telecomunicaciones");
          listaDesplegable.addItem("Mecatronica");
          listaDesplegable.setSelectedItem("Arquitectura");//Seleccionar
         panel.add(listaDesplegable);
         
         JComboBox listaDesplegable2 = new JComboBox();
        listaDesplegable2.setBounds(200, 180, 200, 30);
        
         listaDesplegable2.addItem("Presencial");
         listaDesplegable2.addItem("Virtual");
          listaDesplegable2.setSelectedItem("Presencial");//Seleccionar
         panel.add(listaDesplegable2);
         
           JComboBox listaDesplegable3 = new JComboBox();
        listaDesplegable3.setBounds(200, 240, 200, 30);
        
         listaDesplegable3.addItem("Matriz Cuenca");
         listaDesplegable3.addItem("Matriz Guayaquil");
         listaDesplegable3.addItem("Matriz Quito");
          listaDesplegable3.setSelectedItem("Matriz Cuenca");//Seleccionar
         panel.add(listaDesplegable3);
         
         
          JComboBox listaDesplegable4 = new JComboBox();
        listaDesplegable4.setBounds(200, 300, 200, 30);
        
         listaDesplegable4.addItem("El vecino");
          listaDesplegable4.setSelectedItem("El Vecino");//Seleccionar
         panel.add(listaDesplegable4);
         
         
         JComboBox listaDesplegable5 = new JComboBox();
        listaDesplegable5.setBounds(200, 360, 200, 30);
        
         listaDesplegable5.addItem("Diurna");
         listaDesplegable5.addItem("Nocturna");
          listaDesplegable5.setSelectedItem("Diurna");//Seleccionar
         panel.add(listaDesplegable5);
         
         JComboBox listaDesplegable6 = new JComboBox();
        listaDesplegable6.setBounds(200, 420, 200, 30);
        
        
        
          }
private void colocarBotones(){
          JButton boton1 = new JButton("Siguiente");
          boton1.setBounds(350, 500, 100, 40);
          panel.add(boton1);
          boton1.setForeground(Color.BLACK);
          boton1.setFont(new Font("verdana",Font.BOLD,12));//FUENTE LETRA BOTON
          
}
}