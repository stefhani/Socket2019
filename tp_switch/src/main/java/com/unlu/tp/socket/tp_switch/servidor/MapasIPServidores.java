package com.unlu.tp.socket.tp_switch.servidor;

import java.util.Map;
import java.util.TreeMap;

public class MapasIPServidores {
    //Agregar las Direcciones IP de los servidor Firebirds y Postgrest SQL
    //map.put("Firebirds", IP Maquina Virtual que tiene firebirds)
    //map.put("PostgrestSQL", IP Maquina Virtual que tiene Postgrest)
    public static Map<String,String> getMapa(){
        Map<String,String>mapa=new TreeMap();
        mapa.put("Carlos", "10.0.18.173");
        mapa.put("Rodrigo", "10.0.18.195");
        mapa.put("Esteban", "10.0.19.116");
        mapa.put("Mariana", "10.0.16.8");
        mapa.put("Joaquin", "10.0.16.192");
        return mapa;
    }
}
