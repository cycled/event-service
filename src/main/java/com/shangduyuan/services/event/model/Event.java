package com.shangduyuan.services.event.model;

public class Event {
    private int eventId;
    private String name;

    public Event() {
    }

    public Event(int eventId, String name) {
        this.eventId = eventId;
        this.name = name;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
