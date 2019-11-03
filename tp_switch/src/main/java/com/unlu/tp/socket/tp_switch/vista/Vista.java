package com.unlu.tp.socket.tp_switch.vista;

import com.unlu.tp.socket.tp_switch.cliente.controller.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista {
    Cliente cli = new Cliente();
    private JPanel panel1;
    private JTextField puerto;
    private JTextField ip;
    private JButton conectarButton;
    private JTextArea textArea1;

    public Vista() {
        //Para crear un addAction solo hacer click derecho el boton GUI y dar a la option Create Listener
        conectarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Obtener los valores de Form GUI
                String puertoServidor=puerto.getText();
                String ipServidor=ip.getText();
                cli.iniciarCliente(ipServidor,puertoServidor);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("IVista");
        frame.setContentPane(new Vista().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
