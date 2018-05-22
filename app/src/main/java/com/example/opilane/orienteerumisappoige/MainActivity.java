package com.example.opilane.orienteerumisappoige;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView legend;
    Button abi, kompass;
    ImageView signs;
    

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        legend = findViewById(R.id.kaardilegend);
        abi = findViewById(R.id.abi);
        kompass = findViewById(R.id.kompass);
        signs = findViewById(R.id.margid);

        abi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SmtActivity.class));

            }
        });
        kompass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, KompasActivity.class));
            }
        });
    }
}
