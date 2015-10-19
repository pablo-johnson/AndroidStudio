package com.johnson.pablo.databinding.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.johnson.pablo.databinding.R;
import com.johnson.pablo.databinding.data.Handlers;
import com.johnson.pablo.databinding.data.User;
import com.johnson.pablo.databinding.databinding.MainActivityBinding;

/**
 * Created by Pablo on 18/10/15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        User user = new User("Pablo", "Johnson", false, "Perú");
        binding.setUser(user);
    }
}
