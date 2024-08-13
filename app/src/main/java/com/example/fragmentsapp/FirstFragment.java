package com.example.fragmentsapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(context,
                "OnAttach() is Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),
                "OnCreate() is Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(),
                "OnResume() is Called", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // inflater- instance of the layout inflater that use to inflate a layout from xml
        //container- parent view that fragments ui should be attached to
        //savedInstanceState- gives information about the previous state of the fragment

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        //reference for the widgets

        Button firstBtn = view.findViewById(R.id.btn_frag1);
        TextView text = view.findViewById(R.id.text_frag1);

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "Welcome to first fragment",
                        Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
