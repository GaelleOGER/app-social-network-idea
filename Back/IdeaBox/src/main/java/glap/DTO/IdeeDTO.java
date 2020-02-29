package glap.DTO;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdeeDTO {

	private Integer id;
	private String description;
	private String titre;
	private Set<Integer> collaborateurIds;
	private Integer membreId;
	private Integer categorieId;
	private Integer score;
	private LocalDateTime createdAt;
	private LocalDateTime deletedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Set<Integer> getCollaborateurIds() {
		return collaborateurIds;
	}

	public void setCollaborateurIds(Set<Integer> collaborateurIds) {
		this.collaborateurIds = collaborateurIds;
	}

	public Integer getMembreId() {
		return membreId;
	}

	public void setMembreId(Integer membreId) {
		this.membreId = membreId;
	}

	public Integer getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(Integer categorieId) {
		this.categorieId = categorieId;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}

}
