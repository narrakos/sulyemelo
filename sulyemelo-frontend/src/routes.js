import React from 'react';
import Events from './components/events/Events';
import {Link} from 'react-router-dom';


const routes = [
    {
        path: '#',
        name: 'Home',
        header: () => <Link to={this.path}>{this.name}</Link>,
        main: null,
    },
    {
        path: '#',
        name: 'Rólunk',
        header: () => <Link to={this.path}>{this.name}</Link>,
        main: null,
    },
    {
        path: '/tagok',
        name: 'Tagok',
        header: () => <Link to={this.path}>{this.name}</Link>,
        main: null,
    },
    {
        path: '/versenyek',
        name: 'Versenyek',
        header: () => <Link to={this.path}>{this.name}</Link>,
        main: () => <Events/>,
    },
    {
        path: '#',
        name: 'Galéria',
        header: () => <Link to={this.path}>{this.name}</Link>,
        main: null,
    },
    {
        path: '#',
        name: 'Dokumentumtár',
        header: () => <Link to={this.path}>{this.name}</Link>,
        main: null,
    },
    {
        path: '#',
        name: 'Kapcsolat',
        header: () => <Link to={this.path}>{this.name}</Link>,
        main: null,
    },
];

export default routes;
