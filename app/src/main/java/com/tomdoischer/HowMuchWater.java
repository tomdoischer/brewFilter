package com.tomdoischer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HowMuchWater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_much_water);
    }

    // onClick methods

    public void onClickCalculateMildCoffeeW(View v) {
        int ratio = 18;
        calculateCoffee(v, ratio);
    }

    public void onClickCalculateStandardCoffeeW(View v) {
        int ratio = 13;
        calculateCoffee(v, ratio);
    }

    public void onClickCalculateStrongCoffeeW(View v) {
        int ratio = 8;
        calculateCoffee(v, ratio);
    }

    // this methods calculates the result and displays it

    public void calculateCoffee(View v, int ratio) {
        try {
            EditText txtname = (EditText)findViewById(R.id.volume);
            int coffee = Integer.parseInt(txtname.getText().toString());
            int result = coffee * ratio;
            TextView resultCoffee =(TextView)findViewById(R.id.coffeeResult);
            resultCoffee.setText(result + " ml");
        } catch (NumberFormatException e) {
            TextView resultCoffee =(TextView)findViewById(R.id.coffeeResult);
            resultCoffee.setText(R.string.missing_value);
        }
    }
}
