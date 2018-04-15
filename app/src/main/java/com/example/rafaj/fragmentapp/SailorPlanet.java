package com.example.rafaj.fragmentapp;

import java.io.Serializable;

/**
 * Created by maris on 14/4/2018.
 */

public class SailorPlanet implements Serializable {

    private int img;
    private String name;

    //constructor
    public SailorPlanet(String name, int pos_imagen){
        this.name = name;

        //tomando los recursos de drawable
        if(pos_imagen==0){
            img = R.drawable.sun;
        }
        else if(pos_imagen==1){
            img = R.drawable.mercury;
        }
        else if(pos_imagen==2){
            img = R.drawable.venus;
        }
        else if(pos_imagen==3){
            img = R.drawable.chibi_moon;
        }
        else if(pos_imagen==4){
            img = R.drawable.mars;
        }
        else if(pos_imagen==5){
            img = R.drawable.jupiter;
        }
        else if(pos_imagen==6){
            img = R.drawable.saturn;
        }
        else if(pos_imagen==7){
            img = R.drawable.uranus;
        }
        else if(pos_imagen==8){
            img = R.drawable.neptune;
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
