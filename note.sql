
1.bootstrap source: https://startbootstrap.com/previews/sb-admin-2
--create database schedule;
use schedule;

  insert into user values("dalkahn","dal","summersoftsky@email.com",'2024-03-23');
  insert into availability values ('slkdn111',"dalkahn",'2024-03-05',1,0,1,0,0,0,0,1,1,now());
  insert into availability values ('slkdn112',"dalkahn",'2024-03-05',0,0,0,1,0,0,0,1,1,now());
  insert into availability values ('slkdn113',"dalkahn",'2024-03-06',0,0,1,1,1,0,0,1,1,now());
  insert into availability values ('slkdn114',"dalkahn",'2024-03-07',0,0,1,0,0,0,0,1,0,now());
  insert into availability values ('slkdn115',"dalkahn",'2024-03-08',0,0,1,0,0,0,0,1,0,now());
  insert into availability values ('slkdn116',"dalkahn",'2024-03-09',0,0,1,0,0,0,1,1,0,now());
  insert into availability values ('slkdn117',"dalkahn",'2024-03-10',1,0,1,0,0,0,1,0,0,now());
  insert into availability values ('slkdn118',"dalkahn",'2024-03-11',1,0,1,0,0,0,1,0,1,now());
  insert into availability values ('slkdn119',"dalkahn",'2024-03-12',1,0,1,0,0,0,1,0,1,now());
  insert into availability values ('slkdn120',"dalkahn",'2024-03-13',0,0,1,0,0,0,1,0,1,now());
  insert into availability values ('slkdn121',"dalkahn",'2024-03-14',0,0,0,0,1,1,1,0,1,now());
  insert into availability values ('slkdn122',"dalkahn",'2024-03-15',0,0,0,0,1,1,0,0,1,now());
  insert into availability values ('slkdn123',"dalkahn",'2024-03-16',0,0,0,0,1,1,0,1,1,now());
  insert into availability values ('slkdn124',"dalkahn",'2024-03-17',1,0,0,0,1,1,0,1,1,now());

  
  use schedule;

CREATE TABLE user(                               
  userId VARCHAR(300) NOT NULL,        /*up to 300 chars*/        
  name VARCHAR(300) NOT NULL,                          
  email VARCHAR(300) NULL,                                                     
  signupDate  DATETIME,                                     
  CONSTRAINT testTable_PK PRIMARY KEY(userId)             
);

-- password column addition
ALTER TABLE user
ADD COLUMN password VARCHAR(300) 
AFTER userid;

UPDATE user
SET password = 1234
WHERE userId="dalkahn";


select * from user;



select * from availability;
ALTER TABLE availability RENAME COLUMN created_by TO userId;

-- alter table 테이블이름 add FOREIGN KEY(columnName) REFERENCES 참조테이블(참조컬럼);
alter table availability add FOREIGN KEY(userId) REFERENCES user(userId);

-- schedule.availability definition

CREATE TABLE availability (
   id varchar(300) primary key not null,
  userId varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  date date DEFAULT NULL,
  s1011 tinyint(1) DEFAULT NULL,
  s1213 tinyint(1) DEFAULT NULL,
  s1415 tinyint(1) DEFAULT NULL,
  s1617 tinyint(1) DEFAULT NULL,
  s1819 tinyint(1) DEFAULT NULL,
  s2021 tinyint(1) DEFAULT NULL,
  s2122 tinyint(1) DEFAULT NULL,
  s2223 tinyint(1) DEFAULT NULL,
  s2324 tinyint(1) DEFAULT NULL,
  updated_at timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


  
  
