package com.tomdoischer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // only button on click methods
    public void openCoffeeView(View v){
        startActivity(new Intent(MainActivity.this, HowMuchCoffee.class));
    }

    public void openWaterView(View v){
        startActivity(new Intent(MainActivity.this, HowMuchWater.class));
    }
}