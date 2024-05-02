import modelo.peliculas;

import java.util.Scanner;

public class Principal {
    public void muestraMenu(){
        int opcion = 0;
        Scanner teclado=new Scanner(System.in);
        while (opcion != 9){
            String menu= """
                    BIENVENID@S A SCREENMATCH
                    1) Registra nueva pelicula
                    2) Registra nueva serie
                    
                    9) Salir 
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("ingrese el nombre de la pelicula");
                    String nombre=teclado.nextLine();
                    System.out.println("Año de Lanzamiento");
                    int fechaDeLanzamiento=teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("ingrese la duración en minutos de la pelicula");
                    int duracion=teclado.nextInt();
                    teclado.nextLine();
                    peliculas peliculasUsuario = new peliculas();
                    peliculasUsuario.setNombre(nombre);
                    peliculasUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculasUsuario.setTiempoDeDuracionEnMinutos(duracion);
                    peliculasUsuario.muestraFichaTecnica();
                    break;

                case 9:
                    System.out.println("Opción Invalida");
                    break;

            }
        }
    }
}
