package dev.tech.domain;

import javax.persistence.*;
import java.util.Date;

@Entity/*(name = "USER_DETAILS")*/
@Table(name = "USER_DETAILS")
public class UserDetails {
    @Id
    private int userId;
//    @Transient // Telling Hibernate not to persist this field in the database.
    private String username;
    @Temporal(TemporalType.DATE)
    private Date joinedDate;
    private String address;
    @Lob
    private String description;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}