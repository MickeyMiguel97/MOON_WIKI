package com.example.rafaj.fragmentapp;

import java.io.Serializable;

/**
 * Created by Yanira Yanes on 15/04/2018.
 */

public class SailorGuardiana implements Serializable {

    private int img;
    private String name, name2;

    //constructor
    public SailorGuardiana(String name, int posicion_imagen){
        this.name = name;
        this.name2 = name2;

        //tomando los recursos de drawable
        switch(posicion_imagen){
            case 0:
                img = R.drawable.uno;
                name2 = "Su cumpleaños: 30 de Junio\nSigno astrologico: Cancer\n Pasatiempos: Jugar";
                break;
            case 1:
                img = R.drawable.dos;
                name2 = "Su cumpleaños: 10 de Septiembre\nSigno astrologico: Virgo\nPasatiempos: Leer, ajedrez y natación";
                break;
            case 2:
                img = R.drawable.tres;
                name2 = "Su cumpleaños: 22 de Octubre\nSigno astrologico: Libra\nPasatiempos: Perseguir a sus ídolos";
                break;
            case 3:
                img = R.drawable.cuatro;
                name2 = "Su cumpleaños: 30 de Junio\nSigno astrologico: Cancer\nPasatiempos: Ir de compras y Video Juegos";
                break;
            case 4:
                img = R.drawable.cinco;
                name2 = "Su cumpleaños: 17 de Abril\nSigno Astrologico: Aries\nPasatiempo: Leer el futuro";
                break;
            case 5:
                img = R.drawable.seis;
                name2 = "Su cumpleaños: 5 de Diciembre\nSigno astrologico: Sagitario\nPasatiempos: Buscar precios de descuento";
                break;
            case 6:
                img = R.drawable.siete;
                name2 = "Su cumpleaños: 6 de Enero\nSigno astrologico: Capricornio\nPasatiempos: Leer y coleccionar lamparas";
                break;
            case 7:
                img = R.drawable.ocho;
                name2 = "Su cumpleaños: El 27 de enero\nSigno astrologico: Aquario\nSu pasatiempo: Manejar";
                break;
            case 8:
                img = R.drawable.nueve;
                name2 = "Su cumpleanos: 6 de Marzo\nSigno astrologico: Piscis\nSu pasatiempo: Tocar el violin";
                break;
            case 9:
                img = R.drawable.diez;
                name2 = "Su cumpleaños: 29 de Octubre\nSigno astrologico: Escorpion\nSu pasatiempo: Ir de compras";
                break;
        }

    }

    //getters para img
    public int getimg() {
        return img;
    }

    //getters para name
    public String getname() {
        return name;
    }

    //getters para name2
    public String getname2() {
        return name2;
    }
}
