# Busca filme
 Aplicação que dado um título de um filme em Inglês, busca os detalhes do mesmo acessando API externa
 
## Tecnologias
- Java 8
- Maven
- Spring Boot

## Rodando o projeto
- Build o projeto usando o seguinte comando: 
```
mvn clean install
```
- Rode a aplicação, o Spring proverá um servidor Embedded
```
java -jar ProjectApplicaton.class
```

## Roteiro de teste

- Acesse a seguinte URL
- Observação: Os títulos dos filmes devem ser em Inglês
```
http://localhost:8080/movie?title=Spider-man
A mesma retornára um JSON com os detalhes do filme Spider-Man
```

- Exemplo do JSON retornado

```
{
   "Title":"Spider-Man",
   "Year":"2002",
   "Runtime":"121 min",
   "Plot":"When bitten by a genetically modified spider, a nerdy, shy, and awkward high school student gains spider-like abilities that he eventually must use to fight evil as a superhero after tragedy befalls his family.",
   "Language":"English",
   "Country":"USA",
   "Awards":"Nominated for 2 Oscars. Another 16 wins & 61 nominations.",
   "Poster":"https://m.media-amazon.com/images/M/MV5BZDEyN2NhMjgtMjdhNi00MmNlLWE5YTgtZGE4MzNjMTRlMGEwXkEyXkFqcGdeQXVyNDUyOTg3Njg@._V1_SX300.jpg"
}
```
