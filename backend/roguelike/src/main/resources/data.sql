INSERT INTO GAME_GENRES (name, image)
VALUES  ('Roguelike' , ''),
		('Roguelite', '');

INSERT INTO GAME_DETAILS (name, image, description)
VALUES	('Binding of Isaac', './images/binding/01.jpg', 'A game about tears, many tears.');

INSERT INTO GAMES (name, image, game_details_id, genre_id)
VALUES 	('Binding of Isaac', './images/binding.jpg', 1, 2),
		('Rogue', './images/rogue.jpg', 1, 1);


