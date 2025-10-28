package com.pluralsight;

public class House extends Asset {

    String address;
    int condition, squareFoot, lotSize;

    public House(String description, String dateAcquired,String address,double originalCost,
                 int condition, int squareFoot, int lotSize ) {
        super(description, dateAcquired, originalCost);

        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @Override
    public double getValue() {
        double pricePerSqFt = switch (this.condition) {
            case 1 -> 180.0;
            case 2 -> 130.0;
            case 3 ->  90.0;
            case 4 ->  80.0;
            default -> 0.0;
        };

        return (pricePerSqFt * squareFoot) + (lotSize * 0.25);
    }

    }



