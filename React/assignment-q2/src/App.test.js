
import {render} from '@testing-library/react'
import App from './App';



test('employeeData',async ()=>{
   const {debug}= render(
        <App/>
    )
    
   
    debug();
})
