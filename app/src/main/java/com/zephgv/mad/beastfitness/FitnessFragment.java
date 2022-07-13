package com.zephgv.mad.beastfitness;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class FitnessFragment extends Fragment {

    ImageView img;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public FitnessFragment() {
    }

    public static FitnessFragment newInstance(String param1, String param2) {
        FitnessFragment fragment = new FitnessFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fitness, container, false);

        img = view.findViewById(R.id.bmibtn1);
        img2 = view.findViewById(R.id.dietbtn1);
        img3 = view.findViewById(R.id.musicbtn1);
        img4 = view.findViewById(R.id.wellbtn1);
        img5 = view.findViewById(R.id.tipsbtn1);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),BmicalcActivity.class);
                startActivity(intent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),DietActivity.class);
                startActivity(intent);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Redirecting to Spotify!", Toast.LENGTH_SHORT).show();
                gotoUri("https://open.spotify.com/playlist/1Pw57C5UiYrDSxa21UBWWY");
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),WellnessActivity.class);
                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Opening Guides!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.self.com/story/popular-at-home-workout-programs");
            }
        });

        return view;
    }

    private void gotoUri(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}