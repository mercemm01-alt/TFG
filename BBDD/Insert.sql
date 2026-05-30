Use tfg;

INSERT INTO GENERO (NOMBRE) VALUES ('Fantasía');
INSERT INTO GENERO (NOMBRE) VALUES ('Fantasía Épica');
INSERT INTO GENERO (NOMBRE) VALUES ('Paranormal');
INSERT INTO GENERO (NOMBRE) VALUES ('Romance');
INSERT INTO GENERO (NOMBRE) VALUES ('Dark Romance');
INSERT INTO GENERO (NOMBRE) VALUES ('Romance Histórico');
INSERT INTO GENERO (NOMBRE) VALUES ('Erótico');
INSERT INTO GENERO (NOMBRE) VALUES ('Terror');
INSERT INTO GENERO (NOMBRE) VALUES ('Misterio');
INSERT INTO GENERO (NOMBRE) VALUES ('Thriller');
INSERT INTO GENERO (NOMBRE) VALUES ('Policíaco');
INSERT INTO GENERO (NOMBRE) VALUES ('Novela Negra');
INSERT INTO GENERO (NOMBRE) VALUES ('Psicológico');
INSERT INTO GENERO (NOMBRE) VALUES ('Ciencia Ficción');
INSERT INTO GENERO (NOMBRE) VALUES ('Distopía');
INSERT INTO GENERO (NOMBRE) VALUES ('Aventura');
INSERT INTO GENERO (NOMBRE) VALUES ('Acción');
INSERT INTO GENERO (NOMBRE) VALUES ('Drama');
INSERT INTO GENERO (NOMBRE) VALUES ('Humor');
INSERT INTO GENERO (NOMBRE) VALUES ('Comedia');
INSERT INTO GENERO (NOMBRE) VALUES ('Novela Histórica');
INSERT INTO GENERO (NOMBRE) VALUES ('Contemporáneo');
INSERT INTO GENERO (NOMBRE) VALUES ('Juvenil');
INSERT INTO GENERO (NOMBRE) VALUES ('Infantil');
INSERT INTO GENERO (NOMBRE) VALUES ('Mitología');
INSERT INTO GENERO (NOMBRE) VALUES ('Sobrenatural');
INSERT INTO GENERO (NOMBRE) VALUES ('Vampiros');
INSERT INTO GENERO (NOMBRE) VALUES ('Hombres Lobo');
INSERT INTO GENERO (NOMBRE) VALUES ('LGBTQ+');
INSERT INTO GENERO (NOMBRE) VALUES ('Ficción');
INSERT INTO GENERO (NOMBRE) VALUES ('No Ficción');
INSERT INTO GENERO (NOMBRE) VALUES ('Poesía');
INSERT INTO GENERO (NOMBRE) VALUES ('Filosofía');
INSERT INTO GENERO (NOMBRE) VALUES ('Psicología');
INSERT INTO GENERO (NOMBRE) VALUES ('Autoayuda');
INSERT INTO GENERO (NOMBRE) VALUES ('Desarrollo Personal');
INSERT INTO GENERO (NOMBRE) VALUES ('Biografía');
INSERT INTO GENERO (NOMBRE) VALUES ('Manga');
INSERT INTO GENERO (NOMBRE) VALUES ('Cómic');
INSERT INTO GENERO (NOMBRE) VALUES ('Novela Gráfica');
INSERT INTO GENERO (NOMBRE) VALUES ('Superhéroes');

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Harry Potter', 'SAGA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('zyTCAlFPjgYC','9788478884452','Harry Potter y la piedra filosofal','J.K. Rowling','Salamandra',256,'Harry descubre que es un mago y comienza su aventura en Hogwarts.','https://covers.openlibrary.org/b/isbn/9788478884452-L.jpg','1997',4.8),
('mMluAAAAMAAJ','9788478884957','Harry Potter y la cámara secreta','J.K. Rowling','Salamandra',288,'Harry regresa a Hogwarts donde una amenaza acecha el castillo.','https://covers.openlibrary.org/b/isbn/9788478884957-L.jpg','1998',4.8),
('N2b8PQAACAAJ','9788478885190','Harry Potter y el prisionero de Azkaban','J.K. Rowling','Salamandra',359,'Sirius Black escapa de Azkaban.','https://covers.openlibrary.org/b/isbn/9788478885190-L.jpg','1999',4.9),
('1RnDwQEACAAJ','9788478886548','Harry Potter y el cáliz de fuego','J.K. Rowling','Salamandra',636,'Harry participa en el Torneo de los Tres Magos.','https://covers.openlibrary.org/b/isbn/9788478886548-L.jpg','2000',4.9),
('w5R9oQEACAAJ','9788478887422','Harry Potter y la Orden del Fénix','J.K. Rowling','Salamandra',893,'Voldemort ha regresado y el Ministerio lo niega.','https://covers.openlibrary.org/b/isbn/9788478887422-L.jpg','2003',4.9),
('4vDfAAAACAAJ','9788478889907','Harry Potter y el misterio del príncipe','J.K. Rowling','Salamandra',607,'Harry descubre secretos sobre Voldemort.','https://covers.openlibrary.org/b/isbn/9788478889907-L.jpg','2005',4.9),
('O7A6cQAACAAJ','9788498381405','Harry Potter y las reliquias de la muerte','J.K. Rowling','Salamandra',759,'La batalla final contra Voldemort comienza.','https://covers.openlibrary.org/b/isbn/9788498381405-L.jpg','2007',5.0);

INSERT INTO LIBRO_SAGA (LIBRO_ID,SAGA_ID,NUMERO_ORDEN)
VALUES
(1,1,1),
(2,1,2),
(3,1,3),
(4,1,4),
(5,1,5),
(6,1,6),
(7,1,7);

-- =========================
-- SAGA LOS JUEGOS DEL HAMBRE
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Los Juegos del Hambre', 'TRILOGIA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('jAuYlvQxZ78C','9788427202122','Los Juegos del Hambre','Suzanne Collins','Molino',396,'Katniss Everdeen participa en un juego mortal televisado.','https://covers.openlibrary.org/b/isbn/9788427202122-L.jpg','2008',4.7),
('B09R4Y6K8N','9788427202139','En llamas','Suzanne Collins','Molino',416,'Katniss se convierte en símbolo de rebelión.','https://covers.openlibrary.org/b/isbn/9788427202139-L.jpg','2009',4.8),
('B0044787K8','9788427202146','Sinsajo','Suzanne Collins','Molino',424,'La guerra definitiva contra el Capitolio comienza.','https://covers.openlibrary.org/b/isbn/9788427202146-L.jpg','2010',4.7),
('B08XYZHG12','9788427203181','Balada de pájaros cantores y serpientes','Suzanne Collins','Molino',592,'Precuela centrada en Snow.','https://covers.openlibrary.org/b/isbn/9788427203181-L.jpg','2020',4.5);

INSERT INTO LIBRO_SAGA (LIBRO_ID,SAGA_ID,NUMERO_ORDEN)
VALUES
(8,2,1),
(9,2,2),
(10,2,3),
(11,2,0);

-- =========================
-- SAGA CREPUSCULO
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Crepúsculo', 'SAGA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('xC63EAAAQBAJ','9788420469287','Crepúsculo','Stephenie Meyer','Alfaguara',512,'Bella Swan se enamora de un vampiro.','https://covers.openlibrary.org/b/isbn/9788420469287-L.jpg','2005',4.4),
('xC63EAAAQBA2','9788420467290','Luna Nueva','Stephenie Meyer','Alfaguara',576,'Bella cae en depresión tras la marcha de Edward.','https://covers.openlibrary.org/b/isbn/9788420467290-L.jpg','2006',4.3),
('xC63EAAAQBA3','9788420467306','Eclipse','Stephenie Meyer','Alfaguara',624,'Bella debe elegir entre Edward y Jacob.','https://covers.openlibrary.org/b/isbn/9788420467306-L.jpg','2007',4.4),
('xC63EAAAQBA4','9788420467313','Amanecer','Stephenie Meyer','Alfaguara',832,'Bella y Edward afrontan nuevos peligros.','https://covers.openlibrary.org/b/isbn/9788420467313-L.jpg','2008',4.5),
('xC63EAAAQBA5','9788420460529','Sol de medianoche','Stephenie Meyer','Alfaguara',864,'Historia de Crepúsculo desde la perspectiva de Edward.','https://covers.openlibrary.org/b/isbn/9788420460529-L.jpg','2020',4.6);

INSERT INTO LIBRO_SAGA (LIBRO_ID,SAGA_ID,NUMERO_ORDEN)
VALUES
(12,3,1),
(13,3,2),
(14,3,3),
(15,3,4),
(16,3,5);




-- =========================
-- EL PRINCIPITO
-- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('yQ7XAAAAMAAJ','9788478887194','El Principito','Antoine de Saint-Exupéry','Salamandra',96,'Un clásico filosófico sobre la amistad y la vida.','https://covers.openlibrary.org/b/isbn/9788478887194-L.jpg','1943',4.9);



-- =========================
-- HABITOS ATOMICOS
-- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('H6J-DwAAQBAJ','9788418118036','Hábitos Atómicos','James Clear','Diana',328,'Método práctico para crear buenos hábitos y eliminar malos hábitos.','https://covers.openlibrary.org/b/isbn/9788418118036-L.jpg','2018',4.9);


-- =========================
-- PADRE RICO PADRE POBRE
-- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('vGKAzwEACAAJ','9788466332125','Padre rico, padre pobre','Robert T. Kiyosaki','Debolsillo',272,'Libro sobre educación financiera y mentalidad económica.','https://covers.openlibrary.org/b/isbn/9788466332125-L.jpg','1997',4.7);



-- =========================
-- LA PACIENTE SILENCIOSA
-- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('QvW7DwAAQBAJ','9788420433189','La paciente silenciosa','Alex Michaelides','Alfaguara',400,'Una pintora asesina a su marido y deja de hablar.','https://covers.openlibrary.org/b/isbn/9788420433189-L.jpg','2019',4.6);


-- =========================
-- SAGA ACOTAR
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Una corte de rosas y espinas', 'SAGA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('acotar1','9788408177791','Una corte de rosas y espinas','Sarah J. Maas','Crossbooks',456,'Feyre es llevada al mundo feérico tras matar un lobo.','https://covers.openlibrary.org/b/isbn/9788408177791-L.jpg','2015',4.8),
('acotar2','9788408177807','Una corte de niebla y furia','Sarah J. Maas','Crossbooks',544,'Feyre descubre nuevos poderes y alianzas.','https://covers.openlibrary.org/b/isbn/9788408177807-L.jpg','2016',4.9),
('acotar3','9788408177814','Una corte de alas y ruina','Sarah J. Maas','Crossbooks',672,'La guerra contra Hybern comienza.','https://covers.openlibrary.org/b/isbn/9788408177814-L.jpg','2017',4.9),
('acotar4','9788408205821','Una corte de hielo y estrellas','Sarah J. Maas','Crossbooks',288,'Historia puente entre guerras y reconstrucción.','https://covers.openlibrary.org/b/isbn/9788408205821-L.jpg','2018',4.5),
('acotar5','9788408237228','Una corte de llamas plateadas','Sarah J. Maas','Crossbooks',880,'Nesta afronta sus demonios y un nuevo peligro.','https://covers.openlibrary.org/b/isbn/9788408237228-L.jpg','2021',4.8);

-- =========================
-- PERCY JACKSON
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Percy Jackson y los dioses del Olimpo', 'SAGA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('pj1','9788498386264','El ladrón del rayo','Rick Riordan','Salamandra',288,'Percy descubre que es hijo de Poseidón.','https://covers.openlibrary.org/b/isbn/9788498386264-L.jpg','2005',4.7),
('pj2','9788498386271','El mar de los monstruos','Rick Riordan','Salamandra',320,'Percy viaja al mar de los monstruos.','https://covers.openlibrary.org/b/isbn/9788498386271-L.jpg','2006',4.7),
('pj3','9788498386288','La maldición del titán','Rick Riordan','Salamandra',352,'Artemisa desaparece y Percy debe rescatarla.','https://covers.openlibrary.org/b/isbn/9788498386288-L.jpg','2007',4.8),
('pj4','9788498386295','La batalla del laberinto','Rick Riordan','Salamandra',384,'El laberinto de Dédalo es la clave de la guerra.','https://covers.openlibrary.org/b/isbn/9788498386295-L.jpg','2008',4.8),
('pj5','9788498386301','El último héroe del Olimpo','Rick Riordan','Salamandra',416,'Batalla final contra Cronos.','https://covers.openlibrary.org/b/isbn/9788498386301-L.jpg','2009',4.9);

-- =========================
-- TRONO DE CRISTAL
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Trono de Cristal', 'SAGA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('toc1','9788416224203','Trono de Cristal','Sarah J. Maas','Hidra',544,'Celaena Sardothien lucha por su libertad.','https://covers.openlibrary.org/b/isbn/9788416224203-L.jpg','2012',4.7),
('toc2','9788416387427','Corona de medianoche','Sarah J. Maas','Hidra',560,'Celaena debe decidir en quién confiar.','https://covers.openlibrary.org/b/isbn/9788416387427-L.jpg','2013',4.8),
('toc3','9788417390051','Heredera de fuego','Sarah J. Maas','Hidra',704,'Celaena descubre la verdad sobre sí misma.','https://covers.openlibrary.org/b/isbn/9788417390051-L.jpg','2014',4.8),
('toc4','9788417390549','Reina de sombras','Sarah J. Maas','Hidra',848,'Aelin vuelve para reclamar su reino.','https://covers.openlibrary.org/b/isbn/9788417390549-L.jpg','2015',4.9),
('toc5','9788418002717','Imperio de tormentas','Sarah J. Maas','Hidra',816,'La guerra se extiende por Erilea.','https://covers.openlibrary.org/b/isbn/9788418002717-L.jpg','2016',4.9),
('toc6','9788418002724','Torre del alba','Sarah J. Maas','Hidra',672,'Chaol emprende un viaje de sanación.','https://covers.openlibrary.org/b/isbn/9788418002724-L.jpg','2017',4.7),
('toc7','9788418002731','Reino de cenizas','Sarah J. Maas','Hidra',992,'Final épico de la saga.','https://covers.openlibrary.org/b/isbn/9788418002731-L.jpg','2018',5.0);

-- =========================
-- CIUDAD DE MEDIALUNA
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Ciudad de Medialuna', 'TRILOGIA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('cc1','9788417854215','Casa de tierra y sangre','Sarah J. Maas','Alfaguara',880,'Bryce investiga un asesinato sobrenatural.','https://covers.openlibrary.org/b/isbn/9788417854215-L.jpg','2020',4.8),
('cc2','9788418797450','Casa de cielo y aliento','Sarah J. Maas','Alfaguara',912,'Bryce descubre secretos sobre Midgard.','https://covers.openlibrary.org/b/isbn/9788418797450-L.jpg','2022',4.8),
('cc3','9788419988307','Casa de llama y sombra','Sarah J. Maas','Alfaguara',960,'La guerra amenaza todos los mundos.','https://covers.openlibrary.org/b/isbn/9788419988307-L.jpg','2024',4.7);

-- =========================
-- SHERLOCK HOLMES
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Sherlock Holmes', 'SERIE');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('sh1','9788491050292','Estudio en escarlata','Arthur Conan Doyle','Penguin',224,'Primera aparición de Sherlock Holmes.','https://covers.openlibrary.org/b/isbn/9788491050292-L.jpg','1887',4.5),
('sh2','9788491050308','El signo de los cuatro','Arthur Conan Doyle','Penguin',240,'Holmes investiga un misterioso tesoro.','https://covers.openlibrary.org/b/isbn/9788491050308-L.jpg','1890',4.5),
('sh3','9788491050315','Las aventuras de Sherlock Holmes','Arthur Conan Doyle','Penguin',352,'Colección de relatos clásicos del detective.','https://covers.openlibrary.org/b/isbn/9788491050315-L.jpg','1892',4.7),
('sh4','9788491050322','El sabueso de los Baskerville','Arthur Conan Doyle','Penguin',320,'Uno de los casos más famosos de Holmes.','https://covers.openlibrary.org/b/isbn/9788491050322-L.jpg','1902',4.8),
('sh5','9788491050339','El valle del terror','Arthur Conan Doyle','Penguin',304,'Holmes investiga un asesinato complejo.','https://covers.openlibrary.org/b/isbn/9788491050339-L.jpg','1915',4.5);

-- =========================
-- DAN BROWN
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Robert Langdon', 'SERIE');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('db1','9788495618603','Ángeles y demonios','Dan Brown','Umbriel',640,'Robert Langdon investiga a los Illuminati.','https://covers.openlibrary.org/b/isbn/9788495618603-L.jpg','2000',4.6),
('db2','9788408172178','El código Da Vinci','Dan Brown','Planeta',656,'Langdon descubre una conspiración religiosa.','https://covers.openlibrary.org/b/isbn/9788408172178-L.jpg','2003',4.7),
('db3','9788408083603','El símbolo perdido','Dan Brown','Planeta',688,'Langdon investiga secretos masónicos.','https://covers.openlibrary.org/b/isbn/9788408083603-L.jpg','2009',4.4),
('db4','9788408128403','Inferno','Dan Brown','Planeta',640,'Inspirado en la Divina Comedia.','https://covers.openlibrary.org/b/isbn/9788408128403-L.jpg','2013',4.5),
('db5','9788408209997','Origen','Dan Brown','Planeta',640,'Langdon explora el origen y futuro de la humanidad.','https://covers.openlibrary.org/b/isbn/9788408209997-L.jpg','2017',4.4);

-- =========================
-- AFTER
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('After', 'SAGA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('af1','9788408134133','After','Anna Todd','Planeta',576,'Tessa conoce al problemático Hardin.','https://covers.openlibrary.org/b/isbn/9788408134133-L.jpg','2014',4.1),
('af2','9788408134140','En mil pedazos','Anna Todd','Planeta',640,'La relación entre Tessa y Hardin se complica.','https://covers.openlibrary.org/b/isbn/9788408134140-L.jpg','2014',4.1),
('af3','9788408134157','Almas perdidas','Anna Todd','Planeta',672,'Tessa y Hardin enfrentan nuevas crisis.','https://covers.openlibrary.org/b/isbn/9788408134157-L.jpg','2014',4.0),
('af4','9788408134164','Amor infinito','Anna Todd','Planeta',800,'Cierre de la historia de Tessa y Hardin.','https://covers.openlibrary.org/b/isbn/9788408134164-L.jpg','2015',4.0);

-- =========================
-- BLACKWATER
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Blackwater', 'SERIE');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('bw1','9788419030269','La riada','Michael McDowell','Blackie Books',272,'Comienza la historia de Blackwater.','https://covers.openlibrary.org/b/isbn/9788419030269-L.jpg','1983',4.6),
('bw2','9788419030276','El dique','Michael McDowell','Blackie Books',272,'La familia Caskey continúa expandiéndose.','https://covers.openlibrary.org/b/isbn/9788419030276-L.jpg','1983',4.6),
('bw3','9788419030283','La casa','Michael McDowell','Blackie Books',272,'Los secretos de Elinor crecen.','https://covers.openlibrary.org/b/isbn/9788419030283-L.jpg','1983',4.6),
('bw4','9788419030290','La guerra','Michael McDowell','Blackie Books',272,'Las tensiones familiares explotan.','https://covers.openlibrary.org/b/isbn/9788419030290-L.jpg','1983',4.5),
('bw5','9788419030306','La fortuna','Michael McDowell','Blackie Books',272,'Los Caskey alcanzan poder económico.','https://covers.openlibrary.org/b/isbn/9788419030306-L.jpg','1983',4.5),
('bw6','9788419030313','Lluvia','Michael McDowell','Blackie Books',272,'Conclusión de la saga Blackwater.','https://covers.openlibrary.org/b/isbn/9788419030313-L.jpg','1983',4.7);

-- ========================= -- ELISABET BENAVENT -- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION) 
VALUES 
('eb1','9788491291916','Valeria en el espejo','Elísabet Benavent','Suma',448,'Segunda parte de la saga Valeria.','https://covers.openlibrary.org/b/isbn/9788491291916-L.jpg','2013',4.3), 
('eb2','9788491291923','En los zapatos de Valeria','Elísabet Benavent','Suma',480,'Valeria afronta cambios en su vida amorosa.','https://covers.openlibrary.org/b/isbn/9788491291923-L.jpg','2013',4.4), 
('eb3','9788491291930','Persiguiendo a Silvia','Elísabet Benavent','Suma',536,'Silvia se enamora de Gabriel.','https://covers.openlibrary.org/b/isbn/9788491291930-L.jpg','2014',4.5), 
('eb4','9788491291947','Encontrando a Silvia','Elísabet Benavent','Suma',544,'Final de la bilogía Silvia.','https://covers.openlibrary.org/b/isbn/9788491291947-L.jpg','2014',4.5), 
('eb5','9788466346139','Fuimos canciones','Elísabet Benavent','Debolsillo',432,'Maca intenta rehacer su vida.','https://covers.openlibrary.org/b/isbn/9788466346139-L.jpg','2018',4.4), 
('eb6','9788466346146','Seremos recuerdos','Elísabet Benavent','Debolsillo',448,'Continuación de la historia de Maca.','https://covers.openlibrary.org/b/isbn/9788466346146-L.jpg','2019',4.4);

-- ========================= -- MEGAN MAXWELL -- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION) 
VALUES 
('mm1','9788408174387','Pídeme lo que quieras','Megan Maxwell','Esencia',464,'Historia romántica y erótica entre Judith y Eric.','https://covers.openlibrary.org/b/isbn/9788408174387-L.jpg','2012',4.3), 
('mm2','9788408204701','¿Y a ti qué te importa?','Megan Maxwell','Esencia',480,'Comedia romántica contemporánea.','https://covers.openlibrary.org/b/isbn/9788408204701-L.jpg','2019',4.2), 
('mm3','9788408240273','Tampoco pido tanto','Megan Maxwell','Planeta',448,'Carol y Daryl viven un romance complicado.','https://covers.openlibrary.org/b/isbn/9788408240273-L.jpg','2020',4.1);

-- ========================= -- LENA VALENTI -- =========================

INSERT INTO SAGA (NOMBRE, TIPO) VALUES ('Vanir', 'SAGA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION) 
VALUES 
('lv1','9788492916153','El libro de Jade','Lena Valenti','Vanir',512,'Comienza la saga paranormal Vanir.','https://covers.openlibrary.org/b/isbn/9788492916153-L.jpg','2010',4.6), 
('lv2','9788492916160','El libro de la sacerdotisa','Lena Valenti','Vanir',544,'Segunda entrega de los Vanir.','https://covers.openlibrary.org/b/isbn/9788492916160-L.jpg','2011',4.5), 
('lv3','9788492916177','El libro de la elegida','Lena Valenti','Vanir',560,'Nuevos secretos salen a la luz.','https://covers.openlibrary.org/b/isbn/9788492916177-L.jpg','2011',4.5),
('lv4','9788492916184','El libro de Gabriel','Lena Valenti','Vanir',600,'Gabriel protagoniza esta entrega.','https://covers.openlibrary.org/b/isbn/9788492916184-L.jpg','2012',4.5), 
('lv5','9788492916191','El libro de Miya','Lena Valenti','Vanir',640,'Miya descubre la verdad sobre su destino.','https://covers.openlibrary.org/b/isbn/9788492916191-L.jpg','2013',4.5);

-- ========================= -- REINA ROJA -- =========================

INSERT INTO SAGA (NOMBRE, TIPO) VALUES ('Reina Roja', 'TRILOGIA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION) 
VALUES 
('rr1','9788466664417','Reina Roja','Juan Gómez-Jurado','Ediciones B',568,'Antonia Scott investiga un secuestro.','https://covers.openlibrary.org/b/isbn/9788466664417-L.jpg','2018',4.8), 
('rr2','9788466665971','Loba Negra','Juan Gómez-Jurado','Ediciones B',688,'Antonia y Jon investigan en Marbella.','https://covers.openlibrary.org/b/isbn/9788466665971-L.jpg','2019',4.8), 
('rr3','9788466672474','Rey Blanco','Juan Gómez-Jurado','Ediciones B',536,'Final de la trilogía Reina Roja.','https://covers.openlibrary.org/b/isbn/9788466672474-L.jpg','2020',4.9);

-- ========================= -- LA ASISTENTA -- =========================

INSERT INTO SAGA (NOMBRE, TIPO) VALUES ('La asistenta', 'SERIE');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION) 
VALUES 
('as1','9788413143989','La asistenta','Freida McFadden','Suma',368,'Millie comienza a trabajar para una familia peligrosa.','https://covers.openlibrary.org/b/isbn/9788413143989-L.jpg','2022',4.7), 
('as2','9788413145365','El secreto de la asistenta','Freida McFadden','Suma',352,'Millie vuelve a verse atrapada en un misterio.','https://covers.openlibrary.org/b/isbn/9788413145365-L.jpg','2023',4.6), 
('as3','9788413145372','La boda de la asistenta','Freida McFadden','Suma',320,'Nueva entrega de suspense psicológico.','https://covers.openlibrary.org/b/isbn/9788413145372-L.jpg','2024',4.5);

-- ========================= -- STEPHEN KING -- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION) 
VALUES 
('sk1','9788497593793','It','Stephen King','Debolsillo',1504,'Un grupo de niños se enfrenta a Pennywise.','https://covers.openlibrary.org/b/isbn/9788497593793-L.jpg','1986',4.8), 
('sk2','9788490328729','El resplandor','Stephen King','Debolsillo',688,'Jack Torrance se vuelve loco en el Overlook Hotel.','https://covers.openlibrary.org/b/isbn/9788490328729-L.jpg','1977',4.8), 
('sk3','9788497592208','Carrie','Stephen King','Debolsillo',256,'Una adolescente con poderes telequinéticos.','https://covers.openlibrary.org/b/isbn/9788497592208-L.jpg','1974',4.5), 
('sk4','9788497594257','Misery','Stephen King','Debolsillo',432,'Un escritor es secuestrado por su fan número uno.','https://covers.openlibrary.org/b/isbn/9788497594257-L.jpg','1987',4.7), 
('sk5','9788497593069','Cementerio de animales','Stephen King','Debolsillo',488,'Un cementerio indio devuelve la vida a los muertos.','https://covers.openlibrary.org/b/isbn/9788497593069-L.jpg','1983',4.7), 
('sk6','9788497595179','Doctor Sueño','Stephen King','Debolsillo',608,'Secuela de El resplandor.','https://covers.openlibrary.org/b/isbn/9788497595179-L.jpg','2013',4.5), ('sk7','9788497596824','22/11/63','Stephen King','Debolsillo',864,'Un profesor intenta evitar el asesinato de Kennedy.','https://covers.openlibrary.org/b/isbn/9788497596824-L.jpg','2011',4.8), 
('s7','9788497596718','La milla verde','Stephen King','Debolsillo',640,'Historia sobrenatural en una prisión.','https://covers.openlibrary.org/b/isbn/9788497596718-L.jpg','1996',4.9), ('sk9','9788497593794','Apocalipsis','Stephen King','Debolsillo',1792,'Pandemia y lucha entre el bien y el mal.','https://covers.openlibrary.org/b/isbn/9788497593794-L.jpg','1978',4.8), 
('sk8','9788497596664','La niebla','Stephen King','Debolsillo',224,'Una extraña niebla cubre una ciudad.','https://covers.openlibrary.org/b/isbn/9788497596664-L.jpg','1980',4.4);

-- ========================= -- ROBIN COOK -- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION) 
VALUES 
('rc1','9788498724378','Coma','Robin Cook','Zeta',384,'Thriller médico sobre pacientes en coma.','https://covers.openlibrary.org/b/isbn/9788498724378-L.jpg','1977',4.3), 
('rc2','9788498724385','Vector','Robin Cook','Zeta',432,'Amenaza biológica en Nueva York.','https://covers.openlibrary.org/b/isbn/9788498724385-L.jpg','1999',4.2), 
('rc3','9788498724392','Contagio','Robin Cook','Zeta',400,'Una epidemia mortal se expande rápidamente.','https://covers.openlibrary.org/b/isbn/9788498724392-L.jpg','1995',4.1), 
('rc4','9788498724408','Ceguera asesina','Robin Cook','Zeta',416,'Investigación sobre tratamientos experimentales.','https://covers.openlibrary.org/b/isbn/9788498724408-L.jpg','2006',4.0), 
('rc5','9788498724415','Shock','Robin Cook','Zeta',448,'Tráfico ilegal de óvulos humanos.','https://covers.openlibrary.org/b/isbn/9788498724415-L.jpg','2001',4.1), 
('rc6','9788498724422','Toxina','Robin Cook','Zeta',352,'Intoxicación alimentaria mortal.','https://covers.openlibrary.org/b/isbn/9788498724422-L.jpg','1998',4.2), 
('rc7','9788498724439','Nano','Robin Cook','Zeta',480,'Nanotecnología y conspiraciones corporativas.','https://covers.openlibrary.org/b/isbn/9788498724439-L.jpg','2012',4.0), 
('rc8','9788498724446','Mutación','Robin Cook','Zeta',384,'Experimentos genéticos extremos.','https://covers.openlibrary.org/b/isbn/9788498724446-L.jpg','1989',4.1);

-- =========================
-- CORAZON DE PIEDRA
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Corazón de Piedra', 'SAGA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('cp1','9788419621207','Corazón de piedra','Lucía G. Sobrado','Wonderbooks',512,'Romance juvenil con secretos y fantasía.','https://covers.openlibrary.org/b/isbn/9788419621207-L.jpg','2023',4.4);

-- =========================
-- ASESINO DE BRUJAS
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Asesino de Brujas', 'TRILOGIA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('ab1','9788417854345','La bruja blanca','Shelby Mahurin','Puck',480,'Lou es una bruja perseguida por cazadores.','https://covers.openlibrary.org/b/isbn/9788417854345-L.jpg','2019',4.6),
('ab2','9788417854840','Los hijos del rey','Shelby Mahurin','Puck',512,'Lou y Reid siguen luchando contra la magia oscura.','https://covers.openlibrary.org/b/isbn/9788417854840-L.jpg','2020',4.5),
('ab3','9788417854895','Dioses y monstruos','Shelby Mahurin','Puck',640,'Final de la trilogía Asesino de Brujas.','https://covers.openlibrary.org/b/isbn/9788417854895-L.jpg','2021',4.6);

-- =========================
-- OPERACION MANO MUERTA
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Operación Mano Muerta', 'SERIE');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('om1','9788408269281','Operación Mano Muerta','Juan Gómez-Jurado','B',560,'Thriller de espionaje y conspiraciones.','https://covers.openlibrary.org/b/isbn/9788408269281-L.jpg','2023',4.5);

-- =========================
-- MINDF*CK
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Mindf*ck', 'SERIE');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('mf1','9781955931403','The Risk','S.T. Abby','Independiente',220,'Lana busca venganza contra hombres poderosos.','https://covers.openlibrary.org/b/isbn/9781955931403-L.jpg','2017',4.7),
('mf2','9781955931410','Sidetracked','S.T. Abby','Independiente',230,'La investigación se vuelve más peligrosa.','https://covers.openlibrary.org/b/isbn/9781955931410-L.jpg','2017',4.7),
('mf3','9781955931427','Scarlet Angel','S.T. Abby','Independiente',240,'Lana sigue su camino de venganza.','https://covers.openlibrary.org/b/isbn/9781955931427-L.jpg','2017',4.8),
('mf4','9781955931434','All The Lies','S.T. Abby','Independiente',250,'Secretos y traiciones salen a la luz.','https://covers.openlibrary.org/b/isbn/9781955931434-L.jpg','2018',4.8),
('mf5','9781955931441','Paint It All Red','S.T. Abby','Independiente',260,'Final oscuro e intenso de la serie.','https://covers.openlibrary.org/b/isbn/9781955931441-L.jpg','2018',4.9);

-- =========================
-- ANA
-- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('ana1','9788408197409','Ana','Roberto Santiago','Planeta',640,'Thriller protagonizado por Ana Tramel.','https://covers.openlibrary.org/b/isbn/9788408197409-L.jpg','2017',4.3);

-- =========================
-- EL DIA QUE...
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('El día que', 'BILOGIA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('dul1','9788417001596','El día que sueñes con flores salvajes','Dulcinea','Roca',352,'Historia romántica y emocional.','https://covers.openlibrary.org/b/isbn/9788417001596-L.jpg','2017',4.2),
('dul2','9788417092570','El día que el océano te mire a los ojos','Dulcinea','Roca',360,'Segunda novela de la serie.','https://covers.openlibrary.org/b/isbn/9788417092570-L.jpg','2019',4.1);

-- =========================
-- UNA EDUCACION MORTAL
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Una educación mortal', 'TRILOGIA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('uem1','9788419030641','Una educación mortal','Naomi Novik','Umbriel',352,'Magia oscura en una escuela letal.','https://covers.openlibrary.org/b/isbn/9788419030641-L.jpg','2020',4.5),
('uem2','9788419030962','El último graduado','Naomi Novik','Umbriel',384,'La graduación se acerca peligrosamente.','https://covers.openlibrary.org/b/isbn/9788419030962-L.jpg','2021',4.5),
('uem3','9788419031433','Los enclaves dorados','Naomi Novik','Umbriel',416,'Conclusión de la trilogía.','https://covers.openlibrary.org/b/isbn/9788419031433-L.jpg','2022',4.6);

-- =========================
-- NO SOY UN MONSTRUO
-- =========================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('No soy un monstruo', 'TRILOGIA');

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('nm1','9788408170891','No soy un monstruo','Carme Chaparro','Espasa',336,'Desaparición de un niño en un centro comercial.','https://covers.openlibrary.org/b/isbn/9788408170891-L.jpg','2017',4.3),
('nm2','9788467054231','La química del odio','Carme Chaparro','Espasa',400,'Nueva investigación de Ana Arén.','https://covers.openlibrary.org/b/isbn/9788467054231-L.jpg','2018',4.2),
('nm3','9788467061420','No decepciones a tu padre','Carme Chaparro','Espasa',416,'Cierre de la trilogía.','https://covers.openlibrary.org/b/isbn/9788467061420-L.jpg','2021',4.3);

-- =========================
-- LIBROS SUELTOS
-- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('ls1','9788408266525','Las que no duermen NASH','Dolores Redondo','Destino',624,'Thriller ambientado en Navarra.','https://covers.openlibrary.org/b/isbn/9788408266525-L.jpg','2023',4.4),

('ls2','9788408274667','El tiempo todo locura','Tamara Molina','Crossbooks',384,'Romance juvenil contemporáneo.','https://covers.openlibrary.org/b/isbn/9788408274667-L.jpg','2024',4.0),

('ls3','9788408218043','Memorias de una salvaje','Bebi Fernández','Planeta',448,'Historia dura sobre violencia y supervivencia.','https://covers.openlibrary.org/b/isbn/9788408218043-L.jpg','2018',4.6),

('ls4','9788420451916','Uno de los nuestros','Lucía Di Lammermoor','Alfaguara',400,'Thriller psicológico contemporáneo.','https://covers.openlibrary.org/b/isbn/9788420451916-L.jpg','2022',4.1),

('ls5','9788408172177','La chica del tren','Paula Hawkins','Planeta',496,'Rachel observa una pareja desde el tren.','https://covers.openlibrary.org/b/isbn/9788408172177-L.jpg','2015',4.3),

('ls6','9788423346257','De tumba en tumba','Katarina Mazetti','Destino',256,'Historia romántica entre dos personas opuestas.','https://covers.openlibrary.org/b/isbn/9788423346257-L.jpg','1998',4.1),

('ls7','9789876705509','Cadáver exquisito','Agustina Bazterrica','Alfaguara',256,'Distopía brutal sobre canibalismo legalizado.','https://covers.openlibrary.org/b/isbn/9789876705509-L.jpg','2017',4.5),

('ls8','9780593641996','Alchemised','SenLinYu','Del Rey',432,'Fantasia romántica oscura.','no se pudo obtener la img','2025',4.4),

('ls9','9788419131478','Hasta que caiga la luna','Sarah A. Parker','Umbriel',640,'Romantasy de fantasía épica.','https://covers.openlibrary.org/b/isbn/9788419131478-L.jpg','2024',4.5),

('ls10','9788423349807','Nada','Carmen Laforet','Destino',304,'Clásico existencialista español.','https://covers.openlibrary.org/b/isbn/9788423349807-L.jpg','1945',4.4);

-- =========================
-- ASTERIX Y OBELIX
-- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('ast1','9788421682524','Astérix el Galo','René Goscinny','Salvat',48,'Primera aventura de Astérix y Obélix.','https://covers.openlibrary.org/b/isbn/9788421682524-L.jpg','1961',4.7),
('ast2','9788421682531','Astérix y Cleopatra','René Goscinny','Salvat',48,'Los galos viajan a Egipto.','https://covers.openlibrary.org/b/isbn/9788421682531-L.jpg','1965',4.7),
('ast3','9788421682548','Astérix en Hispania','René Goscinny','Salvat',48,'Astérix llega a Hispania.','https://covers.openlibrary.org/b/isbn/9788421682548-L.jpg','1969',4.6),
('ast4','9788421682555','La vuelta a la Galia','René Goscinny','Salvat',48,'Un viaje por toda la Galia.','https://covers.openlibrary.org/b/isbn/9788421682555-L.jpg','1965',4.6),
('ast5','9788421682562','Astérix en Bretaña','René Goscinny','Salvat',48,'Astérix ayuda a los britanos.','https://covers.openlibrary.org/b/isbn/9788421682562-L.jpg','1966',4.7);

-- =========================
-- MORTADELO Y FILEMON
-- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('mfm1','9788466657891','Mortadelo y Filemón: El sulfato atómico','Francisco Ibáñez','Bruguera',48,'Aventura clásica de la T.I.A.','https://covers.openlibrary.org/b/isbn/9788466657891-L.jpg','1969',4.8),
('mfm2','9788466657907','Contra el gang del Chicharrón','Francisco Ibáñez','Bruguera',48,'Nueva misión disparatada.','https://covers.openlibrary.org/b/isbn/9788466657907-L.jpg','1970',4.6),
('mfm3','9788466657914','Valor y... ¡al toro!','Francisco Ibáñez','Bruguera',48,'Mortadelo y Filemón en los toros.','https://covers.openlibrary.org/b/isbn/9788466657914-L.jpg','1971',4.5);

-- =========================
-- PANTERA ROSA
-- =========================

INSERT INTO LIBRO(API_ID,ISBN,TITULO,AUTOR,EDITORIAL,NUM_PAGINAS,SINOPSIS,IMAGEN,FECHA_PUBLICACION,VALORACION)
VALUES
('pr1','9788402423450','La Pantera Rosa detective','VV.AA','Montena',64,'Historias infantiles de la Pantera Rosa.','https://covers.openlibrary.org/b/isbn/9788402423450-L.jpg','1980',4.0),
('pr2','9788402423467','La Pantera Rosa y el misterio','VV.AA','Montena',64,'Nuevas aventuras animadas.','https://covers.openlibrary.org/b/isbn/9788402423467-L.jpg','1981',4.0),
('pr3','9788402423474','La Pantera Rosa en acción','VV.AA','Montena',64,'Historias humorísticas clásicas.','https://covers.openlibrary.org/b/isbn/9788402423474-L.jpg','1982',4.0);

-- =====================================================
-- JUEGOS DEL HAMBRE - AMANECER EN LA COSECHA
-- =====================================================

INSERT INTO LIBRO(
    API_ID,ISBN,TITULO,AUTOR,EDITORIAL,
    NUM_PAGINAS,SINOPSIS,IMAGEN,
    FECHA_PUBLICACION,VALORACION
)
VALUES
(
    'jh5',
    '9788427246720',
    'Amanecer en la cosecha',
    'Suzanne Collins',
    'Molino',
    480,
    'Nueva novela del universo de Los Juegos del Hambre.',
    'https://covers.openlibrary.org/b/isbn/9788427246720-L.jpg',
    '2025',
    4.8
);

INSERT INTO LIBRO_SAGA (LIBRO_ID,SAGA_ID,NUMERO_ORDEN)
VALUES (
    (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788427246720'),
    (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Los Juegos del Hambre'),
    5
);



-- =====================================================
-- ELISABET BENAVENT
-- =====================================================

INSERT INTO LIBRO(
    API_ID,ISBN,TITULO,AUTOR,EDITORIAL,
    NUM_PAGINAS,SINOPSIS,IMAGEN,
    FECHA_PUBLICACION,VALORACION
)
VALUES

(
    'eb7',
    '9788466353779',
    'El arte de engañar al karma',
    'Elísabet Benavent',
    'Suma',
    680,
    'Catalina intenta encontrar sentido a su vida y al amor.',
    'https://covers.openlibrary.org/b/isbn/9788466353779-L.jpg',
    '2021',
    4.3
),

(
    'eb8',
    '9788466348799',
    'Un cuento perfecto',
    'Elísabet Benavent',
    'Suma',
    640,
    'Margot y David escapan de sus vidas perfectas.',
    'https://covers.openlibrary.org/b/isbn/9788466348799-L.jpg',
    '2020',
    4.5
),

(
    'eb9',
    '9788466375986',
    'Esnob',
    'Elísabet Benavent',
    'Suma',
    536,
    'Romance contemporáneo con personajes opuestos.',
    'https://covers.openlibrary.org/b/isbn/9788466375986-L.jpg',
    '2024',
    4.1
);



-- =====================================================
-- TRILOGIA ALGUIEN
-- =====================================================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('Alguien', 'TRILOGIA');

INSERT INTO LIBRO(
    API_ID,ISBN,TITULO,AUTOR,EDITORIAL,
    NUM_PAGINAS,SINOPSIS,IMAGEN,
    FECHA_PUBLICACION,VALORACION
)
VALUES

(
    'alg1',
    '9788491290681',
    'Alguien que no soy',
    'Elísabet Benavent',
    'Suma',
    432,
    'Alba comienza una relación complicada y apasionada.',
    'https://covers.openlibrary.org/b/isbn/9788491290681-L.jpg',
    '2014',
    4.4
),

(
    'alg2',
    '9788491290698',
    'Alguien como tú',
    'Elísabet Benavent',
    'Suma',
    440,
    'Continuación de la historia de Alba.',
    'https://covers.openlibrary.org/b/isbn/9788491290698-L.jpg',
    '2015',
    4.4
),

(
    'alg3',
    '9788491290704',
    'Alguien como yo',
    'Elísabet Benavent',
    'Suma',
    704,
    'Final de la trilogía Alguien.',
    'https://covers.openlibrary.org/b/isbn/9788491290704-L.jpg',
    '2015',
    4.5
);

INSERT INTO LIBRO_SAGA (LIBRO_ID,SAGA_ID,NUMERO_ORDEN)
VALUES

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788491290681'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Alguien'),
 1
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788491290698'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Alguien'),
 2
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788491290704'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Alguien'),
 3
);



-- =====================================================
-- CORAZON DE PIEDRA
-- =====================================================

INSERT INTO LIBRO(
    API_ID,ISBN,TITULO,AUTOR,EDITORIAL,
    NUM_PAGINAS,SINOPSIS,IMAGEN,
    FECHA_PUBLICACION,VALORACION
)
VALUES

(
    'cp2',
    '9788419621214',
    'Promesa de sangre',
    'Lucía G. Sobrado',
    'Wonderbooks',
    528,
    'Segunda parte de la saga Corazón de Piedra.',
    'https://covers.openlibrary.org/b/isbn/9788419621214-L.jpg',
    '2024',
    4.5
),

(
    'cp3',
    '9788419621221',
    'Rey de sombras',
    'Lucía G. Sobrado',
    'Wonderbooks',
    560,
    'Tercera parte de Corazón de Piedra.',
    'https://covers.openlibrary.org/b/isbn/9788419621221-L.jpg',
    '2025',
    4.6
);

INSERT INTO LIBRO_SAGA (LIBRO_ID,SAGA_ID,NUMERO_ORDEN)
VALUES

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788419621214'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Corazón de Piedra'),
 2
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788419621221'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Corazón de Piedra'),
 3
);



-- =====================================================
-- OPERACION MANO MUERTA
-- =====================================================

INSERT INTO LIBRO(
    API_ID,ISBN,TITULO,AUTOR,EDITORIAL,
    NUM_PAGINAS,SINOPSIS,IMAGEN,
    FECHA_PUBLICACION,VALORACION
)
VALUES

(
    'omm2',
    '9788466675413',
    'El infiltrado',
    'Juan Gómez-Jurado',
    'B',
    560,
    'Thriller de espionaje internacional.',
    'https://covers.openlibrary.org/b/isbn/9788466675413-L.jpg',
    '2024',
    4.5
),

(
    'omm3',
    '9788466675420',
    'Nunca más',
    'Juan Gómez-Jurado',
    'B',
    544,
    'El protagonista continúa la operación secreta.',
    'https://covers.openlibrary.org/b/isbn/9788466675420-L.jpg',
    '2025',
    4.4
),

(
    'omm4',
    '9788466675437',
    'La ciénaga',
    'Juan Gómez-Jurado',
    'B',
    576,
    'Nueva misión llena de conspiraciones.',
    'https://covers.openlibrary.org/b/isbn/9788466675437-L.jpg',
    '2025',
    4.4
);

INSERT INTO LIBRO_SAGA (LIBRO_ID,SAGA_ID,NUMERO_ORDEN)
VALUES

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788408269281'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Operación Mano Muerta'),
 1
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788466675413'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Operación Mano Muerta'),
 2
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788466675420'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Operación Mano Muerta'),
 3
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788466675437'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='Operación Mano Muerta'),
 4
);



-- =====================================================
-- MY HERO ACADEMIA
-- =====================================================

INSERT INTO SAGA (NOMBRE, TIPO)
VALUES ('My Hero Academia', 'SERIE');

INSERT INTO LIBRO(
    API_ID,ISBN,TITULO,AUTOR,EDITORIAL,
    NUM_PAGINAS,SINOPSIS,IMAGEN,
    FECHA_PUBLICACION,VALORACION
)
VALUES

(
    'mha1',
    '9788411406338',
    'My Hero Academia 1',
    'Kohei Horikoshi',
    'Planeta Cómic',
    192,
    'Izuku Midoriya sueña con convertirse en héroe.',
    'https://covers.openlibrary.org/b/isbn/9788411406338-L.jpg',
    '2014',
    4.8
),

(
    'mha2',
    '9788411406345',
    'My Hero Academia 2',
    'Kohei Horikoshi',
    'Planeta Cómic',
    192,
    'Midoriya comienza sus pruebas en la U.A.',
    'https://covers.openlibrary.org/b/isbn/9788411406345-L.jpg',
    '2014',
    4.8
),

(
    'mha3',
    '9788411406352',
    'My Hero Academia 3',
    'Kohei Horikoshi',
    'Planeta Cómic',
    192,
    'Los estudiantes se enfrentan a villanos.',
    'https://covers.openlibrary.org/b/isbn/9788411406352-L.jpg',
    '2015',
    4.8
),

(
    'mha4',
    '9788411406369',
    'My Hero Academia 4',
    'Kohei Horikoshi',
    'Planeta Cómic',
    192,
    'Continúan los entrenamientos heroicos.',
    'https://covers.openlibrary.org/b/isbn/9788411406369-L.jpg',
    '2015',
    4.8
),

(
    'mha5',
    '9788411406376',
    'My Hero Academia 5',
    'Kohei Horikoshi',
    'Planeta Cómic',
    192,
    'Midoriya mejora sus poderes.',
    'https://covers.openlibrary.org/b/isbn/9788411406376-L.jpg',
    '2015',
    4.8
);

INSERT INTO LIBRO_SAGA (LIBRO_ID,SAGA_ID,NUMERO_ORDEN)
VALUES

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788411406338'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='My Hero Academia'),
 1
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788411406345'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='My Hero Academia'),
 2
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788411406352'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='My Hero Academia'),
 3
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788411406369'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='My Hero Academia'),
 4
),

(
 (SELECT ID_LIBRO FROM LIBRO WHERE ISBN='9788411406376'),
 (SELECT ID_SAGA FROM SAGA WHERE NOMBRE='My Hero Academia'),
 5
);

-- =====================================================
-- LIMPIAR RELACIONES ANTERIORES
-- =====================================================

DELETE FROM LIBRO_GENERO;



-- =====================================================
-- HARRY POTTER
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR = 'J.K. Rowling'
AND g.NOMBRE IN ('Fantasía','Juvenil','Aventura');



-- =====================================================
-- JUEGOS DEL HAMBRE
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR = 'Suzanne Collins'
AND g.NOMBRE IN ('Distopía','Acción','Juvenil','Ciencia Ficción');



-- =====================================================
-- CREPUSCULO
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR = 'Stephenie Meyer'
AND g.NOMBRE IN ('Romance','Paranormal','Vampiros','Juvenil');



-- =====================================================
-- ACOTAR
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR = 'Sarah J. Maas'
AND l.TITULO LIKE 'Una corte%'
AND g.NOMBRE IN ('Fantasía','Fantasía Épica','Romance','Sobrenatural');



-- =====================================================
-- TRONO DE CRISTAL
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR = 'Sarah J. Maas'
AND (
    l.TITULO='Trono de Cristal'
    OR l.TITULO='Corona de medianoche'
    OR l.TITULO='Heredera de fuego'
    OR l.TITULO='Reina de sombras'
    OR l.TITULO='Imperio de tormentas'
    OR l.TITULO='Torre del alba'
    OR l.TITULO='Reino de cenizas'
)
AND g.NOMBRE IN ('Fantasía Épica','Acción','Romance','Aventura');



-- =====================================================
-- CIUDAD DE MEDIALUNA
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR = 'Sarah J. Maas'
AND l.TITULO LIKE 'Casa de%'
AND g.NOMBRE IN ('Fantasía','Romance','Sobrenatural','Ciencia Ficción');



-- =====================================================
-- PERCY JACKSON
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Rick Riordan'
AND g.NOMBRE IN ('Fantasía','Mitología','Aventura','Juvenil');



-- =====================================================
-- SHERLOCK HOLMES
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Arthur Conan Doyle'
AND g.NOMBRE IN ('Misterio','Policíaco','Novela Histórica');



-- =====================================================
-- DAN BROWN
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Dan Brown'
AND g.NOMBRE IN ('Thriller','Misterio');



-- =====================================================
-- AFTER
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Anna Todd'
AND g.NOMBRE IN ('Romance','Drama','Juvenil');



-- =====================================================
-- BLACKWATER
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Michael McDowell'
AND g.NOMBRE IN ('Terror','Sobrenatural','Drama');



-- =====================================================
-- ELISABET BENAVENT
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Elísabet Benavent'
AND g.NOMBRE IN ('Romance','Contemporáneo','Erótico');



-- =====================================================
-- MEGAN MAXWELL
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Megan Maxwell'
AND g.NOMBRE IN ('Romance','Romance Histórico','Erótico');



-- =====================================================
-- LENA VALENTI
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Lena Valenti'
AND g.NOMBRE IN ('Paranormal','Romance','Erótico','Sobrenatural');



-- =====================================================
-- REINA ROJA
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Juan Gómez-Jurado'
AND (
    l.TITULO='Reina Roja'
    OR l.TITULO='Loba Negra'
    OR l.TITULO='Rey Blanco'
)
AND g.NOMBRE IN ('Thriller','Novela Negra','Policíaco');



-- =====================================================
-- OPERACION MANO MUERTA
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE (
    l.TITULO='Operación Mano Muerta'
    OR l.TITULO='El infiltrado'
    OR l.TITULO='Nunca más'
    OR l.TITULO='La ciénaga'
)
AND g.NOMBRE IN ('Thriller','Acción');



-- =====================================================
-- LA ASISTENTA
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Freida McFadden'
AND g.NOMBRE IN ('Thriller','Psicológico','Misterio');



-- =====================================================
-- STEPHEN KING
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Stephen King'
AND g.NOMBRE IN ('Terror','Sobrenatural','Thriller','Psicológico');



-- =====================================================
-- ROBIN COOK
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Robin Cook'
AND g.NOMBRE IN ('Thriller','Ciencia Ficción');



-- =====================================================
-- CORAZON DE PIEDRA
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Lucía G. Sobrado'
AND g.NOMBRE IN ('Romance','Romance Histórico','Fantasía');



-- =====================================================
-- ASESINO DE BRUJAS
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Shelby Mahurin'
AND g.NOMBRE IN ('Fantasía','Romance','Juvenil');



-- =====================================================
-- MINDF*CK
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='S.T. Abby'
AND g.NOMBRE IN ('Dark Romance','Thriller','Psicológico');



-- =====================================================
-- ANA
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Ana'
AND g.NOMBRE IN ('Thriller','Drama');



-- =====================================================
-- DULCINEA
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Dulcinea'
AND g.NOMBRE IN ('Romance','Drama','Contemporáneo');



-- =====================================================
-- UNA EDUCACION MORTAL
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Naomi Novik'
AND g.NOMBRE IN ('Fantasía','Juvenil','Sobrenatural');



-- =====================================================
-- NO SOY UN MONSTRUO
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO, g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Carme Chaparro'
AND g.NOMBRE IN ('Thriller','Novela Negra','Psicológico');



-- =====================================================
-- LIBROS SUELTOS
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='La biblioteca de la medianoche'
AND g.NOMBRE IN ('Ficción','Filosofía','Drama');

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Erebos'
AND g.NOMBRE IN ('Thriller','Ciencia Ficción','Juvenil');

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='La paciente silenciosa'
AND g.NOMBRE IN ('Thriller','Psicológico','Misterio');

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Hábitos Atómicos'
AND g.NOMBRE IN ('Autoayuda','Psicología','Desarrollo Personal');

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Padre rico, padre pobre'
AND g.NOMBRE IN ('No Ficción','Autoayuda','Desarrollo Personal');

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='El Principito'
AND g.NOMBRE IN ('Filosofía','Infantil');

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Fisión del yo'
AND g.NOMBRE IN ('Filosofía','Psicología');

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Los Simpson y la filosofía'
AND g.NOMBRE='Filosofía';

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO='Por si las voces vuelven'
AND g.NOMBRE IN ('Biografía','Drama');



-- =====================================================
-- LGBTQ+
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO IN (
'Mis besos no son de cualquiera',
'Un te quiero de repuesto',
'El priorato del naranjo'
)
AND g.NOMBRE='LGBTQ+';



-- =====================================================
-- ASTERIX
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO LIKE 'Astérix%'
AND g.NOMBRE IN ('Cómic','Humor','Infantil','Novela Gráfica');



-- =====================================================
-- MORTADELO Y FILEMON
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.AUTOR='Francisco Ibáñez'
AND g.NOMBRE IN ('Cómic','Humor','Infantil','Novela Gráfica');



-- =====================================================
-- PANTERA ROSA
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO LIKE '%Pantera Rosa%'
AND g.NOMBRE IN ('Infantil','Humor','Novela Gráfica');



-- =====================================================
-- MY HERO ACADEMIA
-- =====================================================

INSERT INTO LIBRO_GENERO (LIBRO_ID, GENERO_ID)
SELECT l.ID_LIBRO,g.ID_GENERO
FROM LIBRO l, GENERO g
WHERE l.TITULO LIKE 'My Hero Academia%'
AND g.NOMBRE IN ('Manga','Superhéroes','Acción','Novela Gráfica');