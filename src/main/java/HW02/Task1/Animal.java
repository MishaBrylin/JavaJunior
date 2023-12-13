package HW02.Task1;

abstract public class Animal {
    protected String name;
    protected int age;



    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
