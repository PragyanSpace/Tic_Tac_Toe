package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WinnerDelcare extends AppCompatActivity {
    EditText mName1,mName2;
    Button mPlayBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(R.style.Theme_TicTacToe);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_winner_delcare);
        mName1=findViewById(R.id.name1);
        mName2=findViewById(R.id.name2);
        mPlayBtn=findViewById(R.id.playBtn);
        mPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=mName1.getText().toString().trim();
                String s2=mName2.getText().toString().trim();
                if(s1.length()!=0&&s2.length()!=0) {
                    Intent intent = new Intent(WinnerDelcare.this, MainActivity.class);
                    intent.putExtra("First", s1);
                    intent.putExtra("Second", s2);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(WinnerDelcare.this,"Enter both player names",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}