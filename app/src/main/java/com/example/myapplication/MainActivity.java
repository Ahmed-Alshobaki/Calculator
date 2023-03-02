package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button  b_pls;
       double all ;
    String S_all ="=";
            TextView seen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
       seen = findViewById(R.id.seen);
        Button  b1= findViewById(R.id.button1);
        Button  b2= findViewById(R.id.button2);
        Button  b3= findViewById(R.id.button3);
        Button  b4= findViewById(R.id.button4);
        Button  b5= findViewById(R.id.button5);
        Button  b6= findViewById(R.id.button6);
        Button  b7= findViewById(R.id.button7);
        Button  b8= findViewById(R.id.button8);
        Button  b9= findViewById(R.id.button9);
      b_pls= findViewById(R.id.buttonpls);
        Button b_minus =findViewById(R.id.buttonminus);
        Button  b_hit= findViewById(R.id.buttonhit);
        Button  b_fseam= findViewById(R.id.buttondestiny);
        Button  b_End= findViewById(R.id.End);
        Button  b_delete= findViewById(R.id.buttondelete);


        findViewById(R.id.point).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                seen.setText(seen.getText().toString()+".");
            }
        });
      findViewById(R.id.Remainder).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                seen.setText(seen.getText().toString()+"%");
            }
        });

        b_fseam.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                seen.setText(seen.getText().toString()+"/");
            }
        });
       b_delete.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
               all=0.0;
            }
        });
        b_minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                seen.setText(seen.getText().toString()+"-");
            }
        });

        b_hit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                seen.setText(seen.getText().toString()+"*");
            }


        });


        b_pls.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                seen.setText(seen.getText().toString()+"+");
            }


        });


        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
             seen.setText(seen.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
               seen.setText(seen.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
               seen.setText(seen.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
               seen.setText(seen.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
               seen.setText(seen.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
               seen.setText(seen.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
               seen.setText(seen.getText().toString()+"7");
            }


        });
        b8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                seen.setText(seen.getText().toString()+"8");
            }


        });
        b9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                seen.setText(seen.getText().toString()+"9");
            }


        });
        findViewById(R.id.zero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seen.setText(seen.getText().toString()+0);
            }
        });

        b_pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.opr("+");

            }
        });

    }

   @SuppressLint("SetTextI18n")
   public void  opr (String new_opr){
        switch (S_all){
            case "=" :
                all=Double.parseDouble(seen.getText().toString());

            case  "+":
                all+=Double.parseDouble(seen.getText().toString());




        }
                S_all=new_opr;
            seen.setText(all+"");

    }






    }
