package com.abag.solrtraining.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FilmSearchService {
    @Autowired
    SolrFilmRepository solrFilmRepository;

    List<Film> searchFilmsByNameWithSpringQuery(String searchTerm, int page) {
        List<String> searchStrings = Arrays.asList(searchTerm.split(" "));
        return solrFilmRepository.findByNameIn(searchStrings, PageRequest.of(page, 10));
    }

    List<Film> searchFilmsByNameWithNamedQuery(String searchTerm, int page) {
        return solrFilmRepository.findByNameNativeQuery(searchTerm, PageRequest.of(page, 10));
    }
}
