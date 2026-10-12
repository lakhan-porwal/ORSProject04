package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.management.relation.Role;

import in.co.rays.proj4.bean.FacultyBean;
import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.model.FacultyModel;
import in.co.rays.proj4.model.RoleModel;

public class TestRoleModel {

	public static void main(String[] args) {
//		testAdd();
//		testUpdate();
//		testFindByPk();
//		testSearch();
//		testDelete();
		testFindByName();
	}

	private static void testAdd() {

		RoleModel model = new RoleModel();
		RoleBean bean = new RoleBean();

		bean.setId(5);
		bean.setName("ayush");
		bean.setDescription("ayush role");
		bean.setCreatedBy("ayush");
		bean.setModifiedBy("ayush");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

	private static void testUpdate() {
		RoleModel model = new RoleModel();
		RoleBean bean = new RoleBean();

		bean.setName("KIOSK");
		bean.setDescription("KIOSK role");
		bean.setCreatedBy("KIOSK");
		bean.setModifiedBy("KIOSK");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		bean.setId(5);

		model.update(bean);

	}

	public static void testFindByPk() {

		RoleModel model = new RoleModel();

		RoleBean bean = model.findByPk(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println("createdBy = " + bean.getCreatedBy());
			System.out.println("modifedBy = " + bean.getModifiedBy());
			System.out.println("createdDateTime = " + bean.getCreatedDatetime());
			System.out.println("modifiedDateTime = " + bean.getModifiedDatetime());
		} else {
			System.out.println("Record not found");
		}

	}

	public static void testSearch() {

		RoleModel model = new RoleModel();
		RoleBean bean = new RoleBean();

		List<RoleBean> list = model.search(bean, 1, 5);

		Iterator<RoleBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
			System.out.println("------------------");
		}

	}

	public static void testDelete() {
		RoleModel model = new RoleModel();
		RoleBean bean = new RoleBean();

		model.delete(7);

	}

	public static void testFindByName() {

		try {

			RoleModel model = new RoleModel();
			RoleBean bean = model.findByName("KIOSk");

			if (bean == null) {
				System.out.println("Test Find By Pk Fail");
			}
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
