public class Team_QA {
    String name;
    Integer age;
    String gender;
    String designation;
    String project_name;

    public static void main(String[] args) {
        Team_QA details = new Team_QA();
        details.name = "kunal Negi";
        details.age = 25;
        details.gender = "Male";
        details.designation = "QA";
        details.project_name="Test Project";
        System.out.println("Employee Detail is :" + details.name + "     " + details.age + "    " + details.gender + "    " + details.designation + "    " + details.project_name);
    }
}