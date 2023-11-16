package com.example.lab_5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.second_activity);

        Button btnnext = findViewById(R.id.id_btn_gonext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void startActivity(Intent i) {
    }

    public Context getApplicationContext() {
        return null;
    }

    public void setContentView(int second_activity) {
        
    }
}

    

