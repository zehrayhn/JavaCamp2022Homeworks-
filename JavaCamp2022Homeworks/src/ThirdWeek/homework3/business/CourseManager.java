package ThirdWeek.homework3.business;


import java.util.ArrayList;
import java.util.List;

import ThirdWeek.homework3.core.logging.Logger;
import ThirdWeek.homework3.dataAccess.CategoryDao;
import ThirdWeek.homework3.dataAccess.CourseDao;
import ThirdWeek.homework3.entities.Category;
import ThirdWeek.homework3.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.loggers=loggers;
		this.courseDao = courseDao;
	}
	
	List<Course> courseList=new ArrayList<Course>();
	public void add(Course course) throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("Ürün fiyatı 0 dan küçük olamaz");		
		}
		for(Course courseName:courseList) {
			if(courseName.getName().equals(course.getName())) {
				throw new Exception("Bu isimde bir kurs zaten mevcut");
			}
		
		}
		 courseList.add(course);
	     courseDao.add(course);
	        
	    System.out.println("Kategori eklendi");
		System.out.println("Kurs eklendi");
		
		
		 for (Logger logger:loggers) {
				logger.log(course.getName());
			}

	
		
	}
}
