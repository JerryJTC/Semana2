package com.example.semana6;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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



        String[] listaalumnos = new String[]{ "NOHELIA ADAMARIS CEDEÑO BERMELLO" , "Paco Sanchez" , "Toto Almeria" , "Carlos Cuates" , "Quinto Walter" , "Sixto Parra" , "Soria Hunto" , "Octavio Herrera" , "Novenoso Cedeño" , "Decimoso Quito", "JOSEPH URIEL CABRERA PANTOJA", "WALTER GUSTAVO CADME ZAMBRANO"







        };

        ArrayAdapter<String> adaptador2 =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listaalumnos);



        ListView lstlistaalunmos = findViewById(R.id.lvlista);

        lstlistaalunmos.setAdapter(adaptador2);
        lstlistaalunmos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                               @Override
                                               public void onItemClick(AdapterView<?> adapterView, View view , int i, long l) {
                                                   Toast.makeText(getApplicationContext(), "Alumno Seleccionado  " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();

                                               }
                                           }



        );





    }
}