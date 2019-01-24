import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import './App.css';
import axios from 'axios';
import pokemonInfo from './PokemonInfo';
import { Table } from 'reactstrap';
const API_URL = 'http://pokeapi.salestock.net/api/v2/';

class App extends Component {
 constructor(props) {
   super();
   this.state = {
    name : null ,
    weight : null,
    searchString: '',
    pokemons : [],
    pic : 'https://i.ytimg.com/vi/JjDsRN89sIA/maxresdefault.jpg?auto=compress&cs=tinysrgb&h=350',
   }

 }

  render() {
    return (
      <div >
          Pokemon Stuffs
          <div>
          <button onClick={() => this.getPokemon(this.state.searchString)}>search</button>
          </div>
          <img  src={this.state.pic} alt="what" width="200" height="200"/>
      </div>
    );
  }
}

export default App;
