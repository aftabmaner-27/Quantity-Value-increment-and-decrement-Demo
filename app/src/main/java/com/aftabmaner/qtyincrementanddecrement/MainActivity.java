package com.aftabmaner.qtyincrementanddecrement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     TextView value;
     int count = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value = findViewById(R.id.value);


    }
    public void increment(View view){
        count++;
        value.setText(""+count);


    }
    public void decrement(View view){
       if (count <= 0) count = 0;
       else count--;
        value.setText(""+count);
    }
}