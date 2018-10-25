package core;

import model.basic.Date;
import model.basic.Location;
import model.component.*;

public class CVMain {

    public static void main(String[] args) {
        CVMain cvCreator = new CVMain();
        Person person = cvCreator.getPerson();
        Education[] educations = cvCreator.getEducationHistory();
        Work[] works = cvCreator.getWorkHistory();
        Technology[] technologies = cvCreator.getTechnologyStack();

        ICVCreator cv = new CVCreator();
//        ICVCreator cv = new CVCreatorReverse();
        StringBuilder builder = new StringBuilder();
        builder.append(cv.createHeader(person))
                .append(cv.createWorkHistory(works))
                .append(cv.createEducationHistory(educations))
                .append(cv.createTechnologyStack(technologies));

        String result = builder.toString();
        System.out.println(result);
    }

    public Person getPerson() {
        Date birthday = new Date(1990, 4, 25);
        Location location = new Location("Ukraine", "Lviv region", "Lviv");
        Person person = new Person("Ivan", "Petrenko", 28, birthday, location);
        return person;
    }

    public Education[] getEducationHistory() {
        Education[] educations = new Education[2];
        Education education1 = new Education("NU LP", "ІКНІ", "АСУ");
        education1.setFromDate(new Date(2008, 9, 1));
        education1.setToDate(new Date(2012, 5, 27));
        educations[0] = education1;

        Education education2 = new Education("NU LP", "ІКНІ", "ІСМ");
        education2.setFromDate(new Date(2012, 9, 1));
        education2.setToDate(new Date(2014, 2, 12));
        educations[1] = education2;

        return educations;
    }

    public Work[] getWorkHistory() {
        Work[] works = new Work[3];
        Work work1 = new Work("GlobalWork", "Junior Java SE");
        work1.setFromDate(new Date(2012, 8, 1));
        work1.setToDate(new Date(2014, 2, 1));
        works[0] = work1;

        Work work2 = new Work("WorkHard", "Java SE");
        work2.setFromDate(new Date(2014, 2, 2));
        work2.setToDate(new Date(2016, 9, 1));
        works[1] = work2;

        Work work3 = new Work("WorkHard", "Senior Java SE");
        work3.setFromDate(new Date(2016, 9, 1));
        work3.setToDate(new Date(2018, 9, 27));
        works[2] = work3;

        return works;
    }

    public Technology[] getTechnologyStack() {
        Technology[] technologies = new Technology[]{
                new Technology(Topic.PROGRAMMING_LANGUAGE, "Java"),
                new Technology(Topic.PROGRAMMING_LANGUAGE, "Kotlin"),
                new Technology(Topic.PROGRAMMING_LANGUAGE, "C/C++"),
                new Technology(Topic.NETWORKING_LIBRARY, "Retrofit"),
                new Technology(Topic.NETWORKING_LIBRARY, "OkHTTP"),
                new Technology(Topic.DATABASE_LIBRARY, "SqLite"),
                new Technology(Topic.DATABASE_LIBRARY, "Realm"),
                new Technology(Topic.DATABASE_LIBRARY, "Room"),
                new Technology(Topic.IMAGE_LOADING_LIBRARY, "Glide"),
                new Technology(Topic.IMAGE_LOADING_LIBRARY, "Picasso"),};
        return technologies;
    }
}
