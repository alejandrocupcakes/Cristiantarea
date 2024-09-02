package com.mycompany.ventanavisual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class Posicion extends JFrame implements ActionListener {
    private JLabel etiNombre;
    private JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;
    private final int BUTTON_WIDTH = 100;
    private final int BUTTON_HEIGHT = 30;

    public Posicion() {
        setTitle("Eventos del Mouse y Posicionamiento");
        setSize(400, 300);
        setLayout(null); 
        etiNombre = new JLabel("Tu Nombre");
        etiNombre.setBackground(Color.YELLOW);
        etiNombre.setOpaque(true);
        etiNombre.setBounds(10, 10, 100, 30);

        btnEsquina = createButton("Esquina", 50, 50);
        btnCentro = createButton("Centro", 200, 50);
        btnAgrandar = createButton("Agrandar", 50, 90);
        btnAchicar = createButton("Achicar", 200, 90);

        add(etiNombre);
        add(btnEsquina);
        add(btnCentro);
        add(btnAgrandar);
        add(btnAchicar);
    }

    private JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, BUTTON_WIDTH, BUTTON_HEIGHT);
        button.addActionListener(this);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setSize(BUTTON_WIDTH + 20, BUTTON_HEIGHT + 10);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
            }
        });
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEsquina) {
            etiNombre.setLocation(0, 0);
        } else if (e.getSource() == btnCentro) {
            int x = (getWidth() - etiNombre.getWidth()) / 2;
            int y = (getHeight() - etiNombre.getHeight()) / 2;
            etiNombre.setLocation(x, y);
        } else if (e.getSource() == btnAgrandar) {
            etiNombre.setSize(etiNombre.getWidth() + 20, etiNombre.getHeight() + 10);
        } else if (e.getSource() == btnAchicar) {
            etiNombre.setSize(etiNombre.getWidth() - 20, etiNombre.getHeight() - 10);
        }
    }

    public static void main(String[] args) {
        Posicion Posiciones = new Posicion();
        Posiciones.setVisible(true);
    }
}
