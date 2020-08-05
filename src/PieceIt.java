class Person {
    double weight = 56.7;
    String bodyType = "Average";
}

class Vehicle {
    String carType;
    int makeYear;
    double tyrePressure;
    int engineCapacity;
    int numberOfDoors;
}

public class PieceIt {
    public static void main(String[] args) {
        String name = "Isaac Ike";
        int age = 23;
        int dateOfBirth = 1997;
        String town = "Lusaka";
        String favouritePet = "Cat";
        String petName = "Light";

        System.out.println("My name is " + name + " I am " + age + " years old, born in " + dateOfBirth + " and..."
                + " My favourite type of pet is a " + favouritePet + " which goes by " + petName + " in " + town);
        Person weight = new Person();
        weight.weight = 56.5;
        Person body = new Person();
        body.bodyType = "Medium";

        // Vehicle class instantiation
        Vehicle car = new Vehicle();
        car.carType = "Hatch Back";
        Vehicle makeYear = new Vehicle();
        makeYear.makeYear = 2005;


        System.out.println("His name is " + name + " he drives a " + car.carType + " made in the year " + makeYear.makeYear);
        System.out.println("The weight of " + name + " is " + weight.weight + " KGs with a " + body.bodyType + " type");
    }
}
