import React from 'react';
import Navbar from './Navbar';
import TitleBar from './TitleBar';

const Header = () => {
    return (
        <div>
            <React.Fragment>
                <TitleBar/>
                <Navbar/>
                <img src="" alt="Header-img"/>
            </React.Fragment>
        </div>
    );
};

export default Header;
