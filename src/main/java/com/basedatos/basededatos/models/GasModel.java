package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "Gas")

public class GasModel {

    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Ubication")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Ubication;

    @Column(name = "Name_Gass")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Name_Gass;

    @Column (name = "Active")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private boolean Active;

    @Column (name = "Total")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Total;

    @Column (name = "Phone")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Phone;

    public GasModel(long id) {
        this.id = id;
    }

    public GasModel() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUbication() {
        return Ubication;
    }

    public void setUbication(String ubication) {
        Ubication = ubication;
    }

    public String getName_Gass() {
        return Name_Gass;
    }

    public void setName_Gass(String name_Gass) {
        Name_Gass = name_Gass;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}