package com.example.hw4said;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.hw4said.country.CountryFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container,new CountryFragment()).commit();
    }
}

