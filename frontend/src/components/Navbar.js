import React from "react";
import { Link } from "react-router-dom";

function Navbar() {
	return (
		<nav>
		<div className="nav-wrapper indigo darken-4">
		  <Link to="/" className="brand-logo center">Otaru's Roguelike Game List</Link>
		  <ul id="nav-mobile" className="left hide-on-med-and-down">
			<Link to="/">Home</Link>
		  </ul>
		</div>
	  </nav>
	);
}

export default Navbar;