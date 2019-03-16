package com.cristianalfaro.ejercicio3_labo02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9;
    private ArrayList<Integer> images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        images = new ArrayList<Integer>();

        images.add(R.drawable.image1);
        images.add(R.drawable.image2);
        images.add(R.drawable.image3);
        images.add(R.drawable.image4);
        images.add(R.drawable.image5);
        images.add(R.drawable.image6);
        images.add(R.drawable.image7);
        images.add(R.drawable.image8);
        images.add(R.drawable.image9);


        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image4 = (ImageView) findViewById(R.id.image4);
        image5 = (ImageView) findViewById(R.id.image5);
        image6 = (ImageView) findViewById(R.id.image6);
        image7 = (ImageView) findViewById(R.id.image7);
        image8 = (ImageView) findViewById(R.id.image8);
        image9 = (ImageView) findViewById(R.id.image9);



        image1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image1.setImageResource(images.get((int)(Math.random()*9)));

            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image2.setImageResource(images.get((int)(Math.random()*9)));

            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image3.setImageResource(images.get((int)(Math.random()*9)));

            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image4.setImageResource(images.get((int)(Math.random()*9)));

            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image5.setImageResource(images.get((int)(Math.random()*9)));

            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image6.setImageResource(images.get((int)(Math.random()*9)));

            }
        });
        image7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image7.setImageResource(images.get((int)(Math.random()*9)));

            }
        });
        image8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image8.setImageResource(images.get((int)(Math.random()*9)));

            }
        });
        image9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image9.setImageResource(images.get((int)(Math.random()*9)));

            }
        });

    }
}
