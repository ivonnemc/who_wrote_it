package com.example.ivonnemc.who_wrote_it;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button searchBooks=(Button)findViewById(R.id.search_button);
        searchBooks.setOnClickListener(this);
        searchBooks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,"Busqueda exitosa",Toast.LENGTH_SHORT).show();
            }


        });


    }

    @Override
    public void onClick(View v) {

    }
}
