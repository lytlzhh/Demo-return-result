package com.example.llw.demo_return_result;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    private LinearLayout linear1;
    private EditText edite1;
    private LinearLayout linear2;
    private TextView text2;
    private EditText edite2;
    private LinearLayout linear3;
    private TextView text3;
    private EditText edite3;
    private LinearLayout linear4;
    private TextView text4;
    private EditText edite4;
    private Button btnPigin;

    private void assignViews() {
        image = (ImageView) findViewById(R.id.image);
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        edite1 = (EditText) findViewById(R.id.edite1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        text2 = (TextView) findViewById(R.id.text2);
        edite2 = (EditText) findViewById(R.id.edite2);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        text3 = (TextView) findViewById(R.id.text3);
        edite3 = (EditText) findViewById(R.id.edite3);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        text4 = (TextView) findViewById(R.id.text4);
        edite4 = (EditText) findViewById(R.id.edite4);
        btnPigin = (Button) findViewById(R.id.btn_pigin);
        //btnPigin.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        btnPigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String User_name = edite1.getText().toString();
                String Pwd = edite2.getText().toString();
                String Repwd = edite3.getText().toString();
                String Email = edite4.getText().toString();

                if ( !"".equals(User_name)&& !"".equals(Pwd) && !"".equals(Email)) {
                    if (!Pwd.equals(Repwd)) {
                        Toast.makeText(MainActivity.this, "您好！您两次输入的密码不一致，请重新输入", Toast.LENGTH_SHORT).show();

                        edite2.setText("");
                        edite3.setText("");
                        edite2.requestFocus();
                    } else {
                        Intent intent = new Intent(MainActivity.this, MyActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putCharSequence("User", User_name);
                        bundle.putCharSequence("Pwd", Pwd);
                        bundle.putCharSequence("Email", Email);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                }else {
                    Toast.makeText(MainActivity.this, "请将信息输入完整", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
