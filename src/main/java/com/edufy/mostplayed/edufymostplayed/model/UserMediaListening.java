package com.edufy.mostplayed.edufymostplayed.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "user_media_listenings")
public class UserMediaListening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usermediaid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "useruserid", nullable = false)
    private User useruserid;

    @Column(name = "timeStamp")
    private Instant timeStamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUseruserid() {
        return useruserid;
    }

    public void setUseruserid(User useruserid) {
        this.useruserid = useruserid;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

}