package com.fp_1.model.Assemble;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author yiyangzhou
 */
public class Assemble {

    private int AssembleID;
    private Short Status;
    private String Car;
    private Date CreateTime;

     public Assemble(){
        super();

     }
    
    public Assemble(int AssembleID, Short Status, String Car, Date CreateTime) {
        this.AssembleID = AssembleID;
        this.Status = Status;
        this.Car = Car;
        this.CreateTime = CreateTime;
    }

    public int getAssembleID() {
        return AssembleID;
    }

    public void setAssembleID(int AssembleID) {
        this.AssembleID = AssembleID;
    }

    public Short getStatus() {
        return Status;
    }

    public void setStatus(Short Status) {
        this.Status = Status;
    }

    public String getCar() {
        return Car;
    }

    public void setCar(String Car) {
        this.Car = Car;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return String.valueOf(AssembleID);

    }
}
