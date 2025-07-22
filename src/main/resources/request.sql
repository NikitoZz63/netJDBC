select product_name
from orders
         inner join customers
                    on customers.id = orders.customer_id
where customers.name ~* ?;