package com.example.phase2.model.product.stationerySupplies;


import com.example.phase2.model.Discount.Discountable;
import com.example.phase2.model.ModelData;
import com.example.phase2.model.product.ProductCategory;

public class Pen extends StationerySupplies implements Discountable {

    private String color;
    private static int discountPercent = 0;

    //0000000000000000000000000000000000000000000000000===CONSTRUCTOR

    public Pen(String country, String color, String name, int nmbrAvailable, double price) {
        super(country, name, nmbrAvailable, price);
        this.color = color;

        //set ID for every object with its properties
        this.ID = new StringBuilder("PEN-" + name + "-" + color + "-" + country);

        ModelData.getProducts().add(this);

        this.category = ProductCategory.PEN;

        ModelData.getPens().add(this);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPriceWithDiscount() {
        return this.price - (this.price * ((double) discountPercent / 100));
    }

    @Override
    public double getPrice(){
        return getPriceWithDiscount();
    }

    @Override
    public void setDiscountPercent(int percent) {
        discountPercent = percent;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                "\nBuyers score=" + this.getAverageScore() +
                ", numberOfAvailable=" + numberOfAvailable +
                ", number=" + number +
                '}';
    }
}
