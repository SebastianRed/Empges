package com.sebastianrojo.empges.Model.Service;

import java.lang.annotation.Annotation;
import java.util.List;

import com.sebastianrojo.empges.Model.DAO.EmpleadoDao;
import com.sebastianrojo.empges.Model.Entity.Empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ServiceImpl
 */ 

 @Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado findById(Integer numEmp) {
        return empleadoDao.findById(numEmp).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Empleado> findAll(Pageable pageable) {
        return null;
    }

    @Override
    @Transactional
    public void deleteById(Integer numEmp) {
        empleadoDao.deleteById(numEmp);
    }

}