package com.harilee.seeitall.GetLocation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.harilee.seeitall.Dashboard.BaseActivity;
import com.harilee.seeitall.R;
import com.harilee.seeitall.Utils.Utility;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SelectLocation extends AppCompatActivity implements SelectLocationPresenter.SelectLocationInterface {

    @BindView(R.id.fetch_location_bt)
    Button fetchLocationBt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_location);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.fetch_location_bt)
    public void onViewClicked() {

        startActivity(new Intent(SelectLocation.this, BaseActivity.class));
    }

    @Override
    public void showMessages(String message) {
        Utility.showSnackBar(fetchLocationBt, message);
    }

    @Override
    public void callApi() {

    }

    @Override
    public void getResponse() {

    }
}
