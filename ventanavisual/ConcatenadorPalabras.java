package com.mycompany.ventanavisual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConcatenadorPalabras extends JFrame implements ActionListener {
    private JTextField txtPalabra1, txtPalabra2;
    private JButton btnConcatena;
    private JLabel etiTexto;

    public ConcatenadorPalabras() {
        setTitle("Concatenador de Palabras");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblPalabra1 = new JLabel("Palabra 1:");
        lblPalabra1.setBounds(50, 20, 100, 30);
        add(lblPalabra1);
        txtPalabra1 = new JTextField();
        txtPalabra1.setBounds(150, 20, 200, 30);
        add(txtPalabra1);

        JLabel lblPalabra2 = new JLabel("Palabra 2:");
        lblPalabra2.setBounds(50, 60, 100, 30);
        add(lblPalabra2);
        txtPalabra2 = new JTextField();
        txtPalabra2.setBounds(150, 60, 200, 30);
        add(txtPalabra2);

        btnConcatena = new JButton("Concatena");
        btnConcatena.setBounds(150, 100, 100, 30);
        btnConcatena.addActionListener(this);
        add(btnConcatena);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 140, 100, 30);
        add(lblResultado);
        etiTexto = new JLabel();
        etiTexto.setBounds(150, 140, 200, 30);
        add(etiTexto);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConcatena) {
            String palabra1 = txtPalabra1.getText();
            String palabra2 = txtPalabra2.getText();
            String resultado = palabra1 + palabra2;
            etiTexto.setText(resultado);
        }
    }

    public static void main(String[] args) {
        ConcatenadorPalabras Palabras = new ConcatenadorPalabras();
        Palabras.setVisible(true);
    }
}
