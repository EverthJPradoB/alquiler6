package com.emprea.app.models.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "estado_auto")
public class EstadoAuto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTADO")
    private int IdEstadoAuto;

    @Column(name = "ESTADO")
    private String disponibilidad;


    
    public EstadoAuto() {
    }

    

    
    public EstadoAuto(int idEstadoAuto, String disponibilidad) {
        IdEstadoAuto = idEstadoAuto;
        this.disponibilidad = disponibilidad;
    }





    public int getIdEstadoAuto() {
        return IdEstadoAuto;
    }

    public void setIdEstadoAuto(int idEstadoAuto) {
        IdEstadoAuto = idEstadoAuto;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }



    
}
