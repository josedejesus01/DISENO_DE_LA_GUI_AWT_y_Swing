
package practicas;// nombre del paquete


import java.awt.Color;// se inserta la extension de la libreria para mostrar el color de las letras
import javax.swing.*;// se inserta la libreria de java con las extension swing 

public class miventana extends JFrame {// la clase se hereda de jframe 

    
   public miventana(){// se crea un metodo constructor
       this.setSize(300, 400);// poner el tamaño de la ventana
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);// sirve para que el programa una vez terminado no se siga ejecutando
       this.setTitle("practica 1");//poner el titulo
       this.setLocation(300,200);// la ubicacion  de la ventana cuando se ejecute
       this.setBounds(300, 300, 400, 500);// para justificar los tamaños  

        JLabel e1 = new JLabel();// se utiliza para mostrar un mensaje al usuario 
        e1.setText("anota un nombre");// se inserta un texto de para mostralo en pantalla
        e1.setBounds(15, 5, 150, 40);// se establece los tamaño que contendra el objeto
        e1.setForeground(Color.BLUE);// se establece un color para cambiar el la letra de texto
        JLabel e2 = new JLabel();
        e2.setText("escribe una contraseña :");
        e2.setBounds(15, 35, 150, 40);
        e2.setForeground(Color.BLUE);//setForeground cambia el color de las letras
        JTextField t1 = new JTextField();// JTextField sirve para que el usuario inserte una cadena de texto dentro del cuadro
        t1.setText("");// para insertar los textos
        t1.setBounds(250, 10, 120, 20);// setBounds establece los tamaño
        JTextField t2 = new JTextField();
        t2.setText("");
        t2.setBounds(250, 40, 120, 20);
        JTextField t3 = new JTextField();
        t3.setBounds(10, 50, 20, 20);
        JButton b1 = new JButton();// JButton sirve para dar click en el programa
        b1.setText("ingresar");// se inserta un texto
        b1.setBounds(125, 90, 100, 20);// se establece los tamaños
        this.add(e1);// se agrega las etiqueta 
        this.add(e2);
        this.add(t1);
        this.add(t2);
        this.add(b1);
        this.add(t3);
    }
}
       
   
