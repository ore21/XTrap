package com.example.bgonzalez526.x_trap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMembers = (Button)findViewById(R.id.idbtnMembers);
        Button btnMerchandise = (Button)findViewById(R.id.idbtnMerchandise);

        btnMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             startActivity(new Intent(MainActivity.this, MainMembers.class));
            }
        });
        btnMerchandise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainMerchandise.class));
            }
        });
    }
}
