package com.example.movies;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "review")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review { 
    @Id
    private ObjectId id;
    private String body;
}
