package VETORES;
public class nona {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        int count = 0, num = 1;
        while(count < 100) {
            if(num % 7 != 0 && num % 10 != 7) {
                vetor[count] = num;
                count++;
            }
            num++;
        }
        for(int n : vetor) System.out.print(n + " ");
    }
}