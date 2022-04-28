package com.nabinchhetri.lict_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {
    Spinner spinner;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Register | LICT APP");

        spinner = findViewById(R.id.spProgram);
        String[] program = {"Bsc Computer Science", "BSc Bio", "BBA", "BHM"};
        ArrayAdapter <String> spAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, program);
        spinner.setAdapter(spAdapter);

//        btnRegister = findViewById(R.id.btnRegister);
//
//        btnRegister.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intentRegister = new Intent(RegisterActivity.this, LoginActivity.class);
//                startActivity(intentRegister);
//            }
//
//            private void startActivity(Intent intent) {
//            }
//        });

    }
}