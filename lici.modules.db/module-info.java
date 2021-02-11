module lici.modules.db {
	exports lici.modules.db to lici.modules.services;
	provides lici.modules.db.MyDAO with lici.modules.db.MyDAOImpl;
}