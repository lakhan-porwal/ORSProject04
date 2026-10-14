
package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.CollegeBean;
import in.co.rays.proj4.model.CollegeModel;

public class TestCollegeModel {

	public static CollegeModel model = new CollegeModel();

	public static void main(String[] args) {

		// testAdd();
		// testUpdate();
		// testDelete();
		// testSearch();
		// testFindByPk();
		// testNextPK();
		testFindByUniqueColumn();
	}

	private static void testAdd() {

		CollegeBean bean = new CollegeBean();

		bean.setName("Malwa Institute");
		bean.setAddress("AB Road");
		bean.setState("MP");
		bean.setCity("Indore");
		bean.setPhoneNo("9977808890");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		try {
			long pk = model.add(bean);
			System.out.println("College added successfully. ID = " + pk);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testUpdate() {

		CollegeBean bean = new CollegeBean();

		bean.setId(6);
		bean.setName("Malwa Institute");
		bean.setAddress("AB Road");
		bean.setState("MP");
		bean.setCity("Indore");
		bean.setPhoneNo("9977808890");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		try {
			model.update(bean);
			System.out.println("College updated successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testDelete() {

		try {
			model.delete(2);
			System.out.println("College deleted successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testFindByPk() {

		CollegeBean bean = model.findByPk(2);

		if (bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getCity());
			System.out.println(bean.getState());
			System.out.println(bean.getPhoneNo());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		} else {
			System.out.println("College record not found");
		}
	}

	private static void testSearch() {

		CollegeBean bean = new CollegeBean();

		List<CollegeBean> list = model.search(bean, 1, 5);

		Iterator<CollegeBean> it = list.iterator();

		while (it.hasNext()) {

			bean = it.next();

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getCity());
			System.out.println(bean.getState());
			System.out.println(bean.getPhoneNo());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

			System.out.println("--------------------------------------");
		}
	}

	private static void testNextPK() {

		try {
			System.out.println("Next PK = " + model.nextPK());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testFindByUniqueColumn() {

        CollegeBean bean =
                model.findByUniqueColumn("PHONE_NO", "9977808890");

        if (bean != null) {
            System.out.println(bean.getId());
            System.out.println(bean.getName());
            System.out.println(bean.getAddress());
            System.out.println(bean.getCity());
            System.out.println(bean.getState());
            System.out.println(bean.getPhoneNo());
        } else {
            System.out.println("College record not found");
        }
    }
}