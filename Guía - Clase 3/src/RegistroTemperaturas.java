public class RegistroTemperaturas {
    public static void main(String[] args) {

        ClaseRegistro registro = new ClaseRegistro();

        registro.mostrarTemperaturas();

        System.out.println("Promedio: " + registro.calcularPromedio());
        System.out.println("Máxima: " + registro.encontrarMaxima());
        System.out.println("Mínima: " + registro.encontrarMinima());
        System.out.println("Días sobre 30 grados: "
                + registro.contarDiasSobreUmbral(30.0));
    }
}

class ClaseRegistro {

    double[] temperaturas = {25.5, 28.0, 31.5, 30.0, 27.5, 33.0, 29.0};

    double calcularPromedio() {
        double sumaTemperaturas = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            sumaTemperaturas = sumaTemperaturas + temperaturas[i];
        }

        return sumaTemperaturas / temperaturas.length;
    }

    double encontrarMaxima() {
        double temperaturaMaxima = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturaMaxima) {
                temperaturaMaxima = temperaturas[i];
            }
        }

        return temperaturaMaxima;
    }

    double encontrarMinima() {
        double temperaturaMinima = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < temperaturaMinima) {
                temperaturaMinima = temperaturas[i];
            }
        }

        return temperaturaMinima;
    }

    int contarDiasSobreUmbral(double umbral) {
        int cantidadDias = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > umbral) {
                cantidadDias++;
            }
        }

        return cantidadDias;
    }

    void mostrarTemperaturas() {
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + " grados");
        }
    }
}