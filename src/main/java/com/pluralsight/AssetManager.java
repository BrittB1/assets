package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {

    public static void main(String[] args) {
        ArrayList<Asset> assets = getAssets();

        System.out.println("===== Asset Report =====");
        System.out.println();

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f%n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;  // Downcast to House
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year/Make/Model: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println();
        }

        double totalValue = 0;
        for (Asset asset : assets) {
            totalValue += asset.getValue();
        }
        System.out.println("===========================");
        System.out.printf("Total Value of All Assets: $%.2f%n", totalValue);
    }

    private static ArrayList<Asset> getAssets() {
        ArrayList<Asset> assets = new ArrayList<>();

        House myHouse = new House(
                "My house",
                "2018-05-15",
                "123 Main Street, Springfield",
                250000.00,
                1,
                2000,
                8000
        );
        assets.add(myHouse);

        House vacationHome = new House(
                "Vacation home",
                "2020-07-20",
                "456 Beach Road, Miami",
                180000.00,
                2,
                1500,
                6000
        );
        assets.add(vacationHome);

        Vehicle myCar = new Vehicle(
                "My car",
                "2022-03-10",
                28000.00,
                "Honda Accord",
                2022,
                35000
        );
        assets.add(myCar);

        Vehicle tomsTruck = new Vehicle(
                "Tom's truck",
                "2015-11-05",
                32000.00,
                "Ford F-150",
                2015,
                125000
        );
        assets.add(tomsTruck);
        return assets;
    }
}