package uniara.software.architecture.project.service;

import org.springframework.stereotype.Service;
import uniara.software.architecture.project.rest.APICaller;
import uniara.software.architecture.project.vo.MovieDTO;

@Service
public class MovieService {

    public MovieDTO getMovie(String title){
        return APICaller.callExternalAPI(title);
    }
}
