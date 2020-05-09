package uniara.software.architecture.project.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// Aqui especificamos para o Jackson (Serializador e Descerializador)
// que existem atributos no JSON
// Que serão ignorados
@JsonIgnoreProperties(ignoreUnknown=true)
public class MovieDTO {

    // Mapeando os atributos do JSON recebido para os atributos membros dessa classe
    @JsonProperty("Title")
    String title;

    @JsonProperty("Year")
    String year;

    @JsonProperty("Runtime")
    String runTime;

    @JsonProperty("Plot")
    String plot;

    @JsonProperty("Language")
    String language;

    @JsonProperty("Country")
    String country;

    @JsonProperty("Awards")
    String awards;

    @JsonProperty("Poster")
    String  poster;
}
