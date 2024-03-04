package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.loadCSVFile(student_source);

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1]);
        return newPerson;
    }

    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person jorris = new Person("Ekoloko", "Jorris");
        jorris.setGithubHandle("reeseyverse");
        jorris.setFavoriteColor("black");
        jorris.setBirthMonth("August");
        jorris.sethavepets(false);
        students.add(jorris);

        Person chaz = new Person("Adams", "Chaz");
        chaz.setGithubHandle("Abukarabukar");
        chaz.setFavoriteColor("Yellow");
        chaz.setBirthMonth("April");
        chaz.sethavepets(true);
        students.add(chaz);

        Person abukar = new Person("Abukar", "Abukar");
        abukar.setGithubHandle("Abukarabukar");
        abukar.setFavoriteColor("Yellow");
        abukar.setBirthMonth("April");
        abukar.sethavepets(true);
        students.add(abukar);


        Person jennifer = new Person("Azer", "Jenn");
        jennifer.setGithubHandle("cupofjavajenny");
        jennifer.setFavoriteColor("Yellow");
        jennifer.setBirthMonth("April");
        jennifer.sethavepets(true);
        students.add(jennifer);

        Person asan = new Person("Ahmadli", "Asan");
        asan.setGithubHandle("asanahmadli");
        asan.setFavoriteColor("Dark Blue");
        asan.setBirthMonth("December");
        asan.sethavepets(false);
        students.add(asan);

        Person jake = new Person("Brennan", "Jake");
        jake.setGithubHandle("jake-brennan714");
        jake.setFavoriteColor("Yellow");
        jake.setBirthMonth("April");
        jake.sethavepets(true);
        students.add(jake);

        Person ali = new Person("Bangash", "Ali");
        ali.setGithubHandle("Abukarabukar");
        ali.setFavoriteColor("Yellow");
        ali.setBirthMonth("April");
        ali.sethavepets(true);
        students.add(ali);

        Person asia = new Person("Bruton", "Asia");
        asia.setGithubHandle("asiaburton");
        asia.setFavoriteColor("pink");
        asia.setBirthMonth("March");
        asia.sethavepets(true);
        students.add(asia);

        Person trey = new Person("Bruton", "Trey");
        trey.setGithubHandle("tb0902_");
        trey.setFavoriteColor("orange");
        trey.setBirthMonth("September");
        trey.sethavepets(true);
        students.add(trey);



        Person danny = new Person("Danny", "Cao");
        danny.setGithubHandle("dannycao1997");
        danny.setFavoriteColor("blue");
        danny.setBirthMonth("September");
        danny.sethavepets(false);
        students.add(danny);

        Person nathan = new Person("Eckel", "Nathan");
        nathan.setGithubHandle("nathaneckle");
        nathan.setFavoriteColor("green");
        nathan.setBirthMonth("February");
        nathan.sethavepets(true);
        students.add(nathan);



        Person alice = new Person("Gonzalez Plaza", "Alice");
        alice.setGithubHandle("NEEDGITHUB");
        alice.setFavoriteColor("dark");
        alice.setBirthMonth("May");
        alice.sethavepets(true);
        students.add(alice);

        Person deepa = new Person("Kakade", "Deepa");
        deepa.setGithubHandle("NEEDGITHUB");
        deepa.setFavoriteColor("pink");
        deepa.setBirthMonth("June");
        deepa.sethavepets(false);
        students.add(deepa);

        Person mariyana = new Person("Katzarova", "Mariyana");
        mariyana.setGithubHandle("mariyana-katz");
        mariyana.setFavoriteColor("green");
        mariyana.setBirthMonth("December");
        mariyana.sethavepets(true);
        students.add(mariyana);

        Person lydia = new Person("Konstanski", "Lydia");
        lydia.setGithubHandle("lydiastonekonstanski");
        lydia.setFavoriteColor("mushroom");
        lydia.setBirthMonth("October");
        lydia.sethavepets(true);
        students.add(lydia);

        Person matt = new Person("Kramer", "Matt");
        matt.setGithubHandle("NEEDGITHUB");
        matt.setFavoriteColor("green");
        matt.setBirthMonth("January");
        matt.sethavepets(true);
        students.add(matt);


        Person angelina = new Person("Mathew", "Angelina");
        angelina.setGithubHandle("angelinamathew");
        angelina.setFavoriteColor("dark blue");
        angelina.setBirthMonth("May");
        angelina.sethavepets(false);
        students.add(angelina);

        Person chris = new Person("McCall", "Chris");
        chris.setGithubHandle("christopher_mccall");
        chris.setFavoriteColor("blue");
        chris.setBirthMonth("May");
        chris.sethavepets(false);
        students.add(chris);

        Person nick = new Person("McNamara", "Nick");
        nick.setGithubHandle("nicholasmacnamara");
        nick.setFavoriteColor("green");
        nick.setBirthMonth("January");
        nick.sethavepets(true);
        students.add(nick);


        Person modi = new Person("Shaily", "Modi");
        modi.setGithubHandle("ShailyGH");
        modi.setFavoriteColor("Purple");
        modi.setBirthMonth("January");
        modi.sethavepets(false);
        students.add(modi);

        Person dan = new Person("Shaily", "Modi");
        modi.setGithubHandle("ShailyGH");
        modi.setFavoriteColor("Purple");
        modi.setBirthMonth("January");
        modi.sethavepets(false);
        students.add(modi);

        Person dan2 = new Person("Moffett-Conaway", "Dan");
        dan2.setGithubHandle("moffd234");
        dan2.setFavoriteColor("Blue");
        dan2.setBirthMonth("June");
        dan2.sethavepets(true);
        students.add(dan2);

        Person lavanya = new Person("Palanikumar", "Lavanya");
        lavanya.setGithubHandle("ShailyGH");
        lavanya.setFavoriteColor("blue");
        lavanya.setBirthMonth("October");
        lavanya.sethavepets(false);
        students.add(lavanya);

        Person anthony = new Person("Pearson", "Anthony");
        anthony.setGithubHandle("anthonyp365");
        anthony.setFavoriteColor("red");
        anthony.setBirthMonth("July");
        anthony.sethavepets(true);
        students.add(anthony);

        Person ethan = new Person("Rieger", "Ethan");
        ethan.setGithubHandle("erieger11");
        ethan.setFavoriteColor("Blue");
        ethan.setBirthMonth("May");
        ethan.sethavepets(true);
        students.add(ethan);

        Person jorden = new Person("Shaily", "Jorden");
        jorden.setGithubHandle("jross911");
        jorden.setFavoriteColor("Green");
        jorden.setBirthMonth("December");
        jorden.sethavepets(false);
        students.add(jorden);

        Person michael = new Person("Scott", "Michael");
        michael.setGithubHandle("michaelscott44");
        michael.setFavoriteColor("Orange");
        michael.setBirthMonth("May");
        michael.sethavepets(true);
        students.add(michael);

        Person shijin = new Person("Zeng", "Shijin");
        shijin.setGithubHandle("szeng89");
        shijin.setFavoriteColor("Yellow");
        shijin.setBirthMonth("July");
        shijin.sethavepets(false);
        students.add(shijin);

        Person diksha = new Person("Sharma", "Diksha");
        diksha.setGithubHandle("dikshasharmaa");
        diksha.setFavoriteColor("Blue");
        diksha.setBirthMonth("March");
        diksha.sethavepets(false);
        students.add(diksha);

        Person andy = new Person("Zheng", "Andy");
        andy.setGithubHandle("andyzheng679");
        andy.setFavoriteColor("red");
        andy.setBirthMonth("December");
        andy.sethavepets(false);
        students.add(andy);
        
        return students;
    }
}



