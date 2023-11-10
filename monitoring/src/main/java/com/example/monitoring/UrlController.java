package com.example.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UrlController {

    @GetMapping("/url")
    public String urlPage() {
        return "url";
    }

    public int checkUrlStatus(String urlToCheck) throws IOException {
        URL url = new URL(urlToCheck);
        HttpURLConnection huc = (HttpURLConnection) url.openConnection();

        int responseCode = huc.getResponseCode();
        return responseCode;
    }

    @PostMapping("/addUrl")
    public ResponseEntity<Url> registerUser(@RequestBody UrlModel urlModel) throws IOException {
        String urlName = urlModel.getUrlName();
        int urlStatus = checkUrlStatus(urlName);
        Url newUrl = new Url(
                urlModel.getUrlName(),
                urlStatus
        );
        return new ResponseEntity<>(newUrl, HttpStatus.OK);
    }
}
