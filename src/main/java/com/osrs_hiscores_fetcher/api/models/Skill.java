package com.osrs_hiscores_fetcher.api.models;

import lombok.Value;
import lombok.With;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
public class Skill {
    int id;
    String name;
    int rank;
    int level;
    long xp;

    @JsonCreator
    public Skill(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("rank") int rank,
            @JsonProperty("level") int level,
            @JsonProperty("xp") long xp) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.level = level;
        this.xp = xp;
    }
} 