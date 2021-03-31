
import React, { Component } from 'react'
import { Input, Container, ButtonGroup, Button, InputGroup,InputGroupAddon,InputGroupText } from 'reactstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faDivide, faEquals, faMinus, faPlus,faTimes } from '@fortawesome/free-solid-svg-icons'
import { event } from 'jquery';
import './Q4Style.css'

class Calculator extends Component {
    constructor(props) {
        super(props)

        this.state = {
            qus: "",
            ans: 0
        }
    }

    handleChange = (event) => {
       
        console.log(event.target.value)
        this.setState({
            qus:this.state.qus + event.target.value
        })
        
    }
    
    handleDivision =(event) =>{
       this.setState({
           qus: this.state.qus+"/"
       })
    }

    evaluate =(event)=>{
        this.setState({
            ans: eval(this.state.qus)
        })
    }
  

    render() {
        return (
            <div>
                <Container className="container">
                    <div className="inputField">
                    <InputGroup>
                        <Input type="text" placeholder="0" value={this.state.qus} onChange={this.handleChange} />
                        <InputGroupAddon  addonType="append"><InputGroupText>{this.state.ans}</InputGroupText></InputGroupAddon>
                    </InputGroup>
                    </div>
                    <div className="firstBtn">
                        <ButtonGroup className="ButtonGroup">
                            <Button size ="lg" className="btn" onClick={()=>{this.setState({qus:"",ans:0})}}>C</Button>
                            <Button size ="lg" value={0} onClick={this.handleChange}>0</Button>
                            <Button size ="lg" value='*' onClick={()=>{this.setState({qus: this.state.qus+"*"})}}><FontAwesomeIcon icon={faTimes}/></Button>
                            <Button  size ="lg" color="danger" value='/'  onClick={this.handleDivision}><FontAwesomeIcon  icon={faDivide} /></Button>
                        </ButtonGroup>
                    </div>
                    <div>
                        <ButtonGroup className="ButtonGroup">
                            <Button size ="lg" value={7} onClick={this.handleChange}>7</Button>
                            <Button  size ="lg" value={8} onClick={this.handleChange}>8</Button>
                            <Button  size ="lg" value={9} onClick={this.handleChange}>9</Button>
                            <Button size ="lg" color="danger" value='-' onClick={()=>{this.setState({qus: this.state.qus+"-"})}}><FontAwesomeIcon icon={faMinus} /></Button>
                        </ButtonGroup>
                    </div>
                    <div>
                        <ButtonGroup className="ButtonGroup">
                            <Button size ="lg" value={4} onClick={this.handleChange}>4</Button>
                            <Button size ="lg" value={5} onClick={this.handleChange}>5</Button>
                            <Button size ="lg" value={6} onClick={this.handleChange}>6</Button>
                            <Button size ="lg" color="danger" value='+' onClick={()=>{this.setState({qus: this.state.qus+"+"})}}><FontAwesomeIcon icon={faPlus} /></Button>
                        </ButtonGroup>
                    </div>
                    <div>
                        <ButtonGroup className="ButtonGroup">
                            <Button value={1} onClick={this.handleChange}>1</Button>
                            <Button value={2} onClick={this.handleChange}>2</Button>
                            <Button value={3} onClick={this.handleChange}>3</Button>
                            <Button color="danger" onClick={this.evaluate}><FontAwesomeIcon icon={faEquals} /></Button>
                        </ButtonGroup>
                    </div>

                </Container>
            </div>
        )
    }
}

export default Calculator
