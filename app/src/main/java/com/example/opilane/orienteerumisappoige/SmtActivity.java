package com.example.opilane.orienteerumisappoige;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SmtActivity extends AppCompatActivity {
    Button margid, kompass;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smt);

        margid=findViewById(R.id.margid);
        kompass=findViewById(R.id.kompass);

        margid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SmtActivity.this, MainActivity.class));

            }
        });
        kompass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SmtActivity.this, KompasActivity.class));
            }
        });
    }
}