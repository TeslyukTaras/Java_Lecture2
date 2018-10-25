package core;

import model.component.Education;
import model.component.Person;
import model.component.Technology;
import model.component.Work;

public interface ICVCreator {
    String createHeader(Person person);
    String createWorkHistory(Work[] works);
    String createEducationHistory(Education[] educations);
    String createTechnologyStack(Technology[] technologies);
}
