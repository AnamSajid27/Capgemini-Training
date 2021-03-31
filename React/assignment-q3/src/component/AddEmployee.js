import React, { Component } from 'react'
import { Table, Form, Label, Input, Button, FormGroup } from 'reactstrap'
import EmpList from './EmpList'
import EmployeeList from './EmployeeList'
import './myStyle.css'

class AddEmployee extends Component {
    constructor(props) {
        super(props)

        this.state = {
            Name: '',
            Job: '',
            empList:[]
        }
    }


    handelName = (event) => {
        this.setState({
            Name: event.target.value
        })
    }

    handleJob = (event) => {
        this.setState({
            Job: event.target.value
        })
    }

    empListTable = []
    handleSubmit = (event) => {
        this.setState({
            empList:[...this.state.empList,{ Name: this.state.Name, Job: this.state.Job }]
        })
        event.preventDefault()
    }

    removeEmp(name){
        //this this.state.empList.splice(this.state.empList.indexOf(name), 1);
        this.state.empList.splice(this.state.empList.indexOf(name))
        this.setState({empList:this.state.empList
        })        
      

    }

    renderRows(empList) {
        console.log("render row")
       // console.log(this.state.empList)
        //console.log(this.state.empList.length)
        
        
        return (
            empList.map((emp) => {
                return (
                    <tbody key={emp.Job}>
                        <tr>
                            <td key={emp.Name}>{emp.Name}</td>
                            <td key={emp.Job}>{emp.Job}</td>
                            <td key={emp} ><Button onClick={()=>this.removeEmp(emp.Name)}>remove</Button></td>
                            
                        </tr>
                    </tbody>
                )
            })
        )
        
    }


    render() {


        return (
            <div>
                

                <h2>Add New Employee</h2>
                <Form className="form" onSubmit={this.handleSubmit}>
                    <FormGroup>
                        <Label>Name</Label>
                        <Input data-testid="name" type="text" value={this.state.Name}
                            onChange={this.handelName} />
                    </FormGroup>
                    <FormGroup>
                        <Label>Job</Label>
                        <Input data-testid="job" type="text" value={this.state.Job}
                            onChange={this.handleJob} />
                    </FormGroup>
                    <Button  data-testid="submit-btn" color="primary">Submit</Button>
                </Form>
                <Table className="table">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Job</th>
                            <th>Remove</th>
                        </tr>
                    </thead>

                   {this.renderRows(this.state.empList)}

                </Table>

              

            </div>

        )
    }
}

export default AddEmployee
