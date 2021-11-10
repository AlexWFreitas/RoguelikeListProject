import React, { useState, useEffect } from "react";
import GameGenreCard from "../components/GameGenreCard";
import Navbar from "../components/Navbar";

function GameGenres() {
	
	const [data, setData] = useState([]);

	useEffect(() => {
		fetch(`http://localhost:8080/api/genres/`)
			.then((response) => response.json())
			.then(setData);
	}, []);

	return (
		<div>
			<Navbar />
			<div className="container">
				<div className="row">
					{ data.map( (item) => (
						<GameGenreCard key={item.id} data={item} />
					))}
				</div>
			</div>			
		</div>
	);
}

export default GameGenres;