package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.bean.UserBean;
import in.co.rays.proj4.model.RoleModel;
import in.co.rays.proj4.model.UserModel;

public class TestUserModel {

	public static void main(String[] args) throws Exception {

//		testAdd();
//		testUpdate();
//		testFindByPk();
//		testSearch();
//		testDelete();
		testFindByLogin();

	}

	private static void testAdd() throws Exception {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setId(5);
		bean.setFirstName("User");
		bean.setLastName("User admin");
		bean.setLogin("user@gmail.com");
		bean.setPassword("user123!@");
		bean.setConfirmPassword("user123!@");
		bean.setDob(sdf.parse("2025-02-10"));
		bean.setMobileNo("626494xxxx");
		bean.setRoleId(504661);
		bean.setUnSuccessfulLogin(0);
		bean.setGender("male");
		bean.setLastLogin(new Timestamp(new Date().getTime()));
		bean.setLock("1234");
		bean.setRegisteredIP("192.168.1.1");
		bean.setLastLoginIP("192.168.1.2");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		long pk = model.add(bean);
		System.out.println("Record Added Successfully, ID = " + pk);

	}

	private static void testUpdate() throws ParseException {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setId(5);
		bean.setFirstName("Atul");
		bean.setLastName("Atul admin");
		bean.setLogin("Atul@gmail.com");
		bean.setPassword("Atul12!@");
		bean.setConfirmPassword("Atul12!@");
		bean.setDob(sdf.parse("2025-02-10"));
		bean.setMobileNo("626494xxxx");
		bean.setRoleId(504661);
		bean.setUnSuccessfulLogin(0);
		bean.setGender("male");
		bean.setLastLogin(new Timestamp(new Date().getTime()));
		bean.setLock("1234");
		bean.setRegisteredIP("192.168.1.1");
		bean.setLastLoginIP("192.168.1.2");
		bean.setCreatedBy("Atul");
		bean.setModifiedBy("Atul");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.update(bean);

	}

	public static void testFindByPk() {

		UserModel model = new UserModel();
		UserBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLogin());
			System.out.println(bean.getPassword());
			System.out.println(bean.getConfirmPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getRoleId());
			System.out.println(bean.getUnSuccessfulLogin());
			System.out.println(bean.getGender());
			System.out.println(bean.getLastLogin());
			System.out.println(bean.getLock());
			System.out.println(bean.getRegisteredIP());
			System.out.println(bean.getLastLoginIP());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		} else {
			System.out.println("record not found ");
		}

	}

	public static void testSearch() {
		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		List<UserBean> list = model.search(bean, 1, 3);
		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLogin());
			System.out.println(bean.getPassword());
			System.out.println(bean.getConfirmPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getRoleId());
			System.out.println(bean.getUnSuccessfulLogin());
			System.out.println(bean.getGender());
			System.out.println(bean.getLastLogin());
			System.out.println(bean.getLock());
			System.out.println(bean.getRegisteredIP());
			System.out.println(bean.getLastLoginIP());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
			System.out.println("-----------------");
		}
	}

	public static void testDelete() {
		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		model.delete(7);

	}

	public static void testFindByLogin() {

		try {

			UserModel model = new UserModel();
			UserBean bean = model.findByLogin("amit@gmail.com");

			if (bean == null) {
				System.out.println("Test find by login fail");
			}
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastLoginIP());
			System.out.println(bean.getLogin());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getRoleId());
			System.out.println(bean.getUnSuccessfulLogin());
			System.out.println(bean.getGender());
			System.out.println(bean.getLastLogin());
			System.out.println(bean.getLock());
			System.out.println(bean.getRegisteredIP());
			System.out.println(bean.getLastLoginIP());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}