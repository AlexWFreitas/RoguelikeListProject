import React from "react";
import "../styles/gamecard.css";

function GameDetailsCard(props) {
	return (
		<div className="center-align">
			<div className="card">
				<div className="card-image">
					<img src={`http://localhost:8080/files/${props.data.image}`} alt={`Game Cover for ${props.data.name}`} className="image-centered" style= {{width: "30%" }} />
				</div>
				<div className="card-content">
					<span class="card-title">{props.data.name}</span>					
				</div>
				<div class="divider"></div>
				<div class="card-content">
					<p>{props.data.description}</p>
				</div>
			</div>
		</div>
	);
}

export default GameDetailsCard;