package com.example.martin.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addBtn = (Button) findViewById(R.id.addBtn); //boton add
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override //creamos la accion boton
            public void onClick(View v) {

                EditText firstNumbEditText = (EditText) findViewById(R.id.firstNumbEditText);
                EditText secondNumbEditText = (EditText) findViewById(R.id.secondNumbEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumbEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumbEditText.getText().toString());
                int result = num1 + num2; //suma
                resultTextView.setText(result + "");


            }
        });
    }



}
