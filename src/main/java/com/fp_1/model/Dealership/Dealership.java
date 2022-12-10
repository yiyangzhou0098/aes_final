/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.model.Dealership;

/**
 *
 * @author yiyangzhou
 */
public class Dealership {

    int VIN;
    String DriveType;
    String Car;
    String EngineType;
    String Transmission;
    float Price;
    String Location;
    String Photopath;

    public String getPhotopath() {
        return Photopath;
    }

    public void setPhotopath(String Photopath) {
        this.Photopath = Photopath;
    }

    public Dealership() {
        super();
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getDriveType() {
        return DriveType;
    }

    public void setDriveType(String DriveType) {
        this.DriveType = DriveType;
    }

    public String getCar() {
        return Car;
    }

    public void setCar(String Car) {
        this.Car = Car;
    }

    public String getEngineType() {
        return EngineType;
    }

    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String Transmission) {
        this.Transmission = Transmission;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
}
