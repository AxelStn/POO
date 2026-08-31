public class Main {
    public static void main(String[] args) {
        int acumulador = 0;
        int[] num = new int[2];
        num[0] = 3;
        num[1] = 5;

        acumulador = num[0] + num[1];
        System.out.println("La suma es de: "+ acumulador);

        int[] num2 = new int[2];
        num2[0] = 3;
        num2[1] = 5;

        if (num2[0] == num2[1]) {
            System.out.println("Empate");
        }
        else if (num2[0] > num2[1]) {
            System.out.println("El mayor es " + num2[0]);
        }
        else { System.out.println("El mayor es " + num2[1]); }

        int mayorDiez = 0;
        int[] num3 = new int[2];
        num3[0] = 3;
        num3[1] = 11;

        for (int i = 0; i < num3.length; i++) {
            if (num3[i] > 10) { mayorDiez++;
            }
        } System.out.println("Cantidad de números mayor a 10 son: " + mayorDiez);
    }
}