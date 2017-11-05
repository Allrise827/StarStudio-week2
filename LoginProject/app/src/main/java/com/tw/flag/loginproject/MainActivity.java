package com.tw.flag.loginproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button login = (Button)findViewById(R.id.login);
        Button sign_up = (Button)findViewById(R.id.sign_up);
        final Button foget = (Button)findViewById(R.id.foget_code);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "那你一点办法都没有",
                        Toast.LENGTH_LONG).show();
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent skip_zc = new Intent(MainActivity.this,SignupActivity.class);
                startActivity(skip_zc);
            }
        });

        foget.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("你好");
                dialog.setMessage("How could you foget you password !");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which){
                    }
                } );
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which){
                    }
                } );
                dialog.show();
            }
        });
    }



}
