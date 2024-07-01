package com.example.mymoviesdemo.service;

import com.example.mymoviesdemo.entity.Movie;
import com.example.mymoviesdemo.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @program: my-movies-demo
 * @description: service
 * @author: Salamanca
 * @create: 2024-06-22 13:50
 **/
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
