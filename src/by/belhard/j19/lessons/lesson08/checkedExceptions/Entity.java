package by.belhard.j19.lessons.lesson08.checkedExceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Entity {

    public Entity getNewinstance() throws
            ClassNotFoundException,
//            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        Class<?> aClass =
                Class.forName("by.belhard.j19.lessons.lesson08.checkedExceptions.Entity");

        Constructor<?> constructor;

        try {
            constructor = aClass.getConstructor(String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            try {
                constructor = aClass.getConstructor();
            } catch (NoSuchMethodException ex) {
                ex.printStackTrace();
                return null;
            }
        }

        return (Entity) constructor.newInstance();
    }


    public int getTemp() {
        return (int) (Math.random() * 25);
    }
}
