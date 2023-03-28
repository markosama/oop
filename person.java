public abstract class person {
    private String name;
    private String phonnumber;
    public abstract String getvactiondays();

    public person(String name, String phonnumber) {
        this.name = name;
        this.phonnumber = phonnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonnumber(String phonnumber) {
        this.phonnumber = phonnumber;
    }

    public String getName() {
        return name;
    }

    public person(String phonnumber) {
        this.phonnumber = phonnumber;
    }
}
