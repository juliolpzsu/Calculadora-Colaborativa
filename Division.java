Java
public class Division {
    public static double calcular(double a, double b) {
        if (b == 0) {
            System.out.println("ERROR: No se puede dividir entre 0.");
            return 0;
        }
        return a / b;
    }
}