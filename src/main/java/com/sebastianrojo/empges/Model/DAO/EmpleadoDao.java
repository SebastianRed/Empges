package com.sebastianrojo.empges.Model.DAO;

import com.sebastianrojo.empges.Model.Entity.Empleado;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * EmpleadoDao
 */

public interface EmpleadoDao extends PagingAndSortingRepository<Empleado, Integer> {

}