package iset.project.exchange.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;



@Data
@Document
public class MaisonRetraite {
	@Id
	private String id;
	private String nomEtablissement;
	private String matricule;
	private String numTel;
	private String email;
	private String motDePasse;

}
