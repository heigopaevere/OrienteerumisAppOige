package com.example.opilane.orienteerumisappoige;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by opilane on 15.05.2018.
 */

public class MainActivity extends AppCompatActivity {

    TextView legend;
    Button abi, kompass;
    ImageView signs;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        legend = findViewById(R.id.kaardilegend);
    }
}
