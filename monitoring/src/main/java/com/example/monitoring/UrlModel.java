package com.example.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UrlModel {
    @JsonProperty("urlName")
    private String urlName;

    public UrlModel() {
    }

    public UrlModel(String urlName) {
        this.urlName = urlName;
    }
}
