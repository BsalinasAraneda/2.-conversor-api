package model;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public Monedas buscarMonedas(String monedaBase, String monedaTarget){

        //Utilizado la REQUEST de la api para convertir la moneda
        //https://v6.exchangerate-api.com/v6/796bd06ba750acfb0f0bf105/pair/CLP/USD

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/796bd06ba750acfb0f0bf105/pair/"+monedaBase+"/"+monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }
        catch (Exception e) {
            throw new RuntimeException("No se puede encontrar la divisa.");
        }
    }
}
