package uniara.software.architecture.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uniara.software.architecture.project.service.MovieService;
import uniara.software.architecture.project.vo.MovieDTO;

@RestController()
@RequestMapping("/movie")
public class MovieController {

    // Injeção de dependência
    @Autowired
    MovieService movieService;

    @GetMapping
    public MovieDTO getMovieByTitle(String title){

        MovieDTO movie = movieService.getMovie(title);

        return movie;
    }
}
