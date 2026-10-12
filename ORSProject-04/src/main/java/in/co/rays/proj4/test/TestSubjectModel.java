package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.bean.SubjectBean;
import in.co.rays.proj4.model.RoleModel;
import in.co.rays.proj4.model.SubjectModel;

public class TestSubjectModel {

	public static void main(String[] args) {

//		testAdd();
//		testUpdate();
//		testFindByPk();
//		testSearch();
//		testDelete();
		testFindByName();

	}

	private static void testAdd() {

		SubjectModel model = new SubjectModel();
		SubjectBean bean = new SubjectBean();

//		bean.getId(0);
		bean.setName("Java");
		bean.setDescription("Core Java Subject");
		bean.setCourseId(1);
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

	public static void testUpdate() {

		SubjectModel model = new SubjectModel();
		SubjectBean bean = new SubjectBean();

		bean.setName("Advanced Java");
		bean.setDescription("Advanced Java Subject");
		bean.setCourseId(1);
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		bean.setId(1);

		model.update(bean);

	}

	public static void testFindByPk() {

		SubjectModel model = new SubjectModel();
		SubjectBean bean = model.findByPk(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCourseId());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		} else {
			System.out.println(" Record Not Found");
		}
	}

	public static void testSearch() {
		SubjectModel model = new SubjectModel();
		SubjectBean bean = new SubjectBean();

		List<SubjectBean> list = model.search(bean, 1, 2);
		Iterator<SubjectBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCourseId());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
			System.out.println("-----------");
		}
	}

	public static void testDelete() {
		SubjectModel model = new SubjectModel();
		SubjectBean bean = new SubjectBean();

		model.delete(7);

	}

	public static void testFindByName() {
		SubjectModel model = new SubjectModel();
		SubjectBean bean = model.findByName("Advanced Java");

		if (bean == null) {
			System.out.println("test find by name fail");
		}
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getDescription());
		System.out.println(bean.getCourseId());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
	}
}