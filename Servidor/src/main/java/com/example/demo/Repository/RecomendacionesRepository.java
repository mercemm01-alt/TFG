package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.LibroEntity;

@Repository
public interface RecomendacionesRepository extends JpaRepository<LibroEntity, Long>{
	
	// Recomendación por géneros favoritos

    @Query("""
        SELECT DISTINCT lg.libroGenero
        FROM UserGeneroEntity ug
        JOIN LibroGeneroEntity lg
            ON ug.genero.idGenero = lg.genero.idGenero
        WHERE ug.usuario.idUser = :idUser
        AND lg.libroGenero.idLibro NOT IN (
            SELECT ul.libroUser.idLibro
            FROM UserLibroEntity ul
            WHERE ul.usuarioLibro.idUser = :idUser
        )
    """)
    List<LibroEntity> recomendarPorGeneros(@Param("idUser") Long idUser);


    // Recomendación por sagas

    @Query("""
        SELECT DISTINCT ls2.libro
        FROM UserLibroEntity ul
        JOIN LibroSagaEntity ls1
            ON ul.libroUser.idLibro = ls1.libro.idLibro
        JOIN LibroSagaEntity ls2
            ON ls1.saga.idSaga = ls2.saga.idSaga
        WHERE ul.usuarioLibro.idUser = :idUser
        AND ls2.libro.idLibro NOT IN (
            SELECT ul2.libroUser.idLibro
            FROM UserLibroEntity ul2
            WHERE ul2.usuarioLibro.idUser = :idUser
        )
    """)
    List<LibroEntity> recomendarPorSaga(@Param("idUser")Long idUser);


    // Recomendación por autor

    @Query("""
        SELECT DISTINCT l2
        FROM UserLibroEntity  ul
        JOIN LibroEntity l1
            ON ul.libroUser.idLibro = l1.idLibro
        JOIN LibroEntity l2
            ON l1.autor = l2.autor
        WHERE ul.usuarioLibro.idUser = :idUser
        AND l2.idLibro NOT IN (
            SELECT ul2.libroUser.idLibro
            FROM UserLibroEntity ul2
            WHERE ul2.usuarioLibro.idUser = :idUser
        )
    """)
    List<LibroEntity> recomendarPorAutor(@Param("idUser")Long idUser);
}
