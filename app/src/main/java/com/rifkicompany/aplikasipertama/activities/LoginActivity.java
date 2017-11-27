package com.rifkicompany.aplikasipertama.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rifkicompany.aplikasipertama.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button clCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        clCancel = (Button) findViewById(R.id.cl_cancel);

        clCancel.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cl_cancel:
                Intent moveIntent = new Intent (LoginActivity.this, MainActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
