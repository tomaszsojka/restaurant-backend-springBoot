/* Initial values in database */
INSERT INTO dishes (name, description, price, type ) VALUES('Scrambled eggs', 'hen eggs', 8, 'breakfast');
INSERT INTO dishes (name, description, price, type ) VALUES('Fried eggs', 'hen eggs', 7, 'breakfast');
INSERT INTO dishes (name, description, price, type ) VALUES('Omelet', 'hen eggs', 9, 'breakfast');
INSERT INTO dishes (name, description, price, type ) VALUES('Hard-boiled eggs', 'hen eggs', 10, 'breakfast');
INSERT INTO dishes (name, description, price, type ) VALUES('Shrimps', 'sea fruit', 8, 'appetizers');
INSERT INTO dishes (name, description, price, type ) VALUES('Vanilla ice cream', 'made of ice', 7, 'appetizers');
INSERT INTO dishes (name, description, price, type ) VALUES('Pizza', 'with cheese', 11, 'appetizers');
INSERT INTO dishes (name, description, price, type ) VALUES('Pork chop', 'with salad and french fries', 8, 'dinner');
INSERT INTO dishes (name, description, price, type ) VALUES('Stone', 'with with water', 1000, 'dinner');
INSERT INTO dishes (name, description, price, type ) VALUES('Sand', 'everywhere', 1, 'dinner');

INSERT INTO users (phone_number, email, password, role ) VALUES(420420420, 'admin@admin.com', 'admin', 'admin');
INSERT INTO users (phone_number, email, password, role ) VALUES(213721372, 'maklowicz@mak.lowicz', 'eeeeeeeee', 'chef');
INSERT INTO users (phone_number, email, password, role ) VALUES(986724572, 'pascal@pas.cal', 'pascal', 'chef');
INSERT INTO users (phone_number, email, password, role ) VALUES(897356273, 'kelner@kelner.kelner', 'kelner', 'waiter');
INSERT INTO users (phone_number, email, password, role ) VALUES(897356273, 'rafal@brzo.zowski', 'brzo', 'waiter');
INSERT INTO users (phone_number, email, password, role ) VALUES(123456789, 'aaa@aaa.com', 'aaa', 'client');