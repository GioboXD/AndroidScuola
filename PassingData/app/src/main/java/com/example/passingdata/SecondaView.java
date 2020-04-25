package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconda_view2);

        final TextView txtR = (TextView)findViewById(R.id.Risultato);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        txtR.setText("Il tuo nome è: " + b.getString("ARRIVING_NAME"));

    }
}
