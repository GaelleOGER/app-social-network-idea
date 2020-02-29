package glap.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentaireDTO {
	private Integer id;
	private String contenu;
	private Date createdAt;
	private Integer idMembre;
	private Integer idIdee;
	private Integer idCommentaire;

	//	private Commentaire commentaire;
	//	@JsonIgnore
	//	private Idee idee;
	//	@JsonIgnore
	//	private Membre membre;
	//	//	private Set<Vote> votes;

	//constructeur pour commentaire Idee
	public CommentaireDTO(String contenu,Integer idIdee,Integer idMembre){
		this.contenu=contenu;
		this.idIdee=idIdee;
		this.idMembre=idMembre;
	}
	//constructeur pour commentaire Idee retour
	public CommentaireDTO(String contenu,Integer idIdee,Integer idMembre, Date createdAt){
		this.contenu=contenu;
		this.idIdee=idIdee;
		this.idMembre=idMembre;
		this.createdAt=createdAt;
	}
	//constructeur pour commentaire reponse
	public CommentaireDTO(String contenu,Integer idIdee,Integer idMembre, Integer idCommentaire){
		this.contenu=contenu;
		this.idIdee=idIdee;
		this.idMembre=idMembre;
		this.idCommentaire=idCommentaire;

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Integer getIdMembre() {
		return idMembre;
	}
	public void setIdMembre(Integer idMembre) {
		this.idMembre = idMembre;
	}
	public Integer getIdIdee() {
		return idIdee;
	}
	public void setIdIdee(Integer idIdee) {
		this.idIdee = idIdee;
	}
	public Integer getIdCommentaire() {
		return idCommentaire;
	}
	public void setIdCommentaire(Integer idCommentaire) {
		this.idCommentaire = idCommentaire;
	}
	public CommentaireDTO(Integer id, String contenu, Date createdAt, Integer idMembre, Integer idIdee,
			Integer idCommentaire) {
		super();
		this.id = id;
		this.contenu = contenu;
		this.createdAt = createdAt;
		this.idMembre = idMembre;
		this.idIdee = idIdee;
		this.idCommentaire = idCommentaire;
	}
	
	
}


