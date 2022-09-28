package com.example.grupo01_tarea04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout btn_cerrar, btn_returnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa_activity);

        btn_cerrar = findViewById(R.id.btn_cancelar);


        btn_cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogInformacion();
            }
        });

    }

    private void mostrarDialogInformacion(  ){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_informacion, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();

//        btn_returnInfo = findViewById(R.id.btn_returnInfo);

//        btn_returnInfo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.cancel();
//            }
//        });



    }



}