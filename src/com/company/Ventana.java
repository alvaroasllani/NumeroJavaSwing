package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    JLabel etiqueta;
    JTextField campo;
    JButton jugar;
    JDialog dialogo;
    JLabel etiqueta2;

    public Ventana() {
        super("Juego de numeros");
        etiqueta = new JLabel("Pon un #");
        campo = new JTextField(3);
        jugar = new JButton("Jugar");
        etiqueta2 = new JLabel("");
        dialogo = new JDialog(this);
        dialogo.setSize(400, 400);
        setLayout(new FlowLayout());
        add(etiqueta);
        add(campo);
        add(jugar);
        dialogo.add(etiqueta2);
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar();

            }
        });

    }

    private void jugar() {
        String valor = campo.getText();
        int num = Integer.parseInt(valor);
        num++;
        etiqueta2.setText("Mi numero es " + num);
        dialogo.setVisible(true);
    }
}
