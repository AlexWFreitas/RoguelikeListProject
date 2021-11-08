import React from "react";
import GameGenreCard from "../components/GameGenreCard";
import Navbar from "../components/Navbar";

function Game() {

	const images = require.context("../images/games", true);

	return (
		<div>
			<Navbar />
			<GameGenreCard name="Binding of Isaac" image={images("./1/cover.jpg").default} />
		</div>
	);
}

export default Game;