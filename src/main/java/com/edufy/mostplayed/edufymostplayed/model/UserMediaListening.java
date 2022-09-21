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

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "useruserid", nullable = false)
    private User useruserid;

    //TODO: Find out why this was not autogenerated by JPA?!
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "mediamediaid", nullable = false)
    private Media mediamediaid;

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

    public Media getMediamediaid() {
        return mediamediaid;
    }

    public void setMediamediaid(Media mediamediaid) {
        this.mediamediaid = mediamediaid;
    }
}