package com.example.tiendaPokemon.models;

import java.util.UUID;

import jakarta.persistence.Entity;

@Entity 
public class Pokemon {

    @Id
    private UUID id;
    private String name;
    private Integer defensa;
    private Integer ataque;
    private String tipo;
    public Pokemon() {
    }
    public Pokemon(UUID id, String name, Integer defensa, Integer ataque, String tipo) {
        this.id = id;
        this.name = name;
        this.defensa = defensa;
        this.ataque = ataque;
        this.tipo = tipo;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getDefensa() {
        return defensa;
    }
    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }
    public Integer getAtaque() {
        return ataque;
    }
    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
