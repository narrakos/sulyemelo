import React from 'react';
import NavbarComp from './NavbarComp';
import TitleBar from './TitleBar';

const Header = () => {
    return (
        <div>
            <React.Fragment>
                <TitleBar/>
                <NavbarComp/>
                <img src="" alt="Header-img"/>
            </React.Fragment>
        </div>
    );
};

export default Header;
