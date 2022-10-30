public class cseStudent extends engineeringStudent{
    private String language;
    private String projectname;
    cseStudent(){}
    cseStudent(String language, String projectname){
        this.language = language;
        this.projectname = projectname;
    }
    public String getLanguage(){
        return language;
    }
    public String getprojectname(){
        return projectname;
    }
    public void setlanguage(String language){
        this.language = language;
    }
    public void setproject(String projectname){
        this.projectname = projectname;
    }
    void disp(){
        super.disp();
        System.out.println("Language: " + language);
        System.out.println("Project Name: " + projectname);
    }
}
