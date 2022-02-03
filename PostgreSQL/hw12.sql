-- 1. Command
SELECT COUNT(*) FROM film WHERE length > (SELECT AVG(length) FROM film);

-- 2. Command
SELECT COUNT(*) FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);

-- 3. Command
SELECT COUNT(*) FROM film WHERE (rental_rate = (SELECT MIN(rental_rate) FROM film)) AND (replacement_cost = (SELECT MIN(replacement_cost) FROM film));

-- 4. Command
SELECT customer_id,amount
FROM payment
WHERE (customer_id, amount) IN
(
	SELECT COUNT(customer_id), MAX(amount)
	FROM payment 
	GROUP BY customer_id
	ORDER BY COUNT(customer_id) DESC
	LIMIT 1
);