package com.turka.acer.mvvm_demo.viewModel;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.turka.acer.mvvm_demo.Interface.LoginResultCallbacks;
import com.turka.acer.mvvm_demo.Model.User;
import com.turka.acer.mvvm_demo.Utils.DecodeMessage;
import com.turka.acer.mvvm_demo.Utils.GlobalConstants;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallbacks loginResultCallbacks;

    LoginViewModel(LoginResultCallbacks loginResultCallbacks) {
        this.user = new User();
        this.loginResultCallbacks = loginResultCallbacks;
    }

    public TextWatcher getEmailTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setEmail(editable.toString());
            }
        };
    }

    public TextWatcher getPasswordTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setPassword(editable.toString());
            }
        };
    }

    //Write method to process login
    public void onLoginClicked(View view){
        int status = user.isValidInfo();
        view.animate();
        if(status == GlobalConstants.VALID_ALL)
            loginResultCallbacks.onSuccess("LoginSuccess");
        else
            loginResultCallbacks.onError(DecodeMessage.msg(status));
    }
}
