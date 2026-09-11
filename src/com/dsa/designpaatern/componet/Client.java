package com.dsa.designpaatern.componet;

public class Client {
    public static void main(String[] args) {
        file resume = new file("Resume.pdf");
        file notes = new file("Notes.txt");

        folder documents = new folder("Documents");

        documents.add(resume);
        documents.add(notes);

        folder root = new folder("C:");

        root.add(documents);

        root.showDetails();

    }
}
