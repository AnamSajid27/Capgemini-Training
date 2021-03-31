import { fireEvent, getByText, render, screen, waitFor } from '@testing-library/react';
import App from './App';

test("calculatTest",async ()=>{
  const {debug,getByTestId,getByText}= render(
    <App/>
  )
  const placeholder = getByTestId("placeholder")
  const numOne = getByTestId("6");
  const numTwo= getByTestId("2");
  const sum = getByTestId("+")
  const evaluate=getByTestId("evaluate");
  

  fireEvent.click(numOne);
  fireEvent.click(sum);
  fireEvent.click(numTwo);
  fireEvent.click(evaluate);
  
   await waitFor(()=>getByTestId("ans"))
  debug()

  
 
})
