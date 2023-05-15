public class Main {
    public static void main(String[] args) {
        Queue myQ = new Queue();
        myQ.put("elijah");
        myQ.put("lopez");
        myQ.put("hernandez");
        for (int i = 0; i < 100; i = i + 1) {
            myQ.put(i);

        }
        Object obj1 = myQ.get();
        System.out.println(obj1);

        for (int i = 0; i < 100; i = i + 1) {
            Object obj2 = myQ.get();
            System.out.println(obj1);
        }
    }
}