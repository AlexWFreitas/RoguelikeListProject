import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import GameCard from "../components/GameCard";
import Navbar from "../components/Navbar";

function Games() {
	
	const { id } = useParams();
	const [data, setData] = useState([]);

	useEffect(() => {
		fetch(`http://localhost:8080/api/genres/${id}`)
			.then((response) => response.json())
			.then(setData);
	}, []);

	return (
		<div>
			<Navbar />
			<div className="container">
				<div className="row">
					{ data.map( (item) => (
						<GameCard key={item.id} data={item} />
					))}
				</div>
			</div>			
		</div>
	);
}

export default Games;