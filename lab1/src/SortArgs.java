/**
 * by: danel382 at: 2012-09-03 : 15:32
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// sort argv alphabetically
public class SortArgs {
    public static void main(String[] args) {
        List list = new ArrayList();

        // not list.addAll(Collection args)
        for (String s : args) {
            list.add(s);
        }

        // C-Space smart-type completion
        Collections.sort(list);

        // narrowing
        for (Object o : list) {
            System.out.println((String) o);
        }
    }
}
