package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text, text2;
    ImageView imageS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //colocando los id del textview e imageview en las variables
        text = findViewById(R.id.textId);
        text2 = findViewById(R.id.textIdos);
        imageS = findViewById(R.id.imgId);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();

        if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);
            }
        }

    }

    private void handleReceivedText(Intent intent){

        //creando objeto
        SailorGuardiana sailor = (SailorGuardiana)intent.getSerializableExtra("SAILOR");

        //condicion para que aparezca el string e imagen
        if (text != null) {
            text.setText(sailor.getname());
        }
        if (text2 != null) {
            text2.setText(sailor.getname2());
        }
        if (imageS != null){
            imageS.setImageResource(sailor.getimg());
        }
    }
}
