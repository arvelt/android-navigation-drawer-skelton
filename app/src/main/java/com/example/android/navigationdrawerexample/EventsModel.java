package com.example.android.navigationdrawerexample;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

import java.util.List;

/**
 * Created by arvelt on 2015/07/02.
 */
@JsonModel
public class EventsModel {
    @JsonKey
    String csrf_token;

    @JsonKey
    List<EventModel> events;

    public String getCsrf_token() {
        return csrf_token;
    }

    public void setCsrf_token(String csrfTtoken) {
        this.csrf_token = csrfTtoken;
    }

    public List<EventModel> getEvents() {
        return events;
    }

    public void setEvents(List<EventModel> events) {
        this.events = events;
    }
}