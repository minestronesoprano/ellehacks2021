import { NavLink, Switch, Route, BrowserRouter } from "react-router-dom";
import React from "react";
import TextLoop from "react-text-loop";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faMoneyBillAlt } from '@fortawesome/free-solid-svg-icons'
import PlayPage from "./Play"
import './App.css';

// color scheme : https://colorhunt.co/palette/207308

function App() {
  return (
    <div className="App">
      <div className="introduction-section">
        <h1> FINANCE SIMULATOR 2021 </h1>
      </div>
      <footer>
        <h8>Made by: <a href="https://github.com/michelleberry">Michelle Berry</a>, <a href="https://github.com/radwin01">Yara Radwan</a>, <a href="https://github.com/mshankar58">Maya Shankar</a>, <a href="https://github.com/angelimnp">Angeli Manipon</a></h8>
      </footer>
      <Main />
    </div>
  );
}

const Home = () => (
  <div class="start-section">
    <h3> Control your{" "}
    <TextLoop>
      <span>spending</span>
      <span>saving</span>
      <span>present</span>
      <span className="future-txt">future</span>
    </TextLoop>
    </h3>
    <ul>
      <li>
        <NavLink className="play-button" exact activeClassName="current" to="/play">
          <span className="play-sec"> <span className="icon"><FontAwesomeIcon icon={faMoneyBillAlt}/></span>{" "}ENTER SIMULATION{" "}<span className="icon"><FontAwesomeIcon icon={faMoneyBillAlt}/></span></span>
        </NavLink>
      </li>
    </ul>
  </div>
);

const Play = () => (
  <div>
    <PlayPage />
  </div>
);
  
const Main = () => (
  <BrowserRouter>
  <Switch>
    <Route exact path="/" component={Home}></Route>
    <Route exact path="/play" component={Play}></Route>
  </Switch>
  </BrowserRouter>
);

export default App;
