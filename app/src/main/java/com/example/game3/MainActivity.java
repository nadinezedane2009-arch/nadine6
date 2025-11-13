package com.example.game3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button start;
    private Button ne;
    private Button score;
    private TextView n1, n2, n3, n4, n5, n6, num, r;
    private int n,count,n11,n22,n33,n44,n55,n66;
    private Handler handler;
public static int c2=0,cr=0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.textView2);
        n2=findViewById(R.id.textView);
        n3=findViewById(R.id.textView3);
        n4=findViewById(R.id.textView4);
        n5=findViewById(R.id.textView5);
        n6=findViewById(R.id.textView6);
        r=findViewById(R.id.textView8);
        start=findViewById(R.id.button);
        ne=findViewById(R.id.button2);
        num=findViewById(R.id.textView7);
        score = findViewById(R.id.scoreId);
        count=0;
        c2=0;
        cr=0;
        num.setText(999+"");

        Intent scoreAc = new Intent(MainActivity.this,scoreActivity.class);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n11 = (int) (Math.random() * 40 + 1);
                n1.setText(n11 + "");
                n22 = (int) (Math.random() * 40 + 1);
                n2.setText(n22 + "");
                n33 = (int) (Math.random() * 40 + 1);
                n3.setText(n33 + "");
                n44 = (int) (Math.random() * 40 + 1);
                n4.setText(n44 + "");
                n55 = (int) (Math.random() * 40 + 1);
                n5.setText(n55 + "");
                n66 = (int) (Math.random() * 40 + 1);
                n6.setText(n66 + "");
                c2++;


            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            private boolean isRunning = false; // flag for toggle
            private Runnable runnable;

            @Override
            public void onClick(View v) {
                if (!isRunning) {
                    start.setText("stop");
                    isRunning = true;

                    handler = new Handler(Looper.getMainLooper());
                    runnable = new Runnable() {
                        @Override
                        public void run() {
                            n = (int) (Math.random() * 40 + 1);
                            num.setText(String.valueOf(n));

                            // Keep updating every second
                            handler.postDelayed(this, 1000);
                        }
                    };

                    handler.post(runnable); // start immediately
                } else {
                    start.setText("start");
                    isRunning = false;

                    if (handler != null && runnable != null) {
                        handler.removeCallbacks(runnable);
                    }
                }
                if(num.getText().equals(n1.getText())){
                    n1.setBackgroundColor(Color.RED);
                    n1.setText(n11+" ");
                    count++;
                    cr++;

                    r.setText(count+"of 6");}
                if(num.getText().equals(n2.getText())){
                    n2.setBackgroundColor(Color.RED);
                    n2.setText(n22+" ");
                    count++;
                    cr++;
                    r.setText(count+"of 6");}
                if(num.getText().equals(n3.getText())){
                    n3.setBackgroundColor(Color.RED);
                    n3.setText(n33+" ");
                    count++;
                    cr++;
                    r.setText(count+"of 6");}
                if(num.getText().equals(n4.getText())){
                    n4.setBackgroundColor(Color.RED);
                    n4.setText(n44+" ");
                    count++;
                    cr++;
                    r.setText(count+"of 6");}
                if(num.getText().equals(n5.getText())){
                    n5.setBackgroundColor(Color.RED);
                    n5.setText(n55+" ");
                    count++;
                    cr++;
                    r.setText(count+"of 6");}
                if(num.getText().equals(n6.getText())){
                    n6.setBackgroundColor(Color.RED);
                    n6.setText(n66+" ");
                    count++;
                    cr++;
                    r.setText(count+"of 6");}
            }

        });
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(scoreAc);

            }
        });


        }
}