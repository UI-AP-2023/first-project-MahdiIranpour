package com.example.phase2.model.product.stationerySupplies;


import com.example.phase2.model.ModelData;
import com.example.phase2.model.product.ProductCategory;

public class Office extends StationerySupplies {

    private int numberOfSheets;
    private String paperType;

    //0000000000000000000000000000000000000000000000000===CONSTRUCTOR

    public Office(String country, int numberOfSheets, String paperType, String name, int nmbrAvailable, double price) {
        super(country,name,nmbrAvailable,price);
        this.numberOfSheets = numberOfSheets;
        this.paperType = paperType;

        //set ID for every object with its properties
        this.ID = new StringBuilder("OFFICE-"+name+"-"+numberOfSheets+"Sheets-"+paperType+"-"+country);

        ModelData.getProducts().add(this);

        this.category= ProductCategory.OFFICE;

        ModelData.getOffices().add(this);
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    @Override
    public String toString() {
        return "\nOffice{" +
                "\nnumberOfSheets=" + numberOfSheets +
                "\npaperType='" + paperType + '\'' +
                "\nID=" + ID +
                "\nname='" + name + '\'' +
                "\nprice=" + price +
                "\nBuyers score=" + this.getAverageScore() +
                "\nnumberOfAvailable=" + numberOfAvailable +
                "\nnumber=" + number +
                "}\n\n";
    }
}