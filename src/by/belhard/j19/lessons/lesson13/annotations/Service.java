package by.belhard.j19.lessons.lesson13.annotations;

import by.belhard.j19.lessons.lesson13.annotations.model.Data;
import by.belhard.j19.lessons.lesson13.annotations.model.DataExtendable;
import by.belhard.j19.lessons.lesson13.annotations.model.DataSimple;
import by.belhard.j19.lessons.lesson13.annotations.model.Tatata;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private final List<Data> list = new ArrayList<>();

    {
        list.add(new DataExtendable("extendable", "extendableData"));
        list.add(new DataSimple("simple", "simpleData"));
        list.add(new DataExtendable("ext", "fwgoeighawpi9ug;wiurgha'woigh"));
        list.add(new Tatata("tata", "tatatatata"));
    }

    public void printInfo() {

        for (Data data : list) {

            Class<? extends Data> clazz = data.getClass();

            ExtendedInformation[] annotationsByType =
                    clazz.getAnnotationsByType(ExtendedInformation.class);

            if (annotationsByType.length != 0) {
                int count = annotationsByType[0].count();
                for (int i = 0; i < count; i++) {
                    System.out.println(data.getTitle() + " : " + data.getData());
                }
            } else {
                System.out.println(data.getTitle());

            }
        }
    }
}
