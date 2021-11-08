import React from "react";
import GameCard from "../components/GameCard";
import Navbar from "../components/Navbar";

function Games() {

	const images = require.context("../images/games", true);

	return (
		<div>
			<Navbar />
			<GameCard name="Binding of Isaac" image={images("./1/cover.jpg").default} />
		</div>
	);
}

export default Games;