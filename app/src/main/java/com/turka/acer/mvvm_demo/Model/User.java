package com.turka.acer.mvvm_demo.Model;

import android.text.TextUtils;
import android.util.Log;

import com.turka.acer.mvvm_demo.Utils.GlobalConstants;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;

public class User extends BaseObservable {

    @NonNull
    private String email, password;

    public User() {
    }

    @NonNull
    private String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    private String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public int isValidInfo() {

        Log.d("hello", "isValidInfo: " + email + " password: " + password);

        if(TextUtils.isEmpty(getEmail()) || !android.util.Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
            return GlobalConstants.INVALID_EMAIL;

        else if(TextUtils.isEmpty(getPassword()) && getPassword().length() < 6)
            return GlobalConstants.INVALID_PASSWORD;

        else
            return GlobalConstants.VALID_ALL;
    }
}

