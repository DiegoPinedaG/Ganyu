package ICO_POO_2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner cadena = new Scanner(System.in);
        System.out.print("Escriba su nombre, su profesión y su país de origen en ese orden, solo separados por una coma (sin espasio despúes de la coma) y sin asentos: ");
        String datos = cadena.nextLine();
        String[] arreglodatos = datos.toUpperCase().trim().split(",");
        System.out.println("Tus datos son:");
        System.out.println("Nombre: " +arreglodatos[0]);
        System.out.println("Profesión: "+arreglodatos[1]);
        System.out.println("País de origen: "+arreglodatos[2]);
    }
}