import React from 'react';
import {BrowserRouter as Router, Link, Route, Switch} from 'react-router-dom';
import Members from '../Members';
import Events from '../events/Events';

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
                        <Link to='/esemenyek'>Események</Link>
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
                    <Route exact path={'/esemenyek'}>
                        <Events/>
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
