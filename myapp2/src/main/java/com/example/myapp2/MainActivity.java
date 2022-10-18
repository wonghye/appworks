package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_vis_True;
    Button btn_vis_False;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_vis_True = findViewById(R.id.btn_vis_True);
        btn_vis_False = findViewById(R.id.btn_vis_False);
        textView = findViewById(R.id.textView);

        //보이기 버튼 클릭
        btn_vis_True.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
            }
        });

        //숨기기 버튼 클릭
        btn_vis_False.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.INVISIBLE);
            }
        });
    }
}