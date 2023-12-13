package HW02.Task1;

public class Dog extends Animal {

    private String dogBreed;

    public Dog(String name, int age, String dogBreed) {
        super(name, age);
        this.dogBreed = dogBreed;
    }

    public void makeSound(){
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return "Dog{" + "name= '" + name + '\'' +
                ", age= " + age +
                ", dogBreed= '" + dogBreed + '\'' +
                '}';
    }
}
