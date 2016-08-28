package com.example.enterprise.int_string_method;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(getApplicationContext(), displaymessage(111, "automation,"), Toast.LENGTH_LONG).show();
    }

    private String displaymessage(int number, String word){
        return "Welcome to the future of " + word + " your ID is number " + number;

    }

}
