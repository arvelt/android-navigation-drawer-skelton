package com.example.android.navigationdrawerexample;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

/**
 * Created by arvelt on 2015/07/03.
 */
@JsonModel
public class EventModel {
    @JsonKey
    String id;
    @JsonKey
    String description;
    @JsonKey
    String date;
    @JsonKey
    String name;
    @JsonKey
    String attend;
    @JsonKey
    String absence;
    @JsonKey
    String place;
    @JsonKey
    long organizer;
    @JsonKey
    String interest;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }

    public String getAbsence() {
        return absence;
    }

    public void setAbsence(String absence) {
        this.absence = absence;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getOrganizer() {
        return organizer;
    }

    public void setOrganizer(long organizer) {
        this.organizer = organizer;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
