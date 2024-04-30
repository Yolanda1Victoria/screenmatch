import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenidos");
       // System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoPlanBasico = true;
        String nombre = "MATRIX";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                Este es el sinopsis de la pelicula
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula " + nombre);
        System.out.println("Fecha de lanzamiento " + fechaDeLanzamiento);
        System.out.println("Evaluacion " + evaluacion);
        System.out.println("¿Esta incluido en el plan basico? " + incluidoPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) /3;
        System.out.println("La evaluación media es: "+ mediaEvaluacion);

        if(fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la pelicula" +
                "Matrix calaculada por el usuario es: " + mediaEvaluacionUsuario/3);
        
    }
}