package com.sebastianrojo.empges.Model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sebastianrojo.empges.Model.Entity.Empleado;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * EmpleadoDaoImpl
 */

@Repository
public class EmpleadoDaoImpl implements IEmpleadoDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void create(Empleado empleado) {
        if(empleado.getNumEmp() != null && empleado.getNumEmp() > 0) {
            em.merge(empleado);
        } else {
            em.persist(empleado);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado readOne(Integer numEmp) {
        return em.find(Empleado.class, numEmp); 
    }
    
    @Override
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Empleado> readAll() {
        return em.createQuery("from Empleado").getResultList();
    }

    @Override
    @Transactional
    public void delete(Integer numEmp) {
        em.remove(readOne(numEmp));
    }

}
