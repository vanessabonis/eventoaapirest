package eventoapirest.models;

/* classe evento da camada model corresponde a entity e table eventos*/

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "eventos")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //auto increment
	private long id;
	
	@Column(name = "nome") //define a coluna no bd
	private String nome;
	
	@Column(name = "local")
	private String local;
	
	@Column(name = "data")
	private Date data;
	
	@Column(name = "horario")
	private Date horario;

}
