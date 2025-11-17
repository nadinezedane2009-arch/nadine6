package com.example.game3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scoreActivity extends AppCompatActivity {
    private Button backb;
    private String name;
    private TextView score,game,yourname;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
       game=findViewById(R.id.textView10);
        backb = findViewById(R.id.button4);
       score=findViewById(R.id.textView11);
        yourname=findViewById(R.id.textView9);
        Intent intent=getIntent();
        String name=intent.getStringExtra("NAME");

        yourname.setText(name+"your score");
        game.setText("game"+MainActivity.c2);
      score.setText("score"+MainActivity.cr);

        backb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });

    }
}