public class Test {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += "abc";
        }
        System.out.println(s);
    }
}
