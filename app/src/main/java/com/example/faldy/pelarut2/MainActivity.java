package com.example.faldy.pelarut2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Inisiasi objek
    EditText textNama;
    EditText textNIM;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNama = (EditText) findViewById(R.id.textNama);
        textNIM = (EditText) findViewById(R.id.textNIM);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("nama", textNama.getText().toString());
                intent.putExtra("nim", textNIM.getText().toString());
                startActivity(intent);
            }
        });
    }
}
