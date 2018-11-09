package com.abag.solrtraining.film;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;

@SolrDocument(collection = "films")
class Film {
    @Id
    @Indexed(name = "id")
    private String id;

    @Indexed(name = "name")
    private String name;

    @Indexed(name = "directed_by")
    private String directedBy;

    @Indexed(name = "genre")
    private List<String> genre;

    @Indexed(name = "initial_release_date")
    private String releaseDate;
}
