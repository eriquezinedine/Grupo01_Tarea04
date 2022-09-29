package com.example.grupo01_tarea04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MapaActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa_activity);

        findViewById(R.id.btn_cancelar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogCancel();
            }
        });

    }

    public void DialogInfo(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(MapaActivity.this);
        LayoutInflater inflater = getLayoutInflater();
         view = inflater.inflate(R.layout.dialog_informacion, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void DialogLeave(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(MapaActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        view = inflater.inflate(R.layout.dialog_leave, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void NavigatorStart(View view){
        Intent intenet = new Intent(MapaActivity.this,MainActivity.class);
        startActivity(intenet);
    }



    private void DialogCancel(){

        try {

            AlertDialog.Builder builder = new AlertDialog.Builder(MapaActivity.this);
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.dialog_cancel, null);
            builder.setView(view);
            AlertDialog dialog = builder.create();
            dialog.show();

            Button btn_volver = findViewById(R.id.btn_volver);

            btn_volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Saliendo ...", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            });


        }catch (Exception e){
            Log.i("Error Zine",e.toString());
        }





    }




}