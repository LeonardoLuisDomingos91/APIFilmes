package uniara.software.architecture.project.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import uniara.software.architecture.project.vo.MovieDTO;

//Classe que encapsula a complexidade de chamada de uma API externa
@Component
public final class APICaller {

    // Construtor privado
    // a fim de não deixar com que outras partes do codigo instancie essa classe
    private APICaller(){};

    private static String uri;

    // Chave de autenticacao na API Externa
    private static String key;


    public static MovieDTO callExternalAPI(String title){

        // Como o RestTemplate será usado somente nesse método, não faz sentido criar várias instâncias do mesmo
        // Visto isso, pede-se a instância criada a classe Singleton
        // Com isso inverte-se a responsabilidade de obtenção e criação do objeto RestTemplate
        // Esse conceioto é chamado de inversão de controle
       RestTemplate restTemplate = RestTemplateSingleton.getInstance();

       //Monta-se a URI com os parametros informados (Pode ser titulo ou ID)
        uri = getUri(title);

        // Faz a chamada HTTP e descerializa o retorno usando Reflection
        return restTemplate.getForObject(uri, MovieDTO.class);

    }

    // Utilizando a injeção de valores do Spring
    // Basicamente mapeia-se esses valores no arquivo application.properties
    // No momento da construção do objeto pelo container do Spring, visto que o mesmo
    // usa conceito de IoC,o Spring lê o arquivo e injeta no Bean
    @Value("${api.url}")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @Value("${api.key}")
    public void setKey(String key) {
        this.key = key;
    }

    private static String getUri(String title) {
        return uri + "?apikey=" + key + "&t=" + title;
    }

}
