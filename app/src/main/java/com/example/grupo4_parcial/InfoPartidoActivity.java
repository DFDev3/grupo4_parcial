package com.example.grupo4_parcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;

public class InfoPartidoActivity extends AppCompatActivity {

    private TextView tvlocal,tvvisitante,tvtitulo;
    private ImageView ivlocal,ivvisitante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_partido);
        setTitle(getString(R.string.Detalle));

        tvlocal=findViewById(R.id.tvlocal);
        ivlocal=findViewById(R.id.ivlocal);
        tvvisitante=findViewById(R.id.tvlocal);
        ivvisitante=findViewById(R.id.ivlocal);

        Partido mipartido= (Partido) getIntent().getSerializableExtra("producto");

        tvlocal.setText(mipartido.getYo().toString());
        tvvisitante.setText(mipartido.getRival().toString());
        tvtitulo.setText(mipartido.getYo() + " vs " + mipartido.getRival());
        Picasso.get().load(mipartido.getRivalUrl())
                .error(R.drawable.ic_launcher_background)
                .into(ivvisitante);
        Picasso.get().load(mipartido.getYoUrl())
                .error(R.drawable.ic_launcher_background)
                .into(ivlocal);
    }

    public static class MainActivity extends AppCompatActivity {

        private ArrayList<Partido> equipos;
        private RecyclerView rvprods;
        private ArrayList<Partido> listadoprincipalp;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setTitle(getString(R.string.listado));

            LoadData();

            rvprods = findViewById(R.id.rv);

            CustomAdapter myAdapter = new CustomAdapter(listadoprincipalp);

            myAdapter.setOnClickListener(new CustomAdapter.OnClickListener() {
                @Override
                public void OnItemClick(Partido mipartido, int posicion) {
                    Intent intent = new Intent(MainActivity.this, InfoPartidoActivity.class);
                    intent.putExtra("Partido", mipartido);
                    startActivity(intent);
                }
            });

            rvprods.setAdapter(myAdapter);
            rvprods.setLayoutManager(new LinearLayoutManager(this));
        }
        public  void  LoadData(){

            ArrayList<String> Chelsea = new ArrayList<>(),Barcelona_FC = new ArrayList<>(),Manshine_City = new ArrayList<>(),PSG = new ArrayList<>(),RM = new ArrayList<>();
            Chelsea.addAll(Arrays.asList("Edouard Mendy","Marc Ucurella","Ben Chilwell","Kalidou Koulibaly","Cesar Azpilicueta","Lewis Hall","NGolo Kante","Enzo Fernandez","Mijailo Mudryk","Datro Fofana","Noni Madueke"));
            Manshine_City.addAll(Arrays.asList("David de Gea","Victor Lindelöf","Eric bailly","Luke Shaw","Teden Mengi","Facundo pellistri","Fred","Bruno Fernandes","Marcus Pashford","Anthony Martial","Mason Greenwood"));
            RM.addAll(Arrays.asList("Courtois","Alaba","Carbajal","F.Mendy","Nacho","Modric","Valverde","Kroos","Camavinga","Hazard","Benzema"));
            Barcelona_FC.addAll(Arrays.asList("Ter Stegen","Marcos Alonso","Jordi Alba","Jules Kounde","Pedri","Segi Roberto","Frank Kessie","Sergio Busquets","Rober Lewandowski","Ousmane Dembele","Ferran Torres"));
            PSG.addAll(Arrays.asList("Sergio Rico","Achraf Hakii","Marquinhos","Nuno Mendes","Timothee Pembele","Marco Verratti","Fabian Ruiz","Vitinha","Kylian Mbappe","Lionel Messi","Neymar Jr"));

            Partido partido1 = new Partido();
            partido1.setRival("Chelsea");
            partido1.setRivalUrl("https://assets.stickpng.com/images/580b57fcd9996e24bc43c4e1.png");
            partido1.gf=5;
            partido1.gc=2;
            partido1.setJugadoresR(Chelsea);


            Partido partido2 = new Partido();
            partido1.setRival("Manshine City");
            partido1.setRivalUrl("https://img2.freepng.es/20180815/wk/kisspng-manchester-united-f-c-premier-league-logo-footbal-5b74d4dbeeb681.9226406815343833239778.jpg");
            partido1.gf=4;
            partido1.gc=3;
            partido1.setJugadoresR(Manshine_City);

            Partido partido3 = new Partido();
            partido1.setRival("Barcelona FC");
            partido1.setRivalUrl("https://www.pngplay.com/wp-content/uploads/6/FC-Barcelona-Football-PNG-HD-Quality.png");
            partido1.gf=2;
            partido1.gc=1;
            partido1.setJugadoresR(Barcelona_FC);

            Partido partido4 = new Partido();
            partido1.setRival("PSG");
            partido1.setRivalUrl("https://seeklogo.com/images/P/psg-logo-DEE93C563D-seeklogo.com.png");
            partido1.gf=1;
            partido1.gc=0;
            partido1.setJugadoresR(PSG);

            Partido partido5 = new Partido();
            partido1.setRival("Real Madrid FC");
            partido1.setRivalUrl("https://e7.pngegg.com/pngimages/161/540/png-clipart-real-madrid-c-f-uefa-champions-\n" +
                    "league-la-liga-uefa-super-cup-dream-league-soccer-others-miscellaneous-logo.png");
            partido1.gf=7;
            partido1.gc=1;
            partido1.setJugadoresR(RM);

            listadoprincipalp = new ArrayList<>();
            listadoprincipalp.add(partido1);
            listadoprincipalp.add(partido2);
            listadoprincipalp.add(partido3);
            listadoprincipalp.add(partido4);
            listadoprincipalp.add(partido5);
        }
    }
}