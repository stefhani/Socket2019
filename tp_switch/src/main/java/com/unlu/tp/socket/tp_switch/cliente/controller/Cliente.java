package com.unlu.tp.socket.tp_switch.cliente.controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {

    public Cliente() {
    }

    public void iniciarCliente(String direccionIP, String puerto){
        //Definir una IP del Servidor Switch y su puerto
        try (
                //Socket so=new Socket("10.0.18.173",5000);
                Socket so=new Socket(direccionIP,Integer.parseInt(puerto));
                ObjectOutputStream out=new ObjectOutputStream(so.getOutputStream());
                ObjectInputStream in=new ObjectInputStream(so.getInputStream());
        ){
            // Persona p=new Persona("Carlos","Ríos",46);
            //  out.writeObject(p);
            System.out.println(in.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
