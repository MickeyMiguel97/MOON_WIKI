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
                img = R.drawable.sun;
                break;
            case 1:
                img = R.drawable.mercury;
                break;
            case 2:
                img = R.drawable.jupiter;
                break;
            case 3:
                img = R.drawable.saturn;
                break;
            case 4:
                img = R.drawable.sun;
                break;
            case 5:
                img = R.drawable.sun;
                break;
            case 6:
                img = R.drawable.sun;
                break;
            case 7:
                img = R.drawable.sun;
                break;
            case 8:
                img = R.drawable.sun;
                break;
            case 9:
                img = R.drawable.sun;
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
