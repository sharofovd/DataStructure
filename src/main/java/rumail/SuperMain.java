package rumail;

public class SuperMain {
    public static void main(String[] args) {
     int x=10;
     run(x);
        System.out.println(x);
    }

    private static void run(int x) {
        ++x;
    }
}
//    Operation operation = new MultiplyOperation();
//    doCalculate(operation);
//    private static void doCalculate(Operation operation) {
//        int result = operation.operate(10,12);
//        System.out.println(result);
//    }