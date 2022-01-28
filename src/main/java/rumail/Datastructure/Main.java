package rumail.Datastructure;

import java.util.*;

public class Main {
    public static int sumElementsOfArrays(List<Integer> arrays) {
       if(arrays.isEmpty()==true) return 0;
       else {
           return arrays.get(0)+sumElementsOfArrays(arrays.subList(1,arrays.size()));
       }
    }
    public static void main(String[] args) {
        List<Integer> arrays = new ArrayList<>();
        arrays.add(5);
        arrays.add(8);
        arrays.add(12);
        arrays.add(22);
        System.out.println(sumElementsOfArrays(arrays));
    }
}
//    Set<String> strings = new LinkedHashSet<>();
//       strings.add("5345");
//               strings.add("1");
//               strings.add("43");
//
//               for (String string : strings) {
//               System.out.println(string);
//               }

//       Person p1 = new Person("Alex",10);
//       Person p2 = new SuperPerson("Alex",10,"Ivankov");
//        System.out.println(p1.equals(p2));
//        System.out.println(p2.equals(p1));

//    Map<Person, String> map = new TreeMap<>(new Comparator<Person>() {
//        @Override
//        public int compare(Person person, Person t1) {
//            return t1.getName().compareTo(person.getName());
//        }
//    });
//         map.put(new Person("alex", 20),"alex");
//                 map.put(new Person("Alex", 12),"Alex");
//                 map.put(new Person("Bob", 20),"Aob");
//
//                 for (Person person : map.keySet()) {
//                 System.out.println(person);
//                 }
//        Map<Person, String> map = new HashMap<>();
//        map.put(new Person("Alex",12),"alex");
//        String s=map.get(new Person("alex",12));
//        System.out.println(s);