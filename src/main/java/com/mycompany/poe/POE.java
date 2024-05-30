/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;

import javax.swing.JOptionPane;

/**
 *
 * @author braed
 */
public class POE {

    public static void main(String[] args) {
        // Create an object of Login class
 Login d = new Login();
boolean isFirstLoopCompleted = false;

while (!isFirstLoopCompleted) {
    String[] options = {"Register", "Login"};
    int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "User Registration/Login",
                                              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    if (choice == 0) {
        d.inputusername();
        d.inputpassword();
        JOptionPane.showMessageDialog(null, d.registerUser());
          if (d.registerUser().equals("User Successfully Captured\nPassword Successfully Captured\n")) {
        d.nameAndSurname();}
    } else if (choice == 1) {
        d.enterLogin();
        if (!d.loginUser()) {
            JOptionPane.showMessageDialog(null, "Login failed. Please try again."+choice);
        } else {
            JOptionPane.showMessageDialog(null, d.returnLoginStatus());
            JOptionPane.showMessageDialog(null, "Welcome to Easy KanBan");
            isFirstLoopCompleted = true;
        }
    }
}
    


while (true) {
    Task t = new Task();
    String[] options = {"Option 1: Add Tasks", "Option 2: Show Report (Coming Soon)", "Option 3: Quit"};
    int choiceTwo = JOptionPane.showOptionDialog(null, "Choose an option:", "Easy KanBan",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    switch (choiceTwo) {
        case 0:
        //for the loop for task number
int userInput;
int lowerLimit = 1;
int upperLimit = 10;

do {
    t.loopSize();
    String input = t.input;
    userInput = Integer.parseInt(input);
} while (userInput < lowerLimit || userInput > upperLimit);

StringBuilder result = new StringBuilder();
int sum = 0;
int num;
for (int i = 1; i <= userInput; i++) {
    t.taskNumber1 = String.valueOf(i-1);
    t.methodsOfInformation();
    num = t.returnTotalHours();
    sum += num;
    result.append(t.printTaskDetails() + "Total Hours: " + num +"hrs"+ t.createClassID()+t.taskStatus());
}

String totalHours = String.valueOf(sum);
JOptionPane.showMessageDialog(null, result + "\nTotal Hours of all tasks combined: " + totalHours);
break;

        case 1:
            JOptionPane.showMessageDialog(null, "This feature is in development please choose Option 1 or 2 for now");
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "Exiting User");
            System.exit(0); 
            break;
        default:
            JOptionPane.showMessageDialog(null, "Invalid choice. Please choose Option 1, Option 2, or Option 3");
            break;
    }
}
    }
}

//References
// IIEVC School of Computer Science. “Add Junit5 Jar Files.” Www.youtube.com, 7 Mar. 2022, www.youtube.com/watch?v=fQaUsfEzGdw&list=PL480DYS-b_kfHSYf2yzLgto_mwDr_U-Q6&index=3. Accessed 2 May 2023.
//IIEVC School of Computer Science. “Gradle in NetBeans IDE.” Www.youtube.com, 5 Sept. 2015, www.youtube.com/watch?v=2EIUHHoVfmU. Accessed 12 May 2022.---. “Link Your Local Repository (NetBeans Folder) with Your GitHub Repo.” Www.youtube.com, 7 Mar. 2022, www.youtube.com/watch?v=M9DzeAw3uMY&list=PL480DYS-b_kfHSYf2yzLgto_mwDr_U-Q6&index=2. Accessed 12 Apr. 2024.Youtube. 
//“PROG51212/5111 POE 1: Create Your Repository.” Www.youtube.com, 7 Mar. 2022, 
//www.youtube.com/watch?v=2JzEhwpg_0U&list=PL480DYS-b_kfHSYf2yzLgto_mwDr_U-Q6&index=1&t=121s. Accessed 12 Apr. 2024.
