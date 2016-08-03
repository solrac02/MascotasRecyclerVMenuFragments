package com.juanmorales.mascotasrv.pojo;

/**
 * Created by juan.morales on 27/07/2016.
 */
public class Mascota {

    private String nombreMascota;
    private int    fotoMascota;
    private String    contador;
    private int fotoHueso1;
    private int fotoHueso2;

    public Mascota(String nombreMascota, int fotoMascota, String contador, int fotoHueso1, int fotoHueso2){
        this.nombreMascota = nombreMascota;
        this.fotoMascota   = fotoMascota;
        this.contador      = contador;
        this.fotoHueso1    = fotoHueso1;
        this.fotoHueso2     = fotoHueso2;


    }

    public Mascota(int fotoMascota, String contador, int fotoHueso2){

        this.fotoMascota   = fotoMascota;
        this.contador      = contador;
        this.fotoHueso2     = fotoHueso2;

    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }

    public int getFotoHueso1() {
        return fotoHueso1;
    }

    public void setFotoHueso1(int fotoHueso1) {
        this.fotoHueso1 = fotoHueso1;
    }

    public int getFotoHueso2() {
        return fotoHueso2;
    }

    public void setFotoHueso2(int fotoHueso2) {
        this.fotoHueso2 = fotoHueso2;
    }



}
