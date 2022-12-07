/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.model.MaterialProducing;

import com.fp_1.model.MaterialPurchasing.StorageMaterial;

/**
 *
 * @author kai
 */
public class CarParts {
    String Partname;
    Double weight;
    
    StorageMaterial material1;
    StorageMaterial material2;
    StorageMaterial material3; //maxium up to 3 materials for a carpart
    
    Double Mweight1;
    Double Mweight2;
    Double Mweight3;
    
    Double Partcost;
    String ProducingLocation;

    public String getPartname() {
        return Partname;
    }

    public void setPartname(String Partname) {
        this.Partname = Partname;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public StorageMaterial getMaterial1() {
        return material1;
    }

    public void setMaterial1(StorageMaterial material1) {
        this.material1 = material1;
    }

    public StorageMaterial getMaterial2() {
        return material2;
    }

    public void setMaterial2(StorageMaterial material2) {
        this.material2 = material2;
    }

    public StorageMaterial getMaterial3() {
        return material3;
    }

    public void setMaterial3(StorageMaterial material3) {
        this.material3 = material3;
    }

    public Double getMweight1() {
        return Mweight1;
    }

    public void setMweight1(Double Mweight1) {
        this.Mweight1 = Mweight1;
    }

    public Double getMweight2() {
        return Mweight2;
    }

    public void setMweight2(Double Mweight2) {
        this.Mweight2 = Mweight2;
    }

    public Double getMweight3() {
        return Mweight3;
    }

    public void setMweight3(Double Mweight3) {
        this.Mweight3 = Mweight3;
    }

   

    public Double getPartcost() {
        return Partcost;
    }

    public void setPartcost(Double Partcost) {
        this.Partcost = Partcost;
    }

    public String getProducingLocation() {
        return ProducingLocation;
    }

    public void setProducingLocation(String ProducingLocation) {
        this.ProducingLocation = ProducingLocation;
    }
    
    
}
