import React from "react";

function GameGenreCard(props) {
	return (
		<div className="row">
		<div className="col s2">
		  <div className="card">
			<div class="card-image">
				<img src={props.image} alt={`Game Cover for ${props.name}`} />
			</div>
			<div class="card-content">
				<span class="card-title">{props.name}</span>
			</div>
			<div className="card-action">
			</div>
		  </div>
		</div>
	  </div>
	);
}

export default GameGenreCard;