package com.ar.maribelaizpitarte.backend.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "educacion")
public class Educacion implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String titulo;
    
    @Column
    private String establecimiento;
    
    @Column
    private Boolean culminado;

    @Column
    private String fechadeingreso;

    @Column
    private String fechadeegreso;

    @Column
    private String observacion;    


}