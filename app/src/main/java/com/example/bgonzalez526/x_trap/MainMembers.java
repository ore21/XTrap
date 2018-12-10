package com.example.bgonzalez526.x_trap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;


public class MainMembers extends AppCompatActivity {
Spinner spinner;
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_members);
        Button btnMembers = (Button)findViewById(R.id.idBtnMembersToHome);

        btnMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainMembers.this, MainActivity.class));
            }
        });



        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);
        final String str[] = {"Ore", "J1nx", "Woody"};


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id)
            {
                String selectedItem = parent.getItemAtPosition(i).toString();
                {
                    if (str[0].equals(spinner.getItemAtPosition(i).toString())){
                        imageView.setImageResource(R.drawable.ore);
                    } else if (str[1].equals(spinner.getItemAtPosition(i).toString())){
                        imageView.setImageResource(R.drawable.woody);
                    } else if (str[2].equals(spinner.getItemAtPosition(i).toString())){
                        imageView.setImageResource(R.drawable.j1nx);
                    }
                }
            } // to close the onItemSelected
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }
}



