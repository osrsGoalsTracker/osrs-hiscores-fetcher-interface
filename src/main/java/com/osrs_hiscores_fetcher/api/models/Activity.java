package com.osrs_hiscores_fetcher.api.models;

import lombok.Value;
import lombok.With;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
public class Activity {
    int id;
    String name;
    int rank;
    int score;

    @JsonCreator
    public Activity(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("rank") int rank,
            @JsonProperty("score") int score) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.score = score;
    }
} 