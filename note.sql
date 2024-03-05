1.bootstrap source: https://startbootstrap.com/previews/sb-admin-2
--create database schedule;
use schedule;

  insert into availability values ('2024-03-05',1,0,1,0,0,0,0,1,1,"dal",now());
  insert into availability values ('2024-03-05',0,0,0,1,0,0,0,1,1,"dal",now());
  insert into availability values ('2024-03-06',0,0,1,1,1,0,0,1,1,"dal",now());
  insert into availability values ('2024-03-07',0,0,1,0,0,0,0,1,0,"dal",now());
  insert into availability values ('2024-03-08',0,0,1,0,0,0,0,1,0,"dal",now());
  insert into availability values ('2024-03-09',0,0,1,0,0,0,1,1,0,"dal",now());
  insert into availability values ('2024-03-10',1,0,1,0,0,0,1,0,0,"dal",now());
  insert into availability values ('2024-03-11',1,0,1,0,0,0,1,0,1,"dal",now());
  insert into availability values ('2024-03-12',1,0,1,0,0,0,1,0,1,"dal",now());
  insert into availability values ('2024-03-13',0,0,1,0,0,0,1,0,1,"dal",now());
  insert into availability values ('2024-03-14',0,0,0,0,1,1,1,0,1,"dal",now());
  insert into availability values ('2024-03-15',0,0,0,0,1,1,0,0,1,"dal",now());
  insert into availability values ('2024-03-16',0,0,0,0,1,1,0,1,1,"dal",now());
  insert into availability values ('2024-03-17',1,0,0,0,1,1,0,1,1,"dal",now());

  
  select * from availability;
  
  
  
