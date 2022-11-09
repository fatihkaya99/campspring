package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;//veriyi kaydetmek

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//brandi tablo haline getirmek için anotasyonlar yani @ile başlayan nesne ile ilgili bilgi toplayan arkasında reflection kullanan bir via 
@Table(name = "brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Brand {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)//ıd otomatik artan
	@Column (name ="id")
	private int id;
	@Column (name ="name")
	private String name;
	//veri tabanı tabloyu tasarla
	//lombok  getter setter bi de builderı var
  
	//Brand-->id,name,quantity
	//GetAllBrandsResponse-->id,name
	
	//mapping

}

