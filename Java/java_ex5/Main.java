public class Main {

    /*** 
     * método que diz que o carro vai a todo
     *  o gas
    */
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    /*** 
     * método que mostra uma msg com a vel max
     * recebe os seguintes parametros:
     * maxSpeed : inteiro;
    */
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Main myCar = new Main();    // Create a myCar object
        myCar.fullThrottle();       // Call the fullThrottle() method
        myCar.speed(200);  // Call the speed() method
    }
}