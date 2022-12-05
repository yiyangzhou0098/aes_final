/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.MaterialPurchasing;

import java.util.Date;

/**
 *
 * @author kai
 */
public class MaterialPurchaseOrder {
    String MaterialName;
    String Origin;
    double Weight;
    double UnitPrice;
    double shipmentFee;
    int Timespand;
    Date OrderDate;
    boolean isArrival;

    public String getMaterialName() {
        return MaterialName;
    }

    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public double getShipmentFee() {
        return shipmentFee;
    }

    public void setShipmentFee(double shipmentFee) {
        this.shipmentFee = shipmentFee;
    }

    public int getTimespand() {
        return Timespand;
    }

    public void setTimespand(int Timespand) {
        this.Timespand = Timespand;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public boolean isIsArrival() {
        return isArrival;
    }

    public void setIsArrival(boolean isArrival) {
        this.isArrival = isArrival;
    }
    
}
