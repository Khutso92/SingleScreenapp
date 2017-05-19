package com.khutso.singlescreenapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(View view)
    {

        EditText edt_first_number = (EditText)findViewById(R.id.edt_first_number);
        EditText edt_second_number = (EditText)findViewById(R.id.edt_second_number);
        TextView txt_results = (TextView)findViewById(R.id.txt_results);
        TextView edt_history = (TextView)findViewById(R.id.edt_history);

        int num1 = Integer.parseInt(edt_first_number.getText().toString());
        int num2 = Integer.parseInt(edt_second_number.getText().toString());

       int sum = num1 + num2;
        txt_results.setText(Integer.toString(sum));
        edt_history.setText(num1 + "+" + num2 + "=" + Integer.toString(sum));

    }


    public void clear(View view){
        TextView edt_history = (TextView)findViewById(R.id.edt_history);
        EditText edt_first_number = (EditText)findViewById(R.id.edt_first_number);
        EditText edt_second_number = (EditText)findViewById(R.id.edt_second_number);
        TextView txt_results = (TextView)findViewById(R.id.txt_results);


        edt_history.setText("Histoty cleared ");
        edt_first_number.setText("");
        edt_second_number.setText("");
        txt_results.setText("");
    }

}
