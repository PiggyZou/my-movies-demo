package com.example.mymoviesdemo.repository;

import com.example.mymoviesdemo.entity.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @program: my-movies-demo
 * @description: repository
 * @author: Salamanca
 * @create: 2024-06-22 13:49
 **/
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
