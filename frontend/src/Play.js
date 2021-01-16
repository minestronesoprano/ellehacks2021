import axios from "axios";
import React, { useEffect, useState } from "react";
import { NavLink } from "react-router-dom";
import {  
    Modal,
    ModalContent,
    ModalBody,
    Button,
    useDisclosure
} from "@chakra-ui/react";
import './Play.css';

const Play = () => { 
    const {isOpen, onOpen, onClose} = useDisclosure();

    const USERS_REST_API_URL = 'http://localhost:8080/api/scenarios'

    const [income, setIncome] = useState(0)
    const [savings, setSavings] = useState(100)
    const [expenses, setExpenses] = useState(0);

    const [uni, setUni] = useState(true)
    const [scholarship, setScholarship] = useState(0)

    const [showEnd, setShowEnd] = useState(false)
    const [currentScenario, setCurrentScenario] = useState(0);


    const [Data, setData] = useState({
        question1: '',
        q1age: 0,
        q1option1: '',
        q1option1S: 0,
        q1option1I: 0,
        q1option1E: 0,
        q1option2: '',
        q1option2S: 0,
        q1option2I: 0,
        q1option2E: 0,
        
        question2: '',
        q2age: 0,
        q2option1: '',
        q2option1S: 0,
        q2option1I: 0,
        q2option1E: 0,
        q2option2: '',
        q2option2S: 0,
        q2option2I: 0,
        q2option2E: 0,

        question3: '',
        q3age: 0,
        q3option1: '',
        q3option1S: 0,
        q3option1I: 0,
        q3option1E: 0,
        q3option2: '',
        q3option2S: 0,
        q3option2I: 0,
        q3option2E: 0,

        question4: '',
        q4age: 0,
        q4option1: '',
        q4option1S: 0,
        q4option1I: 0,
        q4option1E: 0,
        q4option2: '',
        q4option2S: 0,
        q4option2I: 0,
        q4option2E: 0,

        question5: '',
        q5age: 0,
        q5option1: '',
        q5option1S: 0,
        q5option1I: 0,
        q5option1E: 0,
        q5option2: '',
        q5option2S: 0,
        q5option2I: 0,
        q5option2E: 0,

        question6: '',
        q6age: 0,
        q6option1: '',
        q6option1S: 0,
        q6option1I: 0,
        q6option1E: 0,
        q6option2: '',
        q6option2S: 0,
        q6option2I: 0,
        q6option2E: 0,

        question7: '',
        q7age: 0,
        q7option1: '',
        q7option1S: 0,
        q7option1I: 0,
        q7option1E: 0,
        q7option2: '',
        q7option2S: 0,
        q7option2I: 0,
        q7option2E: 0,

        question8: '',
        q8age: 0,
        q8option1: '',
        q8option1S: 0,
        q8option1I: 0,
        q8option1E: 0,
        q8option2: '',
        q8option2S: 0,
        q8option2I: 0,
        q8option2E: 0,

        question9: '',
        q9age: 0,
        q9option1: '',
        q9option1S: 0,
        q9option1I: 0,
        q9option1E: 0,
        q9option2: '',
        q9option2S: 0,
        q9option2I: 0,
        q9option2E: 0,

        question10: '',
        q10age: 0,
        q10option1: '',
        q10option1S: 0,
        q10option1I: 0,
        q10option1E: 0,
        q10option2: '',
        q10option2S: 0,
        q10option2I: 0,
        q10option2E: 0
    })

    useEffect(() => {
        axios.get(USERS_REST_API_URL)
        .then(res => { 
            setData({
                question1: res.data[0].description,
                q1age: res.data[0].age,
                q1option1: res.data[0].option1,
                q1option1S: res.data[0].option1savings,
                q1option1I: res.data[0].option1income,
                q1option1E: res.data[0].option1expenses,
                q1option2: res.data[0].option2,
                q1option2S: res.data[0].option2savings,
                q1option2I: res.data[0].option2income,
                q1option2E: res.data[0].option2expenses,
                
                question2: res.data[1].description,
                q2age: res.data[1].age,
                q2option1: res.data[1].option1,
                q2option1S: res.data[1].option1savings,
                q2option1I: res.data[1].option1income,
                q2option1E: res.data[1].option1expenses,
                q2option2: res.data[1].option2,
                q2option2S: res.data[1].option2savings,
                q2option2I: res.data[1].option2income,
                q2option2E: res.data[1].option2expenses,
        
                question3: res.data[2].description,
                q3age: res.data[2].age,
                q3option1: res.data[2].option1,
                q3option1S: res.data[2].option1savings,
                q3option1I: res.data[2].option1income,
                q3option1E: res.data[2].option1expenses,
                q3option2: res.data[2].option2,
                q3option2S: res.data[2].option2savings,
                q3option2I: res.data[2].option2income,
                q3option2E: res.data[2].option2expenses,
        
                question4: res.data[3].description,
                q4age: res.data[3].age,
                q4option1: res.data[3].option1,
                q4option1S: res.data[3].option1savings,
                q4option1I: res.data[3].option1income,
                q4option1E: res.data[3].option1expenses,
                q4option2: res.data[3].option2,
                q4option2S: res.data[3].option2savings,
                q4option2I: res.data[3].option2income,
                q4option2E: res.data[3].option2expenses,

                question5: res.data[4].description,
                q5age: res.data[4].age,
                q5option1: res.data[4].option1,
                q5option1S: res.data[4].option1savings,
                q5option1I: res.data[4].option1income,
                q5option1E: res.data[4].option1expenses,
                q5option2: res.data[4].option2,
                q5option2S: res.data[4].option2savings,
                q5option2I: res.data[4].option2income,
                q5option2E: res.data[4].option2expenses,

                question6: res.data[5].description,
                q6age: res.data[5].age,
                q6option1: res.data[5].option1,
                q6option1S: res.data[5].option1savings,
                q6option1I: res.data[5].option1income,
                q6option1E: res.data[5].option1expenses,
                q6option2: res.data[5].option2,
                q6option2S: res.data[5].option2savings,
                q6option2I: res.data[5].option2income,
                q6option2E: res.data[5].option2expenses,

                question7: res.data[6].description,
                q7age: res.data[6].age,
                q7option1: res.data[6].option1,
                q7option1S: res.data[6].option1savings,
                q7option1I: res.data[6].option1income,
                q7option1E: res.data[6].option1expenses,
                q7option2: res.data[6].option2,
                q7option2S: res.data[6].option2savings,
                q7option2I: res.data[6].option2income,
                q7option2E: res.data[6].option2expenses,

                question8: res.data[7].description,
                q8age: res.data[7].age,
                q8option1: res.data[7].option1,
                q8option1S: res.data[7].option1savings,
                q8option1I: res.data[7].option1income,
                q8option1E: res.data[7].option1expenses,
                q8option2: res.data[7].option2,
                q8option2S: res.data[7].option2savings,
                q8option2I: res.data[7].option2income,
                q8option2E: res.data[7].option2expenses,

                question9: res.data[8].description,
                q9age: res.data[8].age,
                q9option1: res.data[8].option1,
                q9option1S: res.data[8].option1savings,
                q9option1I: res.data[8].option1income,
                q9option1E: res.data[8].option1expenses,
                q9option2: res.data[8].option2,
                q9option2S: res.data[8].option2savings,
                q9option2I: res.data[8].option2income,
                q9option2E: res.data[8].option2expenses,

                question10: res.data[9].description,
                q10age: res.data[9].age,
                q10option1: res.data[9].option1,
                q10option1S: res.data[9].option1savings,
                q10option1I: res.data[9].option1income,
                q10option1E: res.data[9].option1expenses,
                q10option2: res.data[9].option2,
                q10option2S: res.data[9].option2savings,
                q10option2I: res.data[9].option2income,
                q10option2E: res.data[9].option2expenses
            }); 
        });
    }, [])

    useEffect(() => {
        onOpen();
    }, [onOpen]);  
    
    var questions = [
        {
            "question": Data.question1,
            "age": Data.q1age,
            "answerOptions": [
                {
                    "option1": Data.q1option1,
                    "option1s": Data.q1option1S,
                    "option1i": Data.q1option1I,
                    "option1e": Data.q1option1E
                },
                {
                    "option2": Data.q1option2,
                    "option2s": Data.q1option2S,
                    "option2i": Data.q1option2I,
                    "option2e": Data.q1option2E
                }
            ]
        },

        {
            "question": Data.question2,
            "age": Data.q2age,
            "answerOptions": [
                {
                    "option1": Data.q2option1,
                    "option1s": Data.q2option1S,
                    "option1i": Data.q2option1I,
                    "option1e": Data.q2option1E
                },
                {
                    "option2": Data.q2option2,
                    "option2s": Data.q2option2S,
                    "option2i": Data.q2option2I,
                    "option2e": Data.q2option2E
                }
            ]
        },

        {
            "question": Data.question3,
            "age": Data.q3age,
            "answerOptions": [
                {
                    "option1": Data.q3option1,
                    "option1s": Data.q3option1S,
                    "option1i": Data.q3option1I,
                    "option1e": Data.q3option1E
                },
                {
                    "option2": Data.q3option2,
                    "option2s": Data.q3option2S,
                    "option2i": Data.q3option2I,
                    "option2e": Data.q3option2E
                }
            ]
        },

        {
            "question": Data.question4,
            "age": Data.q4age,
            "answerOptions": [
                {
                    "option1": Data.q4option1,
                    "option1s": Data.q4option1S,
                    "option1i": Data.q4option1I,
                    "option1e": Data.q4option1E
                },
                {
                    "option2": Data.q4option2,
                    "option2s": Data.q4option2S,
                    "option2i": Data.q4option2I,
                    "option2e": Data.q4option2E
                }
            ]
        },

        {
            "question": Data.question5,
            "age": Data.q5age,
            "answerOptions": [
                {
                    "option1": Data.q5option1,
                    "option1s": Data.q5option1S,
                    "option1i": Data.q5option1I,
                    "option1e": Data.q5option1E
                },
                {
                    "option2": Data.q5option2,
                    "option2s": Data.q5option2S,
                    "option2i": Data.q5option2I,
                    "option2e": Data.q5option2E
                }
            ]
        },

        {
            "question": Data.question6,
            "age": Data.q6age,
            "answerOptions": [
                {
                    "option1": Data.q6option1,
                    "option1s": Data.q6option1S,
                    "option1i": Data.q6option1I,
                    "option1e": Data.q6option1E
                },
                {
                    "option2": Data.q6option2,
                    "option2s": Data.q6option2S,
                    "option2i": Data.q6option2I,
                    "option2e": Data.q6option2E
                }
            ]
        },

        {
            "question": Data.question7,
            "age": Data.q7age,
            "answerOptions": [
                {
                    "option1": Data.q7option1,
                    "option1s": Data.q7option1S,
                    "option1i": Data.q7option1I,
                    "option1e": Data.q7option1E
                },
                {
                    "option2": Data.q7option2,
                    "option2s": Data.q7option2S,
                    "option2i": Data.q7option2I,
                    "option2e": Data.q7option2E
                }
            ]
        },

        {
            "question": Data.question8,
            "age": Data.q8age,
            "answerOptions": [
                {
                    "option1": Data.q8option1,
                    "option1s": Data.q8option1S,
                    "option1i": Data.q8option1I,
                    "option1e": Data.q8option1E
                },
                {
                    "option2": Data.q8option2,
                    "option2s": Data.q8option2S,
                    "option2i": Data.q8option2I,
                    "option2e": Data.q8option2E
                }
            ]
        },

        {
            "question": Data.question9,
            "age": Data.q9age,
            "answerOptions": [
                {
                    "option1": Data.q9option1,
                    "option1s": Data.q9option1S,
                    "option1i": Data.q9option1I,
                    "option1e": Data.q9option1E
                },
                {
                    "option2": Data.q9option2,
                    "option2s": Data.q9option2S,
                    "option2i": Data.q9option2I,
                    "option2e": Data.q9option2E
                }
            ]
        },

        {
            "question": Data.question10,
            "age": Data.q10age,
            "answerOptions": [
                {
                    "option1": Data.q10option1,
                    "option1s": Data.q10option1S,
                    "option1i": Data.q10option1I,
                    "option1e": Data.q10option1E
                },
                {
                    "option2": Data.q10option2,
                    "option2s": Data.q10option2S,
                    "option2i": Data.q10option2I,
                    "option2e": Data.q10option2E
                }
            ]
        }
    ]


    const handleAnswerOptionClick = (option, answerOption) => {
        const nextQuestion = currentScenario + 1;

        if (nextQuestion < questions.length) {
            setCurrentScenario(nextQuestion);
            if (option == 1) {
                setSavings(savings + answerOption.option1s);
                setIncome(income + answerOption.option1i);
                setExpenses(expenses + answerOption.option1e);
            }
            else {
                setSavings(savings + answerOption.option2s);
                setIncome(income + answerOption.option2i);
                setExpenses(expenses + answerOption.option2e);
            }
        } else {
            setShowEnd(true);
        }
    };

    return (
        <div className="Play">
            <div className="intro-popup">
                <Modal className="popup" isOpen={isOpen} onClose={onClose} isCentered>
                    <ModalContent>
                        <ModalBody className="popup-instructions">
                            <h5 className="popup-title"> Welcome to <span className="title">Finance Simulator 2021</span>, made for Ellehacks 2021. </h5>
                            <p> Once you close this pop-up, you will become a high schooler with $100 in savings. 
                                You will be faced with a series of situations and be given two set decisions to choose from 
                                that will ultimately affect your savings, income and expenses.
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
                { showEnd ? (
                <div className='score-section-solo'>
                    <h1>You ended with ${savings} in savings, ${income} in income, and ${expenses} in expenses..</h1>
                    <p> It is up to you to decide whether your final results are satifactory for you.<br/>
                    We hope this simulation has taught you a little more about the importance of financial literacy, and we
                    encourage you to take the right steps to becoming more financially independent! But remember, balance is always key!
                    </p>
                    <p><NavLink exact to='/'>EXIT SIMULATION</NavLink></p>
                </div>
                ) : (
                    <>
                    <div className='question-text'>{questions[currentScenario].question}</div>      
                    <div className="stats-section">
                        <ul>
                            <li> age: {questions[currentScenario].age} </li>
                            <li> saving: ${savings} </li>
                            <li> income: ${income} </li>
                            <li> expenses: ${expenses} </li>
                        </ul>
                    </div>
                    <div className='answer-section'>
                        <button className = 'quiz-button1' onClick={() => handleAnswerOptionClick(1, questions[currentScenario].answerOptions[0])}>{questions[currentScenario].answerOptions[0].option1} </button>
                        <button className = 'quiz-button2' onClick={() => handleAnswerOptionClick(2, questions[currentScenario].answerOptions[1])}>{questions[currentScenario].answerOptions[1].option2} </button>
                    </div>   

{/* <div className="scenario-box">
<p>The text goes here. Money money stuff fake scenario make money lose money.</p>
<Button className="choice"  >Hi</Button>
<Button className="choice" >Bye</Button>
</div> */}

                    </>
                )}
            </div>
        </div>
    );
}

export default Play;
