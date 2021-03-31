import React from 'react'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faSun } from '@fortawesome/free-solid-svg-icons'
function Header() {
    return (
        <div>
            <h1><FontAwesomeIcon icon={faSun}/>Weather</h1>
        </div>
    )
}

export default Header
