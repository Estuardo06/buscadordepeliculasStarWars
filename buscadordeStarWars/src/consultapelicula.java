import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultapelicula {
    public peliculas buscarstarwars (int numerodepeli){
        URI direcciondepagina = URI.create("https://swapi.dev/api/films/"+numerodepeli);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direcciondepagina)
                .build();


        try {
            HttpResponse<String>  response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
                    return new Gson().fromJson(response.body(),peliculas.class);
        } catch (Exception e ) {
            throw new RuntimeException("El número de la pelicula que ingresate" +
                    "no fue encontrado, por favor, ingresa otro número");
        }



    }
}
