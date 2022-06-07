package com.sem4.PostIT.Model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Channel {

    @Id
    @GeneratedValue
    private UUID channelId;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String userId;

    public UUID getId() {
        return channelId;
    }

    public void setId(UUID channelId) {
        this.channelId = channelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return userId;
    }

    public void setUser(String userId) {
        this.userId = userId;
    }
}
