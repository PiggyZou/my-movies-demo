package com.example.mymoviesdemo.repository;

import com.example.mymoviesdemo.entity.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: my-movies-demo
 * @description: review
 * @author: Salamanca
 * @create: 2024-06-22 15:46
 **/
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
