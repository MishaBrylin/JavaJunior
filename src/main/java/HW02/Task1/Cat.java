package HW02.Task1;

public class Cat extends Animal{

    private String color;


    public Cat(String name, int age, String color) {
        super(name, age);
        this.color=color;
    }

    public void makeSound(){
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Cat{" + "name= '" + name + '\'' +
                ", age= " + age +
                ", color= '" + color + '\'' +
                '}';
    }
}
