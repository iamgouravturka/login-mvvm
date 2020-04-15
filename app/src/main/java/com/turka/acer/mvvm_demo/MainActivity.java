package com.turka.acer.mvvm_demo;

import android.os.Bundle;

import com.turka.acer.mvvm_demo.Interface.LoginResultCallbacks;
import com.turka.acer.mvvm_demo.viewModel.LoginViewModel;
import com.turka.acer.mvvm_demo.viewModel.LoginViewModelFactory;
import com.turka.acer.mvvm_demo.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements LoginResultCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders.of(
                this,
                new LoginViewModelFactory(this))
            .get(LoginViewModel.class));
    }

    @Override
    public void onSuccess(String message) {
        Toasty.success(this, message).show();
    }

    @Override
    public void onError(String error) {
        Toasty.error(this, error).show();
    }
}
