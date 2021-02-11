module lici.modules.services {
	exports lici.modules.services;
	requires lici.modules.db;
	provides lici.modules.services.MyServices with lici.modules.services.MyServiceImpl;
	uses lici.modules.db.MyDAO;
	exports lici.modules.services.reflection to lici.modules.frontend;
	opens lici.modules.services.reflection to lici.modules.frontend;

}