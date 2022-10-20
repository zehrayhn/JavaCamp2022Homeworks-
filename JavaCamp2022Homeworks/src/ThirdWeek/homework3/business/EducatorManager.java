package ThirdWeek.homework3.business;

import ThirdWeek.homework3.core.logging.Logger;
import ThirdWeek.homework3.dataAccess.EducatorDao;
import ThirdWeek.homework3.entities.Educator;

public class EducatorManager {

	private EducatorDao educatorDao;
    private  Logger[] loggers;
	public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
		
		this.loggers=loggers;
		this.educatorDao = educatorDao;
	}
	
	public void Add(Educator educator) {
		educatorDao.add(educator);
		 for (Logger logger:loggers) {
				logger.log(educator.getName());
			}
	}
}
