import React from 'react';
import NavbarComp from './NavbarComp';
import TitleBar from './TitleBar';
import headerpic from '../../res/headerpic.jpg';

const Header = () => {
    return (
        <div>
            <React.Fragment>
                <TitleBar/>
                <NavbarComp/>
                <img src={headerpic} alt="Header-img"/>
            </React.Fragment>
        </div>
    );
};

export default Header;
