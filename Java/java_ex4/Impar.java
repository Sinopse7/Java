public class Impar {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 1, 1, 1, 1}, {5, 5, 5, 5, 5}, {3, 3, 3, 3, 3}, {8, 8, 8, 8, 8}, {6, 6, 6, 6, 6} }; 
        int elementosexternos = myNumbers.length;
        int elementosinternos = myNumbers[0].length;
        int aux = (elementosexternos / 2); // 5 / 2 = 2.5
            //mas como aux é um int, vai ignorar o valor decimal e vai ser 2
        /*
        System.out.println("elementosexternos = " + elementosexternos);
        System.out.println("elementosinternos = " + elementosinternos);
        System.out.println("aux = " + aux);
        */

        for (int i = 0; i < aux; i++) {
            for (int j = 0; j < elementosinternos; j++) {
                int num1 = myNumbers[i][j]; // O primeiro número que iremos somar
                int num2 = myNumbers[elementosexternos - i - 1][elementosinternos - j - 1]; // O número contrário que iremos somar
                System.out.println(num1 + num2);
            }
        }

        for (int j = 0; j < (elementosinternos / 2) + 0.5; j++) { 
            /*  Vai dividir os elementos internos para somar apenas até metade.
                    No caso de ter uma quantidade impar de numeros internos:
                        vai somar 0.5 pois assim irá somar o número central com ele mesmo. 
                    Caso não tenha uma quantidade impar de numeros internos:
                        o valor decimal será ignorado */
            int num1 = myNumbers[aux][j]; // O primeiro número que iremos somar
            int num2 = myNumbers[aux][elementosinternos - j - 1]; // O número contrário que iremos somar
            System.out.println(num1 + num2);
        }
    }
}
