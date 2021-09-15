package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.FrutaModel;
import com.example.demo.services.FrutaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/fruta")
public class FrutaController {
    @Autowired
    FrutaService frutaService;

    @GetMapping()
    public ArrayList<FrutaModel> obtenerFrutas(){
        return frutaService.obtenerFrutas();
    }

    @PostMapping()
    public FrutaModel guardarFruta(@RequestBody FrutaModel fruta){
        return this.frutaService.guardarFruta(fruta);
    }

    @GetMapping( path = "/{id}")
    public Optional<FrutaModel> obtenerFrutaPorId(@PathVariable("id") Long id) {
        return this.frutaService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<FrutaModel> obtenerFrutaPorPrioridad(@RequestParam("cantidad") Integer cantidad){
        return this.frutaService.obtenerPorCantidad(cantidad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.frutaService.eliminarFruta(id);
        if (ok){
            return "Se eliminó la fruta con id " + id;
        }else{
            return "No pudo eliminar la fruta con id" + id;
        }
    }

}