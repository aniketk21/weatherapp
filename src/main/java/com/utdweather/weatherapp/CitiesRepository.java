package com.utdweather.weatherapp;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesRepository extends MongoRepository<Cities, ObjectId> {
}
