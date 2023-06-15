package com.example.phase2.model.product.digital_Product.storageDevice;


import com.example.phase2.model.ModelData;
import com.example.phase2.model.product.ProductCategory;

public class SSD extends StorageDevice {

    private double readingSpeed, writingSpeed;

    //0000000000000000000000000000000000000000000000000===constructor

    public SSD(int capacity, double readingSpeed, double writingSpeed, int weight, int size, String name, int numberOfAvailable, double price) {

        super(capacity, weight, size, name, numberOfAvailable, price);
        this.readingSpeed = readingSpeed;
        this.writingSpeed = writingSpeed;

        //set ID for every object with its properties
        this.ID = new StringBuilder("SSD-" + name + "-" + capacity + "GB-" + readingSpeed + "RS-" + writingSpeed + "WS");


        this.category = ProductCategory.SSD;

        ModelData.getProducts().add(this);
        ModelData.getSSDs().add(this);
    }

    public double getReadingSpeed() {
        return readingSpeed;
    }

    public void setReadingSpeed(double readingSpeed) {
        this.readingSpeed = readingSpeed;
    }

    public double getWritingSpeed() {
        return writingSpeed;
    }

    public void setWritingSpeed(double writingSpeed) {
        this.writingSpeed = writingSpeed;
    }

    @Override
    public String toString() {
        return "\nSSD{" +
                "\nreadingSpeed=" + readingSpeed +
                "\nwritingSpeed=" + writingSpeed +
                "\nID=" + ID +
                "\nname='" + name + '\'' +
                "\nprice=" + price +
                "\nnumberOfAvailable=" + numberOfAvailable +
                "\nBuyers score=" + this.getAverageScore() +
                "\nnumber=" + number +
                "}\n\n";
    }
}
