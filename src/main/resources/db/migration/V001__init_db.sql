create table tbl_users (
    id serial not null
        constraint tbl_users_id_pk primary key,
    name varchar(255) not null
);

create table tbl_alerts (
    id serial not null
        constraint tbl_alerts_id_pk primary key,
    fired boolean default false,
    user_id bigint not null
        constraint fk1_tbl_alerts__tbl_users_id references tbl_users
);

insert into tbl_users VALUES ( 1, 'test_user' );
insert into tbl_alerts VALUES ( 1, false, 1 );
