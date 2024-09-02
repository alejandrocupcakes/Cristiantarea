package com.mycompany.ventanavisual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraNotas extends JFrame implements ActionListener {
    private JTextField txtPrimerTrimestre, txtSegundoTrimestre, txtTercerTrimestre;
    private JLabel etiNotaFinal, etiResultado;
    private JButton btnCalcular;

    public CalculadoraNotas() {
        setTitle("Calculadora de Notas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblPrimerTrimestre = new JLabel("Primer Trimestre:");
        lblPrimerTrimestre.setBounds(20, 20, 120, 30);
        add(lblPrimerTrimestre);
        txtPrimerTrimestre = new JTextField();
        txtPrimerTrimestre.setBounds(150, 20, 100, 30);
        add(txtPrimerTrimestre);

        JLabel lblSegundoTrimestre = new JLabel("Segundo Trimestre:");
        lblSegundoTrimestre.setBounds(20, 60, 120, 30);
        add(lblSegundoTrimestre);
        txtSegundoTrimestre = new JTextField();
        txtSegundoTrimestre.setBounds(150, 60, 100, 30);
        add(txtSegundoTrimestre);

        JLabel lblTercerTrimestre = new JLabel("Tercer Trimestre:");
        lblTercerTrimestre.setBounds(20, 100, 120, 30);
        add(lblTercerTrimestre);
        txtTercerTrimestre = new JTextField();
        txtTercerTrimestre.setBounds(150, 100, 100, 30);
        add(txtTercerTrimestre);

        JLabel lblNotaFinal = new JLabel("Nota Final:");
        lblNotaFinal.setBounds(20, 140, 120, 30);
        add(lblNotaFinal);
        etiNotaFinal = new JLabel();
        etiNotaFinal.setBounds(150, 140, 100, 30);
        add(etiNotaFinal);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(20, 180, 120, 30);
        add(lblResultado);
        etiResultado = new JLabel();
        etiResultado.setBounds(150, 180, 100, 30);
        add(etiResultado);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 220, 100, 30);
        btnCalcular.addActionListener(this);
        add(btnCalcular);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
                double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
                double nota3 = Double.parseDouble(txtTercerTrimestre.getText());

                double notaFinal = (nota1 + nota2 + nota3) / 3;

                etiNotaFinal.setText(String.format("%.2f", notaFinal));

                if (notaFinal < 5) {
                    etiResultado.setText("Reprobado");
                    etiNotaFinal.setForeground(Color.RED);
                    etiResultado.setForeground(Color.RED);
                } else {
                    etiResultado.setText("Aprobado");
                    etiNotaFinal.setForeground(Color.BLACK);
                    etiResultado.setForeground(Color.BLACK);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, introduzca notas válidas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        CalculadoraNotas Nota = new CalculadoraNotas();
        Nota.setVisible(true);
    }
}
