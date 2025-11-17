
package pertemuan6;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Object> hewan = new ArrayList<>();
        hewan.add("Harimau");
        hewan.add("Singa");
        hewan.add("Kucing");
        hewan.add(5);
        System.out.println(hewan);
        hewan.remove(1);
        System.out.println(hewan);
    }
}
