-- Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e
-- insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
-- obtener un diagrama de entidad relación igual al que se muestra a continuación:
-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
	/* SELECT
		*
	FROM jugadores
    ORDER BY Nombre ASC */


-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
	/* SELECT
		*
	FROM jugadores
    WHERE Posicion = 'C' AND Peso > 200
    ORDER BY Nombre */


-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
	/* SELECT
		*
	FROM equipos
    ORDER BY Nombre */


-- 4. Mostrar el nombre de los equipos del este (East).
	/* SELECT
		*
	FROM equipos
	WHERE Conferencia = 'East'
    ORDER BY Nombre */


-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
	/* SELECT *
    FROM equipos
    WHERE Ciudad LIKE 'C%'
    ORDER BY Nombre */


-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
	/* SELECT Nombre, Nombre_equipo
    FROM jugadores
    ORDER BY Nombre_equipo */


-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
	/* SELECT * 
    FROM jugadores
    WHERE Nombre_equipo = 'Raptors'
    ORDER BY Nombre */


-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
	/* SELECT 
		Puntos_por_partido 
    FROM estadisticas
    WHERE jugador = (SELECT codigo FROM jugadores WHERE Nombre = 'Pau Gasol') */

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
	/* SELECT 
		Puntos_por_partido as Puntos_Por_Partido,
        temporada as Temporada
    FROM estadisticas
    WHERE jugador = (SELECT codigo FROM jugadores WHERE Nombre = 'Pau Gasol') 
    AND temporada = '04/05' */


-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
	/* SELECT 
		jugadores.Nombre,
        round(sum((Puntos_por_partido))) as Puntos_Totales
	FROM estadisticas
    LEFT JOIN jugadores
    ON estadisticas.jugador = jugadores.codigo
    GROUP BY jugadores.Nombre */


-- 11. Mostrar el número de jugadores de cada equipo.
	/* SELECT 
		COUNT(Nombre) AS CantidadJugadores,
        Nombre_equipo
	FROM jugadores
    GROUP BY Nombre_equipo */


-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
	/* SELECT 
		jugadores.Nombre,
        round(sum((Puntos_por_partido))) as Puntos_Totales
	FROM estadisticas
    LEFT JOIN jugadores
    ON estadisticas.jugador = jugadores.codigo
    GROUP BY jugadores.Nombre 
    ORDER BY Puntos_Totales DESC
    LIMIT 1 */


-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
	/* SELECT
		jugadores.Nombre AS NombreJugador,
        jugadores.Altura AS Altura,
		equipos.Nombre AS NombreEquipo,
        equipos.Conferencia AS Conferencia,
        equipos.Division AS Division
	FROM jugadores
    INNER JOIN equipos
    ON jugadores.Nombre_equipo = equipos.Nombre
    ORDER BY jugadores.Altura DESC
    LIMIT 1 */


-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
	/* SELECT
		equipo_local,
        equipo_visitante,
        puntos_local,
        puntos_visitante,
        CASE
			WHEN puntos_local > puntos_visitante THEN puntos_local - puntos_visitante
            WHEN puntos_visitante > puntos_local THEN puntos_visitante - puntos_local
            ELSE 0
		END AS Diferencia
	FROM partidos
    ORDER BY Diferencia DESC
    LIMIT 4 */
    

-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
/* SELECT
		codigo,
        equipo_local,
        equipo_visitante,
        puntos_local,
        puntos_visitante,
        CASE
			WHEN puntos_local > puntos_visitante THEN equipo_local
            WHEN puntos_visitante > puntos_local THEN equipo_visitante
            ELSE NULL
		END AS Ganador
	FROM partidos */