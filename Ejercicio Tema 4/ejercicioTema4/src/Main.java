
public class Main {

    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = -13;
        int numeroDo = 10;
        var estacion = "Verano";


        if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.print("El numero es 0");
        }

        while (numeroWhile < 3) {
            numeroWhile += 1;
            System.out.println(numeroWhile);
        }

        do {
            System.out.println(numeroDo);
            numeroDo -= 1;
        } while (numeroDo >= 10);
            System.out.println(numeroDo);


        for (int numeroFor = 0; numeroFor <=3; numeroFor++ ) {
            System.out.println(numeroFor);
        }

        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Introduce correctamente la estaci\u00F3n en la que estemos: ");
        }
    }
}