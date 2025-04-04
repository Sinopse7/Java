public class Par {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 1, 1, 1}, {5, 5, 5, 5}, {3, 3, 3, 3}, {4, 4, 4, 4} };
        int elements = myNumbers[0].length; //quantidade de elementos
        int menos = 0;
        int aux = (elements / 2);
        for (int i = 0; i < aux; i++) { //somar um numero com o contrario (o primeiro (9) + o ultimo (1) = 10)
            menos += 1;
            for (int j = 0; j < elements; j++) {
                int num1 = myNumbers[i][j]; //o primeiro numero que iremos somar
                int num2 = myNumbers[elements - menos][elements - j - 1]; //o numero contrario que iremos somar
                System.out.println(num1 + num2); //a soma
            }
        }
    }
}
