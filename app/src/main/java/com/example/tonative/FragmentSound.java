package com.example.tonative;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public class FragmentSound extends Fragment {
    EditText input_speech, output_speech;
    ImageView button_speech;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentsound,container,false);
        input_speech=view.findViewById(R.id.input_speech);
        output_speech=view.findViewById(R.id.output_speech);
        button_speech=view.findViewById(R.id.button_speech);
        return view;


    }
}
