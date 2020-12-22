import React from 'react';
import {BrowserRouter as Router, Route, Link, Switch} from 'react-router-dom';
import {Navbar} from 'react-bootstrap/';
import routes from '../../routes';

const NavbarComp = () => {
    return (
        <Router>
            <Navbar>
                <nav>
                    <Switch>
                        {routes.map((route, index) => {
                            return (
                                <Route
                                    key={index}
                                    path={route.path}
                                    exact
                                    children={<Link to={route.path}>{route.name}</Link>}>

                                    {route.name}
                                </Route>
                            );
                        })}
                    </Switch>
                </nav>
            </Navbar>
        </Router>
    );
};

export default NavbarComp;
