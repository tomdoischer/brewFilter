package com.tomdoischer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HowMuchCoffee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_much_coffee);
    }

    public void calculateMildCoffee(View v) {
        int ratio = 18;
        try {
            EditText txtname = (EditText)findViewById(R.id.volume);
            int water = Integer.parseInt(txtname.getText().toString());
            int result = water/ratio;
            TextView resultCoffee =(TextView)findViewById(R.id.coffeeResult);
            resultCoffee.setText(result + " g");
        } catch (NumberFormatException e) {
            TextView resultCoffee =(TextView)findViewById(R.id.coffeeResult);
            resultCoffee.setText(R.string.missing_value);
        }
    }

    public void calculateStandardCoffee(View v) {
        int ratio = 13;
        try {
            EditText txtname = (EditText)findViewById(R.id.volume);
            int water = Integer.parseInt(txtname.getText().toString());
            int result = water/ratio;
            TextView resultCoffee =(TextView)findViewById(R.id.coffeeResult);
            resultCoffee.setText(result + " g");
        } catch (NumberFormatException e) {
            TextView resultCoffee =(TextView)findViewById(R.id.coffeeResult);
            resultCoffee.setText(R.string.missing_value);
        }
    }

    public void calculateStrongCoffee(View v) {
        int ratio = 8;
        try {
            EditText txtname = (EditText)findViewById(R.id.volume);
            int water = Integer.parseInt(txtname.getText().toString());
            int result = water/ratio;
            TextView resultCoffee =(TextView)findViewById(R.id.coffeeResult);
            resultCoffee.setText(result + " g");
        } catch (NumberFormatException e) {
            TextView resultCoffee =(TextView)findViewById(R.id.coffeeResult);
            resultCoffee.setText(R.string.missing_value);
        }
    }

}
