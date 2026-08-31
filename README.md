# POO
PARADIGMA ORIENTADA A OBJETOS
==== Alumnos ====
Axel Olivares: Soy estudiante en la tecnicatura en desarrollo de software en UADE. Mi objetivo es terminar la carrera adqueriendo la mayor cantidad de conococimientos posibles. Y así como meta, lograr seguir estudiante en la carrera de la Licenciatura en gestión de Teconología de la información.

Angiello Cancino: Soy estudiante de la licenciatura en gestión de la tecnología de la información en Uade, un objetivo que tengo es poder terminar la carrera y en el transcurso poder conseguir mi primer trabajo, me gusta jugar al fútbol y al básquet, además toco el piano en mis tiempos libre.

BITACORA 24/08/26 - CLASE 3 / GUÍA DE EJERCITACIÓN

Bloque 1 - La Java Virtual Machine — JDK, JRE, JVM, bytecodeyClasspath
EJERCICIO 1.1
1) b) El JDK, porque incluye a Javac y demás herramientas.
2) b) .class
3) b) La JVM (Java Virtual Machine).
4) b) El mismo bytecode lo ejecuta la JVM de cada plataforma.
5) b) Una variable de entorno del SO que indica dónde buscar clases y librerías.


EJERCICIO 1.2
V - La JVM es parte del JRE. 
V - El JDK incluye al JRE.
F - En Java se compila un binario distinto para cada sistema operativo. 
V - El compilador de Java se llama javac. 
F - El bytecode se ejecuta directamente sobre el hardware, sin intermediarios. 
V - El Garbage Collector se encarga de liberar la memoria que ya no se usa.


EJERCICIO 1.3
JDK  Kit de desarrollo: compilador, generador de documentación y herramientas.
JRE  Entorno de ejecución: lo mínimo para correr un programa Java ya compilado.
JVM  Máquina virtual que ejecuta el bytecode sobre cada plataforma.
javac  Programa que compila el código fuente a bytecode.
.class  Archivo que contiene el bytecode generado.
Classpath  Variable de entorno donde se buscan las clases y librerías.

EJERCICIO 1.4
1) Archivo fuente (.java): El código escrito por el programador.
2) Compilador (javac): Traduce el código fuente a un formato intermedio.
3) Bytecode (.class): El archivo binario intermedio generado.
4) JVM (ClassLoader, JIT, ejecución): Carga, interpreta/compila en tiempo de ejecución el bytecode.
5) Sistema Operativo: Recibe las instrucciones nativas y gestiona los recursos y procesos del sistema.
6) Hardware: Ejecuta físicamente las instrucciones de máquina en el procesador.


EJERCICIO 1.5
1) Java (“Write Once, Run Anywhere”)
Compilación intermedia: Se compila a un código universal e independiente llamado bytecode (.class).
C (“Write Once, Recompile Anywhere”)
Compilación directa: Se compila directamente a código de máquina nativo.

2) Si el CLASSPATH no está bien configurado, el compilador (javac) y la máquina virtual (JVM) no sabrán dónde buscar los archivos compilados (.class) ni las bibliotecas externas (.jar). 

-------------------------------------------------------------------------------------------------

Bloque 2 - Estructura de un programa y convenciones denomenclatura
Ejercicio 2.1
•	int edad;
•	double precio;
•	boolean estaActivo;
•	String nombreUsuario;
•	void calcularPromedio() {..}
Ejercicio 2.2
•	Clase: cuenta_bancaria  CuentaBancaria
•	Variable: saldoTotal  saldoTotal
•	Metodos: Calcular_Interes  calcularInteres
•	Clase: factura  Factura
•	Variable: Nombre_Cliente  nombreCliente
Ejercicio 2.3
Int public = 10;
•	No compila ya que public es una palabra reservada, por lo que no puede ser el nombre de una variable
Int contador = 0; 
•	Compila
Double for = 3.14;
•	For es una palabra reservada utilizada para los ciclos, no puede ser el nombre de una variable
String nombre = “Ana”;
•	Compila
Boolean int = true;
•	No compila ya que int es una palabra revervada que representa un tipo de dato
Ejercicio 2.4
Public class Hola {
	Public static void(String[] args) {
		System.out.println(“Hola Mundo”);
	)
}

Ejercicio 2.5
/*
 * Clase que representa un círculo
 * y permite calcular su área.
 */
public class Circulo {

    double radio = 5;

    // Calcula el área del círculo: π × radio × radio
    double area = 3.14 * radio * radio;
}

------------------------------------------------------------------------------------------

Bloque 3 - Arreglos — el arreglo como objeto, posiciones, accesoy recorrido
EJERCICIO 3.1
int[] num = new int[8];
String[] nombres = new String[5];
boolean[] precios = new boolean[3];

EJERCICIO 3.2
A) Imprime 0, 10, 0, 25
B) Imprime Ana, null, null

EJERCICIO 3.3
Linea 1: a[5] no existe porque el arreglo tiene una longitud maxima de 4.
Linea 2: No va el paréntesis en el momento de utilizar lenght
Linea 3: autos[0] no está definido (Null)

EJERCICIO 3.4
1- 
int acumulador = 0;
        int[] num = new int[2];
        num[0] = 3;
        num[1] = 5;
        for (int i = 0; i < num.length; i++) {
            acumulador = ++num[i];
        }
        System.out.println(acumulador); 

2-
int[] num = new int[2];
        num[0] = 3;
        num[1] = 5;
        if (num[0] == num[1]) {
            System.out.println("Empate");
        }
        else if (num[0] > num[1]) {
            System.out.println("El mayor es " + num[0]);
        }
        else {
            System.out.println("El mayor es " + num[1]);
        }

3-
int mayorDiez = 0;
        int[] num = new int[2];
        num[0] = 3;
        num[1] = 5;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 10) {
                mayorDiez++;
            }
        }
        System.out.println("Cantidad de números mayor a 10 son: " + mayorDiez);


EJERCICIO 3.5 
1)
Valor por defecto de cada posición recién creado el arreglo:
int[] → 0
double[] → 0.0
boolean[] → false
String[] → null
2)
En un arreglo de objetos, cada posición guarda una referencia al objeto, no el objeto directamente.

Ejemplo:
Auto[] autos = new Auto[3];

Inicialmente:
[null, null, null]

Si hacemos:
autos[0] = new Auto();

La posición 0 pasa a contener una referencia al objeto Auto.

------------------------------------------------------------------------------------

Bloque 4 - Registro de temperaturas
/*
 * Clase que permite registrar las temperaturas de una semana
 * y realizar diferentes cálculos sobre ellas.
 */
public class RegistroTemperaturas {

    // Arreglo con las temperaturas de los 7 días.
    double[] temperaturas = {25.5, 28.0, 31.5, 30.0, 27.5, 33.0, 29.0};

    // Calcula el promedio de las temperaturas.
    double calcularPromedio() {
        double sumaTemperaturas = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            sumaTemperaturas = sumaTemperaturas + temperaturas[i];
        }

        return sumaTemperaturas / temperaturas.length;
    }

    // Busca la temperatura máxima.
    double encontrarMaxima() {
        double temperaturaMaxima = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturaMaxima) {
                temperaturaMaxima = temperaturas[i];
            }
        }

        return temperaturaMaxima;
    }

    // Busca la temperatura mínima.
    double encontrarMinima() {
        double temperaturaMinima = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < temperaturaMinima) {
                temperaturaMinima = temperaturas[i];
            }
        }

        return temperaturaMinima;
    }

    // Cuenta los días que superan el umbral.
    int contarDiasSobreUmbral(double umbral) {
        int cantidadDias = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > umbral) {
                cantidadDias++;
            }
        }

        return cantidadDias;
    }

    // Muestra cada día con su temperatura.
    void mostrarTemperaturas() {
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + " grados");
        }
    }

    public static void main(String[] args) {

        RegistroTemperaturas registro = new RegistroTemperaturas();

        registro.mostrarTemperaturas();

        System.out.println("Promedio: " + registro.calcularPromedio());
        System.out.println("Máxima: " + registro.encontrarMaxima());
        System.out.println("Mínima: " + registro.encontrarMinima());
        System.out.println("Días sobre 30 grados: "
                + registro.contarDiasSobreUmbral(30.0));
    }
}

==

