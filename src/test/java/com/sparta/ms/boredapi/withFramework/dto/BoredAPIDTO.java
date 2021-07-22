package com.sparta.ms.boredapi.withFramework.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoredAPIDTO {
    @JsonProperty("activity")
    private String activity;
    @JsonProperty("type")
    private String type;
    @JsonProperty("participants")
    private Integer participants;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("link")
    private String link;
    @JsonProperty("key")
    private String key;
    @JsonProperty("accessibility")
    private Double accessibility;

    public BoredAPIDTO() {
    }
    public String getActivity() {
        return activity;
    }
    public String getType() {
        return type;
    }
    public Integer getParticipants() {
        return participants;
    }
    public Double getPrice() {
        return price;
    }
    public String getLink() {
        return link;
    }
    public String getKey() {
        return key;
    }
    public Double getAccessibility() {
        return accessibility;
    }

    public boolean hasActivity(){
        return activity.getClass() == String.class;
    }

    public boolean keyHasSevenDigits(){
        return key.length() == 7;
    }

    public boolean atLeastOneParticipant(){
        return participants.intValue() >= 1;
    }
}
