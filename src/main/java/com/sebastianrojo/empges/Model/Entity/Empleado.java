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
 * Empleado
 */

@Entity
@Table(name = "employees")
public class Empleado implements Serializable {
    
    @Id
    @Column(name = "emp_no")
    private Integer numEmp;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "first_name", length = 14)
    private String nombre;

    @Column(name = "last_name", length = 16)
    private String apellido;

    @Column(name = "gender")
    private String genero;

    @Column(name = "hire_date")
    @Temporal(TemporalType.DATE)
    private Date fechaContrato;
    
    private static final long serrialVersionUID = 1L;

    public Empleado() {
        
    }

    public Empleado(Integer numEmp, Date fechaNacimiento, String nombre, String apellido, String genero, Date fechaContrato) {
        this.numEmp = numEmp;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaContrato = fechaContrato;
    }

    public Integer getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(Integer numEmp) {
        this.numEmp = numEmp;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public String toString() {
        return "Empleado [apellido=" + apellido + ", fechaContrato=" + fechaContrato + ", fechaNacimiento="
                + fechaNacimiento + ", genero=" + genero + ", nombre=" + nombre + ", numEmp=" + numEmp + "]";
    }
    
}