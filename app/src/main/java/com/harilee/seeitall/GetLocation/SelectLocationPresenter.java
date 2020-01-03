package com.harilee.seeitall.GetLocation;

public class SelectLocationPresenter implements SelectLocationPresenterInterface {
    @Override
    public void callApi() {

    }

    @Override
    public void handleSuccess() {

    }

    @Override
    public void handleFailure() {

    }

    public interface SelectLocationInterface{

        void showMessages(String message);

        void callApi();

        void getResponse();

    }
}
