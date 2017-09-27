/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Normativa {

    String codigo;
    String nombre;
    String descripcion;
    String codigoNormativaAsociada;

    public Normativa() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoNormativaAsociada() {
        return codigoNormativaAsociada;
    }

    public void setCodigoNormativaAsociada(String codigoNormativaAsociada) {
        this.codigoNormativaAsociada = codigoNormativaAsociada;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Normativa other = (Normativa) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre ;
    }

    
   
    
    

}
