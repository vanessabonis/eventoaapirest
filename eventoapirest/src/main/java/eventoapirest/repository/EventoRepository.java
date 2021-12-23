package eventoapirest.repository;
//o repository vai interagir com o eventos da bd

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eventoapirest.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
	
	List<Evento> findById(long id);
	List<Evento> findByNameContaining(String nome);

}

/* com o extends jparepository 
 * podemos usar os métodos (sem precisar implementá-los)
 * 
 * save(), findOne(), findAll(), delete(), count, etc..
 * 
 * tb podemos definir métodos de busca
 * findByNameContaining() irá retornar todos os eventos de acordo com o nome buscado
 * findById() retornará  o evento pelo id buscado
 * */
