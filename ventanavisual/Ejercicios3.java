package com.mycompany.ventanavisual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ejercicios3 extends JFrame implements ActionListener, KeyListener {
    private JTextField txtTexto;
    private JLabel etiTexto;
    private JButton btnVaciar;

    public Ejercicios3() {
        setTitle("Texto Dinámico");
        setSize(300, 150);
        setLayout(null); 

        txtTexto = new JTextField(20);
        etiTexto = new JLabel(" ");
        btnVaciar = new JButton("Vaciar");

        txtTexto.addKeyListener(this);
        btnVaciar.addActionListener(this);

        txtTexto.setBounds(50, 20, 200, 30);
        etiTexto.setBounds(50, 60, 200, 30);
        btnVaciar.setBounds(100, 60, 100, 30);

        add(txtTexto);
        add(etiTexto);
        add(btnVaciar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVaciar) {
            txtTexto.setText("");
            etiTexto.setText("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        etiTexto.setText(txtTexto.getText() + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        Ejercicios3 Ejercicios = new Ejercicios3();
        Ejercicios.setVisible(true);
    }
}

