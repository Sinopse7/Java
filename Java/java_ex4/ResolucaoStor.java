public class ResolucaoStor {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5} };
        //int[][] myNumbers = { {1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}, };

        int elements = myNumbers[0].length;
        int el2 = (elements / 2);

        if (elements % 2 == 0){
            for (int i = 0; i < el2; i++) { 
                for (int j = 0; j < elements; j++) {
                    int num1 = myNumbers[i][j];
                    int num2 = myNumbers[elements - i - 1][elements - j - 1];
                    System.out.println(num1 + num2);
                }
                System.out.println("..");
            }
        } else {
            for (int i = 0; i < el2; i++) { 
                for (int j = 0; j < elements; j++) {
                    int num1 = myNumbers[i][j];
                    int num2 = myNumbers[elements - i - 1][elements - j - 1];
                    System.out.println(num1 + num2);
                }
                System.out.println("..");
            }
            for (int j = 0; j < (el2 + 1); j++) {
                int num1 = myNumbers[el2][j];
                int num2 = myNumbers[el2][elements - j - 1];
                System.out.println(num1 + num2);
            }
        } 
    }
}
