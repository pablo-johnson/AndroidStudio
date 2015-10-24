package com.johnson.pablo.databinding.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.johnson.pablo.databinding.R;

public class MainActivityWithoutDataBinding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_without_data_binding);
        setUpUI();
    }

    private void setUpUI() {
        TextView userName = (TextView) findViewById(R.id.firstName);
        TextView lastName = (TextView) findViewById(R.id.lastname);
        TextView country = (TextView) findViewById(R.id.country);
        userName.setText("Pablo");
        lastName.setText("Johnson");
        country.setText("Perú");
    }
}
