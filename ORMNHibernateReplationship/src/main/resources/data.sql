
DROP TABLE IF EXISTS Role;

CREATE TABLE Role (
  id integer not null auto_increment,
  name VARCHAR(250) NOT NULL
);

INSERT INTO Role VALUES (1, 'ADMIN');
INSERT INTO Role VALUES (2, 'DBA');
INSERT INTO Role VALUES (3, 'DEVELOPER');