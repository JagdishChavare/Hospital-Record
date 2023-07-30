package hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Patient {
	@Id
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public List<Diseas> getDiseas() {
		return diseas;
	}

	public void setDiseas(List<Diseas> diseas) {
		this.diseas = diseas;
	}

	private String symptoms;
	
	@ManyToMany
	List<Diseas> diseas;

}
