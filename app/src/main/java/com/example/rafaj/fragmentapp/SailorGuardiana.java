package com.example.rafaj.fragmentapp;

import java.io.Serializable;

/**
 * Created by Yanira Yanes on 15/04/2018.
 */

public class SailorGuardiana implements Serializable {

    private int img;
    private String name;

    //constructor
    public SailorGuardiana(String name, int posicion_imagen){
        this.name = name;

        //tomando los recursos de drawable
        switch(posicion_imagen){
            case 0:
                img = R.drawable.uno;
                break;
            case 1:
                img = R.drawable.dos;
                break;
            case 2:
                img = R.drawable.tres;
                break;
            case 3:
                img = R.drawable.cuatro;
                break;
            case 4:
                img = R.drawable.cinco;
                break;
            case 5:
                img = R.drawable.seis;
                break;
            case 6:
                img = R.drawable.siete;
                break;
            case 7:
                img = R.drawable.ocho;
                break;
            case 8:
                img = R.drawable.nueve;
                break;
            case 9:
                img = R.drawable.diez;
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
}
