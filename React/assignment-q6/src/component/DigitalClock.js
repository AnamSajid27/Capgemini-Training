import React, { useState } from 'react'
import {
    Card, CardText, CardBody, CardLink,
    CardTitle, CardSubtitle, Container, Button,Label,Input,span
} from 'reactstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faCalendar, faCalendarAlt, faCalendarDay, faClock, faToggleOff, faToggleOn } from '@fortawesome/free-solid-svg-icons'
import './Q5Style.css'


function DigitalClock() {

    let time = new Date().toLocaleTimeString();
    let date = new Date().toLocaleDateString();
    const [ctime, setCtime] = useState(time)

    const UpdateTime = () => {
        time = new Date().toLocaleTimeString();
        setCtime(time)
    }

    setInterval(UpdateTime, 1000)
    const [isOpen, setIsOpen] = useState(false);

    const toggle = () => setIsOpen(!isOpen)
    
    let icon1
    return (
        <div >
   
            <Card className="card">
                <CardBody >
                    <CardTitle className="title" tag="h5"><FontAwesomeIcon className="faClock" icon={faClock} />Digital Clock</CardTitle>  
                      <CardText >
                          {isOpen?
                          <div><FontAwesomeIcon className="faToggleOn" onClick={toggle}    icon={faToggleOn}/><FontAwesomeIcon className="faCalender" icon={faCalendarAlt}/>
                          </div>
                          :<div><FontAwesomeIcon className="faToggleOff"  onClick={toggle}   icon={faToggleOff}/>
                          <FontAwesomeIcon className="faCalender" icon={faCalendarAlt}/>
                          </div>
                          
                          }
                         
                       </CardText>
                    </CardBody>

                    <CardBody className="body">
                        <CardText>{time}</CardText>
                        <CardText >{isOpen ? date : ''}</CardText>
                    </CardBody>
                </Card>
        </div>
      
    )
}

export default DigitalClock
