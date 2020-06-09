package net.foodordering.v1.dal;

import static net.foodordering.v1.dal.DBConnectionManager.*;
import org.hibernate.Session;

public class RadyDALMain {

    public static void main(String[] args) {
	try (Session session = openSession()) {
	    beginTransaction();
	    System.out.println("start");

	    commitTransaction();
	    System.out.println("end");
	} catch (Exception e) {
	    System.err.println(e.getMessage());
	    if (isActiveTransaction()) {
		rollbackTransaction();
	    }
	}
    }
}
