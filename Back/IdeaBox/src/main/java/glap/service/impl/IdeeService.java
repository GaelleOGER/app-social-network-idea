package glap.service.impl;

import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import glap.DTO.IdeeDTO;
import glap.model.Idee;
import glap.repository.IIdeeRepository;
import glap.service.IIdeeService;

@Service
public class IdeeService implements IIdeeService {
	@Autowired
	private IIdeeRepository ideeRepository;


	@Override
	public IdeeDTO add(IdeeDTO ideeDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IdeeDTO> recupererAll() {
		Iterator<Idee> iterator = this.ideeRepository.findAll().iterator();

		List<Idee> listI = new ArrayList<>();
		List<IdeeDTO> listDTO = new ArrayList<>();
		// Add each element of iterator to the List
		iterator.forEachRemaining(listI::add);
		for (Idee idee : listI) {
			// mapping Model To DTO
			IdeeDTO ideeToPush = this.ideeModelToDTO(idee);

			listDTO.add(ideeToPush);
		}
		return listDTO;
	}

	@Override
	public IdeeDTO update(Integer id, IdeeDTO ideeDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdeeDTO getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	private IdeeDTO ideeModelToDTO(Idee idee) {
		IdeeDTO result = new IdeeDTO();

		//id
		result.setId(idee.getId());

		//catId
		result.setCategorieId(idee.getCategorie().getId());

		//Titre
		result.setTitre(idee.getTitre());

		//collabId
		Set<Integer> setCollabIds = new HashSet<>();
		idee.getCollaborteurs().forEach(element -> { setCollabIds.add(element.getId());});
		result.setCollaborateurIds(setCollabIds);

		//membreId (Original Posteur)
		result.setMembreId(idee.getMembre().getId());

		//Score
		result.setScore(1000); //TODO fix bouchon with vote


		//Dates
		result.setCreatedAt(
				Instant.ofEpochMilli(idee.getCreatedAt().getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
		if (idee.getDeleteAt() != null) {
			result.setDeletedAt(Instant.ofEpochMilli(idee.getDeleteAt().getTime()).atZone(ZoneId.systemDefault())
					.toLocalDateTime());
		}
		return result;
	}

	/* private Idee IdeeDTOtoModel(IdeeDTO ideeDTO) {
		Idee result = new Idee();

		//id
		result.setId(ideeDTO.getId());

		//catId
		result.setCategorie();

		return result;
	}
	 */
}
