import React from 'react';
import './TitleBar.css';
import logo from '../../res/logo.jpg';
import facebook from '../../res/facebook.png';
import youtube from '../../res/youtube.png';
import twitter from '../../res/twitter.png';
import instagram from '../../res/instagram.png';

const TitleBar = () => {
    return (
        <div>
            <React.Fragment>

                <img src={logo} alt="logo"/>
                <h1>Pécsi Súlyemelő Egyesület</h1>
                <div>
                    <img src={facebook} alt="facebook"/>
                    <img src={youtube} alt="youtube"/>
                    <img src={twitter} alt="twitter"/>
                    <img src={instagram} alt="instagram"/>
                </div>
            </React.Fragment>
        </div>
    );
};

export default TitleBar;
