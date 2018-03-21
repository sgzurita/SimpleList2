package com.android.curso.simplelist2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Persona> listaPersonas;
    private ListView lista;
    private ArrayAdapter<Persona> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonas=new ArrayList<>();
        listaPersonas.add(new Persona("pepe","mora","lopez"));
        listaPersonas.add(new Persona("ana","gomez","perez"));

        lista=(ListView)findViewById(R.id.lista);
        adapter=new ArrayAdapter<Persona> (this, android.R.layout.simple_list_item_2, android.R.id.text1, listaPersonas) {

            @Override
            public View getView(int position,
                                View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView text1 = (TextView) view.findViewById(android.R.id.text1);
                TextView text2 = (TextView) view.findViewById(android.R.id.text2);

                text1.setText(listaPersonas.get(position).getNombre());

                text2.setText( listaPersonas.get(position).getPrimerApellido()+" "+ listaPersonas.get(position).getSegundoApellido());

                return view;
            }

        };
        lista.setAdapter(adapter);



    }
}
