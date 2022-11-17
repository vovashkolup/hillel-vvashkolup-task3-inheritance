public class Animal {
    private String Name;
    private int age;
    public static int animalCount=0;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.Name = name;
        this.age = age;
        animalCount++;
    }

    public void run (int distance){
        System.out.println(Name + " preparing to run");
    }

    public void swim (int distance){
        System.out.println(Name + " is trying to get into water");
    }

}
