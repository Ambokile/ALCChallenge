package com.codelup.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.codelup.R;
import com.squareup.picasso.Picasso;

public class ProfileALCActivity extends AppCompatActivity {
    TextView name_tx,track_tx,country_tx,email_tx,phone_number_tx,slack_username_tx;
    ImageView profile_icon;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My Profile");
        }


        name_tx = findViewById(R.id.name);
        track_tx = findViewById(R.id.track);
        country_tx = findViewById(R.id.country);
        email_tx = findViewById(R.id.email);
        phone_number_tx = findViewById(R.id.phone_number);
        slack_username_tx = findViewById(R.id.slack_username);

        profile_icon = findViewById(R.id.profile);

        String name = "Ambokile Kifukwe";
        name_tx.setText(name);

        String track = "Android";
        track_tx.setText(track);

        String country = "Tanzania";
        country_tx.setText(country);

        String email = "ambokilekifukwe@gmail.com";
        email_tx.setText(email);

        String phone = "+255 789 313 891";
        phone_number_tx.setText(phone);

        String slack = "@Ambokile";
        slack_username_tx.setText(slack);

        profile_icon = findViewById(R.id.profile);

        Picasso.get()
                .load(R.drawable.profile)
                .placeholder(R.drawable.alc_icon)
                .error(R.drawable.alc_icon)
                .into(profile_icon);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
