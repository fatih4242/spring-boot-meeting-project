package com.fatihtoker.afspraak.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "meet")
public class MeetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "meet_date")
    private String date;

    @Column(name = "meet_client_id")
    private String clientID;

    @Column(name = "meet_owner_id")
    private String ownerID;

    public MeetModel(String date, String clientID, String ownerID) {
        this.date = date;
        this.clientID = clientID;
        this.ownerID = ownerID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public MeetModel() {
    }


    public String getDate() {
        return date;
    }

    public void setDate(String  date) {
        this.date = date;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
