/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fp_1.model.PartPurchasing;

import java.util.Date;

/**
 *
 * @author yiyangzhou
 */
public class PartPurchase {
    private int ID;
    private int WarehouseID;
    private String PartName;
    private Date CreateTime;
    private short Status;
    private int Number;
    private float PerPrice;
    String ForCar;

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
    
}
