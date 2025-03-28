package com.bridgelabz.resumeScreeningWithAI;

// Abstract class representing a job role
public abstract class JobRole {
    protected String name;
    protected int experience;

    public JobRole(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    // Abstract method to display resume details
    public abstract void displayResume();
}

// Software Engineer subclass
class SoftwareEngineer extends JobRole {
    private String skills;

    public SoftwareEngineer(String name, int experience, String skills) {
        super(name, experience);
        this.skills = skills;
    }

    @Override
    public void displayResume() {
        System.out.println("Software Engineer: " + name + " | Experience: " + experience + " years | Skills: " + skills);
    }
}

// Data Scientist subclass
class DataScientist extends JobRole {
    private String skills;

    public DataScientist(String name, int experience, String skills) {
        super(name, experience);
        this.skills = skills;
    }

    @Override
    public void displayResume() {
        System.out.println("Data Scientist: " + name + " | Experience: " + experience + " years | Skills: " + skills);
    }
}

// Product Manager subclass
class ProductManager extends JobRole {
    private String domain;

    public ProductManager(String name, int experience, String domain) {
        super(name, experience);
        this.domain = domain;
    }

    @Override
    public void displayResume() {
        System.out.println("Product Manager: " + name + " | Experience: " + experience + " years | Domain: " + domain);
    }
}
