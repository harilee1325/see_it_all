package com.harilee.seeitall.Dashboard;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.harilee.seeitall.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BaseActivity extends AppCompatActivity {

    @BindView(R.id.home_layout)
    FrameLayout homeLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_activity);
        ButterKnife.bind(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.home_layout
        , new DashboardFragment(), "home").commitAllowingStateLoss();

    }
}
