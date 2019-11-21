import java.util.Scanner;

public class AnimalOOP {

//    OPTION 1 - Instantiate objects


    public static void main(String[] args) {

        Animal lion1 = new Animal("Lion", "Bob", 2000, 'M', 5);
        Animal tiger  = new Animal("Tiger", "Jim", 2009, 'M', 10);
        Animal lion2 = new Animal("Lion", "Dee", 1989, 'F', 15);

        System.out.println(lion1.getName());
        System.out.println(tiger.getGender());
        System.out.println(lion2.getSpecies());


    }

//    OPTION 2 - Instantiate using arrays

//    public static void main(String[] args) {
//
//        Animal[] animal = new Animal[3];
//        animal[0] = new Animal("Lion", "Bob", 2000, 'M', 5);
//        animal[1] = new Animal("Tiger", "Jim", 2009, 'M', 10);
//        animal[2] = new Animal("Lion", "Dee", 1989, 'F', 15);
//
//        for (int i = 0; i < animal.length; i++) {
//            if (animal[i].getName().equalsIgnoreCase("Jim")) {
//                System.out.println(animal[i].getYearOfBirth());
//            }
//        }
//
//    }


}
