package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.SubjectBean;
import in.co.rays.proj4.model.SubjectModel;

public class TestSubjectModel {

    public static SubjectModel model = new SubjectModel();

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

        SubjectBean bean = new SubjectBean();

        bean.setName("Java");
        bean.setDescription("Core Java Subject");
        bean.setCourseId(1L);

        bean.setCreatedBy("admin");
        bean.setModifiedBy("admin");

        Timestamp timestamp = new Timestamp(new Date().getTime());
        bean.setCreatedDatetime(timestamp);
        bean.setModifiedDatetime(timestamp);

        long pk = model.add(bean);

        System.out.println("Subject Added Successfully");
        System.out.println("ID: " + pk);
    }

    // Test Update
    private static void testUpdate() {

        SubjectBean bean = new SubjectBean();

        bean.setId(1);
        bean.setName("Advanced Java");
        bean.setDescription("Advanced Java Subject");
        bean.setCourseId(1L);

        model.update(bean);

        System.out.println("Subject Updated Successfully");
    }

    // Test Delete
    private static void testDelete() {

        model.delete(1);

        System.out.println("Subject Deleted Successfully");
    }

    // Test Find By Primary Key
    private static void testFindByPk() {

        SubjectBean bean = model.findByPk(1);

        if (bean != null) {
            System.out.println("ID: " + bean.getId());
            System.out.println("Name: " + bean.getName());
            System.out.println("Description: " + bean.getDescription());
            System.out.println("Course ID: " + bean.getCourseId());
            System.out.println("Created By: " + bean.getCreatedBy());
            System.out.println("Modified By: " + bean.getModifiedBy());
            System.out.println("Created Datetime: " + bean.getCreatedDatetime());
            System.out.println("Modified Datetime: " + bean.getModifiedDatetime());
        } else {
            System.out.println("Subject Not Found");
        }
    }

    // Test Search
    private static void testSearch() {

        SubjectBean bean = new SubjectBean();

        List<SubjectBean> list = model.search(bean, 1, 10);

        Iterator<SubjectBean> it = list.iterator();

        while (it.hasNext()) {

            SubjectBean subject = it.next();

            System.out.println("ID: " + subject.getId());
            System.out.println("Name: " + subject.getName());
            System.out.println("Description: " + subject.getDescription());
            System.out.println("Course ID: " + subject.getCourseId());
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

        SubjectBean bean =
                model.findByUniqueColumn("NAME", "Java");

        if (bean != null) {
            System.out.println("ID: " + bean.getId());
            System.out.println("Name: " + bean.getName());
            System.out.println("Description: " + bean.getDescription());
            System.out.println("Course ID: " + bean.getCourseId());
        } else {
            System.out.println("Subject Not Found");
        }
    }
}
