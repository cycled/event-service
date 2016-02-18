package com.shangduyuan.services.event.controller;

import com.shangduyuan.services.event.model.Event;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventController {

    /**
     * Sample usage: curl $HOST:$PORT/events/1
     *
     * @param eventId
     * @return
     */
    @RequestMapping("/events/{eventId}")
    public Event getEvent(@PathVariable int eventId) {
        return new Event(eventId, "Docker meetup at 9:00");
    }

    /**
     * Sample usage: curl $HOST:$PORT/events
     * @return
     */
    @RequestMapping("/events")
    public List<Event> getEvents() {
        List events = new ArrayList<Event>();
        events.add(new Event(1, "Docker meetup at 7:00 PM"));
        events.add(new Event(2, "Microservice meetup at 8:00 PM"));
        events.add(new Event(3, "React meetup at tomorrow 7:00 PM"));
        return events;
    }

}
