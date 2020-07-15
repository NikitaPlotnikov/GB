package Project5;

public class main {
    public static void main(String[] args){


        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Elon Reeve Musk", "general manager", "elonmusktop@tesla.com", "1-800-613-8840", 130000, 49);
        emplArray[1] = new Employee("Ivanov Ivan Ivanovich", "QA Engineer", "qwer@qwer.com", "+7(988)888-88-66", 60000, 26 );
        emplArray[2] = new Employee("Josep Guardiola", "coach", "josepguardiola@fcmc.com", "+44(1234)145-1367", 100000, 49 );
        emplArray[3] = new Employee("Jonathan Paul „Jony“ Ive", "Chief Design Officer", "jonyive@noapple.com", "+1-310-234-1678", 80000, 53 );
        emplArray[4] = new Employee("Gabe Logan Newell", "game developer", "qaben@qaben.com", "+1-121-212-1212", 130000, 57 );

        infoAge(emplArray,40);
    }
    public static void infoAge(Employee[] array, int age){

        for (int i = 0; i < array.length; i++){
            int ageEmployee = array[i].age;
            if (ageEmployee >= age ){
                array[i].infoEmployee();
            }
        }
    }
}
