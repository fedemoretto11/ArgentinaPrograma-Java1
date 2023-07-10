-- 1. Obtener los datos completos de los empleados.
	/* SELECT nombre FROM empleados
	ORDER BY nombre; */


-- 2. Obtener los datos completos de los departamentos.
	/* SELECT * from departamentos; */
    

-- 3. Listar el nombre de los departamentos.
	/* SELECT nombre_depto FROM departamentos */
    
    
-- 4. Obtener el nombre y salario de todos los empleados.
	/* SELECT nombre,sal_emp FROM empleados */


-- 5. Listar todas las comisiones.
	/* SELECT nombre, comision_emp FROM empleados */
	


-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
	/* SELECT * from empleados
    WHERE cargo_emp = 'Secretaria' */


-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
	/* SELECT * FROM empleados
	WHERE cargo_emp = 'Vendedor'
    ORDER BY nombre ASC; */


-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
	/* SELECT nombre, cargo_emp, sal_emp from empleados
    ORDER BY sal_emp ASC */


-- 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”
	/* SELECT * from departamentos
    WHERE ciudad = 'CIUDAD REAL' */
    

-- 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.
	/* SELECT 	nombre AS 'Nombre', 
			cargo_emp AS 'Cargo' 
    FROM empleados */


-- 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.
	/* SELECT nombre AS 'Nombre', sal_emp as 'Salario', comision_emp as 'Comision' FROM empleados
    WHERE id_depto = 2000
    ORDER BY comision_emp ASC */


-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético.
	/* SELECT nombre as 'Nombre' , (sal_emp + comision_emp + 500) as 'Total a Pagar' from empleados
	WHERE id_depto = 3000
    ORDER BY Nombre ASC */


-- 13. Muestra los empleados cuyo nombre empiece con la letra J.
	/* select * from empleados
    where nombre LIKE 'J%' */


-- 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.
	/* SELECT nombre, sal_emp as 'salario', comision_emp as 'comision', (sal_emp + comision_emp) as 'salario total' from empleados
    WHERE comision_emp >= 1000
    order by comision_emp asc */
	

-- 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
	/* SELECT nombre, sal_emp as 'salario', comision_emp as 'comision', (sal_emp + comision_emp) as 'salario total' from empleados
    WHERE comision_emp = 0
    order by comision_emp asc */


-- 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
	/* SELECT nombre, sal_emp, comision_emp FROM empleados
    WHERE comision_emp > sal_emp
    ORDER BY comision_emp ASC */


-- 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
	/* SELECT nombre, sal_emp, comision_emp, (sal_emp * 0.3) AS '30%' FROM empleados
    WHERE comision_emp <= (sal_emp * 0.3)
    ORDER BY comision_emp ASC */
    


-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA”
	/* SELECT nombre FROM empleados
    WHERE nombre NOT LIKE '%MA%' */


--  19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento.
	/* SELECT  * FROM departamentos
    WHERE nombre_depto = 'VENTAS' OR nombre_depto = 'INVESTIGACIÓN' OR nombre_depto = 'MANTENIMIENTO' */


-- 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.
	/* SELECT  * FROM departamentos
    WHERE nombre_depto != 'VENTAS' AND nombre_depto != 'INVESTIGACIÓN' AND nombre_depto != 'MANTENIMIENTO' */
    
    
-- 21. Mostrar el salario más alto de la empresa.
	/* SELECT nombre, sal_emp FROM empleados
	ORDER BY sal_emp DESC
    LIMIT 1 */
	


-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético.
	/* SELECT * FROM empleados
    ORDER BY nombre DESC
    LIMIT 1 */


-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
	/* SELECT
		MAX(sal_emp) as salario_maximo,
		MIN(sal_emp) as salario_minimo,
        MAX(sal_emp) - MIN(sal_emp) as diferencia
	FROM empleados */
    
-- 24. Hallar el salario promedio por departamento.
	/* SELECT
		id_depto,
		AVG(sal_emp) as salario_promedio
    FROM empleados GROUP BY id_depto */

-- Consultas con Having
-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
	/* SELECT id_depto, COUNT(*) AS num_empleados FROM empleados
	GROUP BY id_depto HAVING COUNT(*) > 3; */
	

-- 26. Hallar los departamentos que no tienen empleados
	/* SELECT id_depto, COUNT(*) AS num_empleados FROM empleados
	GROUP BY id_depto HAVING COUNT(*) = 0; */

-- Consulta con Subconsulta

-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
	SELECT * FROM empleados
    WHERE sal_emp > (SELECT AVG(sal_emp) FROM empleados)



