package com.utdweather.weatherapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cities {
    @Id
    private ObjectId id;
    private String name;
    private String region;
    private String country;
    private String tz_id;
}
