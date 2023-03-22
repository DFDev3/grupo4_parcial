package com.example.grupo4_parcial;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {

    public String Rival,RivalUrl;
    public int gf,gc;
    public ArrayList<String> Jugadores;

    public Producto() {}
    public Producto(String rival, String rivalUrl, int gf, int gc, ArrayList<String> jugadores) {
        Rival = rival;
        RivalUrl = rivalUrl;
        this.gf = gf;
        this.gc = gc;
        Jugadores = jugadores;
    }

    public String getRival() {
        return Rival;
    }

    public void setRival(String rival) {
        Rival = rival;
    }

    public String getRivalUrl() {
        return RivalUrl;
    }

    public void setRivalUrl(String rivalUrl) {
        RivalUrl = rivalUrl;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public ArrayList<String> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        Jugadores = jugadores;
    }
}
