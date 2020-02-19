package com.cts.training.hibernatemapping.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.training.hibernatemapping.HibernateMappingApplication;
import com.cts.training.hibernatemapping.entity.Course;
import com.cts.training.hibernatemapping.entity.Review;
@RunWith(SpringRunner.class)
@SpringBootTest(classes =  HibernateMappingApplication.class)
class ReviewDaoTests {
	
    @Autowired
	private CourseDao courseDao;
    
    @Autowired 
    private ReviewDao reviewDao;
    
	@Test
	public void testAddCourseWithReviews() {
		Course course =new Course();
		course.setName("javascript");
		
		Review review1 = new Review();
		review1.setReview("angular");
		
		Review added = this.reviewDao.addReviewAndCourse(review1,course);
		assertEquals("angular", added.getReview());
	}
		
	@Test
	public void testaddReviewtoExistingCourse() {
		
		Course course=this.courseDao.findById(1);
		Review review1 = new Review();
	  review1.setReview("angularpro");
		
		
		Review added = this.reviewDao.addReviewtoExistingCourse(review1,course);
		assertEquals("angularpro", added.getReview());
		
	}

}
