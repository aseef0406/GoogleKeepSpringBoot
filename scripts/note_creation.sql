use googlekeep;
CREATE TABLE tbl_note (
   noted_id  char(9),
   title varchar(50),
  message varchar(1000),
  status int,
 reminder_id char(9),
 label_id char(9),
 user_id char(9),
 collabrators_id varchar(100),
 created_time varchar(20),
 updated_time varchar(20)
);