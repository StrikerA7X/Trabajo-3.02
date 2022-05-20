/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

import java.awt.Color;
import java.awt.Font;
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
public class Ventana5 extends JFrame{ 
    public JPanel panel;

    /**
     *
     */
    public Ventana5(){
        
       setSize(1000,200);
        setTitle("Ventana 5"); //Titulo
        setLocationRelativeTo(null);
        iniciarComponentes();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        
    }
    private void iniciarComponentes(){
        
        colocarPaneles();
    
        colocarEtiquetas();
        
        colocarListasDesplegables();
        
        
    }
        
        private void colocarPaneles(){
        panel = new JPanel(); //Creacion panel
        panel.setLayout(null);//Desactivar el diseño del panel
        this.getContentPane().add(panel);//Agregar panel
        }
        private void colocarEtiquetas(){
        //Etiqueta 1
        JLabel etiqueta = new JLabel("Sede",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta.setBounds(0, 10, 150, 50);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setOpaque(true); //Establecer el fondo para pintar
        etiqueta.setFont(new Font("verdana",1,15)); //Tipo de fuente
        panel.add(etiqueta); //Agregar la etiqueta al panel
        
        //Etiqueta 2
        JLabel etiqueta2 = new JLabel("Campus/Extensión",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta2.setBounds(200, 10, 150, 50);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setOpaque(true); //Establecer el fondo para pintar
        etiqueta2.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta2); //Agregar la etiqueta al panel
        
        //Etiqueta 3
         JLabel etiqueta3 = new JLabel("Carrera",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta3.setBounds(460, 10, 80, 50);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta3); //Agregar la etiqueta al panel
        
        //Etiqueta 4
          JLabel etiqueta4 = new JLabel("Código del proyecto",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta4.setBounds(0, 50, 150, 50);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta4); //Agregar la etiqueta al panel
        
        //Etiqueta 5 
           JLabel etiqueta5 = new JLabel("Modalidad",SwingConstants.CENTER);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta5.setBounds(450, 50, 150, 50);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setOpaque(true); //Establecer el fondo para pintar
        etiqueta5.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta5); //Agregar la etiqueta al panel
        
         //Etiqueta 6
           JLabel etiqueta6 = new JLabel("Periodo Academico",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta6.setBounds(700, 50, 150, 50);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setOpaque(true); //Establecer el fondo para pintar
        etiqueta6.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta6); //Agregar la etiqueta al panel
        
          //Etiqueta 7
           JLabel etiqueta7 = new JLabel("Fecha Inicio Clases: 28/03/2022 al 06/08/2022",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta7.setBounds(0, 100, 500, 50);
        etiqueta7.setForeground(Color.BLACK);
        etiqueta7.setOpaque(true); //Establecer el fondo para pintar
        etiqueta7.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta7); //Agregar la etiqueta al panel
        
        
    }
        
        private void colocarListasDesplegables(){
       
          JComboBox listaDesplegable1 = new JComboBox();
        listaDesplegable1.setBounds(60, 10, 150, 30);
        
         listaDesplegable1.addItem("Matriz Cuenca");
         listaDesplegable1.addItem("Matriz Guayaquil");
         listaDesplegable1.addItem("Matriz Quito");
          listaDesplegable1.setSelectedItem("Matriz Cuenca");//Seleccionar
         panel.add(listaDesplegable1);
      
    
        JComboBox listaDesplegable = new JComboBox();
        listaDesplegable.setBounds(350, 10, 150, 30);
        
         listaDesplegable.addItem("EL VECINO");
          listaDesplegable.setSelectedItem("EL VECINO");//Seleccionar
         panel.add(listaDesplegable);
         
         JComboBox listaDesplegable2 = new JComboBox();
        listaDesplegable2.setBounds(550, 10, 350, 30);
        
         listaDesplegable2.addItem("AGROPECUARIA");
         listaDesplegable2.addItem("ARQUITECTURA");
          listaDesplegable2.setSelectedItem("AGROPECUARIA");//Seleccionar
         panel.add(listaDesplegable2);
         
         
         
          JComboBox listaDesplegable4 = new JComboBox();
        listaDesplegable4.setBounds(150, 50, 350, 30);
        
         listaDesplegable4.addItem("AGROPECUARIA [REDISEÑO - NUEVA O REDISEÑO] ");
          listaDesplegable4.setSelectedItem("AGROPECUARIA [REDISEÑO - NUEVA O REDISEÑO]");//Seleccionar
         panel.add(listaDesplegable4);
         
         
         JComboBox listaDesplegable5 = new JComboBox();
        listaDesplegable5.setBounds(590, 50, 150, 30);
        
         listaDesplegable5.addItem("PRECENCIAL");
         listaDesplegable5.addItem("VIRTUAL");
          listaDesplegable5.setSelectedItem("PRESENCIAL");//Seleccionar
         panel.add(listaDesplegable5);
         
         
           JComboBox listaDesplegable6 = new JComboBox();
        listaDesplegable6.setBounds(860, 50, 100, 30);
        
         listaDesplegable6.addItem("2022-2022");
       
          listaDesplegable6.setSelectedItem("2022-2022");//Seleccionar
         panel.add(listaDesplegable6);
         
        
          }
}