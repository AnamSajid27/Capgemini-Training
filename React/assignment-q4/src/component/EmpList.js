import React from 'react'

function EmpList(props) {
    console.log(props.formData)
   // const empList1 = props.formData.map((emp)=> <h1>emp.Name</h1>)
    return (
        <div>
            <h1>Hello</h1>
            <h1>{props.formData}</h1>
        </div>
    )
}

export default EmpList
