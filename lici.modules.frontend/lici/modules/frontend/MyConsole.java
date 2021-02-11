package lici.modules.frontend;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ServiceLoader;

import lici.modules.services.MyServices;
import lici.modules.services.reflection.AdditionalServices;

public class MyConsole {
	public static void main(String[] args) throws InterruptedException {
		Iterable<MyServices> myServices =  ServiceLoader.load(MyServices.class);
		for (MyServices eachService : myServices) {
			System.out.println(eachService.getDisplayData());
		}
		
	try {
		AdditionalServices additionalServices = new AdditionalServices(); 
		Method privateMethod = AdditionalServices.class.
		            getDeclaredMethod("privateDetails");
		privateMethod.setAccessible(true);
		String fieldValue = (String) privateMethod.invoke(additionalServices);
		System.out.println("methodValue = " + fieldValue);
	} catch (SecurityException e) {
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		e.printStackTrace();
	} catch (NoSuchMethodException e) {
		e.printStackTrace();
	}

		
				Thread.sleep(2000);
	}

}
