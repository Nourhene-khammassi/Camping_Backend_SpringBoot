package com.crud.msstudent.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;


@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "participation")
public class Participation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idParticipation;

    public int getIdParticipation() {
		return idParticipation;
	}

	public void setIdParticipation(int idParticipation) {
		this.idParticipation = idParticipation;
	}

	public String getDate_participation() {
		return date_participation;
	}

	public void setDate_participation(String date_participation) {
		this.date_participation = date_participation;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getIdParticipant() {
		return idParticipant;
	}

	public void setIdParticipant(String idParticipant) {
		this.idParticipant = idParticipant;
	}

	public String getIdCampe() {
		return idCampe;
	}

	public void setIdCampe(String idCampe) {
		this.idCampe = idCampe;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String date_participation;

    private String valid;

    private String idParticipant;

    private String idCampe;


}
