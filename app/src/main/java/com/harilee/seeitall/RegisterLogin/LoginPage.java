package com.harilee.seeitall.RegisterLogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.harilee.seeitall.GetLocation.SelectLocation;
import com.harilee.seeitall.Model;
import com.harilee.seeitall.R;
import com.harilee.seeitall.Utils.Utility;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginPage extends AppCompatActivity implements LoginPresenter.LoginInterface {

    @BindView(R.id.signup_text)
    TextView signupText;
    @BindView(R.id.email_et)
    EditText emailEt;
    @BindView(R.id.email)
    TextInputLayout email;
    @BindView(R.id.password_et)
    EditText passwordEt;
    @BindView(R.id.password)
    TextInputLayout password;
    @BindView(R.id.login_bt)
    FloatingActionButton loginBt;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public void showMessages(String message) {
        Utility.showSnackBar(loginBt,message);
    }

    @Override
    public void callLoginApi(String email, String password) {
        loginPresenter.callLoginApi(email, password);
    }

    @Override
    public void getResponse(Model.LoginModel loginModel) {

    }

    @OnClick({R.id.signup_text, R.id.login_bt})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.signup_text:
                break;
            case R.id.login_bt:
                verifyData();
                break;
        }
    }

    private void verifyData() {

        String email = emailEt.getText().toString().trim();
        String password = passwordEt.getText().toString().trim();

        if (email.isEmpty()){
            emailEt.setError("Please enter an email to continue");
        }else if (password.isEmpty()){
            passwordEt.setError("Please enter password to continue");
        }else {
            callLoginApi(email, password);
            startActivity(new Intent(LoginPage.this, SelectLocation.class));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}
