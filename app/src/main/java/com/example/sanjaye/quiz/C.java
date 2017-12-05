package com.example.sanjaye.quiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class C extends AppCompatActivity {

    String[] JavaQuestion, getJava_A, getJava_B, getJava_C, getJava_D,
            get_JavaAnswer;

    TextView tvx, tvy, tvanswer, tvquestiontitlebar;
    TextView javaTime;
    EditText tvquest;
    Button getA, getB, getC, getD, left, right, check;
    int index;
    String s1;
    int count = 0;
    int marks = 0;
    int score=0;
    public String[] Question = new String[15];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Question[0] = "c";
        Question[1] = "a";
        Question[2] = "a";
        Question[3] = "c";
        Question[4] = "b";
        Question[5] = "b";
        Question[6] = "c";
        Question[7] = "b";
        Question[8] = "a";
        Question[9] = "c";
        Question[10] = "d";
        Question[11] = "b";
        Question[12] = "b";
        Question[13] = "a";
        Question[14] = "b";

        javaTime = (TextView) findViewById(R.id.c_Timer);
        javaTime.setText("00:02:00");
        final CounterClass timer = new CounterClass(180000, 1000);
        timer.start();

        JavaQuestion = getResources().getStringArray(R.array.get_C_Question);
        getJava_A = getResources().getStringArray(R.array.get_C_A);
        getJava_B = getResources().getStringArray(R.array.get_C_B);
        getJava_C = getResources().getStringArray(R.array.get_C_C);
        getJava_D = getResources().getStringArray(R.array.get_C_D);

        left = (Button) findViewById(R.id.c_left);
        right = (Button) findViewById(R.id.c_right);

        tvx = (TextView) findViewById(R.id.c_tvxx);
        tvy = (TextView) findViewById(R.id.c_tvyy);
        tvquest = (EditText) findViewById(R.id.c_tvQuestion);

        getA = (Button) findViewById(R.id.c_getA);
        getB = (Button) findViewById(R.id.c_getB);
        getC = (Button) findViewById(R.id.c_getC);
        getD = (Button) findViewById(R.id.c_getD);

        index = 0;
        tvquest.setText(JavaQuestion[index]);
        getA.setText(getJava_A[index]);
        getB.setText(getJava_B[index]);
        getC.setText(getJava_C[index]);
        getD.setText(getJava_D[index]);

        tvquest.setEnabled(false);
        // tvanswer.setText("press \"A\" Button for the Answer ");
        tvx.setText(String.valueOf(index + 1));
        tvy.setText(String.valueOf("/" + JavaQuestion.length));

        getA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                count = Integer.valueOf(tvx.getText().toString());
                changeButtonState(count);
                marks += 10;

            }
        });
        getB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {



                count = Integer.valueOf(tvx.getText().toString());
                changeButtonState(count);
                marks += 10;
            }
        });
        getC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                count = Integer.valueOf(tvx.getText().toString());
                changeButtonState(count);
                marks += 10;
            }
        });
        getD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                count = Integer.valueOf(tvx.getText().toString());
                changeButtonState(count);
                marks += 10;
            }
        });
        left.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                index--;
                if (index == -1) {
                    index = getJava_A.length - 1;
                    index = getJava_B.length - 1;
                    index = getJava_C.length - 1;
                    index = getJava_D.length - 1;
                    index = JavaQuestion.length - 1;

                    tvquest.setText(JavaQuestion[index]);
                    getA.setText(getJava_A[index]);
                    getB.setText(getJava_B[index]);
                    getC.setText(getJava_C[index]);
                    getD.setText(getJava_D[index]);
                    tvx.setText(String.valueOf(index + 1));
                } else {

                    getA.setText(getJava_A[index]);
                    getB.setText(getJava_B[index]);
                    getC.setText(getJava_C[index]);
                    getD.setText(getJava_D[index]);

                    tvquest.setText(JavaQuestion[index]);
                    tvx.setText(String.valueOf(index + 1));
                }

            }
        });

    }

    private void changeButtonState(int count) {

        String answer = Question[--count];
        Log.d("Java", "" + answer);
        if (answer.equals("c")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.GREEN);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("a")) {
            score+=10;
            getA.setBackgroundColor(Color.GREEN);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("a")) {
            score+=10;
            getA.setBackgroundColor(Color.GREEN);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("c")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.GREEN);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("a")) {
            score+=10;
            getA.setBackgroundColor(Color.GREEN);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("b")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.GREEN);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("c")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.GREEN);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("b")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.GREEN);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("a")) {
            score+=10;
            getA.setBackgroundColor(Color.GREEN);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("c")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.GREEN);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("c")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.GREEN);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("d")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.GREEN);
        }
        if (answer.equals("b")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.GREEN);
        }
        if (answer.equals("b")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.GREEN);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("b")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.GREEN);
            getC.setBackgroundColor(Color.RED);
            getD.setBackgroundColor(Color.RED);
        }
        if (answer.equals("c")) {
            score+=10;
            getA.setBackgroundColor(Color.RED);
            getB.setBackgroundColor(Color.RED);
            getC.setBackgroundColor(Color.GREEN);
            getD.setBackgroundColor(Color.RED);
        }

        right.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                getA.setBackgroundColor(getResources().getColor(
                        R.color.buttonColor));
                getB.setBackgroundColor(getResources().getColor(
                        R.color.buttonColor));
                getC.setBackgroundColor(getResources().getColor(
                        R.color.buttonColor));
                getD.setBackgroundColor(getResources().getColor(
                        R.color.buttonColor));

                index++;
                try {
                    if ((index == JavaQuestion.length)
                            && (index == getJava_A.length)
                            && (index == getJava_B.length)
                            && (index == getJava_D.length)) {
                        Intent i = new Intent(C.this, CPlus.class);
                        i.putExtra("mt3", marks);
                        startActivity(i);
                        index = 0;
                        Toast.makeText(getApplicationContext(),
                                "your Score is" + score, Toast.LENGTH_LONG).show();
                        getA.setText(getJava_A[index]);
                        getB.setText(getJava_B[index]);
                        getC.setText(getJava_C[index]);
                        getD.setText(getJava_D[index]);
                        tvquest.setText(JavaQuestion[index]);
                        tvx.setText(String.valueOf(index + 1));
                    } else {
                        getA.setText(getJava_A[index]);
                        getB.setText(getJava_B[index]);
                        getC.setText(getJava_C[index]);
                        getD.setText(getJava_D[index]);

                        tvquest.setText(JavaQuestion[index]);
                        tvx.setText(String.valueOf(index + 1));

                    }
                }catch (Exception e){
                    Toast.makeText(C.this, ""+e.toString(), Toast.LENGTH_LONG).show();
                    Log.d("as",e.toString());
                    Log.e("erre",e.toString());
                }

            }
        });

    }

    public class CounterClass extends CountDownTimer {
        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            Toast.makeText(getApplicationContext(), "Time over ",
                    Toast.LENGTH_LONG).show();
            finish();
        }

        public void onTick(long millisUntilFinished) {
            long millis = millisUntilFinished;
            String hms = String.format(
                    "%02d:%02d:%02d",
                    TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis)
                            - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
                            .toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis)
                            - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
                            .toMinutes(millis)));
            System.out.println(hms);
            javaTime.setText(hms);
        }
    }
    }
