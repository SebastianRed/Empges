package com.sebastianrojo.empges.Model.Service;

import java.util.List;

import com.sebastianrojo.empges.Model.Entity.Empleado;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service
 */

public interface EmpleadoService {

    public void save(Empleado empleado);
    
    public Empleado findById(Integer numEmp);
    
    public List<Empleado> findAll();

    public Page<Empleado> findAll(Pageable pageable);
    
    public void deleteById(Integer numEmp);

}