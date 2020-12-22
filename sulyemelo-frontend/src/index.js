import React from 'react';
import ReactDOM from 'react-dom';
import Header from './components/header/Header';
import 'bootstrap/dist/css/bootstrap.min.css'
import Body from './Body';

ReactDOM.render(
    <React.StrictMode>
        <Header/>
        <Body/>
    </React.StrictMode>,
    document.getElementById('root'),
);
