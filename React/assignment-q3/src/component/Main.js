import React from 'react'
import Contact from './Contact'
import Services from './Services'
import Home from './Home'
import Projects from './Projects'
import './Q6Style.css'

import {
    Collapse,
    Navbar,
    NavbarToggler,
    NavbarBrand,
    Nav,
    NavItem,
    NavLink,
    UncontrolledDropdown,
    DropdownToggle,
    DropdownMenu,
    DropdownItem,
    NavbarText,
} from 'reactstrap';
import { Route, BrowserRouter as Router } from 'react-router-dom'

function Main() {
   let isActive=false
    return (
        <Router>
            <div>

                <Navbar color="light" light expand="md">
                    <NavbarBrand href="/home">HOME</NavbarBrand>

                    <Nav className="mr-auto" navbar>
                    <NavItem className="nav-item" >
                            <NavLink  href="/projects" >PROJECTS </NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink href="/services">SERVICES</NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink href="/contact">CONTACT</NavLink>
                        </NavItem>
                    </Nav>
                </Navbar>
                <div>

                    <Route path="/contact" component={Contact} />
                    <Route path="/services" component={Services} />
                    <Route path="/home" component={Home} />
                    <Route path="/projects" component={Projects} />
                </div>

            </div>
        </Router>
    )
}

export default Main
