public class Main {
    public static void main(String[] args) {
    var TotalHours = 640;
    var EmpWorkTime = 8;
    var TotalEmployees = TotalHours / EmpWorkTime;
    System.out.println("Всего работников в компании - " + TotalEmployees + " человек");
    TotalEmployees = TotalEmployees + 94;
    TotalHours = TotalEmployees * EmpWorkTime;
    System.out.println("Если в компании работает " + TotalEmployees + " человек, то всего " + TotalHours + " часов работы может быть поделено между сотрудниками");
    }
}