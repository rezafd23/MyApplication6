package com.example.rezafd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;

import dmax.dialog.SpotsDialog;

public class MainActivity extends AppCompatActivity {

    MaterialEditText txtchat;
    Button btnsend;
    TextView parentchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtchat=(MaterialEditText)findViewById(R.id.txtchat);
        btnsend = (Button) findViewById(R.id.btnsend);
        parentchat =(TextView)findViewById(R.id.txtchatview2);

        if (savedInstanceState==null){
            Intent data = getIntent();
            parentchat.setText(data.getStringExtra("balas"));
        }

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("chat",txtchat.getText().toString());
                startActivity(intent);
            }
        });

    }
}
