package Projects;

import java.util.Scanner;

public class Phone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do You Want a Phone?: ");
        System.out.println("1. yes");
        System.out.println("2. no");

        String phone = scanner.nextLine().toLowerCase();

        switch (phone) {
            case "1":
            case "yes":
                System.out.println("You selected: Yes");
                break;
            case "2":
            case "no":
                System.out.println("You selected: No");
                System.out.println("Thank you! Retry next time.");
                return;
            default:
                System.out.println("Invalid choice! Please choose 1 for Yes or 2 for No.");
                return;
        }

        System.out.println("Which phone do you want?: ");
        System.out.println("1. Samsung");
        System.out.println("2. Apple");
        String brand = scanner.nextLine().toLowerCase();

        int price = 0;

        if (brand.equals("1") || brand.equals("samsung")) {
            // Samsung phone options
            System.out.println("Which model of Samsung phone do you want?");
            System.out.println("1. Galaxy S22");
            System.out.println("2. Galaxy S10");
            System.out.println("3. Galaxy A34");
            String model = scanner.nextLine().toLowerCase();

            switch (model) {
                case "1":
                case "galaxy s22":
                    price = 89000;
                    System.out.println("You have selected: Galaxy S22");
                    break;
                case "2":
                case "galaxy s10":
                    price = 55000;
                    System.out.println("You have selected: Galaxy S10");
                    break;
                case "3":
                case "galaxy a34":
                    price = 90000;
                    System.out.println("You have selected: Galaxy A34");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid Samsung model.");
                    return;
            }

            // Samsung storage options
            System.out.println("Variants of Samsung phone:");
            System.out.println("1. 142 GB");
            System.out.println("2. 248 GB");
            System.out.println("3. 506 GB");
            String variant = scanner.nextLine().toLowerCase();

            switch (variant) {
                case "1":
                case "142 gb":
                case "142":
                    System.out.println("You have selected: 142 GB");
                    break;
                case "2":
                case "248 gb":
                case "248":
                    System.out.println("You have selected: 248 GB");
                    break;
                case "3":
                case "506 gb":
                case "506":
                    System.out.println("You have selected: 506 GB");
                    break;
                default:
                    System.out.println("Invalid choice! Select only the available options.");
                    return;
            }

            // Samsung color options
            System.out.println("Color of Samsung phone:");
            System.out.println("1. Blue");
            System.out.println("2. Multicolor");
            System.out.println("3. Pink");
            String color = scanner.nextLine().toLowerCase();

            switch (color) {
                case "1":
                case "blue":
                    System.out.println("You have selected: Blue");
                    break;
                case "2":
                case "multicolor":
                    System.out.println("You have selected: Multicolor");
                    break;
                case "3":
                case "pink":
                    System.out.println("You have selected: Pink");
                    break;
                default:
                    System.out.println("Invalid choice! Select only the available colors.");
                    return;
            }

            // Display Samsung phone features
            System.out.println("Features of your selected Samsung phone:");
            System.out.println("Brand           : Samsung");
            System.out.println("Model           : " + model);
            System.out.println("Capacity        : " + variant);
            System.out.println("Color           : " + color);
            System.out.println("Price           : ₹" + price);
            System.out.println("Screen Size     : 6.7-inch");
            System.out.println("Battery         : 4,383mAh");
            System.out.println("OS              : Android 13");
            System.out.println("Camera          : 12MP camera");
            System.out.println("Charger Available: Yes");
            System.out.println("RAM             : 8 GB");

            System.out.println("Thank you! Visit again.");

        } else if (brand.equals("2") || brand.equals("apple")) {
            // Apple phone options
            System.out.println("Which model of iPhone do you want?");
            System.out.println("1. iPhone 15 Pro");
            System.out.println("2. iPhone 16");
            System.out.println("3. iPhone 16 Plus");
            String model = scanner.nextLine().toLowerCase();

            if (model.equals("1") || model.contains("iphone 15 pro")) {
                price = 120000;
                System.out.println("You have selected: iPhone 15 Pro");
            } else if (model.equals("2") || model.contains("iphone 16")) {
                price = 135000;
                System.out.println("You have selected: iPhone 16");
            } else if (model.equals("3") || model.contains("iphone 16 plus")) {
                price = 150000;
                System.out.println("You have selected: iPhone 16 Plus");
            } else {
                System.out.println("Invalid choice! Please select a valid iPhone model.");
                return;
            }

            System.out.println("Variants of iPhone:");
            System.out.println("1. 128 GB");
            System.out.println("2. 256 GB");
            System.out.println("3. 512 GB");
            String variant = scanner.nextLine().toLowerCase();

            switch (variant) {
                case "1":
                case "128 gb":
                    System.out.println("You have selected: 128 GB");
                    break;
                case "2":
                case "256 gb":
                    System.out.println("You have selected: 256 GB");
                    break;
                case "3":
                case "512 gb":
                    System.out.println("You have selected: 512 GB");
                    break;
                default:
                    System.out.println("Invalid choice! Select only the available options.");
                    return;
            }

            // Apple color options
            System.out.println("Color of iPhone:");
            System.out.println("1. Black");
            System.out.println("2. White");
            System.out.println("3. Red");
            String color = scanner.nextLine().toLowerCase();

            switch (color) {
                case "1":
                case "black":
                    System.out.println("You have selected: Black");
                    break;
                case "2":
                case "white":
                    System.out.println("You have selected: White");
                    break;
                case "3":
                case "red":
                    System.out.println("You have selected: Red");
                    break;
                default:
                    System.out.println("Invalid choice! Select only the available colors.");
                    return;
            }

            // Display iPhone features
            System.out.println("Features of your selected iPhone:");
            System.out.println("Brand           : Apple");
            System.out.println("Model           : " + model);
            System.out.println("Capacity        : " + variant);
            System.out.println("Color           : " + color);
            System.out.println("Price           : ₹" + price);
            System.out.println("Screen Size     : 6.7-inch");
            System.out.println("Battery         : 4,383mAh");
            System.out.println("OS              : iOS 17.5.1");
            System.out.println("Camera          : 12MP camera");
            System.out.println("Charger Available: Yes");
            System.out.println("RAM             : 8 GB");

            System.out.println("Thank you! Visit again.");
        } else {
            System.out.println("Invalid choice! Please choose between Samsung or Apple.");
        }
    }
}
