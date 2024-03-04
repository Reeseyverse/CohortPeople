package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String githubHandle;
    private String favoriteColor;
    private String birthMonth;
    private boolean havepets;

    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname +" , " + getGithubHandle() + " , " + getFavoriteColor() + " , " + getBirthMonth() + " , " + gethavepets();
    }

    public String getGithubHandle(){
        return this.githubHandle;
    }

    public void setGithubHandle(String githubHandle){
        this.githubHandle = githubHandle;
    }

    public String getFavoriteColor(){
        return this.favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor){
        this.favoriteColor = favoriteColor;
    }


    public String getBirthMonth(){
        return this.birthMonth;
    }

    public void setBirthMonth(String birthMonth){
        this.birthMonth = birthMonth;
    }

    public boolean gethavepets(){
        return this.havepets;
    }

    public void sethavepets(boolean havepets){
        this.havepets = havepets;
    }

}