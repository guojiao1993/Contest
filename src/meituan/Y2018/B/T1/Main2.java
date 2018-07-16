package meituan.Y2018.B.T1;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main2 {

    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        Map<String, String> map = new TreeMap<String, String>();
        map.put("C", "C");
        map.put("A", "A");
        map.put("B", "B");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
        }
    }
}
