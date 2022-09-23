package com.edufy.mostplayed.edufymostplayed.model;
import javax.persistence.*;
import java.time.LocalDate;
/*
 * Klassen Media har blivit autogenererad från databasen edufydatabase och är annoterad med @Entity.
 * @author Matilda Wintence, Jesper Johansson.
 */
@Entity
@Table(name = "media")
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mediaid", nullable = false)
    private Integer id;

    @Column(name = "url", nullable = false, length = 200)
    private String url;

    @Column(name = "releasedate", nullable = false)
    private LocalDate releasedate;

    @Column(name = "medianame", nullable = false, length = 100)
    private String medianame;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(LocalDate releasedate) {
        this.releasedate = releasedate;
    }

    public String getMedianame() {
        return medianame;
    }

    public void setMedianame(String medianame) {
        this.medianame = medianame;
    }
}