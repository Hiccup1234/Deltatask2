package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.view.WindowManager;


public class MA2 extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void start(View view){
        Intent intent=new Intent(MA2.this, MainActivity.class);
        startActivity(intent);
    }
    public void hScore(View v){
        Intent intent=new Intent(MA2.this,highScores.class);
        startActivity(intent);
    }
    public void exit(View v){
        this.finishAffinity();
    }

}
