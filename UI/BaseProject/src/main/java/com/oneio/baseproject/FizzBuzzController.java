package com.oneio.baseproject;

import org.springframework.web.client.RestTemplate;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "fizzBuzzController")
@SessionScoped
public class FizzBuzzController {

    private short inputNumber;

    public short getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(short inputNumber) {
        this.inputNumber = inputNumber;
    }

    public void save() {
        result();
    }

    public String result() {
        final String uri = "http://localhost:8085/FizzBuzz/Start/" + String.valueOf(inputNumber);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
}
