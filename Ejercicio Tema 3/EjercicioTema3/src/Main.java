public class Main {
    public static void main(String[] args) {

        suma(5, 15, 7);

        coche micoche = new coche();
        micoche.sumarPuerta();
        System.out.println(micoche.puertas);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;

        System.out.println(resultado);
    }

    static class coche {
        public int puertas = 0;

        public void sumarPuerta () {
            this.puertas++;
        }
    }
}