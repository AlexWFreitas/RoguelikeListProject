INSERT INTO GAME_GENRES (name, image)
VALUES  ('Roguelike' , '../images/genre/1/cover.jpg'),
		('Roguelite', '../images/genre/2/cover.jpg');

INSERT INTO GAME_DETAILS (name, image, description)
VALUES	('Binding of Isaac', '../images/games/1/cover.jp', 'When Isaac’s mother starts hearing the voice of God demanding a sacrifice be made to prove her faith, Isaac escapes into the basement facing droves of deranged enemies, lost brothers and sisters, his fears, and eventually his mother. The Binding of Isaac is a randomly generated action RPG shooter with heavy Rogue-like elements. Following Isaac on his journey players will find bizarre treasures that change Isaac’s form giving him super human abilities and enabling him to fight off droves of mysterious creatures, discover secrets and fight his way to safety.'),
		('Rogue', '../images/games/2/cover.jpg', 'Experience the original that spawned a thousand Rogue-likes. Venture into the Dungeons of Doom in search of the legendary Amulet of Yendor, and hopefully escape with your life! Randomly generated dungeon layouts await you, full of nasty monsters, insidious traps, and glittering loot.'),
		('Enter the Gungeon', '../images/games/3/cover.jpg', 'Enter the Gungeon is a bullet hell dungeon crawler following a band of misfits seeking to shoot, loot, dodge roll and table-flip their way to personal absolution by reaching the legendary Gungeon’s ultimate treasure: the gun that can kill the past.'),
		('Shiren the Wanderer: The Tower of Fortune and the Dice of Fate', '../images/games/4/cover.jpg', 'Shiren the Wanderer: The Tower of Fortune and the Dice of Fate is a roguelike role-playing video game developed by Chunsoft. It is the fifth main entry in the Shiren the Wanderer series, which is a subset of the larger Mystery Dungeon series. It was originally released for the Nintendo DS in 2010 in Japan.');

INSERT INTO GAMES (name, image, game_details_id, genre_id)
VALUES 	('Binding of Isaac', '../images/games/1/cover.jpg', 1, 2),
		('Rogue', '../images/games/2/cover.jpg', 2, 1),
		('Enter the Gungeon', '../images/games/3/cover.jpg', 3, 2),
		('Shiren the Wanderer: The Tower of Fortune and the Dice of Fate', '../images/games/4/cover.jpg', 4, 1);


