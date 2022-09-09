package com.a1tech.calculator_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvWork, tvResult;
    private String workings = "";
    private String formula = "";
    private String tempFormula = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void init() {
        tvWork = findViewById(R.id.tv_work);
        tvResult = findViewById(R.id.tv_result);
    }

    private void setWorkings(String givenValue) {
        workings = workings + givenValue;
        tvWork.setText(workings);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_1:
                setWorkings("1");
                break;
            case R.id.btn_2:
                setWorkings("2");
                break;
            case R.id.btn_3:
                setWorkings("3");
                break;
            case R.id.btn_4:
                setWorkings("4");
                break;
            case R.id.btn_5:
                setWorkings("5");
                break;
            case R.id.btn_6:
                setWorkings("6");
                break;
            case R.id.btn_7:
                setWorkings("7");
                break;
            case R.id.btn_8:
                setWorkings("8");
                break;
            case R.id.btn_9:
                setWorkings("9");
                break;
            case R.id.btn_plus_minus:
//                setWorkings(".");
                break;
            case R.id.btn_0:
                setWorkings("0");
                break;
            case R.id.btn_dot:
                setWorkings("0");
                break;
            case R.id.iv_backspace:
                break;
            case R.id.iv_history:
                break;
        }
    }
}