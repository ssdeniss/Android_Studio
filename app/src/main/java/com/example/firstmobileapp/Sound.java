//package com.example.firstmobileapp;
//
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.annotation.SuppressLint;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.content.res.ColorStateList;
//import android.graphics.Color;
//import android.media.MediaPlayer;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class MainActivity extends AppCompatActivity {
//    private  Button soundEffect;
//    private MediaPlayer tapSound;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        soundEffect = findViewById(R.id.soundEffect);
//        tapSound = MediaPlayer.create(this, R.raw.click);
//        soundEffect.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tapSound.start();
//            }
//        });
//
//
//    }
//
//}