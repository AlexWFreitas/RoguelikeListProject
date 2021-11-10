INSERT INTO GAME_GENRES (name, image)
VALUES  ('Roguelike' , '1.jpg'),
		('Roguelite', '2.jpg');
		
INSERT INTO GAMES (name, image, genre_id)
VALUES 	('Binding of Isaac', '1.jpg', 2),
		('Rogue', '2.jpg', 1),
		('Enter the Gungeon', '4.jpg', 2),
		('Shiren the Wanderer: The Tower of Fortune and the Dice of Fate', '3.jpg', 1);


INSERT INTO GAME_DETAILS (name, image, description, game_id)
VALUES	('Binding of Isaac', '1.jpg', 'When Isaac’s mother starts hearing the voice of God demanding a sacrifice be made to prove her faith, Isaac escapes into the basement facing droves of deranged enemies, lost brothers and sisters, his fears, and eventually his mother. The Binding of Isaac is a randomly generated action RPG shooter with heavy Rogue-like elements. Following Isaac on his journey players will find bizarre treasures that change Isaac’s form giving him super human abilities and enabling him to fight off droves of mysterious creatures, discover secrets and fight his way to safety.', 1),
		('Rogue', '2.jpg', 'Experience the original that spawned a thousand Rogue-likes. Venture into the Dungeons of Doom in search of the legendary Amulet of Yendor, and hopefully escape with your life! Randomly generated dungeon layouts await you, full of nasty monsters, insidious traps, and glittering loot.', 2),
		('Enter the Gungeon', '4.jpg', 'Enter the Gungeon is a bullet hell dungeon crawler following a band of misfits seeking to shoot, loot, dodge roll and table-flip their way to personal absolution by reaching the legendary Gungeon’s ultimate treasure: the gun that can kill the past.', 3),
		('Shiren the Wanderer: The Tower of Fortune and the Dice of Fate', '3.jpg', 'Shiren the Wanderer: The Tower of Fortune and the Dice of Fate is a roguelike role-playing video game developed by Chunsoft. It is the fifth main entry in the Shiren the Wanderer series, which is a subset of the larger Mystery Dungeon series. It was originally released for the Nintendo DS in 2010 in Japan.', 4);


