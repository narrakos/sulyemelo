import React from 'react';
import {BrowserRouter as Router, Link} from 'react-router-dom';

const Navbar = () => {
    return (
        <React.Fragment>
            <Router>
                <Link to="#">Home</Link>
                <Link to="#">Rólunk</Link>
                <Link to="#">Tagok</Link>
                <Link to="#">Versenyek</Link>
                <Link to="#">Galéria</Link>
                <Link to="#">Dokumentumtár</Link>
                <Link to="#">Kapcsolat</Link>
            </Router>
        </React.Fragment>
    );
};

export default Navbar;
