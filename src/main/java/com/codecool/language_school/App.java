package com.codecool.language_school;

import com.codecool.language_school.controller.AppControl;
import com.codecool.language_school.data.DataGenerator;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {
    /**
     *
     * Create EntityManagerFactory providing persistenceUnitName.
     * Create EntityManager.
     *
     * Create DataGenerator passing EntityManager to constructor.
     * Populate database by calling DataGenerator method.
     *
     * Create AppControl passing EntityManager to constructor.
     * Run AppControl.
     *
     * Close EntityManager.
     * Close EntityManagerFactory.
     *
     */
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("school");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.clear();

        DataGenerator dataGenerator = new DataGenerator(entityManager);
        dataGenerator.populateDb();

        AppControl appControl = new AppControl(entityManager);
        appControl.run();
1
        entityManager.close();
        entityManagerFactory.close();



    }
}
