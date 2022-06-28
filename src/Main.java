public class Main {
    public static void main(String[] args) {
        int param1 = 45;
        int param2 = 34;
        int param3 = 35;

        var valor  = suma(param1, param2,param3);
        System.out.println(valor);
    }
    public static int suma(int a, int b, int c) {
        return a+b+c;
    }

}


