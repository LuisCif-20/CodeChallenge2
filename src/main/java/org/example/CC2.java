package org.example;

import java.util.ArrayList;
import java.util.List;

public class CC2 {

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
