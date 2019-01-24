import React, { Component } from 'react';
import axios from 'axios';
import { Table } from 'reactstrap';

const API_URL = 'http://pokeapi.salestock.net/api/v2/';
class PokemonInfo extends Component {

  constructor(props) {
    super();
  this.state = {
   name : null ,
   weight : null,
   height : null,
   searchString: '',
   pokemonStats:[],
   pokemonAbilities:[],
   pokemons : [],
   pic : 'https://i.ytimg.com/vi/JjDsRN89sIA/maxresdefault.jpg?auto=compress&cs=tinysrgb&h=350',
  }
}

  componentWillMount() {
    var url =  '/AllPokemon';
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
     var url = 'PokemonName/'+ name ;
     axios.get(url)
     .then(
       res => {
         console.log(res.data)
         if(res.status==200){
          this.setState({
            pokemonStats : res.data.stats,
            pokemonAbilities : res.data.abilities,
            pokemonType : res.data.types,
            pic : res.data.sprites.front_default,
            name: res.data.name,
            weight: res.data.weight,
            height: res.data.height,
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
         returnStats.push(<th>Basic Stats</th>);
          for(let i=0; i<this.state.pokemonStats.length;i++){
           returnStats.push(<tr><th key={this.state.pokemonStats[i].stat.name}>{this.state.pokemonStats[i].stat.name}</th><td>{this.state.pokemonStats[i].base_stat}</td></tr>);
         }
         return returnStats;
       }

       createPokemonAbilities(){
         let returnAbilities = [];
         returnAbilities.push(<th>Abilities</th>);
         for(let i=0; i<this.state.pokemonAbilities.length; i++){
           returnAbilities.push(<tr>{this.state.pokemonAbilities[i].ability.name}</tr>);
         }
         return returnAbilities;
       }

       createPokemonTypes(){
         let returnTypes = [];
         returnTypes.push(<th>Type</th>);
         for(let i=0; i<this.state.pokemonType.length; i++){
           returnTypes.push(<tr>{this.state.pokemonType[i].type.name}</tr>);
         }
         return returnTypes;
       }

       render() {
         let filteredNames = this.state.pokemons.filter(pokemon => pokemon.toLowerCase().search(this.state.searchString.toLowerCase()) !== -1)
         return(
           <div>
             <div className="listContainer">
                 <div>
                   search for a pokemon
                   <input type="text" value={this.state.searchString}  onChange={this.onChange.bind(this)} />
                 </div>

                  <div className="table-wrapper-scroll-y">
                  <Table hover>
                  <tbody>
                  {filteredNames.map(pokemonName=><tr key={pokemonName} onClick={()=>this.pickedPokemon(pokemonName)}>{pokemonName}</tr>)}
                  </tbody>
                  </Table>
                </div>
            </div>

            <div className="infoContainer">
              <img  src={this.state.pic} className="imgContainer"/>

                <Table className="rightInfo" >
                <tbody>
                <tr><th>Name:</th><td>{this.state.name}</td></tr>
                <tr><th>Weight:</th><td>{this.state.weight}</td></tr>
                <tr><th>Height:</th><td>{this.state.height}</td></tr>
                </tbody>
                </Table>

                {this.state.name==null ? null :
                              <div>
                                  <div className="underLeftContainer">
                                  <Table>
                                  <tbody>{this.createPokemonStats()}</tbody>
                                  </Table>
                                  </div>
                                  <div className="underRightContainer">
                                  <Table>
                                  <tbody>{this.createPokemonAbilities()}
                                  {this.createPokemonTypes()}
                                  </tbody>

                                  </Table>
                                  </div>
                                </div>
                              }
            </div>

           </div>
         )
       }
}
export default PokemonInfo;
