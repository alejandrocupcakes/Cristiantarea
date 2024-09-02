package com.mycompany.ventanavisual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CiudadOculta extends JFrame implements ActionListener {
    private JTextField txtNombre;
    private JTextField txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar;
    private JButton btnDesactivar;
    private JButton btnActivar;

    public CiudadOculta() {
        setTitle("Nombre y Ciudad");
        setSize(400, 200);
        setLayout(null);

        txtNombre = new JTextField(15);
        txtCiudad = new JTextField(15);
        txtFrase = new JLabel("                                                    ");
        btnAceptar = new JButton("Aceptar");
        btnDesactivar = new JButton("Desactivar");
        btnActivar = new JButton("Activar");

        btnAceptar.addActionListener(this);
        btnDesactivar.addActionListener(this);
        btnActivar.addActionListener(this);

        txtNombre.setBounds(40, 20, 150, 30);
        txtCiudad.setBounds(200, 20, 140, 30);
        txtFrase.setBounds(50, 60, 300, 30);
        btnAceptar.setBounds(50, 100, 100, 30);
        btnDesactivar.setBounds(250, 100, 100, 30); 
        btnActivar.setBounds(150, 100, 100, 30); 

        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Ciudad:"));
        add(txtCiudad);
        add(txtFrase);
        add(btnAceptar);
        add(btnDesactivar);
        add(btnActivar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            String nombre = txtNombre.getText();
            String ciudad = txtCiudad.getText();
            txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad + ".");
        } else if (e.getSource() == btnDesactivar) {
            txtNombre.setEnabled(false);
            txtCiudad.setEnabled(false);
        } else if (e.getSource() == btnActivar) {
            txtNombre.setEnabled(true);
            txtCiudad.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        CiudadOculta Ciudad = new CiudadOculta();
        Ciudad.setVisible(true);
    }
}
