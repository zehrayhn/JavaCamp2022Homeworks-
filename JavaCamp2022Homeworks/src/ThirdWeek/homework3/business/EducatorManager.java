package ThirdWeek.homework3.business;

import ThirdWeek.homework3.dataAccess.EducatorDao;
import ThirdWeek.homework3.entities.Educator;

public class EducatorManager {

	private EducatorDao educatorDao;

	public EducatorManager(EducatorDao educatorDao) {
		super();
		this.educatorDao = educatorDao;
	}
	
	public void Add(Educator educator) {
		educatorDao.add(educator);
	}
}
