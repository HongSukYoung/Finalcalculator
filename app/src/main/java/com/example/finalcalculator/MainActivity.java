package com.example.finalcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final char ADD = '+';
    private static final char SUB = '-';
    private static final char MUL = 'x';
    private static final char DIV = '÷';
    private static final char PERCENT = '%';
    private char CheckOperator;
    private double FirstNum = Double.NaN;
    private double SecondNum;
    private int Checkequal = 0;
    private int count = 0;
    private int DotNum = 0;
    private int OpStatus = 1;
    private List<Integer> Memory;
    private TextView inputDisplay, outputDisplay;
    private DecimalFormat decimalFormat;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonDot, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonPercent, buttonCE, buttonInitialization, buttonEqual, buttonDelete,
            buttonMC, buttonMR, buttonMP, buttonMM, buttonMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(5);

        inputDisplay = findViewById(R.id.tv_calculation);
        outputDisplay = findViewById(R.id.tv_result);
        button0 = findViewById(R.id.btn_zero);
        button1 = findViewById(R.id.btn_one);
        button2 = findViewById(R.id.btn_two);
        button3 = findViewById(R.id.btn_three);
        button4 = findViewById(R.id.btn_four);
        button5 = findViewById(R.id.btn_five);
        button6 = findViewById(R.id.btn_six);
        button7 = findViewById(R.id.btn_seven);
        button8 = findViewById(R.id.btn_eight);
        button9 = findViewById(R.id.btn_nine);
        buttonAdd = findViewById(R.id.btn_plus);
        buttonSub = findViewById(R.id.btn_minus);
        buttonDiv = findViewById(R.id.btn_division);
        buttonDot = findViewById(R.id.btn_dot);
        buttonMul = findViewById(R.id.btn_multi);
        buttonCE = findViewById(R.id.btn_CE);
        buttonInitialization = findViewById(R.id.btn_initialization);
        buttonEqual = findViewById(R.id.btn_result);
        buttonPercent = findViewById(R.id.btn_percent);
        buttonDelete = findViewById(R.id.btn_delete);
        buttonMC = findViewById(R.id.btn_MC);
        buttonMR = findViewById(R.id.btn_MR);
        buttonMP = findViewById(R.id.btn_MP);
        buttonMM = findViewById(R.id.btn_MM);
        buttonMS = findViewById(R.id.btn_MS);
        Memory = new ArrayList<>();

        buttonMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Memory.clear();
                count=0;
            }
        });

        buttonMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                inputDisplay.setText(Memory.get(count-1).toString());
            }
        });

        buttonMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Memory.add(count-1, Memory.get(count-1) + Integer.parseInt(inputDisplay.getText().toString()));
            }
        });

        buttonMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Memory.add(count-1, Memory.get(count-1) - Integer.parseInt(inputDisplay.getText().toString()));
            }
        });

        buttonMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Memory.add(count, Integer.parseInt(inputDisplay.getText().toString()));
                count+=1;
                inputDisplay.setText("");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "0");
                OpCHECKNum();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "1");
                OpCHECKNum();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "2");
                OpCHECKNum();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "3");
                OpCHECKNum();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "4");
                OpCHECKNum();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "5");
                OpCHECKNum();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "6");
                OpCHECKNum();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "7");
                OpCHECKNum();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "8");
                OpCHECKNum();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualCHECKNum();
                inputDisplay.setText(inputDisplay.getText() + "9");
                OpCHECKNum();
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String calculation = inputDisplay.getText().toString();
                if (calculation.length() > 0) {
                    int lastIndex = calculation.length() - 1;
                    if (lastIndex != -1) {
                        calculation = calculation.substring(0, lastIndex);
                    } else {
                        calculation = "";
                    }
                    inputDisplay.setText(calculation);
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DotCHECKOP();
                EqualCHECKOP();
                if (OpStatus == 0){
                    Calculator();
                    CheckOperator = ADD;
                    outputDisplay.setText(decimalFormat.format(FirstNum) + "+");
                    inputDisplay.setText("");
                    OpStatus +=1;
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DotCHECKOP();
                EqualCHECKOP();
                if (OpStatus == 0){
                    Calculator();
                    CheckOperator = SUB;
                    outputDisplay.setText(decimalFormat.format(FirstNum) + "-");
                    inputDisplay.setText("");
                    OpStatus +=1;
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DotCHECKOP();
                EqualCHECKOP();
                if (OpStatus == 0){
                    Calculator();
                    CheckOperator = MUL;
                    outputDisplay.setText(decimalFormat.format(FirstNum) + "x");
                    inputDisplay.setText("");
                    OpStatus +=1;
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DotCHECKOP();
                EqualCHECKOP();
                if (OpStatus == 0){
                    Calculator();
                    CheckOperator = DIV;
                    outputDisplay.setText(decimalFormat.format(FirstNum) + "÷");
                    inputDisplay.setText("");
                    OpStatus +=1;
                }

            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DotCHECKOP();
                EqualCHECKOP();
                if (OpStatus == 0){
                    Calculator();
                    CheckOperator = PERCENT;
                    outputDisplay.setText(decimalFormat.format(FirstNum) + "%");
                    inputDisplay.setText("");
                    OpStatus +=1;
                }
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(DotNum == 0){
                    inputDisplay.setText(inputDisplay.getText() + ".");
                    DotNum += 1;
                }
                else{
                    inputDisplay.setText((inputDisplay.getText()));
                }
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                inputDisplay.setText("");
            }
        });

        buttonInitialization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstNum = Double.NaN;
                SecondNum = Double.NaN;
                inputDisplay.setText("");
                outputDisplay.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculator();
                outputDisplay.setText("");
                inputDisplay.setText(decimalFormat.format(FirstNum));
                CheckOperator = '0';
                Checkequal = 1;
            }
        });
    }

    private void EqualCHECKNum(){
        if(Checkequal == 1){
            FirstNum = Double.NaN;
            inputDisplay.setText("");
            Checkequal = 0;
        }
    }

    private void EqualCHECKOP(){
        if(Checkequal == 1){
            Checkequal = 0;
        }
    }

    private void DotCHECKOP(){
        if(DotNum == 1){
            DotNum = 0;
        }
    }

    private void OpCHECKNum(){
        if(OpStatus == 1){
            OpStatus = 0;
        }
    }

    private void Calculator(){
        if (!Double.isNaN(FirstNum)) {
            SecondNum = Double.parseDouble(inputDisplay.getText().toString());
            inputDisplay.setText("");
            if (CheckOperator == ADD)
                FirstNum = this.FirstNum + SecondNum;
            else if (CheckOperator == SUB)
                FirstNum = this.FirstNum - SecondNum;
            else if (CheckOperator == MUL)
                FirstNum = this.FirstNum * SecondNum;
            else if (CheckOperator == DIV)
                FirstNum = this.FirstNum / SecondNum;
            else if (CheckOperator == PERCENT)
                FirstNum = this.FirstNum % SecondNum;
        } else {
            try {
                FirstNum = Double.parseDouble(inputDisplay.getText().toString());
            } catch (Exception e) {
            }
        }
    }
}