public class Main {
        static double average(Measurable[] objects) {
                double sum = 0;
              
                for (Measurable m : objects) {
                        sum += m.getMeasure();
                }
                // finding, returning average
                return sum / objects.length;
        }
        
        static Measurable largest(Measurable[] objects) {
                Measurable largest = null;
                // looping through each object in objects array
                for (Measurable m : objects) {
                        // if largest is null or if m has bigger measure than largest,
                        // updating largest.
                        if (largest == null || m.getMeasure() > largest.getMeasure()) {
                                largest = m;
                        }
                }
                return largest;
        }
        public static void main(String[] args) {
                // creating an array of 5 Measurable objects and filling with some
                // employees
                Measurable array[] = new Measurable[5];
                array[0] = new Employee("Nurillo", 30000, "Project Manager");
                array[1] = new Employee("Mukhammad", 27000, "Executive Manager");
                array[2] = new Employee("Navrzubek", 25000, "Engineer");
                array[3] = new Employee("Sevara", 15000, "Designer");
                array[4] = new Employee("Shokrukh", 13000, "Developer");
								
                // To print all 
                System.out.println("Employees:");
                for (Measurable m : array) {
                        System.out.println(m); // toString() of Employee will get invoked.
                }
                //printing average salary and employee with largest salary
                System.out.println("\nAverage Salary: " + average(array));
                System.out.println("\nEmployee with largest Salary: " + largest(array));
        }
}
