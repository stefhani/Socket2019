package com.unlu.tp.socket.tp_switch.servidor;

import javax.swing.*;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSwitch  implements Runnable {
    private JTextArea txa;
    public ServidorSwitch(JTextArea txa) { this.txa = txa; }
    @Override public void run(){
        try (ServerSocket ss=new ServerSocket(6000)){
            while(true){
                try (Socket so=ss.accept();
                     InputStream in=so.getInputStream()){
                    String ip=so.getInetAddress().getHostAddress();
                    String nombre=ip;
                    for(String s:MapasIPServidores.getMapa().keySet()){
                        if(ip.equals(MapasIPServidores.getMapa().get(s)))
                            nombre=s;
                    }
                    String mensaje="";
                    int car;
                    while((car=in.read())!=-1){
                        mensaje+=(char)car;
                    }
                    txa.append(nombre+": "+mensaje+"\n");
                } catch (Exception e) { e.printStackTrace(); }
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
