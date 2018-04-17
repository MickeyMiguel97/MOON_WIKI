package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text, text2;
    ImageView imageS;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        //colocando los id del textview e imageview en las variables
        text = view.findViewById(R.id.textId);
        text2 = view.findViewById(R.id.textIdos);
        imageS = view.findViewById(R.id.imgId);
        Bundle bundle = this.getArguments();

        if(bundle != null){
            //creando objeto
            SailorGuardiana sailor = (SailorGuardiana)bundle.getSerializable("SAILOR");
            Toast.makeText(getActivity(), "Item: " + sailor.getname(), Toast.LENGTH_SHORT).show();
            //setenando string e imagen
            text.setText(sailor.getname());
            text2.setText(sailor.getname2());
            imageS.setImageResource(sailor.getimg());
        }

        return view;
    }
}
