package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "İlkay Bakır",
                buildingNumber = "11B",
                streetName = "Inonu Cd",
                city = "Samsun",
                state = "Ontario",
                zipCode = "55200"; //same type of variables can be defined by using a comma
       // System.out.println(name + "\n" + buildingNumber +" " + streetName+"\n" + city+", "+state+" "+zipCode);
        String address = name + "\n" + buildingNumber +" " + streetName+"\n" + city+", "+state+" "+zipCode;
        System.out.println(address);

    }
}
