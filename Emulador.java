import java.lang.System;

public class Emulador  {
    public static void main(String args[]){

    //verificamos los argumentos para saber si usar FIFO o RR
    String opcion = "";
    if (args.length == 1){
       opcion = args[0];
       
    } else if (args.length == 2){
       opcion = args[0] + " " + args[1];

    //en caso de que el usuario cometa un error
    } else {
        System.out.println( "Numero incorrecto de argumentos" );
        System.out.println( "Debe ejecutar una de las sig. formas:" );
        System.out.println( "java Emulador FIFO" );
        System.out.println( "java Emulador Round Robin" );
        System.exit(0);
    }

    //cargamos la interfaz
    Interfaz fr = new Interfaz(opcion);
    }

}
