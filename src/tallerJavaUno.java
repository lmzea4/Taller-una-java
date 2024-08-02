import java.util.Scanner;

public class tallerJavaUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la nota de uno a diez");
        int nota = scanner.nextInt();
        switch (nota){
            case 1:
            case 2:
                System.out.println("Su calificaciòn es F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificaciòn es D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificaciòn es C");
                break;
            case 7:
            case 8:
                System.out.println("su calificaciòn es B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificaciòn es A");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");
        }
    }
}

