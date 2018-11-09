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
    private List<String> directedBy;

    @Indexed(name = "genre")
    private List<String> genre;

    @Indexed(name = "initial_release_date")
    private String releaseDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDirectedBy() {
        return directedBy;
    }

    public void setDirectedBy(List<String> directedBy) {
        this.directedBy = directedBy;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
