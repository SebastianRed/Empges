package com.sebastianrojo.empges.Model.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Departamento
 */

@Entity
@Table(name = "departaments")
public class Departamento implements Serializable {

    @Id
    @Column(name = "dept_no")
    private String numDepto;

    @Column(name = "dept_name", length = 40)
    private String nombreDepto;
    
    private static final long serrialVersionUID = 1L;

    public Departamento() {

    }

    public Departamento(String numDepto, String nombreDepto) {
        this.numDepto = numDepto;
        this.nombreDepto = nombreDepto;
    }

    public String getNumDepto() {
        return numDepto;
    }

    public void setNumDepto(String numDepto) {
        this.numDepto = numDepto;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

    @Override
    public String toString() {
        return "Departamento [nombreDepto=" + nombreDepto + ", numDepto=" + numDepto + "]";
    }

}