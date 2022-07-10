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
@Table (name = "experiencia")
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String empresa;
    
    @Column
    private String rol;

    @Column
    private String fechadeingreso;

    @Column
    private String fechadeegreso;

    @Column
    private String tarea1;

    @Column
    private String tarea2;   

    @Column
    private String tarea3;   

    @Column
    private String tarea4;   

    @Column
    private String tarea5;   

    @Column
    private String tarea6;
    
    @Column
    private String tarea7;   
    
    @Column
    private String tarea8;   
    
    @Column
    private String tarea9;    
    
}