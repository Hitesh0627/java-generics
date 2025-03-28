package com.bridgelabz.resumeScreeningWithAI;
import java.util.Arrays;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create resumes for different job roles
        SoftwareEngineer se = new SoftwareEngineer("Hitesh", 2, "Java, Javascript");
        DataScientist ds = new DataScientist("Vipul", 5, "Java, C++, SQL");
        ProductManager pm = new ProductManager("Divyansh", 3, "E-commerce");

        // Processing resumes using generic class
        Resume<SoftwareEngineer> resumeSE = new Resume<>(se);
        Resume<DataScientist> resumeDS = new Resume<>(ds);
        Resume<ProductManager> resumePM = new Resume<>(pm);

        resumeSE.processResume();
        resumeDS.processResume();
        resumePM.processResume();

        // Screen multiple resumes using wildcard (Java 8 compatible)
        System.out.println("\n------ Screening Multiple Resumes ------");
        screenResumes(Arrays.asList(se, ds, pm));
    }

    // Wildcard method to screen resumes for any job role
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayResume();
        }
    }
}
