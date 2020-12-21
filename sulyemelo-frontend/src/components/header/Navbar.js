import React from 'react';
import {BrowserRouter as Router, Switch, Route, Link} from 'react-router-dom';
import Events from '../Events'
import Members from '../Members';

const Navbar = () => {
    return (
        <Router>
            <div>
                <ul>
                    <li>
                        <Link to="#">Home</Link>
                    </li>
                    <li>
                        <Link to="#">Rólunk</Link>
                    </li>
                    <li>
                        <Link to="/tagok">Tagok</Link>
                    </li>
                    <li>
                        <Link to='/versenyek'>Versenyek</Link>
                    </li>
                    <li>
                        <Link to="#">Galéria</Link>
                    </li>
                    <li>
                        <Link to="#">Dokumentumtár</Link>
                    </li>
                    <li>
                        <Link to="#">Kapcsolat</Link>
                    </li>
                </ul>

                <hr />

                <Switch>
                    <Route exact path={'/versenyek'}>
                        <Events />
                    </Route>
                    <Route exact path={'/tagok'}>
                        <Members />
                    </Route>
                </Switch>

            </div>
        </Router>
    );
};

export default Navbar;
