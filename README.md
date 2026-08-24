# POO
TPO POO

BITACORA 24/08/26
CLASE 3

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


EJERCICIO 2.1



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



==

