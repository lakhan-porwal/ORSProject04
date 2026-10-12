package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.CollegeBean;
import in.co.rays.proj4.bean.CourseBean;
import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.model.CollegeModel;
import in.co.rays.proj4.model.CourseModel;
import in.co.rays.proj4.model.RoleModel;

public class TestCourseModel {

	public static void main(String[] args) {

//  	testAdd();
//		testUpdate();
//		testFindByPk();
//		testSearch();
//		testDelete();
		testFindByName();

	}

	private static void testAdd() {

		CourseModel model = new CourseModel();
		CourseBean bean = new CourseBean();

		bean.setId(7);
		bean.setName("Hibernate");
		bean.setDescription("Hibernate Framework Course");
		bean.setDuration("1 year");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

	private static void testUpdate() {

		CourseModel model = new CourseModel();
		CourseBean bean = new CourseBean();

		bean.setName("course");
		bean.setDescription("course description");
		bean.setDuration("1 year");
		bean.setCreatedBy("course");
		bean.setModifiedBy("course");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		bean.setId(11);

		model.update(bean);

	}

	public static void testFindByPk() {

		CourseModel model = new CourseModel();

		CourseBean bean = model.findByPk(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getDuration());
			System.out.println("createdBy = " + bean.getCreatedBy());
			System.out.println("modifedBy = " + bean.getModifiedBy());
			System.out.println("createdDateTime = " + bean.getCreatedDatetime());
			System.out.println("modifiedDateTime = " + bean.getModifiedDatetime());
		} else {
			System.out.println("Record not found");
		}

	}

	public static void testSearch() {

		CourseModel model = new CourseModel();
		CourseBean bean = new CourseBean();

		List<CourseBean> list = model.search(bean, 1, 3);

		Iterator<CourseBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getDuration());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
			System.out.println("----------------------");

		}
	}

	public static void testDelete() {
		CourseModel model = new CourseModel();
		CourseBean bean = new CourseBean();

		model.delete(7);

	}

	public static void testFindByName() {
		CourseModel model = new CourseModel();
		CourseBean bean = model.findByName("Advanced Java");

		if (bean == null) {

			System.out.println("find by name fail");

		}

		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getDescription());
		System.out.println(bean.getDuration());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
	}
}
