package com.mycompany.ventanavisual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectorNumeros extends JFrame {
    private JLabel[] etiquetas;
    private JTextField txtNumero;
    private JButton btnBorrar;

    public SelectorNumeros() {
        setTitle("Selector de Números");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        int x = 20, y = 20, width = 50, height = 30, gap = 10;
        etiquetas = new JLabel[10];
        for (int i = 0; i < 10; i++) {
            etiquetas[i] = new JLabel(String.valueOf(i), SwingConstants.CENTER);
            etiquetas[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            etiquetas[i].setBounds(x + (i % 5) * (width + gap), y + (i / 5) * (height + gap), width, height);
            etiquetas[i].addMouseListener(new EtiquetaMouseListener());
            add(etiquetas[i]);
        }

        txtNumero = new JTextField(20);
        txtNumero.setEditable(false);
        txtNumero.setBounds(20, 100, 200, 30);
        add(txtNumero);

        btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(230, 100, 100, 30);
        btnBorrar.addActionListener(e -> txtNumero.setText(""));
        add(btnBorrar);

        setVisible(true);
    }

    private class EtiquetaMouseListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            JLabel etiqueta = (JLabel) e.getSource();
            String numeroActual = txtNumero.getText();
            txtNumero.setText(numeroActual + etiqueta.getText());
        }
    }

    public static void main(String[] args) {
        SelectorNumeros Selector = new SelectorNumeros();
        Selector.setVisible(true);
    }
}
