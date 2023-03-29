package com.example.geolocation.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("cities")
public class City {

    @Id
    private Long _id;
    private Double lat;
    private Double lon;
    private String nameRu;
    private String nameEn;
    private String region;
    private String officialStatus;
}
