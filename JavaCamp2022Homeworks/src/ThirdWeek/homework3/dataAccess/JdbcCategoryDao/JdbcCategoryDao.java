package ThirdWeek.homework3.dataAccess.JdbcCategoryDao;



import ThirdWeek.homework3.dataAccess.CategoryDao;
import ThirdWeek.homework3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
	
		System.out.println("Jdbc ile veri tabanına eklendi.");
	}

}
