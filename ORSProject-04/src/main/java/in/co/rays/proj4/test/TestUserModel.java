package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.UserBean;
import in.co.rays.proj4.model.UserModel;

public class TestUserModel {

	public static UserModel model = new UserModel();

	public static void main(String[] args) {

		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testSearch();
		// testNextPK();
		// testFindByUniqueColumn();
		// testFindByLogin();
		testAuthenticate();
	}

	// Test Add
	private static void testAdd() {

		UserBean bean = new UserBean();

		bean.setFirstName("Rahul");
		bean.setLastName("Sharma");
		bean.setLogin("rahul.sharma@test.com");
		bean.setPassword("Test@123");
		bean.setConfirmPassword("Test@123");
		bean.setDob(new Date());
		bean.setMobileNo("9876543210");
		bean.setRoleId(1L);
		bean.setUnSuccessfulLogin(0);
		bean.setGender("Male");
		bean.setLastLogin(new Timestamp(System.currentTimeMillis()));
		bean.setLock(UserBean.INACTIVE);
		bean.setRegisteredIP("127.0.0.1");
		bean.setLastLoginIP("127.0.0.1");

		bean.setCreatedBy("admin");
		bean.setModifiedBy("admin");

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		bean.setCreatedDatetime(timestamp);
		bean.setModifiedDatetime(timestamp);

		long pk = model.add(bean);

		System.out.println("User Added Successfully");
		System.out.println("ID: " + pk);
	}

	// Test Update
	private static void testUpdate() {

		UserBean bean = new UserBean();

		bean.setId(1);
		bean.setFirstName("Rahul Updated");
		bean.setLastName("Sharma");
		bean.setLogin("rahul.updated@test.com");
		bean.setPassword("Test@123");
		bean.setDob(new Date());
		bean.setMobileNo("9876543210");
		bean.setRoleId(1L);
		bean.setUnSuccessfulLogin(0);
		bean.setGender("Male");
		bean.setLastLogin(new Timestamp(System.currentTimeMillis()));
		bean.setLock(UserBean.ACTIVE);
		bean.setRegisteredIP("127.0.0.1");
		bean.setLastLoginIP("127.0.0.1");

		bean.setCreatedBy("admin");
		bean.setModifiedBy("admin");

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		bean.setCreatedDatetime(timestamp);
		bean.setModifiedDatetime(timestamp);

		model.update(bean);

		System.out.println("User Updated Successfully");
	}

	// Test Delete
	private static void testDelete() {

		model.delete(1);

		System.out.println("User Deleted Successfully");
	}

	// Test Find By Primary Key
	private static void testFindByPk() {

		UserBean bean = model.findByPk(1);

		if (bean != null) {
			printUser(bean);
		} else {
			System.out.println("User Not Found");
		}
	}

	// Test Search
	private static void testSearch() {

		UserBean searchBean = new UserBean();
		searchBean.setFirstName("Rahul");

		List<UserBean> list = model.search(searchBean, 1, 10);

		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {
			printUser(it.next());
			System.out.println("-----------------------------");
		}
	}

	// Test Next Primary Key
	private static void testNextPK() {

		long pk = model.nextPK();

		System.out.println("Next Primary Key: " + pk);
	}

	// Test Find By Unique Column
	private static void testFindByUniqueColumn() {

		UserBean bean = model.findByUniqueColumn("LOGIN", "rahul.sharma@test.com");

		if (bean != null) {
			printUser(bean);
		} else {
			System.out.println("User Not Found");
		}
	}

	// Test Find By Login
	private static void testFindByLogin() {

		UserBean bean = model.findByLogin("rahul.sharma@test.com");

		if (bean != null) {
			printUser(bean);
		} else {
			System.out.println("User Not Found");
		}
	}

	// Test Authentication
	private static void testAuthenticate() {

		UserBean bean = model.authenticate("rahul.sharma@test.com", "Test@123");

		if (bean != null) {
			System.out.println("Authentication Successful");
			System.out.println("Welcome " + bean.getFirstName());
		} else {
			System.out.println("Invalid Login or Password");
		}
	}

	// Common method to print user details
	private static void printUser(UserBean bean) {

		System.out.println("ID: " + bean.getId());
		System.out.println("First Name: " + bean.getFirstName());
		System.out.println("Last Name: " + bean.getLastName());
		System.out.println("Login: " + bean.getLogin());
		System.out.println("Password: " + bean.getPassword());
		System.out.println("DOB: " + bean.getDob());
		System.out.println("Mobile No: " + bean.getMobileNo());
		System.out.println("Role ID: " + bean.getRoleId());
		System.out.println("Unsuccessful Login: " + bean.getUnSuccessfulLogin());
		System.out.println("Gender: " + bean.getGender());
		System.out.println("Last Login: " + bean.getLastLogin());
		System.out.println("Lock: " + bean.getLock());
		System.out.println("Registered IP: " + bean.getRegisteredIP());
		System.out.println("Last Login IP: " + bean.getLastLoginIP());
		System.out.println("Created By: " + bean.getCreatedBy());
		System.out.println("Modified By: " + bean.getModifiedBy());
		System.out.println("Created Datetime: " + bean.getCreatedDatetime());
		System.out.println("Modified Datetime: " + bean.getModifiedDatetime());
	}
}
