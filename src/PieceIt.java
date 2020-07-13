class Person {
    double weight = 56.7;
    String bodyType = "Average";
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

        System.out.println("The weight of " + name + " is " + weight.weight + " KGs with a " + body.bodyType + " type");
    }
}
