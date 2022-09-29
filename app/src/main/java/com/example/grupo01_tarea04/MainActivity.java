package com.example.grupo01_tarea04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_recuperar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_recuperar = findViewById(R.id.tv_recuperar);

        tv_recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogPassword();
            }
        });
//        btn_cerrar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mostrarDialogInformacion();
//            }
//        });

    }


    private void DialogPassword(  ){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_forget_password, null);
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


    public void NavigatorInit(View view) {
        Intent intenet = new Intent(MainActivity.this,MapaActivity.class);
        startActivity(intenet);
    }

    public void NavigatorPop(View view){
        ;
    }
}