package com.sebastianrojo.empges.Model;

/**
 * Departamento
 */
public class Departamento {

    private String numDepto;
    private String nombreDepto;
    
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