package com.example.semana6;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String[] datos = new String[]{ "Primero" , "Segundo" , "Tercero" , "Cuarto" , "Quinto" , "Sexto" , "Septimo" , "Octavo" , "Noveno" , "Decimo"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, datos);


        AutoCompleteTextView textView = findViewById(R.id.autlistacursos);textView.setAdapter(adapter);

    }
}