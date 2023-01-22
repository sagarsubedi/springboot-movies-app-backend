package com.sagar.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private IMovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
}
