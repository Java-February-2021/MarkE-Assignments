package com.mark.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mark.lookify.models.Lookify;
import com.mark.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private LookifyRepository lRepo;
	
	public LookifyService(LookifyRepository repo) {
		this.lRepo = repo;
	}
	
	public List<Lookify> getAllSongs() {
		return this.lRepo.findAll();
	}
	public Lookify getOneSong(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	public Lookify createSong(Lookify newLookify) {
		return this.lRepo.save(newLookify);
	}
	public void deleteSong(Long id) {
		this.lRepo.deleteById(id);
	}
	public Lookify updateSong(Long id, Lookify updateLookify) {
		return this.lRepo.save(updateLookify);
	}
	public List<Lookify> topTenByRating() {
		return lRepo.findTop10ByOrderByRatingDesc();
	}
	public List<Lookify> songsContainingArtist(String artist) {
		return lRepo.findByArtistContaining(artist);
	}
}