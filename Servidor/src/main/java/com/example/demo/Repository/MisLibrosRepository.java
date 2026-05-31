package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Estado;
import com.example.demo.Entity.UserLibroEntity;

@Repository
public interface MisLibrosRepository extends JpaRepository<UserLibroEntity,Long>{
	
	 Optional<UserLibroEntity>findByUsuarioLibroIdUserAndLibroUserIdLibro(Long idUser, Long idLibro);

	 List<UserLibroEntity>findByUsuarioLibroIdUser(Long idUser);
	    
	 
	 @Query("""
		        SELECT ul
		        FROM UserLibroEntity ul
		        WHERE ul.usuarioLibro.idUser = :idUser
		        AND ul.estado = :estado
		        ORDER BY ul.fechaEstado DESC
		    """)
	 List<UserLibroEntity> buscarPorEstadoOrdenados(@Param("idUser") Long idUser, @Param("estado") Estado estado);
	 
	 @Query("""
			    SELECT ul
			    FROM UserLibroEntity ul
			    WHERE ul.usuarioLibro.idUser = :idUser
			    AND ul.estado = :estado
			    ORDER BY ul.fechaEstado DESC
			""")
	List<UserLibroEntity> buscarUltimosPorEstado(@Param("idUser") Long idUser, @Param("estado") Estado estado);
}
