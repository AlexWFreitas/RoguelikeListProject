import React, { useEffect, useState } from "react";
import Navbar from "../components/Navbar";
import { useParams } from "react-router-dom";
import GameDetailsCard from "../components/GameDetailsCard";

function Game() {

	const { id } = useParams();
	const [data, setData] = useState([]);

	useEffect(() => {
		fetch(`http://localhost:8080/api/games/${id}/`)
			.then((response) => response.json())
			.then(setData);
	}, []);

	return (
		<div>
			<Navbar />
			<div className="container">
				<div className="row">
					<GameDetailsCard key={data.id} data={data} />
				</div>
			</div>			
		</div>
	);
}

export default Game;