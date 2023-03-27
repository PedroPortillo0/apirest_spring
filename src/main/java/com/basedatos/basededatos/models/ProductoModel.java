package com.basedatos.basededatos.models;


import jakarta.persistence.*;

@Entity
@Table(schema = "producto")


public class ProductoModel {

    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nameproduct")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nameproduct;
    @Column(name = "precio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double precio;
    @Column(name = " id_fabricante ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id_fabricante ;

    @ManyToOne
    private FabricanteModel fabricanteModel;

    public ProductoModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(long id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public FabricanteModel getFabricanteModel() {
        return fabricanteModel;
    }

    public void setFabricanteModel(FabricanteModel fabricanteModel) {
        this.fabricanteModel = fabricanteModel;
    }
}
