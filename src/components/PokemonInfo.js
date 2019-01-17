import React, { Component } from 'react';
import axios from 'axios';
import { Table, Row } from 'reactstrap';

const API_URL = 'http://pokeapi.salestock.net/api/v2/';
class PokemonInfo extends Component {

  constructor(props) {
    super();
  this.state = {
   name : null ,
   weight : null,
   searchString: '',
   pokemonStats:[],
   pokemonAbilities:[],
   pokemons : [],
   pic : 'https://i.ytimg.com/vi/JjDsRN89sIA/maxresdefault.jpg?auto=compress&cs=tinysrgb&h=350',
  }
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

   getPokemon(name){
     var url = API_URL + 'pokemon/'+ name ;
     axios.get(url)
     .then(
       res => {
         console.log(res.data.abilities)
         if(res.status==200){
          this.setState({
            pokemonStats : res.data.stats,
            pokemonAbilities : res.data.abilities,
            pic : res.data.sprites.front_default,
            name: res.data.name,
            weight: res.data.weight,
         });

       };
     })
     .catch(err=>console.log(err));
   }


       onChange(event) {
         this.setState({ searchString: event.target.value });
       }

       async pickedPokemon(pokemon) {
         if(pokemon != this.state.searchString){
           await this.setState({ searchString: pokemon });
           this.getPokemon(this.state.searchString);
         }
       }

       createPokemonStats(){
         let returnStats = [];
         for(let i=0; i<this.state.pokemonStats.length;i++){
           returnStats.push(<tr><th>{this.state.pokemonStats[i].stat.name}</th> <td>{this.state.pokemonStats[i].base_stat}</td></tr>);
         }
         return returnStats;
       }

       createPokemonAbilities(){
         let returnAbilities = [];
         for(let i=0; i<this.state.pokemonAbilities.length; i++){
           returnAbilities.push(<tr><th>{this.state.pokemonAbilities[i].ability.name}</th></tr>);
         }
         return returnAbilities;
       }

       render() {
         let filteredNames = this.state.pokemons.filter(pokemon => pokemon.toLowerCase().search(this.state.searchString.toLowerCase()) !== -1)
         return(
           <div>
            <input type="text" value={this.state.searchString}  onChange={this.onChange.bind(this)} />
            <div>
              search for a pokemon
            </div>
            <div class="table-wrapper-scroll-y">
            <Table  hover bordered>
            {filteredNames.map(pokemonName =>
              <tr onClick={() => this.pickedPokemon(pokemonName)}>{pokemonName}</tr>
            )}
            </Table>
            </div>
            <img  src={this.state.pic} alt="what" width="200" height="200"/>

            <div>
              <Table hover>
                <tr><th>Name:</th> <td>{this.state.name}</td></tr>
                <tr><th>Weight:</th> <td>{this.state.weight} </td></tr>
                {this.createPokemonStats()}
                {this.createPokemonAbilities()}
              </Table>
            </div>
           </div>
         )
       }
}
export default PokemonInfo;
