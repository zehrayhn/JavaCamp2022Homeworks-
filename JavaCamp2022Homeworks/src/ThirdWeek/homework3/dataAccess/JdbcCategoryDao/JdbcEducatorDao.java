package ThirdWeek.homework3.dataAccess.JdbcCategoryDao;

import ThirdWeek.homework3.dataAccess.EducatorDao;
import ThirdWeek.homework3.entities.Educator;

public class JdbcEducatorDao implements EducatorDao{

	@Override
	public void add(Educator educator) {
		// TODO Auto-generated method stub
		System.out.println("Jdbc ile veri tabanına eklendi.");
	}

}
