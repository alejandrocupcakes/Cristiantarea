package com.mycompany.ventanavisual;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class VentanaVisual extends JFrame {
JPanel miPanel;
JLabel miTitulo1;
JButton miBoton1;
JLabel miTitulo2;
JButton miBoton3;
JButton miBoton4;
JButton miBoton2;


public VentanaVisual(){
    iniciarComponentes();
    setTitle("Consultar datos");
    setSize(400,300);
    setLocationRelativeTo(null);
    iniciarComponentes();
}
private void iniciarComponentes(){
    miPanel=new JPanel();
    miPanel.setLayout(null);
    miPanel.setBackground(Color.gray);

    miTitulo1=new JLabel();
    miTitulo1.setText("Armenia");
    miTitulo1.setBounds(100,10,100,30);
    
     miBoton1=new JButton();
    miBoton1.setText("Ocultar");
    miBoton1.setBounds(100,40,100,30);
    
     miBoton2=new JButton();
    miBoton2.setText("Visualizar");
    miBoton2.setBounds(100,100,100,30);
    
       miTitulo2=new JLabel();
    miTitulo2.setText("Eduard");
    miTitulo2.setBounds(200,10,100,30);
    
    miBoton3=new JButton();
    miBoton3.setText("Ocultar");
    miBoton3.setBounds(200,40,100,30);
 
       
          miBoton4=new JButton();
    miBoton4.setText("visualizar");
    miBoton4.setBounds(200,100,100,30);
    
    miBoton1.addActionListener(e -> miTitulo1.setVisible(false));
    miBoton2.addActionListener(e -> miTitulo1.setVisible(true));
    miBoton3.addActionListener(e -> miTitulo2.setVisible(false));
    miBoton4.addActionListener(e -> miTitulo2.setVisible(true));
    
    miPanel.add(miTitulo1);
    miPanel.add(miBoton1);
     miPanel.add(miTitulo2);
    miPanel.add(miBoton2); 
    miPanel.add(miBoton3);
    miPanel.add(miBoton4);

    add(miPanel);
}

}
 
