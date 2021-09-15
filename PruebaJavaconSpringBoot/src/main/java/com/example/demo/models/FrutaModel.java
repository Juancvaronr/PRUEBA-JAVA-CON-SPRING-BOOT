package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "fruta")
public class FrutaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String tipo;
    private Integer cantidad;
    private float precio;

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
}