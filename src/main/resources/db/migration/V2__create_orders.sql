create table if not exists orders
(
    id           bigserial primary key,
    date         timestamp,
    customer_id  int references customers (id),
    product_name text,
    amount       int
);