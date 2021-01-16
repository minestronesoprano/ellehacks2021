import axios from "axios";
import React, { useEffect, useState } from "react";
import { NavLink } from "react-router-dom";
import {  
    Modal,
    ModalContent,
    ModalBody,
    useDisclosure
} from "@chakra-ui/react";
import './Play.css';

const Play = () => { 
    const USERS_REST_API_URL = 'http://localhost:8080/api/users'
    const [amount, setAmount] = useState(0)
    const [uni, setUni] = useState(true)
    const [scholarship, setScholarship] = useState(0)
    const [level, setLevel] = useState(0)
    const [prompts, setPrompts] = useState([])
    const {isOpen, onOpen, onClose} = useDisclosure();

    useEffect(() => {
        axios.get(USERS_REST_API_URL)
        .then(res => { 
            console.log(res.data.length)
            console.log(res.data[0].firstName)
            for (var i = 0; i < res.data.length; i++) {
                setPrompts(prompts => [...prompts,
                    {name: res.data[i].firstName}
                ])
            }
        });
    }, [])

    useEffect(() => {
        onOpen();
    }, [onOpen]);    

    return (
        <div className="Play">
            <div className="intro-popup">
                <Modal className="popup" isOpen={isOpen} onClose={onClose} isCentered>
                    <ModalContent>
                        <ModalBody className="popup-instructions">
                            <h5 className="popup-title"> Welcome to <span className="title">Life in Literacy</span>, made for Ellehacks 2021. </h5>
                            <p> Once you close this pop-up, you will become a high schooler with $100 in savings. 
                                You will be faced with a series of situations and be given two set decisions to choose from 
                                that will ultimately affect your savings, debt, [insert econ terms idk here xd].
                                Your sole objective is to make concious, yet real decisions as you progress/"age" through the simulation. 
                            </p> <br />
                            <p>
                                <span className="popup-message">Word from the creators</span>: There is no way to "win" this simulation.
                                We want you to make decisions that you would consider in your real life. Our sole goal is for this simulation 
                                to teach you the importance of , and inspire you to start taking control of your own financial situation. 
                                With that in mind, remember that money is not everything! <u>Maintaining a healthy balance is the true key to happiness</u>.
                                <br/>Please enjoy our simulation.
                            </p> <br />
                            <button className="popup-ready" onClick={onClose}><span className="ready">I'M READY</span></button><br/>
                            <NavLink className="popup-notready" exact activeClassName="current" to="/"><span className="notready">I'M NOT READY — TAKE ME BACK</span></NavLink>
                        </ModalBody>
                    </ModalContent>
                </Modal>
            </div>
            
            <div className="profile-section">
                <ul>
                    <li>age: 16</li>
                    <li>current savings: $100</li><br/>
                    {/* {prompts.map(prompt=> (
                    <li>{prompt.name}</li> ))} */}
                </ul>
            </div>
        </div>
    );
}

export default Play;