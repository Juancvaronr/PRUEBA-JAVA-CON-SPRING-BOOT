package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.FrutaModel;
import com.example.demo.repositories.FrutaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrutaService {
    @Autowired
    FrutaRepository frutaRepository;
    
    public ArrayList<FrutaModel> obtenerFrutas(){
        return (ArrayList<FrutaModel>) frutaRepository.findAll();
    }

    public FrutaModel guardarFruta(FrutaModel fruta){
        return frutaRepository.save(fruta);
    }

    public Optional<FrutaModel> obtenerPorId(Long id){
        return frutaRepository.findById(id);
    }


    public ArrayList<FrutaModel>  obtenerPorCantidad(Integer cantidad) {
        return frutaRepository.findByCantidad(cantidad);
    }

    public boolean eliminarFruta(Long id) {
        try{
            frutaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}