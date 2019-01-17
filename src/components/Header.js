import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import './App.css';
import axios from 'axios';
import pokemonInfo from './PokemonInfo';
import { Table } from 'reactstrap';
const API_URL = 'http://pokeapi.salestock.net/api/v2/';

class Header extends Component {
 constructor(props) {
   super();
   this.state = {
     currentOption : null,
   }

 }

  render() {
    return (
      <div>
          this is the Header at the top
      </div>
    );
  }
}

export default Header;
