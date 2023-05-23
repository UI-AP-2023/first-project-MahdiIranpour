package com.example.fase2.model.product.digital_Product.storageDevice;


//================================================================

import com.example.fase2.model.product.digital_Product.DigitalProduct;

public abstract class StorageDevice extends DigitalProduct {
    private int capacity;

    //0000000000000000000000000000000000000000000000000===constructor
    StorageDevice(int capacity, int weight, int size, String name, int numberOfAvailable,double price){

        super(weight, size, name, numberOfAvailable,price);
        this.capacity = capacity;
    }



    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}


//------------------------------------------------------------------

