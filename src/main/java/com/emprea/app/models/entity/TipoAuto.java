package com.emprea.app.models.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_auto")
public class TipoAuto {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO")
    private Integer IdTipoAuto;
    
    @Column(name = "NOMBRE_TIPO")
    private String NombreTipo;

    public TipoAuto() {
    }

    public TipoAuto(int idTipoAuto, String nombreTipo) {
        IdTipoAuto = idTipoAuto;
        NombreTipo = nombreTipo;
    }
    public int getIdTipoAuto() {
        return IdTipoAuto;
    }

    public void setIdTipoAuto(int idTipoAuto) {
        IdTipoAuto = idTipoAuto;
    }

    public String getNombreTipo() {
        return NombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        NombreTipo = nombreTipo;
    }

    

}
