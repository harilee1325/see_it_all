package com.harilee.seeitall.RegisterLogin;

import com.harilee.seeitall.Model;

public interface LoginPresenterInterface {

    void callLoginApi(String email, String password);

    void handleSuccess(Model.LoginModel loginModel);

    void handleFailure();

}
