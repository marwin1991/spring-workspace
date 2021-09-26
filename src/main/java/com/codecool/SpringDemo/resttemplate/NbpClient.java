package com.codecool.SpringDemo.resttemplate;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
public class NbpClient {

    @Value("${nbp.url:http://google.pl}")
    private String nbpUrl;

    public void getCurrenciesRate(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Root[]> response = restTemplate.getForEntity(nbpUrl, Root[].class);

        List<Root> roots = Arrays.asList(response.getBody());

        log.info(roots.get(0).toString());
    }
}
