package com.example.appprac1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button naverbut, googlebut, cbnugsbut, cbnulmsbut;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        naverbut = (Button)findViewById(R.id.naverbut);
        googlebut = (Button) findViewById(R.id.googlebut);
        cbnugsbut = (Button)findViewById(R.id.cbnugsbut);
        cbnulmsbut = (Button)findViewById(R.id.cbnulmsbut);


        naverbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"버튼을 눌렀어요", Toast.LENGTH_SHORT).show();
            }
        });

        googlebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri googleUri = Uri.parse("https://www.google.co.kr");
                Intent googleIntent = new Intent(Intent.ACTION_VIEW, googleUri);

                if (googleIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(googleIntent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"실행 안 됨", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbnugsbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"버튼을 눌렀어요", Toast.LENGTH_SHORT).show();
            }
        });

        cbnulmsbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"버튼을 눌렀어요", Toast.LENGTH_SHORT).show();
            }
        });
    }
}