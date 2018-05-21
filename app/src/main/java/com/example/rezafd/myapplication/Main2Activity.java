package com.example.rezafd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rengwuxian.materialedittext.MaterialEditText;

public class Main2Activity extends AppCompatActivity {

    TextView client;
    Button btnsend2;
    MaterialEditText txtchatclient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        client=(TextView)findViewById(R.id.txtchatview) ;
        btnsend2 = (Button)findViewById(R.id.btnsend2);
        txtchatclient = (MaterialEditText)findViewById(R.id.txtchatclient);

        if (savedInstanceState==null){
            Intent data = getIntent();
            client.setText(data.getStringExtra("chat"));
//            user.setText(data.getStringExtra("User"));
        }

        btnsend2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                intent.putExtra("balas",txtchatclient.getText().toString());
                startActivity(intent);
            }
        });

    }
}
