package com.bridgelabz.resumeScreeningWithAI;

// Generic Resume class
public class Resume<T extends JobRole> {
    private T candidate;

    public Resume(T candidate) {
        this.candidate = candidate;
    }

    // Method to process the resume
    public void processResume() {
        System.out.println("Processing resume for: ");
        candidate.displayResume();
    }
}
