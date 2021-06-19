package com.sebastianrojo.empges.Model.DAO;

import java.util.List;

import com.sebastianrojo.empges.Model.Entity.Empleado;

/**
 * EmpleadoDao
 */

public interface IEmpleadoDao {

    public void create(Empleado empleado);
    
    public Empleado readOne(Integer numEmp);
    
    public List<Empleado> readAll();
    
    public void delete(Integer numEmp);

}