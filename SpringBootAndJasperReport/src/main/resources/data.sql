create table if not exists persistent_logins (
  username varchar_ignorecase(100) not null,
  series varchar(64) primary key,
  token varchar(64) not null,
  last_used timestamp not null
  );

INSERT INTO Role VALUES (1, 'ADMIN');
INSERT INTO Role VALUES (2, 'DBA');
INSERT INTO Role VALUES (3, 'DEVELOPER');
INSERT INTO Role VALUES (4, 'USER');

INSERT INTO Employee(`Id`,`NAME`)
values(1,'Basant');
INSERT INTO Employee(`Id`,`NAME`) values(2,'Santosh');
INSERT INTO Employee(`Id`,`NAME`) values(3,'Arun');
