package grcy.sda.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DemoReflection {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("grcy.sda.reflection.Student");

            Method[] givenClassMethods = studentClass.getMethods(); // metody z danej klasy (prywatne też)
            Method[] allHierarchyMethods = studentClass.getMethods(); // metody z hierarchii dziedziczenia (ale nieprywatne)

            Field[] givenClassFileds = studentClass.getDeclaredFields(); // analogicznie pola z danej klasy (prywatne też)
            Field[] allHierarchyFields = studentClass.getFields(); // wszystkie pola dostępne

            System.out.println("===!!! Declared methods !!!===");
            Arrays.stream(givenClassMethods)
                    .forEach(System.out::println);
            System.out.println("=================");
            System.out.println("=== !!! All hierarchy methods !!!===");
            Arrays.stream(allHierarchyMethods)
                    .forEach(System.out::println);
            System.out.println("===!!! Declared fields !!!===");
            Arrays.stream(givenClassFileds)
                    .forEach(System.out::println);
            System.out.println("================");
            System.out.println("===!!! All hierarchy fileds !!!===");
            Arrays.stream(allHierarchyFields)
                    .forEach(System.out::println);
            System.out.println("================");

            // robienie obiektu refleksyjnie
            Student student = (Student) studentClass.newInstance();
            /**
             *
             * setNameMethod i getNameMethod
             * to "uchwyty" do odpowiednio setName i getName
             * pozwalają na ich refleksyjne wywołanie
             *
             */
            Method setNameMethod = studentClass.getDeclaredMethod("setName", String.class);
            Method getNameMethod = studentClass.getDeclaredMethod("getName");

            //refleksyjne wywołanie metody set name
            System.out.println("sprawdzamy czy student ma na imie florian");
            setNameMethod.invoke(student,"florian"); //setter refleksyjny
            System.out.println(student.getName()); //getter zwykły

            System.out.println("Podmieniamy imie studenta na Mariola");
            student.setName("Mariola"); // setter zwykły
            System.out.println(getNameMethod.invoke(student)); // getter refleksyjny




        } catch (ClassNotFoundException e) {
            //taka obsługa wyjątków to rak!
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
