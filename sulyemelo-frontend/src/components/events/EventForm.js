import React, {useState} from 'react';
import axios from 'axios';

class EventForm extends React.Component {
    constructor(props: P, context: any) {
        super(props, context);
        this.state = {
            eventName: '',
            location: ''
        }

        this.handleSubmit = this.handleSubmit.bind(this)
        this.setEventName = this.setEventName.bind(this)
        this.setLocation = this.setLocation.bind(this)
    }

    setEventName(event) {
        this.setState({eventName : event.target.eventName})
    }

    setLocation(event) {
        this.setState({location : event.target.location})
    }

    handleSubmit(event) {
        console.log(this.state.eventName)
        axios.post('http://localhost:8081/event/save', this.state)
            .catch(err => {
                console.log(err);
            })
        console.log(this.state);
        event.preventDefault();
    }

    getCompetitions() {
        const competitions = axios.get('http://localhost:8081/competition/getAll')
            .then(res => {
                res.data.map(comp => {
                    return(
                        <option id={comp.id}>
                            {comp.name}
                        </option>
                    );
                })
                console.log(res.data)
                return res.data
            });
        return competitions == null ?
            <option/> :
            competitions;
    }

    render() {
        return (
            <form onSubmit={this.handleSubmit}>
                <label>
                    Esemény neve:
                    <input type='text' name='name' value={this.state.eventName} onChange={this.setEventName}/>
                </label>
                <label>
                    Helyszín:
                    <input type='text' name='location' value={this.state.location} onChange={this.setLocation}/>
                </label>
                {/*<label>*/}
                {/*    <select name='competition'>*/}
                {/*        {this.getCompetitions()}*/}
                {/*    </select>*/}
                {/*</label>*/}
                <input type='submit' value='Mentés'/>
            </form>
        );
    }

}

export default EventForm;
