import React from 'react';
import classes from './MyButton.module.css';

const MyButton = ({children,onClick, ...props}) => {
    return (
        <button {...props} className={classes.myBtn} onClick={onClick}>
            {children}
        </button>
    );
};

export default MyButton;