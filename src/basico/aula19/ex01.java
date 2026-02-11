package cursojavabasico.aula19;

public class ex01 {
    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = new int[5];

        a[0] = 11;
        a[1] = 12;
        a[2] = 13;
        a[3] = 14;
        a[4] = 15;

        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
            System.out.printf("%d ", b[i]);
        }


    }
}
