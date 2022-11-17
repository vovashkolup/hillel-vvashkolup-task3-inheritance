public class Dog extends Animal {

    public static int dogCount = 0;

    public Dog(String name, int age) {
        super(name, age);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        if(distance<=500){
            System.out.println(getName()+" successfully ran "+distance+" metres\n");
        }else{
            System.out.println("Ooops! It's seems that the distance is too big for dogs\n");
        }
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
        System.out.println(getName() + " is swimming!");

        if(distance<=10){
            System.out.println(getName()+" successfully swam "+distance+" metres\n");
        }else{
            System.out.println("Ooops! It's seems that the distance is too big for dogs\n");
        }
    }
}
