package glap.DTO;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import glap.model.Commentaire;
import glap.model.Idee;
import glap.model.Membre;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VoteDTO {
	private Integer id;
	private Boolean positif;
	//commentaire parent
	@JsonIgnore
	private Commentaire commentaire;
	//idee parent
	@JsonIgnore
	private Idee idee;
	//membre parent
	@NotNull
	@JsonIgnore
	private Membre membre;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getPositif() {
		return positif;
	}
	public void setPositif(Boolean positif) {
		this.positif = positif;
	}
	public Commentaire getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}
	public Idee getIdee() {
		return idee;
	}
	public void setIdee(Idee idee) {
		this.idee = idee;
	}
	public Membre getMembre() {
		return membre;
	}
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
	public VoteDTO(Integer id, Boolean positif, Commentaire commentaire, Idee idee, @NotNull Membre membre) {
		super();
		this.id = id;
		this.positif = positif;
		this.commentaire = commentaire;
		this.idee = idee;
		this.membre = membre;
	}
	
	
}
