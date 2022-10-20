package ThirdWeek.homework3.dataAccess.HibernateDao;

import ThirdWeek.homework3.dataAccess.CourseDao;
import ThirdWeek.homework3.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi");
		
	}
}
