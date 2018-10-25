package model.component;

public class Technology {
    private Topic topic;
    private String name;

    public Technology(Topic topic, String name) {
        this.topic = topic;
        this.name = name;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
