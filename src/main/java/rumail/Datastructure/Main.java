package rumail.Datastructure;

import java.util.*;

public class Main {

    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);

    }
}/*
----------------H. K ga bo'linadigan sonlar Sizga k soni beriladi. Sizning vazifangiz [a,b] oraliqdagi k ga bo’linadigan sonlar sonini topish .
public static long InitialDivisible(long a, long b, long k) {
       long v=0;
       if (a==0) return k;
       for (long i=a; i<=b; i++)
       {
           if(i%k==0) {v=i; break;}
       }
       return v;
   }
    public static long LastDivisible(long a, long b, long k) {
        long v=0;
        if (b==0) return k;
        for (long i=b; i>=a; i--)
        {
            if(i%k==0) {v=i; break;}
        }
        return v;
    }

    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
      long k = in.nextLong();
      long a = in.nextLong();
      long b = in.nextLong();
      System.out.println((LastDivisible(a,b,k) - InitialDivisible(a,b,k))/k+1);
    }
----------------2.G. Split and sort(Butun sonlar bir-biridan ‘:’ orqali ajratilib berilgan. Sizning vazifangiz barcha qatnashgan sonlarni qiymatlari kamaymaslik tartibida saralab chiqarishdan iborat.)
Scanner in =new Scanner(System.in);
      String str = in.nextLine();
      int counter = 0;
      String t="";
        for (int i = 0; i < str.length(); i++) {
            char temp =str.charAt(i) ;
            if(temp==':') counter++;
        }
        int [] arr = new int[counter+1];
        int k=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=':') {t+=str.charAt(i);}
            else {
             arr[k] = Integer.valueOf(t);   k++;
             t="";
            }
        }
        if (k==counter) arr[k] = Integer.valueOf(t);

        int sortvaribale = arr[0];
        for (int i = 0; i < counter+1; i++) {
            for (int j = i+1; j < counter+1; j++) {
                if(arr[i]>arr[j]) {
                    sortvaribale = arr[i];
                    arr[i] = arr[j];
                    arr[j] = sortvaribale;
                }

            }
        }
        for (int i = 0; i < k+1; i++) {
            System.out.print(arr[i]+" ");
        }
*/
//--------------1.Getting a sum from ArrayList<Integer> using recursion(Recursion)
//    public static int sumElementsOfArrays(List<Integer> arrays) {
//        if(arrays.isEmpty()==true) return 0;
//        else {
//            return arrays.get(0)+sumElementsOfArrays(arrays.subList(1,arrays.size()));
//        }
//    }
//    public static void main(String[] args) {
//        List<Integer> arrays = new ArrayList<>();
//        arrays.add(5);
//        arrays.add(8);
//        arrays.add(12);
//        arrays.add(22);
//        System.out.println(sumElementsOfArrays(arrays));
//    }
//---------End

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