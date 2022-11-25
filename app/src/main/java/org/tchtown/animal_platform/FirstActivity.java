package org.tchtown.animal_platform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final Button LoginButton = (Button) findViewById(R.id.LoginButton);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginintent = new Intent(FirstActivity.this,LoginActivity.class);
                FirstActivity.this.startActivity(loginintent);
            }

        });

        final Button RegisterButton = (Button) findViewById(R.id.RegisterButton);
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerintent = new Intent(FirstActivity.this,RegisterActivity.class);
                FirstActivity.this.startActivity(registerintent);
            }
        });
    }


}