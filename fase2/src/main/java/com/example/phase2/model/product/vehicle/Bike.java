package com.example.phase2.model.product.vehicle;

import com.example.phase2.model.ModelData;
import com.example.phase2.model.product.ProductCategory;

public class Bike extends Vehicle {

    private BikeType type;

    public Bike(String companyName, String name, int nmbrAvailable, BikeType type, double price) {

        super(companyName, name, nmbrAvailable, price);
        this.type = type;

        //set id
        this.ID = new StringBuilder(companyName + "-" + name + "-" + type.toString());

        ModelData.getProducts().add(this);

        this.category = ProductCategory.BIKE;

        ModelData.getBikes().add(this);
    }

    public BikeType getType() {
        return type;
    }

    public void setType(BikeType type) {
        this.type = type;
    }

    public void setBikeType(BikeType bikeType) {
        this.type = bikeType;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "\ntype=" + type +
                "\nID=" + ID +
                "\nname='" + name + '\'' +
                "\nBuyers score=" + this.getAverageScore() +
                "\nprice=" + price +
                "\nnumberOfAvailable=" + numberOfAvailable +
                "\nnumber=" + number +
                "}\n\n";
    }
}
