use tfg;
INSERT INTO LIBRO(
    API_ID,
    ISBN,
    TITULO,
    AUTOR,
    EDITORIAL,
    NUM_PAGINAS,
    SINOPSIS,
    IMAGEN,
    FECHA_PUBLICACION,
    VALORACION
)
VALUES
(
    'ddb1',
    '9788408290674',
    'El diván de Beca',
    'Beca de @srtabebi',
    'Montena',
    320,
    'Novela juvenil con humor, romance y situaciones cotidianas.',
    'https://covers.openlibrary.org/b/isbn/9788408290674-L.jpg',
    '2024',
    4.1
);



INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO = 'El diván de Beca'
AND g.NOMBRE = 'Comedia';

DELETE FROM GENERO
WHERE NOMBRE = 'Hombres Lobo';

-- =====================================================
-- FISION DEL YO
-- =====================================================

INSERT INTO LIBRO(
    API_ID,
    ISBN,
    TITULO,
    AUTOR,
    EDITORIAL,
    NUM_PAGINAS,
    SINOPSIS,
    IMAGEN,
    FECHA_PUBLICACION,
    VALORACION
)
VALUES
(
    'fdy1',
    '9788411190732',
    'Fisión del yo',
    'Cristina Jiménez',
    'Destino',
    256,
    'Reflexión sobre la identidad, la mente y el crecimiento personal.',
    'https://covers.openlibrary.org/b/isbn/9788411190732-L.jpg',
    '2023',
    4.0
);

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Fisión del yo'
AND g.NOMBRE IN ('Filosofía','Psicología');



-- =====================================================
-- POR SI LAS VOCES VUELVEN
-- =====================================================

INSERT INTO LIBRO(
    API_ID,
    ISBN,
    TITULO,
    AUTOR,
    EDITORIAL,
    NUM_PAGINAS,
    SINOPSIS,
    IMAGEN,
    FECHA_PUBLICACION,
    VALORACION
)
VALUES
(
    'pslv1',
    '9788408252313',
    'Por si las voces vuelven',
    'Ángel Martín',
    'Planeta',
    256,
    'Relato autobiográfico donde Ángel Martín cuenta su brote psicótico y su recuperación.',
    'https://covers.openlibrary.org/b/isbn/9788408252313-L.jpg',
    '2021',
    4.8
);

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Por si las voces vuelven'
AND g.NOMBRE IN ('Biografía','Psicología');



-- =====================================================
-- SONRIE TODO VA A SALIR MAL
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Sonríe, todo va a salir mal'
AND g.NOMBRE='Poesía';



-- =====================================================
-- AMOR Y ASCO
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Amor y asco'
AND g.NOMBRE='Poesía';



-- =====================================================
-- NO PUEDO VIVIR SIN TI
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='No puedo vivir sin ti'
AND g.NOMBRE='Poesía';



-- =====================================================
-- CORRECCION OPERACION MANO MUERTA
-- =====================================================

UPDATE LIBRO
SET AUTOR = 'M.A. Rothman'
WHERE TITULO IN (
    'Operación Mano Muerta',
    'El infiltrado',
    'Nunca más',
    'La ciénaga'
);