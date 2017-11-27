package com.rifkicompany.aplikasipertama.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rifkicompany.aplikasipertama.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        private Button lgnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lgnLogin = (Button) findViewById(R.id.lgn_login);

        lgnLogin.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lgn_login:
                Intent moveIntent = new Intent (MainActivity.this, LoginActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
