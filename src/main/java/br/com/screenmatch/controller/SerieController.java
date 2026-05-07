package br.com.screenmatch.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController {
    public String obterSeries() {
        return "Aqui vão ser listadas as séries.";
    }
}
