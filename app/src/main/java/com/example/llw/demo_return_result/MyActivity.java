package com.example.llw.demo_return_result;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {
    // protected Button btn_back;
    private LinearLayout line1;
    private TextView text1;
    private LinearLayout line2;
    private TextView text2;
    private LinearLayout line3;
    private TextView text3;
    private Button btnReturn;

    private void assignViews() {
        line1 = (LinearLayout) findViewById(R.id.line1);
        text1 = (TextView) findViewById(R.id.text1);
        line2 = (LinearLayout) findViewById(R.id.line2);
        text2 = (TextView) findViewById(R.id.text2);
        line3 = (LinearLayout) findViewById(R.id.line3);
        text3 = (TextView) findViewById(R.id.text3);
        btnReturn = (Button) findViewById(R.id.btn_return);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        assignViews();
        btnReturn = (Button) findViewById(R.id.btn_return);
        Intent intent = getIntent();
        savedInstanceState = intent.getExtras();
        text1.setText("用户名：" + savedInstanceState.getString("User"));
        text2.setText("密码：" + savedInstanceState.getString("Pwd"));
        text3.setText("Email:" + savedInstanceState.getString("Email"));

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,MainActivity.class));
            }
        });
    }


}
