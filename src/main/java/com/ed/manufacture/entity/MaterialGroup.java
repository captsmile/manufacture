package com.ed.manufacture.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "гр1сырьё")
public class MaterialGroup {

    @Id
    @GeneratedValue
    @Column(name = "кодгр1")
    private int id;

    @Column(name = "гр1описание")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
