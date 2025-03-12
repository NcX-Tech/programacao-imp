package ExemploApi;

public class ExemploApi {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 1) {
            int aleatorio = (int) Math.floor(Math.random() * 6) + 1;
            System.out.println(aleatorio);
        }
    }
}

