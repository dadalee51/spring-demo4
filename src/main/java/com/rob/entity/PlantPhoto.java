package com.rob.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the plant_photos database table.
 * 
 */
@Entity
@Table(name="plant_photos")
@NamedQuery(name="PlantPhoto.findAll", query="SELECT p FROM PlantPhoto p")
public class PlantPhoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_photo_taken")
	private Date datePhotoTaken;

	@Column(name="photo_path")
	private String photoPath;

	@Column(name="plant_name")
	private String plantName;

	@Column(name="plant_number")
	private int plantNumber;

	public PlantPhoto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatePhotoTaken() {
		return this.datePhotoTaken;
	}

	public void setDatePhotoTaken(Date datePhotoTaken) {
		this.datePhotoTaken = datePhotoTaken;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String getPlantName() {
		return this.plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public int getPlantNumber() {
		return this.plantNumber;
	}

	public void setPlantNumber(int plantNumber) {
		this.plantNumber = plantNumber;
	}

}