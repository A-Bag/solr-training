package com.abag.solrtraining.film;

import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.Collection;
import java.util.List;

public interface SolrFilmRepository extends SolrCrudRepository<Film, String> {

    List<Film> findByNameIn(Collection<String> searchTerms, Pageable pageable);

    @Query("name:*?0*")
    List<Film> findByNameNativeQuery(String searchTerm, Pageable pageable);
}
