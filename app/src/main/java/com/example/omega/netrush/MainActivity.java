package com.example.omega.netrush;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.clientButton) Button mClientButton;
    @Bind(R.id.aboutButton) Button mAboutButton;
    @Bind(R.id.introText) TextView mIntroText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


       Typeface introFont = Typeface.createFromAsset(getAssets(), "fonts/Colleged.ttf");
       mIntroText.setTypeface(introFont);

        mClientButton.setOnClickListener(this);
        mAboutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mAboutButton){
            Intent goToAbout = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(goToAbout);
        }

        if(v == mClientButton) {
            Intent goToClient = new Intent(MainActivity.this, ClientActivity.class);
            startActivity(goToClient);

        }
    }
}
