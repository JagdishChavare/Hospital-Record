package hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diseas {
     @Id
	private int id;
	private String diseas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiseas() {
		return diseas;
	}
	public void setDiseas(String diseas) {
		this.diseas = diseas;
	}
}
