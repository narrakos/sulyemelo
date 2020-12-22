import React from 'react';
import './TitleBar.css';


const TitleBar = () => {
    return (
        <div>
            <React.Fragment>

                <img src="res/logo.jpg" alt="logo"/>
                <h1>Pécsi Súlyemelő Egyesület</h1>
                <div>
                    <img src="res/facebook.png" alt="facebook"/>
                    <img src="res/youtube.png" alt="youtube"/>
                    <img src="res/twitter.png" alt="twitter"/>
                    <img src="res/instagram.png" alt="instagram"/>
                </div>
            </React.Fragment>
        </div>
    );
};

export default TitleBar;
