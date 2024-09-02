package com.mycompany.ventanavisual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Palabras extends JFrame {
    private JLabel etiPal1, etiPal2, etiPal3, etiPal4, etiOcultar;

    public Palabras() {
        setTitle("Ocultar Palabras");
        setSize(300, 200);
        setLayout(null);

        etiPal1 = new JLabel("Palabra1");
        etiPal2 = new JLabel("Palabra2");
        etiPal3 = new JLabel("Palabra3");
        etiPal4 = new JLabel("Palabra4");

        etiOcultar = new JLabel("Ocultar");
        etiOcultar.setFont(new Font("Arial", Font.BOLD, 20));
        etiOcultar.setOpaque(true);
        etiOcultar.setBackground(Color.LIGHT_GRAY);
        etiOcultar.setPreferredSize(new Dimension(100, 40));

        etiOcultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setWordsVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setWordsVisible(true);
            }
        });

        etiPal1.setBounds(50, 40, 100, 30);
        etiPal2.setBounds(50, 60, 100, 30);
        etiPal3.setBounds(50, 80, 100, 30);
        etiPal4.setBounds(50, 100, 100, 30);
        etiOcultar.setBounds(150, 70, 100, 40);

        add(etiPal1);
        add(etiPal2);
        add(etiPal3);
        add(etiPal4);
        add(etiOcultar);
    }

    private void setWordsVisible(boolean visible) {
        etiPal1.setVisible(visible);
        etiPal2.setVisible(visible);
        etiPal3.setVisible(visible);
        etiPal4.setVisible(visible);
    }

    public static void main(String[] args) {
        Palabras Palabra = new Palabras();
        Palabra.setVisible(true);
    }
}
