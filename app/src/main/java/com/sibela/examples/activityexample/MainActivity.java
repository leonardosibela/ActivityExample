package com.sibela.examples.activityexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstValue;
    EditText secondValue;
    TextView result;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue  =   (EditText)    findViewById(R.id.first_value);
        secondValue =   (EditText)    findViewById(R.id.second_value);
        result      =   (TextView)    findViewById(R.id.result_text);
        addButton   =   (Button)      findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double valueOne = Double.valueOf(firstValue.getText().toString());
                Double valueTwo = Double.valueOf(secondValue.getText().toString());
                result.setText(String.valueOf(valueOne + valueTwo));
            }
        });
    }
}
