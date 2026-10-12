package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.bean.StudentBean;
import in.co.rays.proj4.model.RoleModel;
import in.co.rays.proj4.model.StudentModel;

public class TestStudentModel {

	public static void main(String[] args) {

//		testAdd();
//		testUpdate();
//		testFindByPk();
//		testSearch();
//		testDelete();
		testFindByEmail();

	}

	private static void testAdd() {

		StudentModel model = new StudentModel();
		StudentBean bean = new StudentBean();

//		bean.setId(0);
		bean.setCollegeId(1L);
		bean.setCollegeName("IPS College");
		bean.setFirstName("Rahul");
		bean.setLastName("Sharma");
		bean.setDob(new Date());
		bean.setMobileNo("9876543210");
		bean.setEmail("rahul@gmail.com");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

	public static void testUpdate() {

		StudentModel model = new StudentModel();
		StudentBean bean = new StudentBean();

		bean.setCollegeId(1L);
		bean.setCollegeName("IPS College");
		bean.setFirstName("Amit");
		bean.setLastName("Sharma");
		bean.setDob(new Date());
		bean.setMobileNo("9876543211");
		bean.setEmail("amit@gmail.com");
		bean.setCreatedBy("Amit");
		bean.setModifiedBy("Amit");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		bean.setId(11);

		model.update(bean);

	}

	public static void testFindByPk() {

		StudentModel model = new StudentModel();
		StudentBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getDob());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		} else {
			System.out.println("Record not found");
		}

	}

	public static void testSearch() {

		StudentModel model = new StudentModel();
		StudentBean bean = new StudentBean();

		List<StudentBean> list = model.search(bean, 1, 5);

		Iterator<StudentBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getDob());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
			System.out.println("-----------------");
		}

	}

	public static void testDelete() {
		StudentModel model = new StudentModel();
		StudentBean bean = new StudentBean();

		model.delete(7);

	}

	public static void testFindByEmail() {
		StudentModel model = new StudentModel();
		StudentBean bean = model.findByEmail("rohan@gmail.com");

		if (bean == null) {
			System.out.println("find by email is fail");
		}
		System.out.println(bean.getId());
		System.out.println(bean.getCollegeId());
		System.out.println(bean.getCollegeName());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getDob());
		System.out.println(bean.getMobileNo());
		System.out.println(bean.getEmail());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
	}
}