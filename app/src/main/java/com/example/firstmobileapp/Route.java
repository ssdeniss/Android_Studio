//package com.example.firstmobileapp;
//
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.content.res.ColorStateList;
//import android.graphics.Color;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class Route extends AppCompatActivity {
//    private Button routeButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        routeButton = findViewById(R.id.routeButton);
//        routeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startNewActivity();
//            }
//        });
//    }
//
//    public void startNewActivity() {
//        Intent intent = new Intent(this, SecondActivity.class);
//        startActivity(intent);
//
//    }
//
//}