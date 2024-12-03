//package Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List, ArrayList
//        List<String> namelist = new ArrayList<>();
//        namelist.add("Duoc");
//        namelist.add("Quang");
//        namelist.add("Huy");
//        namelist.add("Duoc");
//        System.out.println("Array: "+ namelist);
////        System.out.println("Array 1: "+ namelist.get(1));
//
//        //Set -> HasSet, LinkedHashSet, Treeset
//        Set<String> namelisthashset = new HashSet<>();
//        namelisthashset.add("Duoc");
//        namelisthashset.add("Quang");
//        namelisthashset.add("Huy");
//        namelisthashset.add("Duoc");
//        System.out.println("HashSet: "+ namelisthashset);
//
//        Set<String> namelistlinked= new LinkedHashSet<>();
//        namelistlinked.add("Duoc");
//        namelistlinked.add("Quang");
//        namelistlinked.add("Huy");
//        System.out.println("LinkHashSet: "+ namelistlinked);
//
//        Set<String> namelisttree= new TreeSet<>();
//        namelisttree.add("Duoc");
//        namelisttree.add("Quang");
//        namelisttree.add("Huy");
//        System.out.println("TreeSet: "+ namelisttree);


        //Map -> HashMap, LinkedHashMap, TreeMap
        // Key - Value
        Map<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("A",1);
        hashmap.put("C",2);
        hashmap.put("B",3);
        System.out.println("Hashmap: "+ hashmap);

        Map<String, Integer> linkhashmap = new LinkedHashMap<>();
        linkhashmap.put("A",1);
        linkhashmap.put("C",2);
        linkhashmap.put("B",3);
        System.out.println("LinkHashmap: "+ linkhashmap);

        Map<String, Integer> treemap = new TreeMap<>();
        treemap.put("C",1);
        treemap.put("A",3);
        treemap.put("B",2);

        

        System.out.println("Treemap: "+ treemap);

    }
}