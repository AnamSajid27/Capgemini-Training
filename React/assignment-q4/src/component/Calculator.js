
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
                        <Input data-testid="placeholder" type="text" placeholder="0" value={this.state.qus} onChange={this.handleChange} />
                        <InputGroupAddon data-testid="ans" addonType="append"><InputGroupText>{this.state.ans}</InputGroupText></InputGroupAddon>
                    </InputGroup>
                    </div>
                    <div className="firstBtn">
                        <ButtonGroup className="ButtonGroup">
                            <Button data-testid="C" size ="lg" className="btn" onClick={()=>{this.setState({qus:"",ans:0})}}>C</Button>
                            <Button data-testid="0" size ="lg" value={0} onClick={this.handleChange}>0</Button>
                            <Button data-testid="*" size ="lg" value='*' onClick={()=>{this.setState({qus: this.state.qus+"*"})}}><FontAwesomeIcon icon={faTimes}/></Button>
                            <Button data-testid="/" size ="lg" color="danger" value='/'  onClick={this.handleDivision}><FontAwesomeIcon  icon={faDivide} /></Button>
                        </ButtonGroup>
                    </div>
                    <div>
                        <ButtonGroup className="ButtonGroup">
                            <Button  data-testid="7" data-testid size ="lg" value={7} onClick={this.handleChange}>7</Button>
                            <Button data-testid="8" size ="lg" value={8} onClick={this.handleChange}>8</Button>
                            <Button data-testid="9"  size ="lg" value={9} onClick={this.handleChange}>9</Button>
                            <Button data-testid= "-" size ="lg" color="danger" value='-' onClick={()=>{this.setState({qus: this.state.qus+"-"})}}><FontAwesomeIcon icon={faMinus} /></Button>
                        </ButtonGroup>
                    </div>
                    <div>
                        <ButtonGroup className="ButtonGroup">
                            <Button  data-testid="4" size ="lg" value={4} onClick={this.handleChange}>4</Button>
                            <Button  data-testid="5" size ="lg" value={5} onClick={this.handleChange}>5</Button>
                            <Button data-testid="6" size ="lg" value={6} onClick={this.handleChange}>6</Button>
                            <Button data-testid="+" size ="lg" color="danger" value='+' onClick={()=>{this.setState({qus: this.state.qus+"+"})}}><FontAwesomeIcon icon={faPlus} /></Button>
                        </ButtonGroup>
                    </div>
                    <div>
                        <ButtonGroup className="ButtonGroup">
                            <Button data-testid="1"  value={1} onClick={this.handleChange}>1</Button>
                            <Button data-testid="2" value={2} onClick={this.handleChange}>2</Button>
                            <Button data-testid="3" value={3} onClick={this.handleChange}>3</Button>
                            <Button data-testid="evaluate" color="danger" onClick={this.evaluate}><FontAwesomeIcon icon={faEquals} /></Button>
                        </ButtonGroup>
                    </div>

                </Container>
            </div>
        )
    }
}

export default Calculator
