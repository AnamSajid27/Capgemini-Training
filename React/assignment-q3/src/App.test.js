import { fireEvent, getByText, render, screen, waitFor, waitForElement, } from '@testing-library/react';
import App from './App';

test('addEmployeeTest',async ()=>{
  const {debug,getByTestId,getByText}=render(
    <App/>
  )
  const inputName = getByTestId("name");
  const inputJob=getByTestId("job");
  const submitBtn = getByTestId("submit-btn");
  fireEvent.click(submitBtn);
 // await waitFor();

  fireEvent.change(inputName,{target:{value:"neeraj"}})
 fireEvent.change(inputJob,{target:{value:"analyst"}})
 fireEvent.click(submitBtn);

 await waitFor(()=>getByText("neeraj"))
  //debug();
})