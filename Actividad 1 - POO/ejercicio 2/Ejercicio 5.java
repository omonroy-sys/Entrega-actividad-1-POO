public class Main {
    public static void main(String[] args) {
        double suma, x, y;
        suma = 0;
        x = 20;
        suma += x;
        y = 40;
        x += Math.pow(y,2);
        suma += (x/y);
        System.out.println("el valor de la suma es: " + suma);
    }
}
