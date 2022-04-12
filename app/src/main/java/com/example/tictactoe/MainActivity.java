package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout mbox1,mbox2,mbox3,mbox4,mbox5,mbox6,mbox7,mbox8,mbox9;
    TextView mPlayerId,mDeclare;
    int counter=1;
    int b1=-1,b2=-1,b3=-1,b4=-1,b5=-1,b6=-1,b7=-1,b8=-1,b9=-1;
    String p1,p2;

    Button mPlayAgain,mHomeBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbox1=findViewById(R.id.box1);
        mbox2=findViewById(R.id.box2);
        mbox3=findViewById(R.id.box3);
        mbox4=findViewById(R.id.box4);
        mbox5=findViewById(R.id.box5);
        mbox6=findViewById(R.id.box6);
        mbox7=findViewById(R.id.box7);
        mbox8=findViewById(R.id.box8);
        mbox9=findViewById(R.id.box9);
        mPlayerId=findViewById(R.id.playerId);
        mDeclare=findViewById(R.id.Declare);

        mPlayAgain=findViewById(R.id.playAgain);
        mHomeBtn=findViewById(R.id.homeBtn);

        p1=getIntent().getStringExtra("First");
        p2=getIntent().getStringExtra("Second");

        mPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });

        mHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(MainActivity.this,WinnerDelcare.class));
            }
        });

        if(counter==1)
            mPlayerId.setText(p1+"'s turn");


        mbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1==-1) {
                    if (counter % 2 != 0) {
                        mbox1.setBackground(getDrawable(R.drawable.x));
                        counter++;
                        b1=0;
                    } else {
                        mbox1.setBackgroundResource(R.drawable.o);
                        counter++;
                        b1=1;
                    }
                }
                check(p1,p2);
                if(counter%2!=0)
                    mPlayerId.setText(p1+"'s turn");
                else
                    mPlayerId.setText(p2+"'s turn");
            }
        });
        mbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2==-1) {
                    if (counter % 2 != 0) {
                        b2=0;
                        mbox2.setBackgroundResource(R.drawable.x);
                        counter++;
                    } else {
                        b2=1;
                        mbox2.setBackgroundResource(R.drawable.o);
                        counter++;
                    }
                }
                check(p1,p2);
                if(counter%2!=0)
                    mPlayerId.setText(p1+"'s turn");
                else
                    mPlayerId.setText(p2+"'s turn");
            }
        });
        mbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3==-1) {
                    if (counter % 2 != 0) {
                        b3=0;
                        mbox3.setBackgroundResource(R.drawable.x);
                        counter++;
                    } else {
                        mbox3.setBackgroundResource(R.drawable.o);
                        counter++;
                        b3=1;
                    }
                }check(p1,p2);
                if(counter%2!=0)
                    mPlayerId.setText(p1+"'s turn");
                else
                    mPlayerId.setText(p2+"'s turn");
            }
        });

        mbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b4==-1) {
                    if (counter % 2 != 0) {
                        b4=0;
                        mbox4.setBackgroundResource(R.drawable.x);
                        counter++;
                    } else {
                        b4=1;
                        mbox4.setBackgroundResource(R.drawable.o);
                        counter++;
                    }
                }check(p1,p2);
                if(counter%2!=0)
                    mPlayerId.setText(p1+"'s turn");
                else
                    mPlayerId.setText(p2+"'s turn");
            }
        });
        mbox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5==-1) {
                    if (counter % 2 != 0) {
                        b5=0;
                        mbox5.setBackgroundResource(R.drawable.x);
                        counter++;
                    } else {
                        mbox5.setBackgroundResource(R.drawable.o);
                        counter++;
                        b5=1;
                    }
                }check(p1,p2);
                if(counter%2!=0)
                    mPlayerId.setText(p1+"'s turn");
                else
                    mPlayerId.setText(p2+"'s turn");
            }
        });
        mbox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6==-1) {
                    if (counter % 2 != 0) {
                        b6=0;
                        mbox6.setBackgroundResource(R.drawable.x);
                        counter++;
                    } else {
                        b6=1;
                        mbox6.setBackgroundResource(R.drawable.o);
                        counter++;
                    }
                }check(p1,p2);
                if(counter%2!=0)
                    mPlayerId.setText(p1+"'s turn");
                else
                    mPlayerId.setText(p2+"'s turn");
            }
        });

        mbox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7==-1) {
                    if (counter % 2 != 0) {
                        b7=0;
                        mbox7.setBackgroundResource(R.drawable.x);
                        counter++;
                    } else {
                        b7=1;
                        mbox7.setBackgroundResource(R.drawable.o);
                        counter++;
                    }
                }check(p1,p2);
                if(counter%2!=0)
                    mPlayerId.setText(p1+"'s turn");
                else
                    mPlayerId.setText(p2+"'s turn");
            }
        });
        mbox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b8==-1) {
                    if (counter % 2 != 0) {
                        b8=0;
                        mbox8.setBackgroundResource(R.drawable.x);
                        counter++;
                    } else {
                        b8=1;
                        mbox8.setBackgroundResource(R.drawable.o);
                        counter++;
                    }
                }check(p1,p2);
                if(counter%2!=0)
                    mPlayerId.setText(p1+"'s turn");
                else
                    mPlayerId.setText(p2+"'s turn");
            }
        });
        mbox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9==-1) {
                    b9=0;
                    if (counter % 2 != 0) {
                        mbox9.setBackgroundResource(R.drawable.x);
                        counter++;
                    } else {
                        b9=1;
                        mbox9.setBackgroundResource(R.drawable.o);
                        counter++;
                    }
                }check(p1,p2);
                if(counter%2!=0)
                    mPlayerId.setText(p1+"'s turn");
                else
                    mPlayerId.setText(p2+"'s turn");
            }
        });
    }



    public void check(String p1,String p2)
    {
        if(counter!=10) {
            if ((b1 == 0 && b2 == 0 && b3 == 0) || (b1 == 0 && b4 == 0 && b7 == 0) || (b1 == 0 && b5 == 0 && b9 == 0) || (b2 == 0 && b5 == 0 && b8 == 0) || (b3 == 0 && b6 == 0 && b9 == 0) || (b4 == 0 && b5 == 0 && b6 == 0) || (b7 == 0 && b8 == 0 && b9 == 0) || (b3 == 0 && b5 == 0 && b7 == 0)) {
                String s=p1+" Won";
                win(s);
            } else if ((b1 == 1 && b2 == 1 && b3 == 1) || (b1 == 1 && b4 == 1 && b7 == 1) || (b1 == 1 && b5 == 1 && b9 == 1) || (b2 == 1 && b5 == 1 && b8 == 1) || (b3 == 1 && b6 == 1 && b9 == 1) || (b4 == 1 && b5 == 1 && b6 == 1) || (b7 == 1 && b8 == 1 && b9 == 1)||(b3 == 1 && b5 == 1 && b7 == 1)) {
                String s=p2+" Won";
                win(s);
            }
        }
        else
        {
            String s="Draw";
            win(s);
        }
    }

    public void win(String p)
    {
        mbox1.setClickable(false);
        mbox2.setClickable(false);
        mbox3.setClickable(false);
        mbox4.setClickable(false);
        mbox5.setClickable(false);
        mbox6.setClickable(false);
        mbox7.setClickable(false);
        mbox8.setClickable(false);
        mbox9.setClickable(false);
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.winning);
        music.start();
        mDeclare.setText(p);
    }
}