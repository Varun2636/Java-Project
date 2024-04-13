// Example usage (in your application code)
package com;

public class MainApp {

    public static void main(String[] args) {
        // Create an employee with skills
        Employee employee = new Employee();
        employee.setEmpName("John Doe");
        employee.setEmpSal(50000);

        Skills skills = new Skills();
        skills.setSkill1("Java");
        skills.setSkill2("Python");
        // Set other skills as needed

        employee.setSkills(skills);

        // Save the employee to the database
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}