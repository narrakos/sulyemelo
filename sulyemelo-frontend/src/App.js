import React, {useState, useEffect} from 'react';
import axios from 'axios';


const HW = () => {
    const [msg, setMsg]= useState([]);

    const fetch = () => {
        axios.get('http://localhost:8080/hw').then(res => {
            console.log(res.data)
            setMsg(res.data)
        });
    };

    useEffect(() => {
        fetch()
    }, []);


    return<h1>{msg}</h1>
};


function App() {
    return (
        <div className="App">
            <HW/>
        </div>
    );
}

export default App;
