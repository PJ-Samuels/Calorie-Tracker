package com.example.calorie_calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText type1Amount;
    private EditText type2Amount;
    private EditText type3Amount;
    private EditText type4Amount;
    private EditText type5Amount;
    private TextView totalCalories;

    private Double totalCal1 = 0.0;
    private Double totalCal2 = 0.0;
    private Double totalCal3 = 0.0;
    private Double totalCal4 = 0.0;
    private Double totalCal5 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        type1Amount = (EditText) findViewById(R.id.type1Amount);
        type2Amount = (EditText) findViewById(R.id.type2Amount);
        type3Amount = (EditText) findViewById(R.id.type3Amount);
        type4Amount = (EditText) findViewById(R.id.type4Amount);
        type5Amount = (EditText) findViewById(R.id.type5Amount);
        totalCalories = (TextView) findViewById(R.id.totalCalories);

        totalCalories.setText("0");

        type1Amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(type1Amount.getText().toString())) {
                    totalCal1 = Double.parseDouble(type1Amount.getText().toString()) * 20.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                } else {
                    totalCal1 = 0.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                }
            }
        });

        type2Amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(type2Amount.getText().toString())) {
                    totalCal2 = Double.parseDouble(type2Amount.getText().toString()) * 16.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                } else {
                    totalCal2 = 0.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                }
            }
        });

        type3Amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(type3Amount.getText().toString())) {
                    totalCal3 = Double.parseDouble(type3Amount.getText().toString()) * 13.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                } else {
                    totalCal3 = 0.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                }
            }
        });

        type4Amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(type4Amount.getText().toString())) {
                    totalCal4 = Double.parseDouble(type4Amount.getText().toString()) * 6.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                } else {
                    totalCal4 = 0.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                }
            }
        });

        type5Amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(type5Amount.getText().toString())) {
                    totalCal5 = Double.parseDouble(type5Amount.getText().toString()) * 39.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                } else {
                    totalCal5 = 0.0;
                    totalCalories.setText(String.valueOf(totalCal1+totalCal2+totalCal3+totalCal4+totalCal5));
                }
            }
        });
    }
}