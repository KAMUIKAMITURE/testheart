package com.kamiture.kamui.testheart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void playback(View v) {
    }


    public void toline(View v) {
        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
        startActivity(intent);
    }
    public void direct(View v) {
        Intent intent = new Intent(Main3Activity.this, Main5Activity.class);
        startActivity(intent);
    }
}
