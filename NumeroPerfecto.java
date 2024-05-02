public class NumeroPerfecto {
   
    public static int sumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
   
    public static boolean esNumeroPerfecto(int numero) {
        int suma = sumaDivisores(numero);
        switch (suma) {
            case 1:
                return false;
            default:
                return suma == numero;
        }
    }
   
    public static void main(String[] args) {
        int numero = 32; 
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }
}