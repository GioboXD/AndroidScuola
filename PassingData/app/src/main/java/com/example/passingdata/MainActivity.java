package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nome = (EditText)this.findViewById(R.id.Nome);
        final Button br = (Button)findViewById(R.id.BReset);
        final Button bt = (Button)findViewById(R.id.BTest);
        final Button bp = (Button)findViewById(R.id.BPlay);

        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome.setText("");
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = nome.getText().toString();
                Toast.makeText(getApplicationContext(), "Ciao " + str, Toast.LENGTH_LONG).show();
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SecondaView.class);
                intent.putExtra("ARRIVING_NAME", nome.getText().toString());
                startActivity(intent);
            }
        });
    }
}
