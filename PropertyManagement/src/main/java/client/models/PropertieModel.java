/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client.models;

import client.forms.SwingColumn;


public class PropertieModel {
    
    @SwingColumn(description = "ID")
    Integer id;
    @SwingColumn(description = "Titulo")
    String title;
    @SwingColumn(description = "Endereco")
    String address;
    @SwingColumn(description = "Tipo do imovel")
    String type;
    @SwingColumn(description = "Numero de quartos")
    Integer numberBedroom;
    @SwingColumn(description = "Numero de garagens")
    Integer numberGarage;
    @SwingColumn(description = "Area do terreno")
    Integer landArea;
    @SwingColumn(description = "Area construida")
    Integer buildedArea;
    @SwingColumn(description = "Preco")
    Double value;

    public PropertieModel(Integer id, String title, String address, String type, Integer numberBedroom, Integer numberGarage, Integer landArea, Integer buildedArea, Double value) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.type = type;
        this.numberBedroom = numberBedroom;
        this.numberGarage = numberGarage;
        this.landArea = landArea;
        this.buildedArea = buildedArea;
        this.value = value;
    }

    public PropertieModel() {
       
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBuildedArea() {
        return buildedArea;
    }

    public void setBuildedArea(Integer buildedArea) {
        this.buildedArea = buildedArea;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberBedroom() {
        return numberBedroom;
    }

    public void setNumberBedroom(Integer numberBedroom) {
        this.numberBedroom = numberBedroom;
    }

    public Integer getNumberGarage() {
        return numberGarage;
    }

    public void setNumberGarage(Integer numberGarage) {
        this.numberGarage = numberGarage;
    }

    public Integer getLandArea() {
        return landArea;
    }

    public void setLandArea(Integer landArea) {
        this.landArea = landArea;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
    
}
