package lici.modules.services;

import java.util.ServiceLoader;

import lici.modules.db.MyDAO;

public class MyServiceImpl implements MyServices{
	public String getDisplayData() {
		String result = null;
		Iterable<MyDAO> MyDaos =  ServiceLoader.load(MyDAO.class);
		for(MyDAO eachDAO : MyDaos) {
			if (eachDAO.getData() != null) {
				result = eachDAO.getData();
				break;
			}
		}
		return result;
	}

}
