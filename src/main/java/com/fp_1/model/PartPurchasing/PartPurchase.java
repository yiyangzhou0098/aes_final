/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.model.PartPurchasing;

import java.util.Date;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author yiyangzhou
 */
public class PartPurchase implements Serializable {

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getWarehouseID() {
        return WarehouseID;
    }

    public void setWarehouseID(int WarehouseID) {
        this.WarehouseID = WarehouseID;
    }

    public String getPartName() {
        return PartName;
    }

    public void setPartName(String PartName) {
        this.PartName = PartName;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }

    public short getStatus() {
        return Status;
    }

    public void setStatus(short Status) {
        this.Status = Status;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public float getPerPrice() {
        return PerPrice;
    }

    public void setPerPrice(float PerPrice) {
        this.PerPrice = PerPrice;
    }

    public String getForCar() {
        return ForCar;
    }

    public void setForCar(String ForCar) {
        this.ForCar = ForCar;
    }

    private int ID;
    private int WarehouseID;
    private String PartName;
    private Date CreateTime;
    private short Status;
    private int Number;
    private float PerPrice;
    String ForCar;

    @Override
    public String toString() {
        return this.PartName;
    }

    public PartPurchase(int ID, int WarehouseID, String PartName, Date CreateTime, short Status, int Number, float PerPrice, String ForCar) {
        super();
        this.ID = ID;
        this.WarehouseID = WarehouseID;
        this.PartName = PartName;
        this.CreateTime = CreateTime;
        this.Status = Status;
        this.Number = Number;
        this.PerPrice = PerPrice;
        this.ForCar = ForCar;
    }

    public PartPurchase() {
        super();
    }
    
    public PartPurchase(int ID) {
        this.ID = ID;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.PartName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PartPurchase other = (PartPurchase) obj;
        return this.ID == other.ID;
    }
    
    
    
}
