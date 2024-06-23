import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
    consultapelicula consulta = new consultapelicula();
        System.out.println("Por favor, escriba el número de la pelicula de Star Wars: ");
    try {
        var numerodepeliculadeStarWars = Integer.valueOf(usuario.nextLine());
        peliculas pelicula = consulta.buscarstarwars(numerodepeliculadeStarWars);
        System.out.println(pelicula);
        archivo generador = new archivo();
        generador.gson(pelicula);
    }
    catch (NumberFormatException | IOException e){
        System.out.println("Número de pelicula no encontrado"+e.getMessage());
    }
    catch (RuntimeException e){
        System.out.println(e.getMessage());
        System.out.println("El programa ha finalizado, buen día!");
    }

    }
}
