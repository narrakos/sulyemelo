import React, {useState, useEffect} from 'react';
import axios from 'axios';


const Events = () => {

    const [events, setEvents] = useState([]);

    useEffect(() => {
        fetchEvents();
    }, []);

    const fetchEvents = () => {
        axios.get('http://localhost:8081/event/getAll').then(res => {
            setEvents(res.data);
        });
    };

    const formattedEvents = events.map((event, index) => {
        return (
            <div>
                <h3>{event.name}</h3>
                <p>{event.location}</p>
                <p>{event.dateTime}</p>
            </div>
        );
    });

    return (
        <div>
            {formattedEvents}
        </div>
    );
};


export default Events
