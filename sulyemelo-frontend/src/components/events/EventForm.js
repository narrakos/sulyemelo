import React, {useState} from 'react';
import axios from 'axios';

class EventForm extends React.Component {
    handleSubmit(formData) {
        // axios.post('http://localhost:8081/event/save', formData)
        //     .catch(err => {
        //         console.log(err);
        //     })
        console.log(formData);
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
                    <input type='text' name='name'/>
                </label>
                <label>
                    Helyszín:
                    <input type='text' name='location'/>
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
