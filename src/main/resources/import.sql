-- Insert role
insert into role (name) values ('ROLE_ADMIN');

-- Insert users
insert into user (username,enabled,password,role_id) values ('admin',true,'password',1);

-- Insert customers
insert into customer (firstname,lastname,mobilenumber,reasonforvisit,checkintime,place) values ('Vikram','Hegde','3143152856','billingpayment',CURRENT_TIMESTAMP(),0)
insert into customer (firstname,lastname,mobilenumber,reasonforvisit,checkintime,place) values ('Yuri','Khechoyan','3123142896','techsupport',CURRENT_TIMESTAMP(),0)
insert into customer (firstname,lastname,mobilenumber,reasonforvisit,checkintime,place) values ('Zahid','Anwar','8473123456','acctissues',CURRENT_TIMESTAMP(),0)