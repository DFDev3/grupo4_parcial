package com.example.grupo4_parcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Producto> equipos;
    private RecyclerView rvprods;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getString(R.string.listpartidos));

        LoadData();

        rvprods = findViewById(R.id.rv);


    }

    public void LoadData(){
        ArrayList<String> BarcaPlayers = new ArrayList<>();
        BarcaPlayers.addAll(Arrays.asList("Ter Stegen","Marcos Alonso","Jordi Alba","Jules Kounde","Pedri","Sergi Roberton","Frank Kessie","Sergio Busquets","Robert Lewandowski","Ousmane Dembele","Ferran Torres"));
        Producto Barca = new Producto("Barcelona FC","https://www.pngplay.com/wp-content/uploads/6/FC-Barcelona-Football-PNG-HD-Quality.png",4,2,BarcaPlayers);
    }
}