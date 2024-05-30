/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import javax.swing.JOptionPane;

/**
 *
 * @author braed
 */
public class Task {
 
    String taskSize;
    String taskName;
    String developer;
    String name;
    String surname;
    int taskDuration;
    String taskStatus;
    String taskID;
    public String taskNumber1;
    public String input;
    
public void loopSize(){
input = JOptionPane.showInputDialog(null,"Please enter amount of tasks you are entering information between 1 and 10");
}

public boolean checkTaskDescription(String taskSize){
  return taskSize.length() <= 50;
}

public void methodsOfInformation(){
    taskName = JOptionPane.showInputDialog(null, "Please input Task Name");
        taskSize = JOptionPane.showInputDialog(null, "Please enter Task description");
    if (!checkTaskDescription(taskSize)) {
        JOptionPane.showMessageDialog(null, "Please enter 50 characters or under");
        while(!checkTaskDescription(taskSize)){
                taskSize = JOptionPane.showInputDialog(null, "Please enter Task description");
}
    } else {
        JOptionPane.showMessageDialog(null, "Task sucessfully captured");
    }        
        name = JOptionPane.showInputDialog(null, "Please enter name");
        surname = JOptionPane.showInputDialog(null, "Please enter surname");
        developer = name + surname;
        String userInput = JOptionPane.showInputDialog("Enter 1 or 2or 3 \n'1:To Do', \n'2:Done', or \n'3:Doing' to select a specific outcome:");
        String userChoice = userInput;
             

        switch (userChoice) {
            case "1":
                taskStatus = "To Do";
                break;
            case "2":
                taskStatus = "Done";
                break;
            case "3":
                taskStatus = "Doing";
                break;
            default:
        }
}
    public String taskStatus(){
    return "Task Status: "+taskStatus+"\n"+"\n";
}
    
    public String createClassID(){
     String twoLettersOfName = taskName.substring(0, Math.min(taskName.length(), 2));
     String threeDevelop = developer.substring(Math.max(0, developer.length()-3));
      taskID = twoLettersOfName.toUpperCase() + ":" + taskNumber1 + ":" + threeDevelop.toUpperCase();
    return "\nTaskID: "+taskID+"\n";
    }
    

    public int returnTotalHours(){
                 taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter task Duration"));  
             return taskDuration;

    }
    public int forTest(){
                     return taskDuration;
    }

    public String printTaskDetails(){
     String one = taskName;
     String two = taskNumber1;
     String three = taskSize;
     String four = developer;


        
    return "TaskName: "+one+"\nTask Number: "+two+"\nTask Description:"+three +"\nDeveloper Name:" +four +"\n";
            }
}



