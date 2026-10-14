package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.FacultyBean;
import in.co.rays.proj4.model.FacultyModel;

public class TestFacultyModel {

    public static FacultyModel model = new FacultyModel();

    public static void main(String[] args) {

        // testAdd();
        // testUpdate();
        // testDelete();
        // testFindByPk();
        // testSearch();
        // testNextPK();
        testFindByUniqueColumn();
    }

    private static void testAdd() {

        FacultyBean bean = new FacultyBean();

        bean.setCollegeId(1);
        bean.setCollegeName("Malwa Institute");
        bean.setFirstName("Rahul");
        bean.setLastName("Sharma");
        bean.setEmail("rahul.sharma@example.com");
        bean.setMobileNo("9876543210");
        bean.setAddress("AB Road, Indore");
        bean.setGender("Male");
        bean.setDob(new Date());

        bean.setCreatedBy("root");
        bean.setModifiedBy("root");
        bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
        bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

        try {
            long pk = model.add(bean);
            System.out.println("Faculty added successfully. ID = " + pk);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testUpdate() {

        FacultyBean bean = new FacultyBean();

        bean.setId(1);
        bean.setCollegeId(1);
        bean.setCollegeName("Malwa Institute");
        bean.setFirstName("Rahul");
        bean.setLastName("Sharma");
        bean.setEmail("rahul.sharma@example.com");
        bean.setMobileNo("9876543210");
        bean.setAddress("Vijay Nagar, Indore");
        bean.setGender("Male");
        bean.setDob(new Date());

        try {
            model.update(bean);
            System.out.println("Faculty updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testDelete() {

        try {
            model.delete(1);
            System.out.println("Faculty deleted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testFindByPk() {

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
            System.out.println(bean.getCreatedBy());
            System.out.println(bean.getModifiedBy());
            System.out.println(bean.getCreatedDatetime());
            System.out.println(bean.getModifiedDatetime());

        } else {
            System.out.println("Faculty record not found");
        }
    }

    private static void testSearch() {

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

        FacultyBean bean =
                model.findByUniqueColumn("EMAIL", "rahul.sharma@example.com");

        if (bean != null) {

            System.out.println(bean.getId());
            System.out.println(bean.getFirstName());
            System.out.println(bean.getLastName());
            System.out.println(bean.getEmail());
            System.out.println(bean.getMobileNo());

        } else {
            System.out.println("Faculty record not found");
        }
    }
}
