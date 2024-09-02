package com.mycompany.ventanavisual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Traspaso extends JFrame implements ActionListener {
    private JTextField txtTexto;
    private JLabel etiTexto1;
    private JLabel etiTexto2;
    private JButton btnTraspasa1;
    private JButton btnTraspasa2;

    public Traspaso() {
        setTitle("Traspaso de Texto");
        setSize(300, 200);
        setLayout(null);

        txtTexto = new JTextField(20);
        etiTexto1 = new JLabel(" ");
        etiTexto2 = new JLabel(" ");
        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa2 = new JButton("Traspasa 2");

        btnTraspasa1.addActionListener(this);
        btnTraspasa2.addActionListener(this);

        txtTexto.setBounds(50, 20, 200, 30);
        etiTexto1.setBounds(200, 60, 200, 30);
        etiTexto2.setBounds(50, 60, 200, 30);
        btnTraspasa1.setBounds(50, 100, 100, 30); 
        btnTraspasa2.setBounds(150, 100, 100, 30); 

        add(txtTexto);
        add(etiTexto1);
        add(etiTexto2);
        add(btnTraspasa1);
        add(btnTraspasa2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String texto = txtTexto.getText();
        if (e.getSource() == btnTraspasa1) {
            etiTexto1.setText(texto);
        } else if (e.getSource() == btnTraspasa2) {
            etiTexto2.setText(texto);
        }
    }

    public static void main(String[] args) {
        Traspaso Traspasar = new Traspaso();
        Traspasar.setVisible(true);
    }
}

