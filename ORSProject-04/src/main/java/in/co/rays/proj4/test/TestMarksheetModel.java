package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.MarksheetBean;
import in.co.rays.proj4.model.MarksheetModel;

public class TestMarksheetModel {

    public static MarksheetModel model = new MarksheetModel();

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

        MarksheetBean bean = new MarksheetBean();

        bean.setRollNo("R101");
        bean.setStudentId(1L);
        bean.setName("Rahul Sharma");
        bean.setPhysics(85);
        bean.setChemistry(78);
        bean.setMaths(92);

        bean.setCreatedBy("admin");
        bean.setModifiedBy("admin");

        Timestamp timestamp = new Timestamp(new Date().getTime());
        bean.setCreatedDatetime(timestamp);
        bean.setModifiedDatetime(timestamp);

        long pk = model.add(bean);

        System.out.println("Marksheet Added Successfully");
        System.out.println("ID: " + pk);
    }

    // Test Update
    private static void testUpdate() {

        MarksheetBean bean = new MarksheetBean();

        bean.setId(1);
        bean.setRollNo("R101");
        bean.setStudentId(1L);
        bean.setName("Rahul Sharma Updated");
        bean.setPhysics(90);
        bean.setChemistry(88);
        bean.setMaths(95);

        bean.setCreatedBy("admin");
        bean.setModifiedBy("admin");

        Timestamp timestamp = new Timestamp(new Date().getTime());
        bean.setCreatedDatetime(timestamp);
        bean.setModifiedDatetime(timestamp);

        model.update(bean);

        System.out.println("Marksheet Updated Successfully");
    }

    // Test Delete
    private static void testDelete() {

        model.delete(1);

        System.out.println("Marksheet Deleted Successfully");
    }

    // Test Find By Primary Key
    private static void testFindByPk() {

        MarksheetBean bean = model.findByPk(1);

        if (bean != null) {
            System.out.println("ID: " + bean.getId());
            System.out.println("Roll No: " + bean.getRollNo());
            System.out.println("Student ID: " + bean.getStudentId());
            System.out.println("Name: " + bean.getName());
            System.out.println("Physics: " + bean.getPhysics());
            System.out.println("Chemistry: " + bean.getChemistry());
            System.out.println("Maths: " + bean.getMaths());
            System.out.println("Created By: " + bean.getCreatedBy());
            System.out.println("Modified By: " + bean.getModifiedBy());
            System.out.println("Created Datetime: " + bean.getCreatedDatetime());
            System.out.println("Modified Datetime: " + bean.getModifiedDatetime());
        } else {
            System.out.println("Marksheet Not Found");
        }
    }

    // Test Search
    private static void testSearch() {

        MarksheetBean bean = new MarksheetBean();

        List<MarksheetBean> list = model.search(bean, 1, 10);

        Iterator<MarksheetBean> it = list.iterator();

        while (it.hasNext()) {

            MarksheetBean marksheet = it.next();

            System.out.println("ID: " + marksheet.getId());
            System.out.println("Roll No: " + marksheet.getRollNo());
            System.out.println("Student ID: " + marksheet.getStudentId());
            System.out.println("Name: " + marksheet.getName());
            System.out.println("Physics: " + marksheet.getPhysics());
            System.out.println("Chemistry: " + marksheet.getChemistry());
            System.out.println("Maths: " + marksheet.getMaths());
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

        MarksheetBean bean =
                model.findByUniqueColumn("ROLL_NO", "R101");

        if (bean != null) {
            System.out.println("ID: " + bean.getId());
            System.out.println("Roll No: " + bean.getRollNo());
            System.out.println("Student ID: " + bean.getStudentId());
            System.out.println("Name: " + bean.getName());
            System.out.println("Physics: " + bean.getPhysics());
            System.out.println("Chemistry: " + bean.getChemistry());
            System.out.println("Maths: " + bean.getMaths());
        } else {
            System.out.println("Marksheet Not Found");
        }
    }
}
