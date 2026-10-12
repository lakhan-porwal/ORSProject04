package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.MarksheetBean;
import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.bean.MarksheetBean;
import in.co.rays.proj4.model.MarksheetModel;
import in.co.rays.proj4.model.RoleModel;
import in.co.rays.proj4.model.MarksheetModel;

public class TestMarksheetModel {

	public static void main(String[] args) {

//		testAdd();
//		testUpdate();
//		testFindByPk();
//		testSearch();
//		testDelete();
		testFindByName();

	}

	private static void testAdd() {

		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = new MarksheetBean();

		bean.setRollNo("101");
		bean.setStudentId(1);
		bean.setName("Rahul Sharma");
		bean.setPhysics(80);
		bean.setChemistry(75);
		bean.setMaths(85);
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

	public static void testUpdate() {

		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = new MarksheetBean();

		bean.setRollNo("102");
		bean.setStudentId(1);
		bean.setName("Amit Sharma");
		bean.setPhysics(85);
		bean.setChemistry(80);
		bean.setMaths(90);
		bean.setCreatedBy("Amit");
		bean.setModifiedBy("Amit");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		bean.setId(11);

		model.update(bean);
	}

	public static void testFindByPk() {

		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = model.findByPk(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getRollNo());
			System.out.println(bean.getStudentId());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());
			System.out.println("createdBy = " + bean.getCreatedBy());
			System.out.println("modifedBy = " + bean.getModifiedBy());
			System.out.println("createdDateTime = " + bean.getCreatedDatetime());
			System.out.println("modifiedDateTime = " + bean.getModifiedDatetime());
		} else {
			System.out.println("Record not found");
		}

	}

	public static void testSearch() {

		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = new MarksheetBean();

		List<MarksheetBean> list = model.search(bean, 1, 5);

		Iterator<MarksheetBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getRollNo());
			System.out.println(bean.getStudentId());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
			System.out.println("--------------");
		}

	}

	public static void testDelete() {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = new MarksheetBean();

		model.delete(7);

	}

	public static void testFindByName() {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findByName("Rohan Sharma");

		if (bean == null) {
			System.out.println("find by name is fail");
		}
		System.out.println(bean.getId());
		System.out.println(bean.getRollNo());
		System.out.println(bean.getName());
		System.out.println(bean.getPhysics());
		System.out.println(bean.getChemistry());
		System.out.println(bean.getMaths());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());

	}

}