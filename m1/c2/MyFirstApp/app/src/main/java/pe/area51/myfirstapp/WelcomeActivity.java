package pe.area51.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    public final static String PARAM_NAME = "pe.area51.myfirstapp.WelcomeActivity.NAME";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        final Intent intentThatLaunchedThisActivity = getIntent();
        if (intentThatLaunchedThisActivity.hasExtra(PARAM_NAME)) {
            final String name = intentThatLaunchedThisActivity.getStringExtra(PARAM_NAME);
            final TextView textViewWelcome = (TextView) findViewById(R.id.textview_welcome);
            final String welcomeMessage = getString(R.string.welcome, name);
            textViewWelcome.setText(welcomeMessage);
        }
    }

}
