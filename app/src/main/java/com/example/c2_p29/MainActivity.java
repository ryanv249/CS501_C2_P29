package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;
    private EditText input5;
    private TextView total;

    private Double calSum1 = 0.0;
    private Double calSum2 = 0.0;
    private Double calSum3 = 0.0;
    private Double calSum4 = 0.0;
    private Double calSum5 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        total = findViewById(R.id.total);

        total.setText("0");

        TextWatcher updater = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable == input1.getEditableText()) {
                    if (!TextUtils.isEmpty(input1.getText().toString())) {
                        calSum1 = Double.parseDouble(input1.getText().toString()) * 20.0;
                    } else {
                        calSum1 = 0.0;
                    }
                }
                else if (editable == input2.getEditableText()) {
                    if (!TextUtils.isEmpty(input2.getText().toString())) {
                        calSum2 = Double.parseDouble(input2.getText().toString()) * 16.0;
                    } else {
                        calSum2 = 0.0;
                    }
                }
                else if (editable == input3.getEditableText()) {
                    if (!TextUtils.isEmpty(input3.getText().toString())) {
                        calSum3 = Double.parseDouble(input3.getText().toString()) * 35.0;
                    } else {
                        calSum3 = 0.0;
                    }
                }
                else if (editable == input4.getEditableText()) {
                    if (!TextUtils.isEmpty(input4.getText().toString())) {
                        calSum4 = Double.parseDouble(input4.getText().toString()) * 6.0;
                    } else {
                        calSum4 = 0.0;
                    }
                }
                else {
                    if (!TextUtils.isEmpty(input5.getText().toString())) {
                        calSum5 = Double.parseDouble(input5.getText().toString()) * 15.0;
                    } else {
                        calSum5 = 0.0;
                    }
                }
                total.setText(String.valueOf(calSum1 + calSum2 + calSum3 + calSum4 + calSum5));
            }
        };

        input1.addTextChangedListener(updater);
        input2.addTextChangedListener(updater);
        input3.addTextChangedListener(updater);
        input4.addTextChangedListener(updater);
        input5.addTextChangedListener(updater);
    }
}


