package core;

import model.component.*;

public class CVCreator implements ICVCreator {

    @Override
    public String createHeader(Person person) {
        StringBuilder builder = new StringBuilder();
        if (person != null) {
            builder.append(person).append("\n");
        }
        return builder.toString();
    }

    @Override
    public String createWorkHistory(Work[] works) {
        StringBuilder builder = new StringBuilder();
        if (works != null) {
            builder.append("Work History\n");
            for (Work work : works) {
                builder.append(work).append("\n");
            }
        }
        return builder.toString();
    }

    @Override
    public String createEducationHistory(Education[] educations) {
        StringBuilder builder = new StringBuilder();
        if (educations != null) {
            builder.append("Education\n");
            for (Education education : educations) {
                builder.append(education).append("\n");
            }
        }
        return builder.toString();
    }

    @Override
    public String createTechnologyStack(Technology[] technologies) {
        StringBuilder builder = new StringBuilder();
        if (technologies != null) {
            builder.append("Technologies\n");
            Topic[] topics = new Topic[]{Topic.PROGRAMMING_LANGUAGE,
                    Topic.NETWORKING_LIBRARY,
                    Topic.DATABASE_LIBRARY,
                    Topic.IMAGE_LOADING_LIBRARY};
            for (Topic topic : topics) {
                int topicTechnologiesCount = 0;
                for (Technology technology : technologies)
                    if (technology.getTopic().equals(topic)) {
                        topicTechnologiesCount++;
                    }

                if (topicTechnologiesCount > 0) {
                    builder.append(topic.toString()).append(" - ");
                    int printedTechnologies = 0;
                    for (Technology technology : technologies)
                        if (technology.getTopic().equals(topic)) {
                            builder.append(technology.getName());
                            printedTechnologies++;
                            if (printedTechnologies == topicTechnologiesCount) {
                                builder.append(";\n");
                            } else {
                                builder.append(", ");
                            }
                        }
                }


            }
        }
        return builder.toString();
    }
}
