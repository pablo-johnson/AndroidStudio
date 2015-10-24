package com.johnson.pablo.databinding.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.johnson.pablo.databinding.R;
import com.johnson.pablo.databinding.data.User;
import com.johnson.pablo.databinding.databinding.ActivityMainWithDataBindingBinding;

/**
 * Created by Pablo on 18/10/15.
 */
public class MainActivityWithDataBinding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainWithDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main_with_data_binding);
        User user = new User("Pablo", "Johnson", false, "Perú");
        binding.setUser(user);
    }
}
