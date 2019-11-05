package glap.service;

import glap.DTO.CommentaireDTO;

public interface ICommentaire {
	//ajouter un commentaire
	public CommentaireDTO add(CommentaireDTO com);

	//supprimer un commentaire
	public void delete();

	//modifier un commentaire
	public String update(String com);
}
