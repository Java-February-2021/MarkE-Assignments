package com.mark.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mark.languages.models.Language;
import com.mark.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	public List<Language> getAllLanguage() {
		return this.lRepo.findAll();
	}
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
	public Language updateLanguage(Long id, Language updateLanguage) {
		return this.lRepo.save(updateLanguage);
	}
}
