package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.CollegeBean;
import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.model.CollegeModel;
import in.co.rays.proj4.model.RoleModel;

public class TestCollegeModel {

	public static void main(String[] args) {

//		testAdd();
//		testUpdate();
//		testFindByPk();
//		testSearch();
//		testDelete();
		testFindByName();
	}

	private static void testAdd() {

		CollegeModel model = new CollegeModel();
		CollegeBean bean = new CollegeBean();

//     	bean.setId(2);
		bean.setName("College");
		bean.setAddress(" Swastik vihar colony , indore");
		bean.setState("MP");
		bean.setCity("Indore");
		bean.setPhoneNo("6402604950");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

	public static void testUpdate() {

		CollegeModel model = new CollegeModel();
		CollegeBean bean = new CollegeBean();

		bean.setName("Devansh");
		bean.setAddress("Jaora");
		bean.setState("MP");
		bean.setCity("Jaora");
		bean.setPhoneNo("7365901105");
		bean.setCreatedBy("Devansh");
		bean.setModifiedBy("Devansh");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		bean.setId(11);

		model.update(bean);
	}

	public static void testFindByPk() {

		CollegeModel model = new CollegeModel();

		CollegeBean bean = model.findByPk(2);

		if (bean != null) {
			System.out.println("ID = " + bean.getId());
			System.out.println("Name = " + bean.getName());
			System.out.println("Address = " + bean.getAddress());
			System.out.println("State = " + bean.getState());
			System.out.println("City = " + bean.getCity());
			System.out.println("Phone No = " + bean.getPhoneNo());
			System.out.println("createdBy = " + bean.getCreatedBy());
			System.out.println("modifedBy = " + bean.getModifiedBy());
			System.out.println("createdDateTime = " + bean.getCreatedDatetime());
			System.out.println("modifiedDateTime = " + bean.getModifiedDatetime());
		} else {
			System.out.println("Record not found");
		}
	}

	public static void testSearch() {

		CollegeModel model = new CollegeModel();
		CollegeBean bean = new CollegeBean();

		// bean.setId(1);;

		List<CollegeBean> list = model.search(bean, 1, 5);

		Iterator<CollegeBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getState());
			System.out.println(bean.getCity());
			System.out.println(bean.getPhoneNo());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		}

	}

	public static void testDelete() {
		CollegeModel model = new CollegeModel();
		CollegeBean bean = new CollegeBean();

		model.delete(7);

	}

	public static void testFindByName() {
		CollegeModel model = new CollegeModel();
		CollegeBean bean = model.findByName("IPS College");

		if (bean == null) {
			System.out.println("Find by college fail");
		}
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getAddress());
		System.out.println(bean.getState());
		System.out.println(bean.getCity());
		System.out.println(bean.getPhoneNo());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());

	}

}
