package com.ar.maribelaizpitarte.backend.Mod;

import java.io.Serializable;

public class SkillM implements Serializable {

    private String skill;

    private Integer porcentaje;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }
}
