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

public class MainActivity extends AppCompatActivity implements interfacelistener{

    private CustomView customView;
    private TextView scr,disp;
    private Switch mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        scr=findViewById(R.id.textView2);
        disp=findViewById(R.id.textView4);
        customView=findViewById(R.id.customView);
        customView.setListner(this);
        mode=findViewById(R.id.switch1);
    }



    public void stop(View view){
        customView.def();
    }

    public void change(View v){
        customView.changer(mode.isChecked());
        this.hide2(false);
    }


    @Override
    public void switcher(int var,boolean var2) {
        Intent intent=new Intent(MainActivity.this,end.class);
        intent.putExtra("score",var);
        intent.putExtra("isHard",var2);
        startActivity(intent);
        finish();
    }

    @Override
    public void scorer(int b) {
        scr.setText(Integer.toString(b));
    }

    @Override
    public void display() {
        disp.setText("Game is paused. Tap to resume");
        disp.setVisibility(View.VISIBLE);
    }

    @Override
    public void hide() {
        disp.setVisibility(View.INVISIBLE);
    }



    @Override
    public void hide2(boolean b) {
        mode.setEnabled(b);
    }


}