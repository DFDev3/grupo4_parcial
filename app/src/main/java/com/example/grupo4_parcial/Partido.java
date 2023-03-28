package com.example.grupo4_parcial;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Partido implements Serializable {

    public String Rival, RivalUrl, Yo, YoUrl;
    public int gf, gc;
    public ArrayList<String> JugadoresR, JugadoresY,Bastard;

    public Partido(String rival, String rivalUrl, String yo, String yoUrl, int gf, int gc, ArrayList<String> jugadoresR, ArrayList<String> jugadoresY) {
        Rival = rival;
        RivalUrl = rivalUrl;
        Yo = "Bastard Munchen";
        YoUrl = "https://www.bonjourlesenfants.net/coloriages/2272/g/blue-lock-g-7.jpg";
        this.gf = gf;
        this.gc = gc;
        JugadoresR = jugadoresR;
        Bastard.addAll(Arrays.asList("Gin Gagamaru","Noel Noa","Michael Kaiser","Alexis Ness","Benedict Grim","Erik Gesner","Kenyu Yukimiya","Ranze Kurona","Resnuke Kunigami","Jingo Raichi","Yoichi Isagi"));
        JugadoresY = Bastard;
    }

    public Partido() {
    }

    public String getYo() {
        return Yo;
    }

    public void setYo(String yo) {
        Yo = yo;
    }

    public String getYoUrl() {
        return YoUrl;
    }

    public void setYoUrl(String yoUrl) {
        YoUrl = yoUrl;
    }

    public ArrayList<String> getJugadoresR() {
        return JugadoresR;
    }

    public void setJugadoresR(ArrayList<String> jugadoresR) {
        JugadoresR = jugadoresR;
    }

    public ArrayList<String> getJugadoresY() {
        return JugadoresY;
    }

    public void setJugadoresY(ArrayList<String> jugadoresY) {
        JugadoresY = jugadoresY;
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
}