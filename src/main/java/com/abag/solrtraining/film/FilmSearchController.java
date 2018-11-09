package com.abag.solrtraining.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/film/search")
class FilmSearchController {

    @Autowired
    FilmSearchService filmSearchService;

    @GetMapping("/{searchTerm}/{page}")
    List<Film> searchByName(@PathVariable String searchTerm, @PathVariable int page) {
        return filmSearchService.searchFilmsByNameWithSpringQuery(searchTerm, page);
        //return filmSearchService.searchFilmsByNameWithNamedQuery(searchTerm, page);
    }
}
