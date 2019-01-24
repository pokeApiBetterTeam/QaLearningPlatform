import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import * as serviceWorker from './serviceWorker';
import Main from './components/Main';
import PokemonInfo from './components/PokemonInfo';
import History from "./components/history";
import Navigation from "./components/Navigation";
import './components/App.css';
ReactDOM.render(

  <div >
    <Navigation/>
    <div className="mainContainer">
    <Router history={History} >
      <div>
        <Route path='/' exact={true} component={Main}/>
        <Route path='/pokemon' exact={true} component={PokemonInfo}/>
      </div>
    </Router>
    </div>
  </div>
   ,document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
