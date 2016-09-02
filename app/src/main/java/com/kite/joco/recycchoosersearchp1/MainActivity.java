package com.kite.joco.recycchoosersearchp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

@SuppressWarnings("SpellCheckingInspection")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case (R.id.btnLista) :
                startLista();
                break;
            case (R.id.btnSzamolo ) :
                startSzamol();
                break;
        }
    }

    private void startSzamol() {
        Intent szamoloIntent = new Intent(this,Szamolo.class);
        startActivity(szamoloIntent);
    }

    private void startLista() {
        Intent listaIntent = new Intent(this,Ellenorzo.class);
        startActivity(listaIntent);
    }
}
