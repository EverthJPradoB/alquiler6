package com.emprea.app.models.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO_USUARIO")
    private int IdTipoUsuario;

    @Column(name = "NOMBRE_TIPO_USUARIO")
    private String NombreTipoUsuario;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String nombreTipoUsuario) {
        IdTipoUsuario = idTipoUsuario;
        NombreTipoUsuario = nombreTipoUsuario;
    }

    public int getIdTipoUsuario() {
        return IdTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        IdTipoUsuario = idTipoUsuario;
    }

    public String getNombreTipoUsuario() {
        return NombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        NombreTipoUsuario = nombreTipoUsuario;
    }
}
