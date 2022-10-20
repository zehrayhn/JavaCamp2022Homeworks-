package ThirdWeek.homework3.dataAccess.HibernateDao;



import ThirdWeek.homework3.dataAccess.CategoryDao;
import ThirdWeek.homework3.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanına eklendi");
		
	}

}
