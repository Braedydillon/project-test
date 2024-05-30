/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author braed
 */
public class TaskTest {
    
    @Test
    public void testTwoLoopsData() {
        Task task = new Task();
        task.input="2";
        task.taskName = "Login Feature";
        task.taskSize = "Create a login to authenticate users";
        task.name = "Robyn";
        task.surname = "Harrison";
        task.taskStatus = "To Do";
        task.taskDuration= 8;
        task.developer = task.name + task.surname;
        task.taskStatus = "To Do";
        int num = task.forTest();

        String Expected="TaskName:Task 1\nTask Number: 1\nTask Description:This is a task description\n";
        String actualOutput = task.printTaskDetails() + "Total Hours: " + num + task.createClassID();
        
    }
    @Test 
    public void testTaskDescriptionPass() {
        Task task = new Task();
        String taskSize = "Complete task description within limit";
        boolean result = task.checkTaskDescription(taskSize);
        assertEquals(true, result);
    }

    @Test
    public void testTaskDescriptionFail() {
        Task task = new Task();
        String taskSize = "This task description is way too long and exceeds the limit allowed";
        boolean result = task.checkTaskDescription(taskSize);
        assertEquals(false, result);
    }
 @Test
    public void testCreateID1() {
        Task task = new Task();
        task.taskName = "CR";
        task.taskNumber1 = "0";
        task.developer = "IKE";

        String expectedID = "\nTaskID: CR:0:IKE\n";
        String actualID = task.createClassID();

        assertEquals(expectedID, actualID);
    }
        @Test
    public void testCreateID2() {
        Task task = new Task();
        task.taskName = "CR";
        task.taskNumber1 = "1";
        task.developer = "ARD";
        String expectedID = "\nTaskID: CR:1:ARD\n";
        String actualID = task.createClassID();

        assertEquals(expectedID, actualID);
    }
    @Test
    public void testCreateID3() {
        Task task = new Task();
        task.taskName = "CR";
        task.taskNumber1 = "2";
        task.developer = "THA";
        String expectedID = "\nTaskID: CR:2:THA\n";
        String actualID = task.createClassID();

        assertEquals(expectedID, actualID);
    }
  @Test
    public void testTaskDuration() {
        Task task = new Task();
        int expectedTotalHours = 0;
        int[] hours = {10, 12, 55, 11, 1};

        for (int i = 0; i < hours.length; i++) {
            task.taskDuration = hours[i];
            expectedTotalHours += hours[i];
        }
    }
}