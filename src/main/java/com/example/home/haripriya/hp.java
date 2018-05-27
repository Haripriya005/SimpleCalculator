package com.example.home.haripriya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class hp extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "hp";
    Button plus, minus, mul, div;

    int cnt = 0;
    int val1, val2;
    EditText txtname, num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp);
        plus = findViewById(R.id.minus);
        minus = findViewById(R.id.add);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        txtname = findViewById(R.id.result);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "sample", Toast.LENGTH_SHORT).show();
        cnt++;
        String temp = num1.getText().toString();
        if (temp.length() > 0) {
            val1 = Integer.parseInt(temp);
        } else {
            Toast.makeText(this, "Enter both values", Toast.LENGTH_SHORT).show();
            return;
        }
        temp = num2.getText().toString();
        Log.i(TAG, "onClick: " + temp.length());
        if (temp.length() > 0) {
            val2 = Integer.parseInt(temp);
        } else {
            Toast.makeText(this, "Enter both values", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, String.valueOf(val1) + " " + String.valueOf(val2), Toast.LENGTH_SHORT).show();
        switch (v.getId()) {
            case R.id.add: txtname.setText(String.valueOf(val1 + val2));
                break;
            case R.id.minus:txtname.setText(String.valueOf(val1 - val2));
                break;
            case R.id.multiply:txtname.setText(String.valueOf(val1 * val2));
                break;
            case R.id.divide:if (Integer.valueOf(val2)==0) {
                Toast.makeText(this, "not valid", Toast.LENGTH_SHORT).show();
            }
            else {
                txtname.setText(String.valueOf(val1 / val2));
                break;

        }

       // if (v.getId() == R.id.add) {
        //    txtname.setText(String.valueOf(val1 + val2));
       // } else if (v.getId() == R.id.minus) {
        //    txtname.setText(String.valueOf(val1 - val2));
      //  } else if (v.getId() == (R.id.multiply)) {
       ////     txtname.setText(String.valueOf(val1 * val2));
        //} else if (v.getId() == (R.id.divide)) {
          //  if (Integer.valueOf(val2)==0) {
          //      Toast.makeText(this, "not valid", Toast.LENGTH_SHORT).show();
          //  }
          //  else {
          //      txtname.setText(String.valueOf(val1 / val2));
          //      //oast.makeText(this, String.valueOf(val1 + val2), Toast.LENGTH_SHORT).show();
           // }
        }

    }
}


