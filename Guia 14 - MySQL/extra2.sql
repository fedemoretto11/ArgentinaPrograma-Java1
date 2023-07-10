-- Abrir el script de la base de datos llamada “jardineria.sql” y ejecutarlo para crear todas las tablas e insertar datos en las mismas. Deberá obtener un diagrama de entidad relación igual al que se muestra a continuación:
-- A continuación, se deben realizar las siguientes consultas sobre la base de datos: Consultas sobre una tabla
-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
		/* SELECT 
			codigo_oficina as codigoOficina,
            ciudad
        FROM oficina */


-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
	/* SELECT 
		ciudad,
        telefono
	FROM oficina
    WHERE pais = 'España' */


-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
	/* SELECT
		nombre,
        CONCAT(nombre, ' ', apellido1, ' ', apellido2) as nombreCompleto,
        email,
        codigo_jefe
    FROM empleado
    WHERE codigo_jefe = 7 */


-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
	/* SELECT
		puesto,
        CONCAT(nombre, ' ', apellido1, ' ', apellido2) as nombreCompleto,
        email
    FROM empleado
    WHERE codigo_jefe IS NULL */


-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
	/* SELECT
		CONCAT(nombre, ' ', apellido1, ' ', apellido2) as nombreCompleto,
        puesto
    FROM empleado
    WHERE puesto != 'Representante Ventas' */


-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
	/* SELECT
		nombre_cliente,
        pais
    FROM cliente
    WHERE pais = 'Spain' */


-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
	/* SELECT distinct
		estado
    FROM pedido */


-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:
-- o Utilizando la función YEAR de MySQL.
-- o Utilizando la función DATE_FORMAT de MySQL.
-- o Sin utilizar ninguna de las funciones anteriores.

	-- YEAR
	/* SELECT DISTINCT 
		codigo_cliente
	FROM pago
	WHERE YEAR(fecha_pago) = 2008 */ 
    
    -- DATE_FORMAT
    /* SELECT DISTINCT 
		codigo_cliente
	FROM pago
	WHERE DATE_FORMAT(fecha_pago, '%Y') = '2008' */
    
    -- SIN FUNCION
    /* SELECT DISTINCT 
		codigo_cliente
	FROM pago
	WHERE fecha_pago LIKE '2008%' */


-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
	/* SELECT DISTINCT
		codigo_pedido,
        codigo_cliente,
        fecha_esperada,
        fecha_entrega
    FROM pedido
    WHERE fecha_esperada < fecha_entrega AND  estado = 'Entregado' */


-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada.
-- o Utilizando la función ADDDATE de MySQL.
-- o Utilizando la función DATEDIFF de MySQL.

	-- ADDDATE
	/* SELECT
		codigo_pedido,
        codigo_cliente,
        fecha_esperada,
        fecha_entrega
    FROM pedido
    WHERE estado = 'Entregado' AND fecha_entrega <= ADDDATE(fecha_esperada, INTERVAL -2 DAY) */
    
    -- DATEDIFF
    /* SELECT
		codigo_pedido,
        codigo_cliente,
        fecha_esperada,
        fecha_entrega
    FROM pedido
    WHERE estado = 'Entregado' AND DATEDIFF(fecha_esperada, fecha_entrega) >= 2 */


-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
	/* SELECT
    *
    FROM pedido
    WHERE YEAR(fecha_esperada) = 2009 AND estado = 'Rechazado' */


-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
	/* SELECT
    *
    FROM PEDIDO
    WHERE estado = 'Entregado' AND date_format(fecha_entrega, '%m') = '01' */


-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
	/* SELECT
    *
    FROM pago
    WHERE YEAR(fecha_pago) = 2008 AND forma_pago = 'PayPal'
    ORDER BY total DESC */


-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
	/* SELECT DISTINCT
		forma_pago
	FROM pago */


-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
	/* SELECT
    *
    FROM producto
    WHERE gama = 'Ornamentales' AND cantidad_en_stock > 100
    ORDER BY precio_venta DESC */


-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.
	/* SELECT
    *
    FROM cliente
    WHERE ciudad = 'Madrid' AND codigo_empleado_rep_ventas IN (11,30) */


-- Consultas multitabla (Composición interna)
-- Las consultas se deben resolver con INNER JOIN.
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
	/* SELECT
		c.nombre_cliente,
        e.nombre,
        e.apellido1,
        c.codigo_empleado_rep_ventas,
        e.codigo_empleado
    FROM cliente c
    INNER JOIN empleado e
    ON c.codigo_empleado_rep_ventas = e.codigo_empleado */


-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
	/* SELECT
		c.nombre_cliente,
        CONCAT(e.nombre, ' ', e.apellido1, ' ', e.apellido2) as nombreEmpleado,
        e.puesto
	FROM cliente c
    INNER JOIN pago p ON c.codigo_cliente = p.codigo_cliente
    INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado */


-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.

	-- NO ENCONTRE FORMA DE USAR CON INNER JOIN EL PAGO SOLO CON LEFT
	/* SELECT
		c.nombre_cliente,
        CONCAT(e.nombre, ' ', e.apellido1, ' ', e.apellido2) as nombreEmpleado
	FROM cliente c
    INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
    LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente
    WHERE p.codigo_cliente IS NULL */


-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
	/* SELECT
		c.nombre_cliente,
        CONCAT(e.nombre, ' ', e.apellido1, ' ', e.apellido2) as nombreEmpleado,
        o.codigo_oficina,
        o.ciudad
    FROM cliente c
    INNER JOIN pago p ON c.codigo_cliente = p.codigo_cliente
    INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
    INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina */


-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
	/* SELECT
		c.nombre_cliente,
        CONCAT(e.nombre, ' ', e.apellido1, ' ', e.apellido2) as nombreEmpleado,
        o.codigo_oficina,
        o.ciudad
	FROM cliente c
    INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
    LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente
    INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina
    WHERE p.codigo_cliente IS NULL */


-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
	/* SELECT
		o.linea_direccion1
    FROM oficina o 
	INNER JOIN empleado e ON e.codigo_oficina = o.codigo_oficina
    INNER JOIN cliente c ON c.codigo_empleado_rep_ventas = e.codigo_empleado
    WHERE c.ciudad = 'Fuenlabrada' */


-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
	/* SELECT
		c.nombre_cliente,
        CONCAT(e.nombre, ' ', e.apellido1, ' ', e.apellido2) as nombreEmpleado,
        o.ciudad
    FROM oficina o 
	INNER JOIN empleado e ON e.codigo_oficina = o.codigo_oficina
    INNER JOIN cliente c ON c.codigo_empleado_rep_ventas = e.codigo_empleado
    WHERE c.ciudad = 'Fuenlabrada' */


-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
	/* SELECT
		e.nombre as nombreEmpleado,
        e2.nombre as nombreJefe
    FROM empleado e
    INNER JOIN empleado e2 ON e.codigo_empleado = e2.codigo_jefe */


-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.	
	/* SELECT
		c.nombre_cliente
    FROM cliente c
    INNER JOIN pedido p ON p.codigo_cliente = c.codigo_cliente
    WHERE p.fecha_esperada < p.fecha_entrega AND  estado = 'Entregado' */


-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
	/* SELECT
		c.nombre_cliente,
        pro.gama
    FROM cliente c
    INNER JOIN pedido p ON c.codigo_cliente = p.codigo_cliente
    INNER JOIN detalle_pedido detalle ON detalle.codigo_pedido = p.codigo_pedido
    INNER JOIN producto pro ON pro.codigo_producto = detalle.codigo_producto */


-- Consultas multitabla (Composición externa)
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
	/* SELECT
    *
    FROM cliente c
    LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente
	WHERE p.codigo_cliente IS NULL */



-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
	/* SELECT
    *
    FROM cliente c
    LEFT JOIN pedido p ON c.codigo_cliente = p.codigo_cliente
	WHERE p.codigo_cliente IS NULL */
    
    
-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
	/* SELECT
    *
    FROM cliente c
    LEFT JOIN pedido pe ON c.codigo_cliente = pe.codigo_cliente
    LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente
    WHERE p.codigo_cliente IS NULL AND pe.codigo_cliente IS NULL */


-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
	-- estara bien?? me parece raro
	/* SELECT
    *
    FROM empleado e
    LEFT JOIN oficina o ON o.codigo_oficina = e.codigo_oficina
    WHERE e.codigo_oficina IS NULL */


-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
	/* SELECT
    *
    FROM empleado e
    LEFT JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas
    WHERE c.codigo_empleado_rep_ventas IS NULL */


-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
	/* SELECT
    *
    FROM empleado e
    LEFT JOIN oficina o ON o.codigo_oficina = e.codigo_oficina
    LEFT JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas
    WHERE e.codigo_oficina IS NULL AND c.codigo_empleado_rep_ventas IS NULL */


-- 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
	/* SELECT
    *
    FROM producto p
    LEFT JOIN detalle_pedido d ON d.codigo_producto = p.codigo_producto
    WHERE d.codigo_producto IS NULL */


-- 8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales.
	/* SELECT
		o.codigo_oficina
    FROM oficina o
	LEFT JOIN empleado e ON o.codigo_oficina = e.codigo_oficina
	LEFT JOIN cliente c ON c.codigo_empleado_rep_ventas = e.codigo_empleado
	LEFT JOIN pedido p ON p.codigo_cliente = c.codigo_cliente
	LEFT JOIN detalle_pedido detalle ON detalle.codigo_pedido = p.codigo_pedido
	LEFT JOIN producto prod ON prod.codigo_producto = detalle.codigo_producto
	WHERE prod.gama = 'Frutales' AND c.codigo_empleado_rep_ventas IS NULL */
    


-- 9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.
	/* SELECT
    *
    FROM cliente c
    INNER JOIN pedido p ON  c.codigo_cliente = p.codigo_cliente
    LEFT JOIN pago pa ON c.codigo_cliente = pa.codigo_cliente
    WHERE pa.codigo_cliente IS NULL */


-- 10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.
	/* SELECT
		e.codigo_empleado,
		CONCAT(e.nombre, ' ', e.apellido1, ' ', e.apellido2) AS nombreCompletoEmpleado,
		CONCAT(j.nombre, ' ', j.apellido1, ' ', j.apellido2) AS nombreCompletoJefe
    FROM empleado e
    LEFT JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas
    LEFT JOIN empleado j ON e.codigo_empleado = j.codigo_jefe
    WHERE c.codigo_empleado_rep_ventas IS NULL */


-- Consultas resumen
-- 1. ¿Cuántos empleados hay en la compañía?
	/* SELECT
		count(codigo_empleado) as cantidadEmpleados
    FROM empleado e */


-- 2. ¿Cuántos clientes tiene cada país?
	/* select
		count(codigo_cliente) as cantidadEmpleado,
        pais
    from cliente c
    group by pais
    order by cantidadEmpleado */


-- 3. ¿Cuál fue el pago medio en 2009?
	/* SELECT
		AVG(total) as promedio,
        YEAR(fecha_pago)
    FROM pago
	WHERE YEAR(fecha_pago) = 2009
    GROUP BY YEAR(fecha_pago) */
   


-- 4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos.
	/* SELECT
		COUNT(p.codigo_pedido) as cantidadPedidos,
        c.region
	FROM pedido p
    INNER JOIN cliente c ON c.codigo_cliente = p.codigo_cliente
    GROUP BY region
    ORDER BY cantidadPedidos DESC */


-- 5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
	/* SELECT
        MAX(p.precio_venta) as precioMaximo,
        MIN(p.precio_venta) as precioMinimo
    FROM producto p */


-- 6. Calcula el número de clientes que tiene la empresa.
	/* SELECT
		COUNT(c.codigo_cliente) as cantidadClientes
    FROM cliente c */


-- 7. ¿Cuántos clientes tiene la ciudad de Madrid?
	/* SELECT
		COUNT(c.codigo_cliente) as cantidadClientes,
        c.ciudad
    FROM cliente c
    WHERE c.ciudad = 'Madrid'
    GROUP BY c.ciudad */
    
    
    
-- 8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
	/* SELECT
		COUNT(c.codigo_cliente) as cantidadClientes,
        c.ciudad
    FROM cliente c
    WHERE c.ciudad LIKE 'M%'
    GROUP BY c.ciudad
    ORDER BY cantidadClientes */


-- 9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.
	/* SELECT
    e.nombre,
    COUNT(c.codigo_cliente) as cantidadClientes
    FROM empleado e
    INNER JOIN cliente c ON c.codigo_empleado_rep_ventas = e.codigo_empleado
    GROUP BY e.nombre */
    

-- 10. Calcula el número de clientes que no tiene asignado representante de ventas.
	/* SELECT
    c.nombre_cliente
    FROM cliente c 
    INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
    WHERE c.codigo_empleado_rep_ventas IS NULL */


-- 11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado deberá mostrar el nombre y los apellidos de cada cliente.
	/* SELECT
		c.nombre_cliente,
        MIN(p.fecha_pago) as primerPago,
        MAX(p.fecha_pago) as ultimoPago
    FROM cliente c
    LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente
    GROUP BY c.nombre_cliente
    ORDER BY c.nombre_cliente */


-- 12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
	/* SELECT DISTINCT
		p.codigo_pedido,
        COUNT(codigo_producto) as cantidadProductos
    FROM detalle_pedido p
    GROUP BY p.codigo_pedido */
    

-- 13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.
	/* SELECT
		p.codigo_pedido,
        SUM(cantidad) as sumaProductos
    FROM detalle_pedido p
	GROUP BY p.codigo_pedido */
    
    
-- 14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que se han vendido de cada uno. El listado deberá estar ordenado por el número total de unidades vendidas.
	/* SELECT
	d.codigo_producto,
    p.nombre,
    SUM(cantidad) as cantidadVendidas
    FROM detalle_pedido d
    INNER JOIN producto p ON d.codigo_producto = p.codigo_producto
    GROUP BY d.codigo_producto
    ORDER BY cantidadVendidas DESC */


-- 15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base imponible, y el total la suma de los dos campos anteriores.
	/* SELECT
		SUM(d.cantidad * p.precio_venta) as baseImponible,
		SUM(d.cantidad * p.precio_venta) * 0.21 as IVA,
        SUM(d.cantidad * p.precio_venta) * 1.21 as totalFacturado
    FROM detalle_pedido d
    INNER JOIN producto p ON d.codigo_producto = p.codigo_producto */


-- 16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
	/* SELECT
		p.codigo_producto,
		SUM(d.cantidad * p.precio_venta) as baseImponible,
		SUM(d.cantidad * p.precio_venta) * 0.21 as IVA,
        SUM(d.cantidad * p.precio_venta) * 1.21 as totalFacturado
    FROM detalle_pedido d
    INNER JOIN producto p ON d.codigo_producto = p.codigo_producto
    GROUP BY p.codigo_producto */


-- 17. La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR.
	/* SELECT
		p.codigo_producto,
		SUM(d.cantidad * p.precio_venta) as baseImponible,
		SUM(d.cantidad * p.precio_venta) * 0.21 as IVA,
        SUM(d.cantidad * p.precio_venta) * 1.21 as totalFacturado
    FROM detalle_pedido d
    INNER JOIN producto p ON d.codigo_producto = p.codigo_producto
    WHERE p.codigo_producto LIKE 'OR%'
    GROUP BY p.codigo_producto */
    
    
-- 18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA)
	/* SELECT
		p.nombre as nombreProducto,
		p.codigo_producto as codigoProducto,
        SUM(d.cantidad) as cantidadVendida,
		SUM(d.cantidad * p.precio_venta) as baseImponible,
        SUM(d.cantidad * p.precio_venta) * 1.21 as totalFacturado
    FROM detalle_pedido d
    INNER JOIN producto p ON d.codigo_producto = p.codigo_producto
    GROUP BY p.codigo_producto
    HAVING SUM(d.cantidad * p.precio_venta) > 3000
    ORDER BY baseImponible */


-- Subconsultas con operadores básicos de comparación
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
	/* SELECT
    nombre_cliente,
    limite_credito
    FROM cliente
    WHERE limite_credito = 
		(SELECT MAX(limite_credito) FROM cliente) */



-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
	/* SELECT
		nombre,
        precio_proveedor,
        precio_venta
    FROM producto
    WHERE precio_venta = 
		(SELECT MAX(precio_venta) FROM producto) */


-- 3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta que tendrá que calcular cuál es el número total de unidades que se han vendido de cada producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código del producto, puede obtener su nombre fácilmente.)
	/* SELECT
		p.nombre,
        d.cantidad
    FROM detalle_pedido d
    INNER JOIN producto p ON d.codigo_producto = p.codigo_producto
    WHERE cantidad = (SELECT MAX(cantidad) FROM detalle_pedido) */



-- 4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN).
	/* SELECT
		cliente.nombre_cliente
    FROM cliente
    WHERE limite_credito > (SELECT MAX(total) FROM pago) */


-- 5. Devuelve el producto que más unidades tiene en stock.
	/* SELECT
		nombre,
        cantidad_en_stock
    FROM producto
    WHERE cantidad_en_stock = (SELECT MAX(cantidad_en_stock) FROM producto) */


-- 6. Devuelve el producto que menos unidades tiene en stock.
	/* SELECT
		nombre,
        cantidad_en_stock
    FROM producto
    WHERE cantidad_en_stock = (SELECT MIN(cantidad_en_stock) FROM producto) */
    
    
-- 7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.
	/* SELECT
		nombre,
        apellido1,
        apellido2,
        email
    FROM empleado
    WHERE codigo_jefe = 
			(SELECT 
			codigo_empleado 
            FROM empleado
			WHERE nombre = 'Alberto' AND apellido1 = 'Soria') */


-- Subconsultas con ALL y ANY
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
	/* SELECT 
		nombre_cliente
	FROM cliente c
	WHERE limite_credito >= ALL (SELECT limite_credito FROM cliente) */



-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
	/* SELECT
		p.nombre,
        p.precio_venta
    FROM producto p
    WHERE precio_venta >= ALL (SELECT precio_venta FROM producto) */


-- 3. Devuelve el producto que menos unidades tiene en stock. Subconsultas con IN y NOT IN
	/* SELECT
    *
    FROM producto
    WHERE cantidad_en_stock IN (SELECT MAX(cantidad_en_stock) FROM producto) */


-- 1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente.
	/* SELECT
	*
    FROM empleado e
    WHERE codigo_empleado NOT IN (SELECT codigo_empleado_rep_ventas FROM cliente c); */
    
	
-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
	/* SELECT
    *
    FROM cliente
    WHERE codigo_cliente NOT IN (SELECT codigo_cliente from pago) */


-- 3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
	/* SELECT
    *
    FROM cliente
    WHERE codigo_cliente IN (SELECT codigo_cliente from pago) */


-- 4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
	/* SELECT
    *
    FROM producto
    WHERE codigo_producto NOT IN (SELECT codigo_producto FROM detalle_pedido) */


-- 5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente. Subconsultas con EXISTS y NOT EXISTS
	/* SELECT 
    *
	FROM empleado
	WHERE puesto = 'Representante Ventas'
    AND NOT EXISTS (
        SELECT 
        *
        FROM cliente
        WHERE codigo_empleado_rep_ventas = empleado.codigo_empleado
    ) */

-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
	/* SELECT
    *
    FROM cliente
    WHERE NOT EXISTS (SELECT codigo_cliente from pago WHERE pago.codigo_cliente = cliente.codigo_cliente) */
    
    
-- 2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
	/* SELECT
    *
    FROM cliente
    WHERE EXISTS (SELECT codigo_cliente from pago WHERE pago.codigo_cliente = cliente.codigo_cliente) */
    
    
-- 3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
	/*SELECT 
	*
	FROM producto p
	WHERE NOT EXISTS (SELECT *
					  FROM detalle_pedido dp
					  WHERE dp.codigo_producto = p.codigo_producto) */


-- 4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.
	/*SELECT 
	*
	FROM producto p
	WHERE EXISTS (SELECT *
					  FROM detalle_pedido dp
					  WHERE dp.codigo_producto = p.codigo_producto) */
