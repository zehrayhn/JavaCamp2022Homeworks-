package ThirdWeek.homework3;



import java.util.ArrayList;
import java.util.List;

import ThirdWeek.homework3.business.CategoryManager;
import ThirdWeek.homework3.business.CourseManager;
import ThirdWeek.homework3.business.EducatorManager;
import ThirdWeek.homework3.dataAccess.HibernateDao.HibernateCourseDao;
import ThirdWeek.homework3.dataAccess.JdbcCategoryDao.JdbcCategoryDao;
import ThirdWeek.homework3.dataAccess.JdbcCategoryDao.JdbcEducatorDao;
import ThirdWeek.homework3.entities.Category;
import ThirdWeek.homework3.entities.Course;
import ThirdWeek.homework3.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
	
		
		CategoryManager categoryManager =new CategoryManager(new JdbcCategoryDao());
		Category category=new Category();
		category.setId(2);
		category.setName("aa");
	
		Category category2=new Category();
		category2.setId(2);
		category2.setName("aa");
		
		categoryManager.add(category);
		//categoryManager.add(category2);
		categoryManager.list();
		
		
		CourseManager courseManager=new CourseManager(new HibernateCourseDao());
		Course course =new Course(4, "java kursu", 20);
		Course course2=new Course(2,"c# kursu" , -1);
		courseManager.add(course);
		courseManager.add(course2);
	
		EducatorManager educatorManager=new EducatorManager(new JdbcEducatorDao());
		Educator educator=new Educator(1, "Engin Demiroğ");		
		Educator educator2=new Educator(2, "Engin Demiroğ");
		educatorManager.Add(educator);
		educatorManager.Add(educator2);
		
	}
	
	

}
