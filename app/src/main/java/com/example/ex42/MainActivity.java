package com.example.ex42;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton btn;
    Random rand;
    int[] img = new int[7];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rand = new Random();
        btn = (ImageButton) findViewById(R.id.main_button);

        img[0] = R.drawable.leaver_0;
        img[1] = R.drawable.leaver_1;
        img[2] = R.drawable.leaver_2;
        img[3] = R.drawable.btn_img_click;
        img[4] = R.drawable.btn_img_1;
        img[5] = R.drawable.btn_img_2;
        img[6] = R.drawable.btn_img_3;


        btn.setImageResource(img[3]);
        iv = findViewById(R.id.iv);
        btn.setBackgroundColor(Color.rgb(250,245,245));
    }

    public void buttonClick(View view) {
        int number = rand.nextInt(3);
        System.out.println(number);
        btn.setImageResource(img[number+4]);
        iv.setImageResource(img[number]);
    }
}
