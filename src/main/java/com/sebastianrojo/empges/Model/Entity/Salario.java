package com.sebastianrojo.empges.Model.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Salario
 */

@Entity
@Table(name = "salaries")
public class Salario implements Serializable {
    
    @Id
    @Column(name = "emp_no")
    private Integer numEmp;

    @Column(name = "salary")
    private Integer salario;

    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date fechaComienzo;

    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date fechaTermino;

    private static final long serrialVersionUID = 1L;

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
