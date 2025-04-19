package code;

import java.util.LinkedList;
import java.util.List;

public class LoopChange {

    public void LoopRelatedChagneDisplay() {
        int n = 5;
        int i = 0;

        while (i < n) {
            System.out.println("Hello");
            i++;
        }

    }

    public void convertForEachToFor() {
        int[] l = new int[] {1, 2, 3, 4, 5};
        for (int i = 0; i < l.length; i++) {
            System.out.println(l[i]);
        }
    }

    public void modifyLoopInitializer() {
        List<String> list = new LinkedList<>();
        for (var i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
