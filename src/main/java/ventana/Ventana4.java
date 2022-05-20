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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author TUF GAMING
 */
public class Ventana4 extends JFrame{ 
    public JPanel panel;

    /**
     *
     */
    public Ventana4(){
        
       setSize(700,600);
        setTitle("Ventana 4"); //Titulo
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
        
        colocarRadioBotones();
        
        
        
    }
        
        private void colocarPaneles(){
        panel = new JPanel(); //Creacion panel
        panel.setLayout(null);//Desactivar el diseño del panel
        this.getContentPane().add(panel);//Agregar panel
        }
        private void colocarEtiquetas(){
        //Etiqueta 1
        JLabel etiqueta1 = new JLabel("CREAR GRUPO",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta1.setBounds(0, 10, 700, 50);
        etiqueta1.setForeground(Color.WHITE);
        etiqueta1.setOpaque(true); //Establecer el fondo para pintar
        etiqueta1.setBackground(Color.blue);//Color de fondo
        etiqueta1.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta1); //Agregar la etiqueta al panel
        
         //Etiqueta 1
        JLabel etiqueta = new JLabel("Periodo Academico:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta.setBounds(0, 50, 150, 50);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setOpaque(true); //Establecer el fondo para pintar
    
        etiqueta.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta); //Agregar la etiqueta al panel
        
        
        //Etiqueta 20
        JLabel etiqueta20 = new JLabel("2022 - 2022",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta20.setBounds(195, 50, 150, 50);
        etiqueta20.setForeground(Color.BLACK);
        etiqueta20.setOpaque(true); //Establecer el fondo para pintar
    
        etiqueta.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta20); //Agregar la etiqueta al panel
        
         //Etiqueta q
        JLabel etiquetaq = new JLabel("Sede: ",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiquetaq.setBounds(0, 80, 100, 50);
        etiquetaq.setForeground(Color.BLACK);
        etiquetaq.setOpaque(true); //Establecer el fondo para pintar
        
        etiquetaq.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiquetaq); //Agregar la etiqueta al panel
        
        
        //Etiqueta k
        JLabel etiquetak = new JLabel("MATRIZ CUENCA ",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiquetak.setBounds(230, 80, 150, 50);
        etiquetak.setForeground(Color.BLACK);
        etiquetak.setOpaque(true); //Establecer el fondo para pintar
        etiquetak.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiquetak); //Agregar la etiqueta al panel
        
        
        //Etiqueta 30
        JLabel etiqueta30 = new JLabel("Campus/Extensión: ",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta30.setBounds(0, 115, 150, 50);
        etiqueta30.setForeground(Color.BLACK);
        etiqueta30.setOpaque(true); //Establecer el fondo para pintar
        
        etiqueta30.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta30); //Agregar la etiqueta al panel
        
         //Etiqueta 31
        JLabel etiqueta31 = new JLabel("EL VECINO ",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta31.setBounds(200, 115, 150, 50);
        etiqueta31.setForeground(Color.BLACK);
        etiqueta31.setOpaque(true); //Establecer el fondo para pintar
        etiqueta31.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta31); //Agregar la etiqueta al panel
        
        
        //Etiqueta 3
         JLabel etiqueta3 = new JLabel("Modalidad: ",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta3.setBounds(0, 150, 150, 50);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setOpaque(true); //Establecer el fondo para pintar
        etiqueta3.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta3); //Agregar la etiqueta al panel
        
          //Etiqueta 21
         JLabel etiqueta21 = new JLabel("PRESENCIAL ",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta21.setBounds(210, 150, 150, 50);
        etiqueta21.setForeground(Color.BLACK);
        etiqueta21.setOpaque(true); //Establecer el fondo para pintar
        etiqueta21.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta21); //Agregar la etiqueta al panel
      
        
        
        //Etiqueta 4
          JLabel etiqueta4 = new JLabel("Carrera: ",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta4.setBounds(0, 180, 150, 50);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true); //Establecer el fondo para pintar
        etiqueta4.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta4); //Agregar la etiqueta al panel
        
          //Etiqueta 22
         JLabel etiqueta22 = new JLabel("AGROPECUARIA ",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta22.setBounds(230, 180, 150, 50);
        etiqueta22.setForeground(Color.BLACK);
        etiqueta22.setOpaque(true); //Establecer el fondo para pintar
        etiqueta22.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta22); //Agregar la etiqueta al panel
        
        
        //Etiqueta 5
        
         JLabel etiqueta5 = new JLabel("Codigo de Proyecto:*",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta5.setBounds(0, 210, 150, 50);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setOpaque(true); //Establecer el fondo para pintar
        etiqueta5.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta5); //Agregar la etiqueta al panel
        
          //Etiqueta 23
         JLabel etiqueta23 = new JLabel("AGROPECUARIA [REDISEÑO - NUEVA O REDISEÑO] ",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta23.setBounds(275, 210, 300, 50);
        etiqueta23.setForeground(Color.BLACK);
        etiqueta23.setOpaque(true); //Establecer el fondo para pintar
        etiqueta23.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta23); //Agregar la etiqueta al panel
        
        
        //Etiqueta 6
          JLabel etiqueta6 = new JLabel(" Asigntura:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta6.setBounds(0, 240, 150, 50);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setOpaque(true); //Establecer el fondo para pintar
        etiqueta6.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta6);
        
        
          //Etiqueta 24
         JLabel etiqueta24 = new JLabel("E-CV-IAG-003 BOTÁNICA ",SwingConstants.RIGHT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta24.setBounds(285, 240, 150, 50);
        etiqueta24.setForeground(Color.BLACK);
        etiqueta24.setOpaque(true); //Establecer el fondo para pintar
        etiqueta24.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta24); //Agregar la etiqueta al panel
        
        
              //Etiqueta 7
          JLabel etiqueta7 = new JLabel(" Nombre de grupo:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta7.setBounds(0, 270, 150, 50);
        etiqueta7.setForeground(Color.BLACK);
        etiqueta7.setOpaque(true); //Establecer el fondo para pintar
        etiqueta7.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta7);
        
        //Etiqueta 8
          JLabel etiqueta8 = new JLabel(" Cupos por grupo *:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta8.setBounds(0, 290, 150, 80);
        etiqueta8.setForeground(Color.BLACK);
        etiqueta8.setOpaque(true); //Establecer el fondo para pintar
        etiqueta8.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta8);
        
        //Etiqueta 9
          JLabel etiqueta9 = new JLabel(" Autorizacion calificacion sobre 100:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta9.setBounds(0, 320, 150, 50);
        etiqueta9.setForeground(Color.BLACK);
        etiqueta9.setOpaque(true); //Establecer el fondo para pintar
        etiqueta9.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta9);
        
        //Etiqueta 10
          JLabel etiqueta10 = new JLabel(" Seleccionar Jornada del Grupo:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta10.setBounds(0, 350, 200, 50);
        etiqueta10.setForeground(Color.BLACK);
        etiqueta10.setOpaque(true); //Establecer el fondo para pintar
        etiqueta10.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta10);
        
        //Etiqueta 11
          JLabel etiqueta11 = new JLabel(" Oferta para estudiantes:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta11.setBounds(0, 380, 150, 50);
        etiqueta11.setForeground(Color.BLACK);
        etiqueta11.setOpaque(true); //Establecer el fondo para pintar
        etiqueta11.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta11);
        
          //Etiqueta 12
          JLabel etiqueta12 = new JLabel(" Aplica cambio de grupo:",SwingConstants.LEFT);//Crear etiqueta
        //etiqueta.setText("Inscribete");
        etiqueta12.setBounds(0, 410, 150, 50);
        etiqueta12.setForeground(Color.BLACK);
        etiqueta12.setOpaque(true); //Establecer el fondo para pintar
        etiqueta12.setFont(new Font("verdana",1,10)); //Tipo de fuente
        panel.add(etiqueta12);
        }
         private void colocarBotones(){
          JButton boton1 = new JButton("Guardar");
          boton1.setBounds(0, 500, 100, 40);
          panel.add(boton1);
          boton1.setForeground(Color.BLACK);
          boton1.setFont(new Font("verdana",Font.BOLD,12));//FUENTE LETRA BOTON
          
            JButton boton2 = new JButton("Cancelar");
          boton2.setBounds(110, 500, 100, 40);
          panel.add(boton2);
          boton2.setForeground(Color.BLACK);
          boton2.setFont(new Font("verdana",Font.BOLD,12));//FUENTE LETRA BOTON
      }
         
          private void colocarCajasDeTexto(){
                  JTextField cajaTexto = new JTextField();
                  cajaTexto.setBounds(280,280,400,30);
                  panel.add(cajaTexto);
                  
               
                  JTextField cajaTexto1 = new JTextField();
                  cajaTexto1.setBounds(280,310,150,20);
                  panel.add(cajaTexto1);
                  
        }
          
           private void colocarListasDesplegables(){
       
        
      
    
       
         
         JComboBox listaDesplegable2 = new JComboBox();
        listaDesplegable2.setBounds(280, 350, 200, 30);
        
         listaDesplegable2.addItem("JORNADAS DISPONIBLES");
          listaDesplegable2.setSelectedItem("JORNADAS DISPONIBLES");//Seleccionar
         panel.add(listaDesplegable2);
         
          JComboBox listaDesplegable3 = new JComboBox();
        listaDesplegable3.setBounds(280, 420, 100, 20);
        
         listaDesplegable3.addItem("SI");
         listaDesplegable3.addItem("NO");
          listaDesplegable3.setSelectedItem("SI");//Seleccionar
         panel.add(listaDesplegable3);
         
           }
           
           private void colocarRadioBotones(){
           JRadioButton radioBoton1 = new JRadioButton("Nuevos",true);
           radioBoton1.setBounds(280,380,100,50);
           panel.add(radioBoton1);
           }
}
        
       

