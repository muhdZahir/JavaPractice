 

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class confirmSubject {

    private Set<String> selectedSubjects;

    public confirmSubject(Set<String> selectedSubjects) {
        this.selectedSubjects = selectedSubjects;
    
        showConfirmationDialog();
    }

    //--------------[Give attribute to button]-------------------------

    private void showConfirmationDialog() {
        
        if (selectedSubjects.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No subjects selected.");
            selectSubject openSelectSubject = new selectSubject();
        } else {
            /*Map<String, Integer> subjectMap = new HashMap<>();
            int count = 1;

            for (String subject : selectedSubjects) {
                switch (subject.toUpperCase()) {
                    case "SCIENCE":
                        subjectMap.put("SCIENCE", count++);
                        break;
                    case "ART":
                        subjectMap.put("ART", count++);
                        break;
                    case "ACCOUNTING":
                        subjectMap.put("ACCOUNTING", count++);
                        break;
                    case "MATH":
                        subjectMap.put("MATH", count++);
                        break;
                     
                }
            }

       
            System.out.println("Subject Map: " + subjectMap);*/

            openTimetable();
        }
    }

    public Set<String> getSelectedSubjects() {
        return selectedSubjects;
    }

    private void openTimetable() {
        if (!selectedSubjects.isEmpty()) {
            int[] subjectValues = new int[4];
    
 
            subjectValues[0] = selectedSubjects.contains("SCIENCE") ? 1 : 0;
            subjectValues[1] = selectedSubjects.contains("ACCOUNTING") ? 1 : 0;
            subjectValues[2] = selectedSubjects.contains("ART") ? 1 : 0;
            subjectValues[3] = selectedSubjects.contains("MATHEMATICS") ? 1 : 0;
    
            SwingUtilities.invokeLater(() -> {
                new viewTimetable(subjectValues);
            });
        }
    }
}
