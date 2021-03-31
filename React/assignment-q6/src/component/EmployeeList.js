import React from 'react'
import { Table } from 'reactstrap'
function employeeList() {
    const empData = [{
        id: 1,
        name: 'Charlie',
        job: 'Janitor'
    }, {
        id: 2,
        name: 'Mac',
        job: 'Bouncer'
    }, {
        id: 3,
        name: 'Dee',
        job: 'Aspiring actress'
    }, {
        id: 4,
        name: 'Denis',
        job: 'Bartender'
    }]

    const empList = empData.map((emp) => {
        return (
            <tbody>
                <tr>
                    <td>{emp.name}</td>
                    <td>{emp.job}</td>

                </tr>
            </tbody>

        )
    })
    return (
        <div>
            <Table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Job</th>
                    </tr>
                </thead>

                {empList}

            </Table>
        </div>
    )
}

export default employeeList
