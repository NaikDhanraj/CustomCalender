package com.dssp.customcalender;

/**
 * Created by dhanrajnaik522 on 3/25/2016.
 */
public class EventModel {

    public String date = "";
    public String event_message = "";

    public EventModel(String date, String event_message) {
        this.date = date;
        this.event_message = event_message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEvent_message() {
        return event_message;
    }

    public void setEvent_message(String event_message) {
        this.event_message = event_message;
    }
}
