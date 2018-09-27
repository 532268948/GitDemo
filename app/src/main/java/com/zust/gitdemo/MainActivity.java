package com.zust.gitdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zust.gitdemo.bluetooth.BlueToothActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.btn1);
        mButton1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn1:
                startActivity(new Intent(this, BlueToothActivity.class));
                break;
            default:
                break;
        }
    }
}
