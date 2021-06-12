package com.sebastianrojo.empges.Model;

import java.util.Date;

/**
 * Salario
 */
public class Salario {
    
    private Integer numEmp;
    private Integer salario;
    private Date fechaComienzo;
    private Date fechaTermino;

    public Salario() {

    }

    public Salario(Integer numEmp, Integer salario, Date fechaComienzo, Date fechaTermino) {
        this.numEmp = numEmp;
        this.salario = salario;
        this.fechaComienzo = fechaComienzo;
        this.fechaTermino = fechaTermino;
    }

    public Integer getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(Integer numEmp) {
        this.numEmp = numEmp;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
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
        return "Salario [fechaComienzo=" + fechaComienzo + ", fechaTermino=" + fechaTermino + ", numEmp=" + numEmp
                + ", salario=" + salario + "]";
    }
    
}
