package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.model.RoleModel;

public class TestRoleModel {

    public static RoleModel model = new RoleModel();

    public static void main(String[] args) {

        // testAdd();
        // testUpdate();
        // testDelete();
        // testFindByPk();
        // testSearch();
        // testNextPK();
        // testFindByUniqueColumn();
        testFindByName();
    }

    // Test Add
    private static void testAdd() {

        RoleBean bean = new RoleBean();

        bean.setName("Manager");
        bean.setDescription("Manager Role");

        bean.setCreatedBy("admin");
        bean.setModifiedBy("admin");

        Timestamp timestamp = new Timestamp(new Date().getTime());
        bean.setCreatedDatetime(timestamp);
        bean.setModifiedDatetime(timestamp);

        long pk = model.add(bean);

        System.out.println("Role Added Successfully");
        System.out.println("ID: " + pk);
    }

    // Test Update
    private static void testUpdate() {

        RoleBean bean = new RoleBean();

        bean.setId(1);
        bean.setName("Manager Updated");
        bean.setDescription("Updated Manager Role");

        bean.setCreatedBy("admin");
        bean.setModifiedBy("admin");

        Timestamp timestamp = new Timestamp(new Date().getTime());
        bean.setCreatedDatetime(timestamp);
        bean.setModifiedDatetime(timestamp);

        model.update(bean);

        System.out.println("Role Updated Successfully");
    }

    // Test Delete
    private static void testDelete() {

        model.delete(1);

        System.out.println("Role Deleted Successfully");
    }

    // Test Find By Primary Key
    private static void testFindByPk() {

        RoleBean bean = model.findByPk(1);

        if (bean != null) {
            System.out.println("ID: " + bean.getId());
            System.out.println("Name: " + bean.getName());
            System.out.println("Description: " + bean.getDescription());
            System.out.println("Created By: " + bean.getCreatedBy());
            System.out.println("Modified By: " + bean.getModifiedBy());
            System.out.println("Created Datetime: " + bean.getCreatedDatetime());
            System.out.println("Modified Datetime: " + bean.getModifiedDatetime());
        } else {
            System.out.println("Role Not Found");
        }
    }

    // Test Search
    private static void testSearch() {

        RoleBean bean = new RoleBean();

        // Search by name
        bean.setName("Manager");

        // You can also search by description
        // bean.setDescription("Manager");

        List<RoleBean> list = model.search(bean, 1, 10);

        Iterator<RoleBean> it = list.iterator();

        while (it.hasNext()) {

            RoleBean role = it.next();

            System.out.println("ID: " + role.getId());
            System.out.println("Name: " + role.getName());
            System.out.println("Description: " + role.getDescription());
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

        RoleBean bean =
                model.findByUniqueColumn("name", "Manager");

        if (bean != null) {
            System.out.println("ID: " + bean.getId());
            System.out.println("Name: " + bean.getName());
            System.out.println("Description: " + bean.getDescription());
        } else {
            System.out.println("Role Not Found");
        }
    }

    // Test Find By Name
    private static void testFindByName() {

        RoleBean bean = model.findByName("Manager");

        if (bean != null) {
            System.out.println("ID: " + bean.getId());
            System.out.println("Name: " + bean.getName());
            System.out.println("Description: " + bean.getDescription());
        } else {
            System.out.println("Role Not Found");
        }
    }
}
