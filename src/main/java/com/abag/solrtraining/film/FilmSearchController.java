package com.abag.solrtraining.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/film/search")
class FilmSearchController {

    @Autowired
    SolrFilmRepository solrFilmRepository;

    @GetMapping("/{searchTerm}/{page}")
    List<Film> searchByName(@PathVariable String searchTerm, @PathVariable int page) {
        return solrFilmRepository.findByName(searchTerm, PageRequest.of(page, 10));
    }
}
