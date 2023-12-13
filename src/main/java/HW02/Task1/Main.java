package HW02.Task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Жучка", 3, "Овчарка"));
        animals.add(new Dog("Мухтар", 2, "Дворняжка"));
        animals.add(new Cat("Барсик", 5, "Рыжий"));
        Class<?> personalClass = Class.forName("HW02.Task1.Animal");
        Method displayInfoMethod = personalClass.getDeclaredMethod("toString");
        Method displayInfoMethod2 = personalClass.getDeclaredMethod("makeSound");

        animals.forEach((Animal animal) -> {
            try {
                System.out.println(displayInfoMethod.invoke(animal));
                displayInfoMethod2.invoke(animal);

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        });


    }
}
