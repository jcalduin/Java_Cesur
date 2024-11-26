public class _02_TiposDeDatos {
    public static void main(String[] args) {


        // Datos primitivos

        // números enteros

        byte temperatura = 25; //Entero de 8 bits abarca números desde -128 a 127 (meter un número fuera de rango en la variable byte indica error)
        short poblacion = -15000; // Entero de 16 bits abarca nº desde -32768 a 32767
        long distancia =  987165165L; // Entero de 64 bits abarca desde -2^63 a 2^63 . Se usa "L" para numeros largos para que java los diferencia de un dato int
        int edad = 29; // Entero de 32 bits abarca desde -2^31 a 2^31.

        // como normal se usa int en java por defecto. En casos particulares se usaran los otros dependiendo de la necesidad


        // números reales

        double altura = 1.71; // Decimal de 64bits (aprox hasta 15 digitos decimales)
        float peso = 65.5f; // Decimal de 32bits (aprox hasta 7 decimales). Se usa "f" para diferenciarlo de double

        // como normal se usa double. En casos particulares para ahorrar memoria usaremos float


        // caracteres

        char sexo = 'M'; // almacena caracteres simples que se declaran con comillas simples.
        char saltoLinea = '\n';
        char espacio = ' ';


        // lógicos (datos que son verdero o falso)

        boolean soyEstudiante = true;
        boolean soyProfesor = false;



        //Datos complejos (se definen por clase, de momento solo conocemos String)

        // cadenas de texto

        String soyUnTexto = "Texto de ejemplo";

    }
}