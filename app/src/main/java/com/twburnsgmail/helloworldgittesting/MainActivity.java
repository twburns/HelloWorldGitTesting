package com.twburnsgmail.helloworldgittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getClear(View view){

        double number = 0;
        TextView textInView = (TextView) findViewById(R.id.editText2);
        TextView textResult = (TextView) findViewById(R.id.textView);



        try{
            number = Double.parseDouble(textInView.getText().toString());
            textResult.setText("number = " + number);
            textInView.setText("");

        }catch (NumberFormatException e) {
            textResult.setText("Error");

        }




    }
}


