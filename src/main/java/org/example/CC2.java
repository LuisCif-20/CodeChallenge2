package org.example;

import java.util.ArrayList;
import java.util.List;

public class CC2 {

    /*
    Mi algoritmo es O(n2) ya que hay bucles anidados, esto en el peor de los casos eleva la complejidad
    dependiendo de la profundidad de los arreglos anidados 
    */
    public List<Object> transformToArray(Object[] arrayInput) {
        List<Object> result = new ArrayList<>();
        for (Object object : arrayInput) {
            if (object instanceof Object[]) {
                for (Object object2 : transformToArray((Object[])object)) {
                    result.add(object2);
                }
            } else {
                result.add(object);
            }
        }
        return result;
    }

}
