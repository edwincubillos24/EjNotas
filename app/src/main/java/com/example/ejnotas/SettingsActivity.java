package com.example.ejnotas;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class SettingsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final EditText Quiz = (EditText) findViewById(R.id.eCQuiz);
        final EditText Expo = (EditText) findViewById(R.id.eCExpo);
        final EditText Pract = (EditText) findViewById(R.id.eCPract);
        final EditText Proy = (EditText) findViewById(R.id.eCProy);
        final Button calcular = (Button) findViewById(R.id.bAcep);

        Bundle extras = getIntent().getExtras();
        Quiz.setText(String.valueOf(extras.getInt("pQuiz")));
        Expo.setText(String.valueOf(extras.getInt("pExp")));
        Pract.setText(String.valueOf(extras.getInt("pPra")));
        Proy.setText(String.valueOf(extras.getInt("pPro")));
    }
}
