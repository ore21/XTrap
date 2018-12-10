package com.example.bgonzalez526.x_trap;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
import java.text.DecimalFormat;

public class MainMerchandise extends AppCompatActivity {
    Spinner spinner;
    ImageView imageView;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_merchandise);
        final Button btnMerchandise = (Button)findViewById(R.id.idBtnMerchToHome);
        final Button add = findViewById(R.id.addBtn);
//        add.setOnClickListener(this);

        btnMerchandise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainMerchandise.this, MainActivity.class));
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick (View v)
           {
               Toast.makeText(MainMerchandise.this, "You have added this item to cart!", Toast.LENGTH_LONG).show();

           }

       });


        spinner = findViewById(R.id.spinner2);
//        spinner.setOnItemSelectedListener(this);

        imageView = findViewById(R.id.imageView3);

        TextView textPrice = (TextView)findViewById(R.id.txtPrice);


        final String str[] = {"Shirt", "Phone Case", "Wallpaper"};
        final String strPrice[] = {" $ 29.99 ", " $ 14.99 ", " $ 2.99 "};

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                String selectedItem = parent.getItemAtPosition(i).toString();
                TextView displayTextView = (TextView) findViewById(R.id.txtPrice);
                String[] priceArray = getResources().getStringArray(R.array.prices_array);


                {
                    if (str[0].equals(spinner.getItemAtPosition(i).toString())) {
                        imageView.setImageResource(R.drawable.shirt);
                        displayTextView.setText((priceArray[0]));
                    } else if (str[1].equals(spinner.getItemAtPosition(i).toString())) {
                        imageView.setImageResource(R.drawable.phone_case);
                        displayTextView.setText((priceArray[1]));
                    } else if (str[2].equals(spinner.getItemAtPosition(i).toString())) {
                        imageView.setImageResource(R.drawable.wallpaper);
                        displayTextView.setText((priceArray[2]));
                    }
                }
            }





       public void onNothingSelected(AdapterView<?> parent)
        {

        }
        });
        }
public void onItemSelected(AdapterView<?> parent, View view,
        int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)



        }

}
