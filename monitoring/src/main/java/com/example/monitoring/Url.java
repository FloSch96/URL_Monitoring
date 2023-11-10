package com.example.monitoring;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Url{

    @Column(name="urlName")
    private String urlName;
    @Column(name="status")
    private Integer status;

    public Url() {
    }
    public Url(String urlName, Integer status) {
        this.urlName = urlName;
        this.status = status;
    }
}
