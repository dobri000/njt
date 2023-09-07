import { Link } from "react-router-dom";

const Navigator = () => {

    return (
        <header>
                <nav className="navbar">
                    <ul className="nav-menu">
                        <li className="nav-item">
                            <Link to="/home">Home</Link>
                        </li>
                        <li className="nav-item">
                            <Link to="/player-page">Player</Link>
                        </li>
                        <li className="nav-item">
                            <Link to="/team-page">Team</Link>
                        </li>
                        <li className="nav-item">
                            <Link to="/">Logout</Link>
                        </li>
                    </ul>
                </nav>
            </header>
    );

}

export default Navigator;