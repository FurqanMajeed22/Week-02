package assitedproblems.animalhierarchy;

public class AnimalHierarchy {
    public static void main(String[] args) {
        //making object of animal
        Animal animal=new Animal("Lion",20);
        //making object of Bird using animal reference
        Animal A=new Bird("Crow",12);
        Animal B=new Dog("PitBull",12);
        Animal C=new Cat("Persian",12);

        animal.makeSound();
        A.makeSound();
        B.makeSound();
        C.makeSound();

    }

}
