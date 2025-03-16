public class Par {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 1, 1, 1}, {5, 5, 5, 5}, {3, 3, 3, 3}, {4, 4, 4, 4} }; 
        int elementosexternos = myNumbers.length;
        int elementosinternos = myNumbers[0].length;
        int aux = (elementosexternos / 2);
        /*
        System.out.println("elementosexternos = " + elementosexternos);
        System.out.println("elementosinternos = " + elementosinternos);
        System.out.println("aux = " + aux);
        */

        for (int i = 0; i < aux; i++) { // Somar o primeiro com o último
            for (int j = 0; j < elementosinternos; j++) {
                int num1 = myNumbers[i][j]; // O primeiro número que iremos somar
                int num2 = myNumbers[elementosexternos - i - 1][elementosinternos - j - 1]; // O número contrário que iremos somar
                System.out.println(num1 + num2); //a soma
            }
        }
    }
}
