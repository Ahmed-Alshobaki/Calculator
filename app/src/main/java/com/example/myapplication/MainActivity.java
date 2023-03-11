package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView Reslt;
String oper ="";
double all=0;
    int s=1;
    TextView seenall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ConstraintLayout ss = findViewById(R.id.paernt);
        Reslt = findViewById(R.id.seen);
         seenall =findViewById(R.id.seenall);
        Button b1 = findViewById(R.id.button1);

        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        Button b8 = findViewById(R.id.button8);
        Button b9 = findViewById(R.id.button9);
        ImageButton b_pls = findViewById(R.id.buttonpls);ImageButton delete = findViewById(R.id.delete);
        ImageButton b_minus = findViewById(R.id.buttonminus);
        ImageButton b_hit = findViewById(R.id.buttonhit);
        ImageButton b_fseam = findViewById(R.id.buttondestiny);
        ImageButton b_End = findViewById(R.id.End);
        Button b_delete = findViewById(R.id.buttondelete);
        ImageButton  Remainder = findViewById(R.id. Remainder);  Button  zero = findViewById(R.id. zero); Button  point = findViewById(R.id. point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reslt.setText(Reslt.getText().toString() + ".");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reslt.setText(Reslt.getText().toString() + "0");
            }
        });

        {
            Remainder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s++;


                   if (s%2==0){
                       ss.setBackgroundResource(R.color.black);
                       Reslt.setTextColor(getColor(R.color.white));
                       Reslt.setHintTextColor(getColor(R.color.white));
                       seenall.setTextColor(getColor(R.color.white));
                   }else if(s%2==1) {ss.setBackgroundResource(R.color.zon); Reslt.setTextColor(getColor(R.color.black));
                       Reslt.setHintTextColor(getColor(R.color.zon));
                   }


                }
            });
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!(Reslt.length() == 0)) {
                        String a =String.valueOf(Reslt.getText());
                        a=a.substring(0,a.length()-1);
                        Reslt.setText(a);
                    }


                }
            });
            b1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    Reslt.setText(Reslt.getText().toString() + "1");
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Reslt.setText(Reslt.getText().toString() + "2");
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Reslt.setText(Reslt.getText().toString() + "3");
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Reslt.setText(Reslt.getText().toString() + "4");
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Reslt.setText(Reslt.getText().toString() + "5");
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Reslt.setText(Reslt.getText().toString() + "6");
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Reslt.setText(Reslt.getText().toString() + "7");
                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Reslt.setText(Reslt.getText().toString() + "8");
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Reslt.setText(Reslt.getText().toString() + "9");
                }
            });
        }
        b_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.oidopre("*");
            }
        });

        b_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reslt.setText(" ");
                all = 0;
                oper="";
                seenall.setText("");
            }
            });
        b_pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.oidopre("+");
            }
        });b_fseam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.oidopre("/");
            }
        });
       b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.oidopre("-");
            }
        });
        b_End.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.oidopre("");

            }
        });

    }
   @SuppressLint("SetTextI18n")
   public void oidopre (String news) {
                if (!(Reslt.length() ==0)) {
                    seenall.setText(String.valueOf(seenall.getText().toString() + Reslt.getText().toString() + news));
                    switch (oper) {
                        case "":
                            all = Double.parseDouble(Reslt.getText().toString());
                            break;
                        case "+":
                            all += Double.parseDouble(Reslt.getText().toString());
                            break;
                        case "-":
                            all -= Double.parseDouble(Reslt.getText().toString());
                            break;
                        case "/":
                            all /= Double.parseDouble(Reslt.getText().toString());
                            break;
                        case "*":
                            all *= Double.parseDouble(Reslt.getText().toString());
                            break;

                    }
                    oper = news;
                    Reslt.setHint(all + "");
                    Reslt.setText("");

                }




   }

    }


