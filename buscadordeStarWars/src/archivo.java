import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class archivo {
    public void gson(peliculas peliculas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter documento = new FileWriter(peliculas.title()+".json");
        documento.write(gson.toJson(peliculas));
        documento.close();
    }
}
