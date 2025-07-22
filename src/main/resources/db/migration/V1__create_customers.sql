create table if not exists customers
(
    id           bigserial primary key,
    name         varchar(100),
    surname      varchar(100),
    age          int,
    phone_number varchar(20)
);