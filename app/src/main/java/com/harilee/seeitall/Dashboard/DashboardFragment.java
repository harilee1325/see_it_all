package com.harilee.seeitall.Dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.harilee.seeitall.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DashboardFragment extends Fragment {

    @BindView(R.id.text_whats_new)
    TextView textWhatsNew;
    @BindView(R.id.title_card)
    CardView titleCard;
    @BindView(R.id.events_card)
    CardView eventsCard;
    @BindView(R.id.search_card)
    CardView searchCard;
    @BindView(R.id.tickets_card)
    CardView ticketsCard;
    @BindView(R.id.profile_card)
    CardView profileCard;
    private View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.dashboard_screen, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.events_card, R.id.search_card, R.id.tickets_card, R.id.profile_card})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.events_card:
                break;
            case R.id.search_card:
                break;
            case R.id.tickets_card:
                break;
            case R.id.profile_card:
                break;
        }
    }
}
