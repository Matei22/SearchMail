package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Map<Integer, String> emailsId = new HashMap<>();
	    employeeList.add(new Employee(1, "Mat", "mat@gmail.com", 2000));
        employeeList.add(new Employee(2, "Kathrine", "kathrine@gmail.com", 3000));
        employeeList.add(new Employee(3, "Lili", "lili@gmail.com", 4000));
        employeeList.add(new Employee(4, "Simba", "simba@gmail.com", 3421));
        employeeList.add(new Employee(5, "Stefan", "stefan@gmail.com", 452));
        employeeList.add(new Employee(6, "Tom", "tom@gmail.com", 2345));
        employeeList.add(new Employee(7, "Jerry", "jerry@gmail.com", 2341));
        employeeList.add(new Employee(8, "Scooby", "scooby@gmail.com", 4573));
        employeeList.add(new Employee(9, "Doo", "doo@gmail.com", 9430));
        employeeList.add(new Employee(10, "James", "james@gmail.com", 2345));
        employeeList.add(new Employee(11, "Bond", "bond@gmail.com", 5674));
        employeeList.add(new Employee(12, "Mona", "mona@gmail.com", 7523));
        employeeList.add(new Employee(13, "Lisa", "lisa@gmail.com", 1246));
        employeeList.add(new Employee(14, "DaVinci", "da.vinci@gmail.com", 122));
        employeeList.add(new Employee(15, "Leibniz", "leibniz@gmail.com", 4246));
        employeeList.add(new Employee(16, "Russel", "russel@gmail.com", 2352));
        employeeList.add(new Employee(17, "Hegel", "hegel@gmail.com", 1235));
        employeeList.add(new Employee(18, "Spinoza", "spinoza@gmail.com", 2314));
        employeeList.add(new Employee(19, "Platon", "platon@gmail.com", 12042));


        for(Employee emp:employeeList){
            emailsId.put(emp.getId(), cutToEmailId(emp.getEmail()));
        }

        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Please insert the emailId that you want to search");
        System.out.println("You can choose between: ");
        System.out.println("1) q if You want to stop the program");
        System.out.println("2) " + emails(emailsId));
        String emailIdYouChoose = input.next();
        while(!Objects.equals(emailIdYouChoose, "q")) {
            if (emailsId.containsValue(emailIdYouChoose)) {

                int idNumber = getKey(emailsId, emailIdYouChoose);
                System.out.println(searchedEmployee(employeeList, idNumber));
                System.out.println();
                System.out.println("You can choose between: ");
                System.out.println("1) q if You want to stop the program");
                System.out.println("2) " + emails(emailsId));

            } else {
                System.out.println("You didn't choose from the list. Please try again.");

            }
            emailIdYouChoose = input.next();

        }

    }

    public static String searchedEmployee(List<Employee> employeeList, int id){
        for(Employee employee: employeeList){
            if(employee.getId() == id){
                return employee.toString();
            }
        }
        return null;
    }

    public static String cutToEmailId(String email){
        String[] partsOfEmail = email.split("@");
        return partsOfEmail[0];
    }

    public static Collection<String> emails(Map<Integer, String> emailsId){
        System.out.println(emailsId.entrySet());
        return emailsId.values();
    }

    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

}
