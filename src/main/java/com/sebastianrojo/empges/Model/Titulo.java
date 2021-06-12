package com.sebastianrojo.empges.Model;

import java.util.Date;

/**
 * Titulo
 */
public class Titulo {

    private Integer numEmp;
    private String titulo;
    private Date fechaComienzo;
    private Date fechaTermino;

    public Titulo() {

    }

    public Titulo(Integer numEmp, String titulo, Date fechaComienzo, Date fechaTermino) {
        this.numEmp = numEmp;
        this.titulo = titulo;
        this.fechaComienzo = fechaComienzo;
        this.fechaTermino = fechaTermino;
    }

    public Integer getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(Integer numEmp) {
        this.numEmp = numEmp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(Date fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    @Override
    public String toString() {
        return "Titulo [fechaComienzo=" + fechaComienzo + ", fechaTermino=" + fechaTermino + ", numEmp=" + numEmp
                + ", titulo=" + titulo + "]";
    }

}