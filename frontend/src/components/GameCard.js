import React from "react";
import { Link } from "react-router-dom";

function GameCard(props) {
	return (
		<div className="col s2">
			<div className="card medium">
				<div className="card-image">
				<Link to={`../../games/${props.data.id}`}><img src={`http://localhost:8080/files/${props.data.image}`} alt={`Game Cover for ${props.data.name}`} /></Link>
				</div>
				<div className="card-content">				
					<Link to={`../../games/${props.data.id}`}><p>{props.data.name}</p></Link>
				</div>
			</div>
		</div>
	);
}

export default GameCard;