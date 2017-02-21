package com.example.faldy.pelarut2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tampilNama;
    TextView tampilNIM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tampilNama = (TextView) findViewById(R.id.tampilNama);
        tampilNIM = (TextView) findViewById(R.id.tampilNIM);

        tampilNama.setText(getIntent().getStringExtra("nama"));
        tampilNIM.setText(getIntent().getStringExtra("nim"));
    }
}
