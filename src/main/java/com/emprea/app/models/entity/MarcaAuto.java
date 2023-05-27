package com.emprea.app.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca_auto")
public class MarcaAuto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MARCA")
    private int idMarca;

    @Column(name = "NOMBRE_MARCA")
    private String NombreMarca;


    
    public MarcaAuto() {
    }


    public MarcaAuto(int idMarca, String nombreMarca) {
        this.idMarca = idMarca;
        NombreMarca = nombreMarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return NombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        NombreMarca = nombreMarca;
    }

    

}