package ThirdWeek.homework3.dataAccess.JdbcCategoryDao;

import ThirdWeek.homework3.dataAccess.CourseDao;
import ThirdWeek.homework3.entities.Course;

public class JdbcCourseDao implements CourseDao {

	

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veri tabanına eklendi.");
		
	}
}
