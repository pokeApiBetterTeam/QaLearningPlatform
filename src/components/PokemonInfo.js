import React, { Component } from 'react';
import axios from 'axios';
import './App.css';
import { Table } from 'reactstrap';

const API_URL = 'http://pokeapi.salestock.net/api/v2/';
class PokemonInfo extends Component {

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
  getPokemon(name){
    var url = API_URL + 'pokemon/'+ name ;
    axios.get(url)
    .then(
      res => {
        if(res.status==200){this.setState({
          pic : res.data.sprites.front_default,
          name: res.data.name,
          weight: res.data.weight,
        });
      };
    })
    .catch(err=>console.log(err));
  }

  componentWillMount() {
    var url =  API_URL + 'pokemon/?limit=100';
     axios.get(url)
         .then(res => {
           res.data.results.map(item => this.setState(
             prevState => ({
                 pokemons:[...prevState.pokemons, item.name]
             })
           ));
         });
   }

       onChange(event) {
         this.setState({ searchString: event.target.value });
       }

       async filterList (event)  {
         console.log( event.target.value);
         await this.setState({ searchString: event.target.value });
         this.getPokemon(this.state.searchString);
       }

       render() {
         let filteredNames = this.state.pokemons.filter(pokemon => pokemon.toLowerCase().search(this.state.searchString.toLowerCase()) !== -1)
         return(
           <div>
            <input type="text" value={this.state.searchString}  onChange={this.onChange.bind(this)} />
            <div>
              search for a pokemon
            </div>
            <Table  >
            {filteredNames.map(pokemonName =>
              <tr onClick={this.filterList.bind(this)}>{pokemonName}</tr>
            )}
            </Table>
            <img  src={this.state.pic} alt="what" width="200" height="200"/>

            <div>
              <Table hover>
                <tr><th>Name:</th> <td>{this.state.name}</td></tr>
                <tr><th>Weight:</th> <td>{this.state.weight} </td></tr>
              </Table>
            </div>
           </div>
         )
       }
}
export default PokemonInfo;
