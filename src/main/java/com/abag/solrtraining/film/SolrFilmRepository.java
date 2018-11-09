package com.abag.solrtraining.film;

import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface SolrFilmRepository extends SolrCrudRepository<Film, String> {

    List<Film> findByName(String searchTerm, Pageable pageable);
}
