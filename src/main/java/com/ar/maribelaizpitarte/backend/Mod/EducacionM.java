package com.ar.maribelaizpitarte.backend.Mod;

import java.io.Serializable;

public class EducacionM implements Serializable {
  
    private String titulo;
    
    private String establecimiento;

    private String fechadeingreso;

    private String fechadeegreso;
    
    private String fotoedu;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(String fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }

    public String getFechadeegreso() {
        return fechadeegreso;
    }

    public void setFechadeegreso(String fechadeegreso) {
        this.fechadeegreso = fechadeegreso;
    }

    public String getFotoedu() {
        return fotoedu;
    }

    public void setFotoedu(String fotoedu) {
        this.fotoedu = fotoedu;
    }


}
