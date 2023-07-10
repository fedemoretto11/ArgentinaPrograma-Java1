-- A continuación, se deben realizar las siguientes consultas:
-- 1. Mostrar el nombre de todos los pokemon.
	/* SELECT
		nombre
    FROM pokemon */
    
-- 2. Mostrar los pokemon que pesen menos de 10k.
	/* SELECT
    *
    FROM pokemon
    WHERE peso < 10 */
    

-- 3. Mostrar los pokemon de tipo agua.
	/* SELECT
		p.nombre,
		t.nombre
    FROM pokemon p
    INNER JOIN pokemon_tipo tipo ON p.numero_pokedex = tipo.numero_pokedex 
    INNER JOIN tipo t ON t.id_tipo = tipo.id_tipo
    WHERE t.nombre = 'Agua' */


-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
	/* SELECT
		p.nombre,
		t.nombre
    FROM pokemon p
    INNER JOIN pokemon_tipo tipo ON p.numero_pokedex = tipo.numero_pokedex 
    INNER JOIN tipo t ON t.id_tipo = tipo.id_tipo
    WHERE t.nombre IN ('Agua', 'Fuego', 'Tierra')
    ORDER BY t.nombre ASC */


-- 5. Mostrar los pokemon que son de tipo fuego y volador.
	-- Ver como hacer mejor
	/* SELECT
		p.nombre,
		t.nombre
    FROM pokemon p
    INNER JOIN pokemon_tipo tipo ON p.numero_pokedex = tipo.numero_pokedex 
    INNER JOIN tipo t ON t.id_tipo = tipo.id_tipo
    WHERE t.nombre = 'Fuego' OR t.nombre = 'Volador'
    ORDER BY p.nombre ASC; */

    
-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.
	/* SELECT 
    * 
    FROM pokemon p
    INNER JOIN  estadisticas_base e ON p.numero_pokedex = e.numero_pokedex
    WHERE e.ps > 200 */


-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
	/* SELECT
    * 
    FROM pokemon p
	WHERE p.numero_pokedex = 
		(SELECT pokemon_origen FROM evoluciona_de WHERE pokemon_evolucionado = 
			(SELECT numero_pokedex FROM pokemon WHERE nombre = 'Arbok')
		); */

-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.
	/* SELECT
    *
    FROM pokemon p
    WHERE p.numero_pokedex IN
		(SELECT numero_pokedex FROM pokemon_forma_evolucion WHERE id_forma_evolucion IN 
			(SELECT id_forma_evolucion FROM forma_evolucion WHERE tipo_evolucion IN
				(SELECT id_tipo_evolucion FROM tipo_evolucion WHERE tipo_evolucion = 'Intercambio')
            )
		) */
        

-- 9. Mostrar el nombre del movimiento con más prioridad.
	/* SELECT
    m.nombre
    FROM movimiento m
    ORDER BY prioridad DESC
    LIMIT 1 */


-- 10. Mostrar el pokemon más pesado.
	/* SELECT
    *
    FROM pokemon
    ORDER BY peso DESC
    LIMIT 1 */


-- 11. Mostrar el nombre y tipo del ataque con más potencia.
	/* SELECT
		m.nombre,
        a.tipo
    FROM tipo_ataque a
    INNER JOIN tipo t ON a.id_tipo_ataque = t.id_tipo_ataque
    INNER JOIN movimiento m ON m.id_tipo = t.id_tipo
    ORDER BY m.potencia DESC
    LIMIT 1 */
    

-- 12. Mostrar el número de movimientos de cada tipo.
	/* SELECT
		t.nombre,
		COUNT(m.id_movimiento) as cantidadMovimientos
    FROM tipo_ataque a
    INNER JOIN tipo t ON a.id_tipo_ataque = t.id_tipo_ataque
    INNER JOIN movimiento m ON m.id_tipo = t.id_tipo
    GROUP BY t.id_tipo
    ORDER BY cantidadMovimientos DESC */


-- 13. Mostrar todos los movimientos que puedan envenenar.
	/* SELECT
    *
    FROM movimiento m
    WHERE descripcion LIKE '%envene%' */


-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
	/* SELECT
    *
    FROM movimiento m
    WHERE descripcion LIKE '%causa daño%'
    ORDER BY m.nombre */
    
    
-- 15. Mostrar todos los movimientos que aprende pikachu.
	/* SELECT
    *
    FROM movimiento m
	INNER JOIN pokemon_tipo t ON m.id_tipo = t.id_tipo
    INNER JOIN pokemon p ON t.numero_pokedex = p.numero_pokedex
    WHERE p.nombre = 'Pikachu' */
	

-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
	/* SELECT
    *
    FROM movimiento m
	INNER JOIN pokemon_tipo t ON m.id_tipo = t.id_tipo
    INNER JOIN pokemon p ON t.numero_pokedex = p.numero_pokedex
	INNER JOIN pokemon_movimiento_forma mf ON mf.id_movimiento = m.id_movimiento AND mf.numero_pokedex = p.numero_pokedex
    WHERE mf.id_forma_aprendizaje IN
		(SELECT id_forma_aprendizaje FROM forma_aprendizaje WHERE id_tipo_aprendizaje =
			(SELECT id_tipo_aprendizaje FROM tipo_forma_aprendizaje WHERE tipo_aprendizaje = 'MT')
        ) AND p.nombre = 'Pikachu'  */
    

-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.

	/* SELECT
    *
    FROM movimiento m
	INNER JOIN pokemon_tipo t ON m.id_tipo = t.id_tipo
    INNER JOIN tipo ti ON ti.id_tipo = t.id_tipo
    INNER JOIN pokemon p ON t.numero_pokedex = p.numero_pokedex
	INNER JOIN pokemon_movimiento_forma mf ON mf.id_movimiento = m.id_movimiento AND mf.numero_pokedex = p.numero_pokedex
    WHERE mf.id_forma_aprendizaje IN
		(SELECT id_forma_aprendizaje FROM forma_aprendizaje WHERE id_tipo_aprendizaje =
			(SELECT id_tipo_aprendizaje FROM tipo_forma_aprendizaje WHERE tipo_aprendizaje = 'nivel')
        ) 
        AND p.nombre = 'Pikachu'
        AND ti.nombre = 'Normal' */

		
-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
	/* SELECT
    *
    FROM movimiento m
    INNER JOIN movimiento_efecto_secundario s ON m.id_movimiento = s.id_movimiento
    WHERE s.probabilidad > 30 */


-- 19. Mostrar todos los pokemon que evolucionan por piedra.
	/* SELECT
    *
    FROM pokemon p
    INNER JOIN pokemon_forma_evolucion e ON p.numero_pokedex = e.numero_pokedex
	INNER JOIN forma_evolucion fe ON e.id_forma_evolucion = fe.id_forma_evolucion
    WHERE fe.tipo_evolucion =
		(SELECT id_tipo_evolucion FROM tipo_evolucion e WHERE e.tipo_evolucion = 'piedra'); */
        
    


-- 20. Mostrar todos los pokemon que no pueden evolucionar.
	/* SELECT
    *
    FROM pokemon p
    LEFT JOIN pokemon_forma_evolucion e ON p.numero_pokedex = e.numero_pokedex
    WHERE e.id_forma_evolucion IS NULL */

-- 21. Mostrar la cantidad de los pokemon de cada tipo.
	/* SELECT
		tipo.nombre,
		COUNT(p.numero_pokedex) as cantidadPokemon
    FROM pokemon p
    INNER JOIN pokemon_tipo t ON p.numero_pokedex = t.numero_pokedex
    INNER JOIN tipo tipo ON t.id_tipo = tipo.id_tipo
    GROUP BY tipo.nombre */