package com.osrs_hiscores_fetcher.api.models;

import lombok.Value;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

@Value
public class OsrsPlayer {
    String rsn;
    List<Skill> skills;
    List<Activity> activities;

    @JsonCreator
    public OsrsPlayer(
            @JsonProperty("rsn") String rsn,
            @JsonProperty("skills") List<Skill> skills,
            @JsonProperty("activities") List<Activity> activities) {
        this.rsn = rsn;
        this.skills = Collections.unmodifiableList(new ArrayList<>(skills));
        this.activities = Collections.unmodifiableList(new ArrayList<>(activities));
    }

    // Custom getters to ensure immutability of collections
    public List<Skill> getSkills() {
        return skills; // Already unmodifiable from constructor
    }

    public List<Activity> getActivities() {
        return activities; // Already unmodifiable from constructor
    }
} 