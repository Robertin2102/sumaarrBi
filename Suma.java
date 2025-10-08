public class Suma {
    public static void main(String[] args) {
        int[][] arrExample = {
            {2, 5, 0, 1},
            {5, 1, 9, 5},
            {5, 0, 8, 3},
            {4, 0, 0, 4},
            {7, 5, 1, 2}
        };

        int suma = 0;
        for (int i = 0; i < arrExample.length; i++) {
            for (int z = 0; z < arrExample[i].length; z++) {
                suma += arrExample[i][z];
            }
        }

        System.out.println("La suma en general de todo es: " + suma);
    }
}
