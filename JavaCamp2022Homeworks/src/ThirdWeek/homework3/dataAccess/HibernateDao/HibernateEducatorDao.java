package ThirdWeek.homework3.dataAccess.HibernateDao;

import ThirdWeek.homework3.dataAccess.EducatorDao;
import ThirdWeek.homework3.entities.Educator;

public class HibernateEducatorDao implements EducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("Hibernate ile veri tabanına eklendi");
		
	}

}
