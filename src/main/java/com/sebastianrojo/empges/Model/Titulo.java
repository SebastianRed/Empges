package com.sebastianrojo.empges.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Titulo
 */

@Entity
@Table(name = "titles")
public class Titulo implements Serializable {

    @Id
    @Column(name = "emp_no")
    private Integer numEmp;

    @Column(name = "title", length = 50)
    private String titulo;

    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date fechaComienzo;

    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date fechaTermino;

    private static final long serrialVersionUID = 1L;

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