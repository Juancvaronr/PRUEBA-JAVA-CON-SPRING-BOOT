package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.FrutaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaRepository extends CrudRepository<FrutaModel, Long> {
    public abstract ArrayList<FrutaModel> findByCantidad(Integer cantidad);

}