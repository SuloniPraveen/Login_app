package com.example.login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eNAME;
    EditText eEMAIL;
     Button SUBMIT;
    ImageView image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eNAME = findViewById(R.id.etName);
        eEMAIL = findViewById(R.id.etEmail);
        SUBMIT = findViewById(R.id.button);
        image = findViewById(R.id.imageView);
        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String name = eNAME.getText().toString();
              String mail = eEMAIL.getText().toString();

            }
        });

    }
}