package com.harilee.seeitall.RegisterLogin;

import com.harilee.seeitall.Model;

public class LoginPresenter implements LoginPresenterInterface {


    public LoginPresenter(LoginInterface loginInterface) {
    }

    @Override
    public void callLoginApi(String email, String password) {

    }

    @Override
    public void handleSuccess(Model.LoginModel loginModel) {

    }


    @Override
    public void handleFailure() {

    }

    public interface LoginInterface{

        void showMessages(String message);

        void callLoginApi(String email, String password);

        void getResponse(Model.LoginModel loginModel);

    }
}
