import React, { Component } from 'react';
import {Navbar,NavItem, Nav,MenuItem,NavDropdown} from  'react-bootstrap';
class Navigation extends Component{
  render(){
  return(
    <Navbar inverse>
      <Navbar.Header>
          <a href="/">Home</a>
      </Navbar.Header>

        <a  href="/pokemon">
          Pokemon
        </a>
        <a  >
          Link
        </a>
        <Nav>
        <NavDropdown  title="Dropdown" id="basic-nav-dropdown">
          <MenuItem >Action</MenuItem>
          <MenuItem >Another action</MenuItem>
          <MenuItem >Something else here</MenuItem>
          <MenuItem divider />
          <MenuItem >Separated link</MenuItem>
        </NavDropdown>
      </Nav>
    </Navbar>
  )
  }

}
export default Navigation;
