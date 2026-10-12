package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.FacultyBean;
import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.model.FacultyModel;
import in.co.rays.proj4.model.RoleModel;

public class TestFacultyModel {

	public static void main(String[] args) {

//		testAdd();
//		testUpdate();
//		testFindByPk();
//		testSearch();
//		testDelete();
		testFindByEmail();

	}

	private static void testAdd() {

		FacultyModel model = new FacultyModel();
		FacultyBean bean = new FacultyBean();

//		bean.setId(0);
		bean.setCollegeId(1);
		bean.setCollegeName("IPS College");
		bean.setFirstName("Rahul");
		bean.setLastName("Sharma");
		bean.setEmail("rahul@gmail.com");
		bean.setMobileNo("9876543210");
		bean.setAddress("Indore");
		bean.setGender("Male");
		bean.setDob(new Date());
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

	public static void testUpdate() {

		FacultyModel model = new FacultyModel();
		FacultyBean bean = new FacultyBean();

		bean.setCollegeId(1);
		bean.setCollegeName("IPS College");
		bean.setFirstName("Amit");
		bean.setLastName("Sharma");
		bean.setEmail("amit@gmail.com");
		bean.setMobileNo("9876543211");
		bean.setAddress("Indore");
		bean.setGender("Male");
		bean.setDob(new Date());
		bean.setCreatedBy("Amit");
		bean.setModifiedBy("Amit");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		bean.setId(11);

		model.update(bean);
	}

	public static void testFindByPk() {

		FacultyModel model = new FacultyModel();

		FacultyBean bean = model.findByPk(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getEmail());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getAddress());
			System.out.println(bean.getGender());
			System.out.println(bean.getDob());
			System.out.println("createdBy = " + bean.getCreatedBy());
			System.out.println("modifedBy = " + bean.getModifiedBy());
			System.out.println("createdDateTime = " + bean.getCreatedDatetime());
			System.out.println("modifiedDateTime = " + bean.getModifiedDatetime());
		} else {
			System.out.println("Record not found");
		}

	}

	public static void testSearch() {

		FacultyModel model = new FacultyModel();
		FacultyBean bean = new FacultyBean();

		List<FacultyBean> list = model.search(bean, 1, 5);

		Iterator<FacultyBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getEmail());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getAddress());
			System.out.println(bean.getGender());
			System.out.println(bean.getDob());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

			System.out.println("----------------------------");
		}
	}

	public static void testDelete() {
		FacultyModel model = new FacultyModel();
		FacultyBean bean = new FacultyBean();

		model.delete(7);

	}

	public static void testFindByEmail() {
		FacultyModel model = new FacultyModel();
		FacultyBean bean = model.findByEmail("rahul.f@gmail.com");

		if (bean == null) {
			System.out.println("find by emial fail");

		}
		System.out.println(bean.getId());
		System.out.println(bean.getCollegeId());
		System.out.println(bean.getCollegeName());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getEmail());
		System.out.println(bean.getMobileNo());
		System.out.println(bean.getAddress());
		System.out.println(bean.getGender());
		System.out.println(bean.getDob());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
	}

}