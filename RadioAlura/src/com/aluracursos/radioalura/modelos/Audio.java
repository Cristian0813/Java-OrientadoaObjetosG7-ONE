package com.aluracursos.radioalura.modelos;

public class Audio {

    private String titulo;
    private int totalDeReproducciones;
    private int  totalDeMegusta;
    private int calificasiones;

    public void meGusta(){
        this.totalDeMegusta ++;
    }

    public void reproduce(){
        this.totalDeReproducciones ++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMegusta() {
        return totalDeMegusta;
    }

    public void setTotalDeMegusta(int totalDeMegusta) {
        this.totalDeMegusta = totalDeMegusta;
    }

    public int getCalificasiones() {
        return calificasiones;
    }

    public void setCalificasiones(int calificasiones) {
        this.calificasiones = calificasiones;
    }
}
