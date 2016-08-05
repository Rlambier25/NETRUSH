package com.example.omega.netrush;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.imageButton) ImageButton mWeb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ButterKnife.bind(this);

        mWeb.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == mWeb) {
            Intent mapIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http:"+"//netrush.com/contact.html"));
            startActivity(mapIntent);
        }
    }
}
