package iset.project.exchange.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import iset.project.exchange.entities.MaisonRetraite;


public interface MaisonRetraiteRepository extends MongoRepository<MaisonRetraite,Integer> {
	MaisonRetraite findMaisonRetraiteById(String id);

}
