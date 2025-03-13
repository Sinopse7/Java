public class Main {
    public static void main(String[] args) {
        int soma = 0;
        int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
            soma += numero[i];
        }
        
        System.out.println("Soma: " + soma);
    }
}