import React, { Component } from 'react';

class Navigation extends Component{
  render(){
  return(
    <nav class="navbar navbar-default">
     <div class="container-fluid">
      <a class="navbar-brand" href="/">Home</a>
     <ul class="nav navbar-nav">
        <li><a href="/pokemon">Pokemon</a></li>
        <li><a href="/">Berries</a></li>
        <li><a href="/">Items</a></li>
      </ul>
     </div>
    </nav>)

  }

}
export default Navigation;
