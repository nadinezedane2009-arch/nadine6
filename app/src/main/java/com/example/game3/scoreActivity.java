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
    private TextView score,game;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       game=findViewById(R.id.textView10);
       score=findViewById(R.id.textView11);

        setContentView(R.layout.activity_score);
        backb = findViewById(R.id.button4);
        game.setText("game"+MainActivity.c2);
      score.setText("score"+MainActivity.cr);
        Intent MainAc = new Intent(scoreActivity.this,MainActivity.class);

        backb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MainAc);
            }
        });

    }
}