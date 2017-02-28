package com.example.android.androidexam;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int Points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayResult(View view) {
        CheckBox firstAnswer = (CheckBox) findViewById(R.id.checkbox_answer_1);
        CheckBox secondAnswer = (CheckBox) findViewById(R.id.checkbox_answer_2);
        CheckBox thirdAnswer = (CheckBox) findViewById(R.id.checkbox_answer_3);
        CheckBox fourthAnswer = (CheckBox) findViewById(R.id.checkbox_answer_4);
        CheckBox fifthAnswer = (CheckBox) findViewById(R.id.checkbox_answer_5);

        if (firstAnswer.isChecked() == true) {
            Points++;
        }

        if (secondAnswer.isChecked() == true) {
            Points++;
        }

        if (thirdAnswer.isChecked() == true) {
            Points++;
        }

        if (fourthAnswer.isChecked() == true) {
            Points++;
        }

        if (fifthAnswer.isChecked() == true) {
            Points++;
        }
        Context context = getApplicationContext();

        if(Points >=3){
            Toast.makeText(context,"Hurray!! , you succeeded and gained "+Points+" points", Toast.LENGTH_SHORT).show();
            Points=0;
        }
        else
        {
            Toast.makeText(context,"You failed :( and gained "+Points+" points", Toast.LENGTH_SHORT).show();
            Points=0;
        }


    }
}
