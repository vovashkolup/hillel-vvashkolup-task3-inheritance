public class Cat extends Animal{

public static int catCount=0;

    public Cat(String name, int age) {
        super(name, age);
        catCount++;
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
        System.out.println("Oops, cats hate to swim!\n");
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        if(distance<=200){
            System.out.println(getName()+" successfully ran "+distance+" metres\n");
        }else{
            System.out.println("Ooops! It's seems that the distance is too big for cats\n");
        }

    }


}
