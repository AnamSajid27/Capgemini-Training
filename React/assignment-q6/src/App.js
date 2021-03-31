import logo from './logo.svg';
import './App.css';
import React from 'react'
import {Table} from 'reactstrap';
import EmployeeList from './component/EmployeeList';
import AddEmployee from './component/AddEmployee';
import Calculator from './component/Calculator';
import DigitalClock from './component/DigitalClock';
import Main from './component/Main';
import CurrentWeatherDisplay from './component/Weather/CurrentWeatherDisplay';


function App() {
  return (
    <div className="App">
      <CurrentWeatherDisplay/>
      {/* < Main/> */}
      {/* < DigitalClock/> */}
      {/* <Calculator/> */}
      {/* <AddEmployee/> */}
     {/* <EmployeeList/> */}
      
    </div>
  );
}

export default App;
