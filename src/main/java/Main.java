public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Meow", 5);
        Animal cat2= new Cat("Garfield",7);
        Animal dog = new Dog("Bark", 6);
        Animal dog2= new Dog("Teddy",14);
        Animal dog3 =new Dog("Marquise",9);

        cat.run(50);
        cat2.swim(50);

        dog.run(1000);
        dog2.swim(5);

        System.out.println("\nThere are:\n"
                + Cat.catCount + " cats\n"
                + Dog.dogCount + " dogs\nIn total "
                + Animal.animalCount + " animals");
    }
}
