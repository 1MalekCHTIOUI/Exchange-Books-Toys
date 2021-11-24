package iset.project.exchange.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iset.project.exchange.entities.MaisonRetraite;
import iset.project.exchange.repository.MaisonRetraiteRepository;

@RestController
@RequestMapping("MaisonRetraite")
public class MaisonRetraiteRestService {
	@Autowired
	MaisonRetraiteRepository mRr;
	
	@RequestMapping("/")
	public ResponseEntity<List<MaisonRetraite>> getMaisonRetraite(){
		return new ResponseEntity<>(mRr.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<MaisonRetraite> addMaisonRetraite(@RequestBody MaisonRetraite Mr){
		return new ResponseEntity<>(mRr.save(Mr), HttpStatus.CREATED);
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<MaisonRetraite> getMaisonRetraiteById(@PathVariable("id") String id) {
		MaisonRetraite Mr = mRr.findMaisonRetraiteById(id);
		return new ResponseEntity<>(Mr, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteMaisonRetraite(@PathVariable("id") String id) {
		mRr.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<MaisonRetraite> updateMaisonRetraite(@PathVariable("id") String id, @RequestBody MaisonRetraite Mr){
		return new ResponseEntity<>(mRr.save(Mr), HttpStatus.OK);
	}

}
