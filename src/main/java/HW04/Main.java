package HW04;

import HW04.models.Courses;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(HW04.models.Courses.class)
                .buildSessionFactory()){

            // Создание сессии
            Session session = sessionFactory.getCurrentSession();

            // Начало транзакции
            session.beginTransaction();

            // Создание объекта
            Courses courses = new Courses("Английский язык", 12);
            session.save(courses);
            System.out.println("Object courses save successfully");



            // Чтение объекта из базы данных
            Courses retrievedCourses = session.get(HW04.models.Courses.class, 1);
            System.out.println("Object courses retrieved successfully");
            System.out.println("Retrieved courses object: " + retrievedCourses);

//            // Обновление объекта
            retrievedCourses.setDuration(10);
            session.update(retrievedCourses);
            System.out.println("Object courses update successfully");


            session.delete(retrievedCourses);
            System.out.println("Object courses delete successfully");


            session.getTransaction().commit();

        }
        catch (Exception e){
            e.printStackTrace();
        }




    }
}
