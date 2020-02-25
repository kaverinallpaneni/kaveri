package com.cts.training.media.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.media.entity.Media;
import com.cts.training.media.repository.MediaRepository;


@Service
public class MediaServiceImpl {

	@Autowired
	private MediaRepository mediaRepository;
	
	public List<Media> findAllMedias() {
		
		return this.mediaRepository.findAll();
	}
	
	
	public Media findMediaById(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<Media> record =  this.mediaRepository.findById(id);
		
		Media media = new Media();
		if(record.isPresent())
			media = record.get();
		return media;
		
	}


	public boolean addMedia(Media media) {
		// TODO Auto-generated method stub
		this.mediaRepository.save(media);
		return true;
	}


	public boolean updateMedia(Media media) {
		// TODO Auto-generated method stub
		this.mediaRepository.save(media);
		return true;
	}


	public boolean deleteMedia(Integer id) {
		// TODO Auto-generated method stub
		this.mediaRepository.deleteById(id);
		return true;
	}

}
