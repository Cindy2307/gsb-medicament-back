package com.ecolepratique.medicament2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.ecolepratique.medicament2.entite.Medicament;
import com.ecolepratique.medicament2.repository.MedicamentRepositoryItf;

@Service
public class MedicamentService implements MedicamentServiceItf {
	@Autowired
	private MedicamentRepositoryItf medicamentRepository;
	
	@Override
	public List<Medicament> list() {
		return medicamentRepository.findAll();
	}
	@Override
	public Medicament create(Medicament medicament) {
		return medicamentRepository.save(medicament);
	}
	@Override
	public Medicament getByNumDepotLegal(Long numDepotLegal) {
		return medicamentRepository.findById(numDepotLegal).get();
	}
	@Override
	public Medicament deleteByNumDepotLegal(Long numDepotLegal) {
		Medicament medicament = getByNumDepotLegal(numDepotLegal);
		medicamentRepository.deleteById(numDepotLegal);
		return medicament;
	}
	
	@Override
	public Medicament updateByNumDepotLegal(Long numDepotLegal, Medicament medicament) {
		medicament.setNumDepotLegal(numDepotLegal);
		return medicamentRepository.save(medicament);
	}
	@Override
	public List<Medicament> listByPage(int numPage, int taille) {
		return medicamentRepository.findAll(PageRequest.of(numPage,taille)).getContent();
	}
	@Override
	public Medicament getByNomCommercial(String nomCommercial) {
		return medicamentRepository.findByNomCommercial(nomCommercial);
	}
	@Override
	public List<Medicament> getByNomCommercialLike(String mc) {
		return medicamentRepository.findByNomCommercialLike("%"+mc+"%");
	}
	@Override
	public List<Medicament> listOrderByNomCommercial() {
		return medicamentRepository.findAllByOrderByNomCommercial();
	}
	@Override
	public List<Medicament> getByNomCommercialLikeOrder(String mc){
		return medicamentRepository.findByNomCommercialLikeOrderByNomCommercial("%"+mc+"%");
	}
}
