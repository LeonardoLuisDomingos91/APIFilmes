package uniara.software.architecture.project.rest;

import org.springframework.web.client.RestTemplate;

// A classe em questão fas uso do padrão Singleton
// Tal padrão é utilizado quando deve-se existir apenas uma instância da classe
// Como essa é uma classe que guarda os valores de chamada da API externa, não faz sentido ter mais
// de uma instância

//O final é para que a classe não sejá herdável
public final class RestTemplateSingleton {
    private static RestTemplate instance;

    private RestTemplateSingleton(){

    }

    // Método que retorna a instância do objeto
    public static RestTemplate getInstance(){
        if(instance == null){
            instance = new RestTemplate();
        }

        return instance;
    }
}
