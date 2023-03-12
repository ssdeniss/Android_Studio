//package com.example.firstmobileapp;
//
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.DialogInterface;
//import android.content.res.ColorStateList;
//import android.graphics.Color;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class Alert extends AppCompatActivity {
//    private Button button2;
//    private TextView mainText;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        mainText = findViewById(R.id.appText);
//        button2 = findViewById(R.id.button2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showInfo(mainText.getText().toString(), button2);
//                showInfoAlert("Do u want close the app?");
//            }
//        });
//    }
//
//    public void btnClick(View view) {
//        showInfo(((Button) view).getText().toString(), ((Button) view));
//    }
//    private void showInfoAlert(String text){
//        AlertDialog.Builder builder = new AlertDialog.Builder(Alert.this);
//        builder.setTitle("Big Helper").setMessage(text).setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                finish();
//            }
//        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dialogInterface.cancel();
//            }
//        });
//        AlertDialog dialog = builder.create();
//        dialog.show();
//    }
//
//    private void showInfo(String text, Button btn) {
//        btn.setText("Pressed");
//        btn.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
//        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
//    }
//
//}