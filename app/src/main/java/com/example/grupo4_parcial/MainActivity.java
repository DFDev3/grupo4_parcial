package com.example.grupo4_parcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rvprods;

    private ArrayList<Partido> listadoprincipalp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getString(R.string.listado)
        );

        LoadData();

        rvprods = findViewById(R.id.rv);

        CustomAdapter myAdapter = new CustomAdapter(listadoprincipalp);

        myAdapter.setOnClickListener(new CustomAdapter.OnClickListener() {
            @Override
            public void OnItemClick(Partido miPartido, int posicion) {
                Intent intent = new Intent(MainActivity.this, InfoPartidoActivity.class);
                intent.putExtra("Partido", miPartido);
                startActivity(intent);
            }
        });

        rvprods.setAdapter(myAdapter);
        rvprods.setLayoutManager(new LinearLayoutManager(this));
    }
    public void LoadData(){

        ArrayList<String> Chelsea = new ArrayList<>(),Barcelona = new ArrayList<>(),Manchester = new ArrayList<>(),PSG = new ArrayList<>(),RM = new ArrayList<>();
        Chelsea.addAll(Arrays.asList("Edouard Mendy","Marc Ucurella","Ben Chilwell","Kalidou Koulibaly","Cesar Azpilicueta","Lewis Hall","NGolo Kante","Enzo Fernandez","Mijailo Mudryk","Datro Fofana","Noni Madueke"));
        Manchester.addAll(Arrays.asList("David de Gea", "Victor Lindelöf","Eric bailly","Luke Shaw","Teden Mengi","Facundo pellistri","Fred","Bruno Fernandes","Marcus Pashford","Anthony Martial","Mason Greenwood"));
        PSG.addAll(Arrays.asList("Sergio Rico","Achraf Hakii","Marquinhos","Nuno Mendes","Timothee Pembele","Marco Verratti","Fabian Ruiz","Vitinha","Kylian Mbappe","Lionel Messi","Neymar Jr"));
        Barcelona.addAll(Arrays.asList("Ter Stegen","Marcos Alonso","Jordi Alba","Jules Kounde","Pedri","Segi Roberto","Frank Kessie","Sergio Busquets","Rober Lewandowski","Ousmane Dembele","Ferran Torres"));
        RM.addAll(Arrays.asList("Courtois","Alaba","Carbajal","F.Mendy","Nacho","Modric","Valverde","Kroos","Camavinga","Hazard","Benzema"));

        Partido Partido1 = new Partido("Chelsea","https://assets.stickpng.com/images/580b57fcd9996e24bc43c4e1.png",null,null,4,2,Chelsea,null);
        Partido Partido2 = new Partido("Barcelona","https://www.pngplay.com/wp-content/uploads/6/FC-Barcelona-Football-PNG-HD-Quality.png",null,null,1,0,Barcelona,null);
        Partido Partido3 = new Partido("Manchester","https://img2.freepng.es/20180815/wk/kisspng-manchester-united-f-c-premier-league-\n" +
                "logo-footbal-5b74d4dbeeb681.9226406815343833239778.jpg",null,null,2,0, Manchester,null);
        Partido Partido4 = new Partido("Real Madrid","https://e7.pngegg.com/pngimages/161/540/png-clipart-real-madrid-c-f-uefa-champions-\n" +
                "league-la-liga-uefa-super-cup-dream-league-soccer-others-miscellaneous-logo.png",null,null,3,2,RM,null);
        Partido Partido5 = new Partido("PSG","https://seeklogo.com/images/P/psg-logo-DEE93C563D-seeklogo.com.png",null,null,7,1,PSG,null);

        listadoprincipalp = new ArrayList<>();
        listadoprincipalp.add(Partido1);
        listadoprincipalp.add(Partido2);
        listadoprincipalp.add(Partido3);
        listadoprincipalp.add(Partido4);
        listadoprincipalp.add(Partido5);

    }
}
