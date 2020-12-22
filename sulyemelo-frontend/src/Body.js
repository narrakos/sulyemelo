import routes from './routes';
import {BrowserRouter as Router, Link, Route, Switch} from 'react-router-dom';
import React from 'react';


const Body = () => {
    return (
        <Router>
            <aside>
                <nav>
                    {routes.map((route, index) => {
                        return (
                            <Link to={route.path}>
                                {route.name}
                            </Link>
                        );
                    })}
                </nav>
            </aside>

            <main>
                <Switch>
                    {routes.map((route, index) => (
                        // You can render a <Route> in as many places
                        // as you want in your app. It will render along
                        // with any other <Route>s that also match the URL.
                        // So, a sidebar or breadcrumbs or anything else
                        // that requires you to render multiple things
                        // in multiple places at the same URL is nothing
                        // more than multiple <Route>s.
                        <Route
                            key={index}
                            path={route.path}
                            exact
                            children={<route.main/>}
                        />
                    ))}
                </Switch>
            </main>
        </Router>
    );
};

export default Body;
