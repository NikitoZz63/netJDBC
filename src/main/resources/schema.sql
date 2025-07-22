create table if not exists customers
(
    id           bigserial primary key,
    name         varchar(100),
    surname      varchar(100),
    age          int,
    phone_number varchar(20)
);

create table if not exists orders
(
    id           bigserial primary key,
    date         timestamp,
    customer_id  int references customers (id),
    product_name text,
    amount       int
);