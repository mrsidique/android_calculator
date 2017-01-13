package com.tappforce.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
    }

    public void numberButtonTapped(View view) {
        Button button = (Button)view;
        TextView textView = (TextView)findViewById(R.id.resultTextView);
        if (textView.getText().equals("0") || calculator.getValue1Entered() == true) {
            textView.setText(button.getText());
        }
        else {
            textView.append(button.getText());
        }
    }

    public void decimalButtonTapped(View view) {
        Button button = (Button)view;
        TextView textView = (TextView)findViewById(R.id.resultTextView);
        String textViewText = (String)textView.getText();
        if (!((String) textView.getText()).contains(".")) {
            textView.append(button.getText());
        }
    }

    public void operandButtonTapped(View view) {
        Button button = (Button)view;
        TextView textView = (TextView)findViewById(R.id.resultTextView);
        if (calculator.getValue1Entered() == false) {
            calculator.setValue1(Double.parseDouble(textView.getText().toString()));
            calculator.setValue1Entered(true);
        }
        else {
            calculator.setValue2(Double.parseDouble(textView.getText().toString()));
            double result = calculator.performOperation();
            textView.setText(Double.toString(result));

            calculator.setValue1(result);
        }
        calculator.setSelectedOperandWithOperandString((String)button.getText());
    }

    public void clearButtonTapped(View view) {
        TextView textView = (TextView)findViewById(R.id.resultTextView);
        textView.setText("0");
        calculator.setValue1Entered(false);
    }

    public void invertValueButtonTapped(View view) {
        TextView textView = (TextView)findViewById(R.id.resultTextView);
        double textViewValue = Double.parseDouble(textView.getText().toString());
        double invertedValue = textViewValue * -1;
        calculator.setValue1(invertedValue);
        textView.setText(Double.toString(invertedValue));
    }
}
