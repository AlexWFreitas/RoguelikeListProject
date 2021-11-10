import React from "react";
import { Link } from "react-router-dom";
import "../styles/cards.css";

function GameGenreCard(props) {
	return (
		<div className="col s2">
			<div className="card medium">
				<div class="card-image">
					<Link to={`genres/${props.data.id}`}><img src={`http://localhost:8080/files/${props.data.image}`} alt={`Game Cover for ${props.data.name}`} /> </Link>
				</div>
				<div class="card-content">
					<Link to={`genres/${props.data.id}`}><span class="card-title">{props.data.name}</span></Link>
				</div>
			</div>
		</div>
	);
}

export default GameGenreCard;