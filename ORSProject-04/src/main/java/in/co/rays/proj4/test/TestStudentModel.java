package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.StudentBean;
import in.co.rays.proj4.model.StudentModel;

public class TestStudentModel {

    public static StudentModel model = new StudentModel();

    public static void main(String[] args) {

        // testAdd();
        // testUpdate();
        // testDelete();
        // testFindByPk();
        // testSearch();
        // testNextPK();
        testFindByUniqueColumn();
    }

    // Test Add
    private static void testAdd() {

        StudentBean bean = new StudentBean();

        bean.setCollegeId(1L);
        bean.setCollegeName("ABC College");
        bean.setFirstName("Rahul");
        bean.setLastName("Sharma");
        bean.setDob(new Date());
        bean.setMobileNo("9876543210");
        bean.setEmail("rahul.sharma@example.com");

        bean.setCreatedBy("admin");
        bean.setModifiedBy("admin");

        Timestamp timestamp = new Timestamp(new Date().getTime());
        bean.setCreatedDatetime(timestamp);
        bean.setModifiedDatetime(timestamp);

        long pk = model.add(bean);

        System.out.println("Student Added Successfully");
        System.out.println("ID: " + pk);
    }

    // Test Update
    private static void testUpdate() {

        StudentBean bean = new StudentBean();

        bean.setId(1);
        bean.setCollegeId(1L);
        bean.setCollegeName("ABC College");
        bean.setFirstName("Rahul Updated");
        bean.setLastName("Sharma");
        bean.setDob(new Date());
        bean.setMobileNo("9876543210");
        bean.setEmail("rahul.updated@example.com");

        model.update(bean);

        System.out.println("Student Updated Successfully");
    }

    // Test Delete
    private static void testDelete() {

        model.delete(1);

        System.out.println("Student Deleted Successfully");
    }

    // Test Find By Primary Key
    private static void testFindByPk() {

        StudentBean bean = model.findByPk(1);

        if (bean != null) {
            System.out.println("ID: " + bean.getId());
            System.out.println("College ID: " + bean.getCollegeId());
            System.out.println("College Name: " + bean.getCollegeName());
            System.out.println("First Name: " + bean.getFirstName());
            System.out.println("Last Name: " + bean.getLastName());
            System.out.println("DOB: " + bean.getDob());
            System.out.println("Mobile No: " + bean.getMobileNo());
            System.out.println("Email: " + bean.getEmail());
            System.out.println("Created By: " + bean.getCreatedBy());
            System.out.println("Modified By: " + bean.getModifiedBy());
            System.out.println("Created Datetime: " + bean.getCreatedDatetime());
            System.out.println("Modified Datetime: " + bean.getModifiedDatetime());
        } else {
            System.out.println("Student Not Found");
        }
    }

    // Test Search
    private static void testSearch() {

        StudentBean bean = new StudentBean();

        List<StudentBean> list = model.search(bean, 1, 10);

        Iterator<StudentBean> it = list.iterator();

        while (it.hasNext()) {

            StudentBean student = it.next();

            System.out.println("ID: " + student.getId());
            System.out.println("College ID: " + student.getCollegeId());
            System.out.println("College Name: " + student.getCollegeName());
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("DOB: " + student.getDob());
            System.out.println("Mobile No: " + student.getMobileNo());
            System.out.println("Email: " + student.getEmail());
            System.out.println("-----------------------------");
        }
    }

    // Test Next Primary Key
    private static void testNextPK() {

        long pk = model.nextPK();

        System.out.println("Next Primary Key: " + pk);
    }

    // Test Find By Unique Column
    private static void testFindByUniqueColumn() {

        StudentBean bean =
                model.findByUniqueColumn("EMAIL", "rahul.sharma@example.com");

        if (bean != null) {
            System.out.println("ID: " + bean.getId());
            System.out.println("First Name: " + bean.getFirstName());
            System.out.println("Last Name: " + bean.getLastName());
            System.out.println("Email: " + bean.getEmail());
        } else {
            System.out.println("Student Not Found");
        }
    }
}