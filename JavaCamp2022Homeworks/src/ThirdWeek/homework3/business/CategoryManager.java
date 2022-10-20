package ThirdWeek.homework3.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ThirdWeek.homework3.core.logging.Logger;
import ThirdWeek.homework3.dataAccess.CategoryDao;
import ThirdWeek.homework3.entities.Category;


public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.loggers=loggers;
		this.categoryDao = categoryDao;
	}

	List<Category> categoryList=new ArrayList<Category>();
	public void add(Category category) throws Exception {
		
		
		for(Category categoryName:categoryList) {
			if(categoryName.getName().equals(category.getName())) {
				throw new Exception("Bu isimde bir kategori zaten mevcut");
			}
		
			
		}
		    
		categoryList.add(category);
        categoryDao.add(category);
        System.out.println("Kategori eklendi");
        
        for (Logger logger:loggers) {
			logger.log(category.getName());
		}
	}
	
	 public void list()
	    {
	        for (Category category : categoryList)
	        {
	            System.out.println(category.getName());
	        }
	    }
}
