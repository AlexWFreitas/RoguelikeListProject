import React from 'react';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import GameGenres from './pages/GameGenres';
import Games from './pages/Games';
import Game from './pages/Game';

function Router() {
	return (
		<>
			<BrowserRouter>
				<Routes>
					<Route path = "/" element = { <Home /> } />
					<Route path = "/genres/" element = { <GameGenres /> } />
					<Route path = "/genres/:id/" element = { <Games /> } />
					<Route path = "/games/:id/" element = { <Game /> } />
				</Routes>		
			</BrowserRouter>	
		</>
	);
}

export default Router;