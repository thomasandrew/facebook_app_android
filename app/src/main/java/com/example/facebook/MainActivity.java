package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private ArrayList<Face_> face_ = new ArrayList<Face_>();
    private FaceAdapter faceAdapter;
    private Face_ face;
    private Boolean isPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);

        faceAdapter = new FaceAdapter(this, face_);
        recView.setAdapter(faceAdapter);

        facePost();
    }

    public void init() {
        recView = findViewById(R.id.recView);
    }

    public void facePost() {
        face = new Face_("John Stuart", "2 hrs", "The cars we drive say a lot about us.", R.drawable.cars, 9, 2, R.drawable.one);
        face_.add(face);

        face = new Face_("Jack Hook", "3 hrs", "My latest (and hopefully last!) lung operation went well, and if things continue healing up nicely I'll be out of hospital this weekend :)", 0, 5, 10, R.drawable.nine_);
        face_.add(face);

        face = new Face_("Emily Ashley", "5 hrs", "I will always love nature.", R.drawable.nature, 20, 7, R.drawable.two_);
        face_.add(face);

        face = new Face_("Sarah Parker", "10 hrs", "I can't wait to eat", R.drawable.eat_, 30, 15, R.drawable.three_);
        face_.add(face);

        face = new Face_("Ragnar Viking", "17 hrs", "Ok Fantasy people. If Gaskin plays this week, do you play him against the Jets or Mike Davis vs the Vikings? I'm in a must win for the #1 seed this week. Half ppr.", 0, 9, 20, R.drawable.t_e);
        face_.add(face);

        face = new Face_("Nicole Jolie", "20 hrs", "My new house", R.drawable.house, 1, 3, R.drawable.women);
        face_.add(face);

        faceAdapter.notifyDataSetChanged();
    }
}