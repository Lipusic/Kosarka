package com.example.android.kosarka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int rezultatdomaci = 0;
    int rezultatgosti = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * prikazuje rezultat domaćih.
     */
    public void rezultatDomaci(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.domaci_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }

    public void trica_domaci(View view) {
        rezultatdomaci = rezultatdomaci + 3;

    }

    public void dva_domaci(View view) {
        rezultatdomaci= rezultatdomaci+2;


    }

    public void slobodni_domaci(View view) {
        rezultatdomaci=rezultatdomaci+1;

    }

    /**
     * prikazuje rezultat gosta.
     */
    public void rezultatGosti(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.gosti_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }
    public void trica_gosti(View view) {
        rezultatgosti = rezultatgosti+3;
    }
    public void dva_gosti(View view) {
        rezultatgosti= rezultatgosti+2;
    }
    public void slobodno_gosti(View view) {
        rezultatgosti=rezultatgosti+1;
    }
    /**
     * Reset.
     */



    public void reset(View view) {
            rezultatgosti=0;
            rezultatdomaci=0;

        }
    });
}