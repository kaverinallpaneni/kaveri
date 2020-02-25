package com.cts.training.media.service;

import java.util.List;

import com.cts.training.media.entity.Media;



public interface IMediaService {


	List<Media> findAllMedias();
	Media findMediaById(Integer id);
	boolean addMedia(Media media);
	boolean updateMedia(Media media);
	boolean deleteMedia(Integer id);
}
