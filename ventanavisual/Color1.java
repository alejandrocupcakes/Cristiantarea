package com.mycompany.ventanavisual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Color1 extends JFrame implements ActionListener {
    private JLabel etiTexto;
    private JButton btnAzul, btnRojo, btnVerde;
    private JButton btnFondoAzul, btnFondoRojo, btnFondoVerde;
    private JButton btnTransparente, btnOpaca;

    public Color1() {
        setTitle("Cambiador de Colores");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 

        etiTexto = new JLabel("Texto de ejemplo");
        etiTexto.setBounds(150, 20, 100, 30);
        add(etiTexto);

        btnAzul = createButton("Azul", 50, 60);
        btnRojo = createButton("Rojo", 150, 60);
        btnVerde = createButton("Verde", 250, 60);
        btnFondoAzul = createButton("Fondo Azul", 50, 100);
        btnFondoRojo = createButton("Fondo Rojo", 150, 100);
        btnFondoVerde = createButton("Fondo Verde", 250, 100);
        btnTransparente = createButton("Transparente", 50, 140);
        btnOpaca = createButton("Opaca", 150, 140);

        setVisible(true);
    }

    private JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 100, 30);
        button.addActionListener(this);
        add(button);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAzul) {
            etiTexto.setForeground(Color.BLUE);
        } else if (e.getSource() == btnRojo) {
            etiTexto.setForeground(Color.RED);
        } else if (e.getSource() == btnVerde) {
            etiTexto.setForeground(Color.GREEN);
        } else if (e.getSource() == btnFondoAzul) {
            etiTexto.setBackground(Color.BLUE);
            etiTexto.setOpaque(true);
        } else if (e.getSource() == btnFondoRojo) {
            etiTexto.setBackground(Color.RED);
            etiTexto.setOpaque(true);
        } else if (e.getSource() == btnFondoVerde) {
            etiTexto.setBackground(Color.GREEN);
            etiTexto.setOpaque(true);
        } else if (e.getSource() == btnTransparente) {
            etiTexto.setOpaque(false);
        } else if (e.getSource() == btnOpaca) {
            etiTexto.setOpaque(true);
        }
        repaint();
    }

    public static void main(String[] args) {
        Color1 Colores = new Color1();
        Colores.setVisible(true);
    }
}
