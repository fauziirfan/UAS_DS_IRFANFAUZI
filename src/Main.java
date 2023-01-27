import java.util.*;

public class Main {
    public static void firstTask() {
        int noSoal = 0;
        Scanner masukanSoal = new Scanner(System.in);
        String soal = "1. Stack\n" + "2. Queue\n";
        System.out.println(soal);
        System.out.print("Masukan Pilihan : ");
        noSoal = masukanSoal.nextInt();
        switch (noSoal) {
            case 1:
                ArrayStack stack = new ArrayStack(5);

                System.out.println("Is Stack empty => " + stack.isEmpty() + "\n");

                System.out.println("Adding Data to Stack");
                System.out.println("=============================================================================================================================================");
                stack.push(new Student("Irfan", "Fauzi", 1));
                stack.push(new Student("Albert", "Camus", 2));
                stack.push(new Student("Tom", "Hanks", 3));
                stack.push(new Student("James", "Bond", 4));
                stack.push(new Student("Sherlock", "Holmes", 5));
                stack.printStack();
                System.out.println("Size of Stack => " + stack.size());
                System.out.println("=============================================================================================================================================");
                System.out.println("See First Data From Stack => " + stack.peek());
                System.out.println("Remove Data From Stack => " + stack.pop());

                System.out.println("=============================================================================================================================================");
                System.out.println("Last After All Remove");
                stack.printStack();
                System.out.println("=============================================================================================================================================");
                System.out.println("\n\n");
                next();
                break;
            case 2:
                Student janeJones = new Student("Ethan", "Hunt", 21);
                Student johnDoe = new Student("John", "Wick", 34);
                Student marySmith = new Student("Tom", "Cruise", 65);
                Student mikeWilson = new Student("Daniel", "Craig", 87);
                Student billEnd = new Student("Keanu", "Reeves", 11);

                Queue<Student> queue = new PriorityQueue<Student>();
                queue.add(janeJones);
                queue.add(johnDoe);
                queue.add(marySmith);
                queue.add(mikeWilson);
                queue.add(billEnd);
                System.out.println("First init Queue");
                for (Student employee : queue) {
                    System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
                }
                System.out.println("\n");
                System.out.println("Head Of Queue");
                System.out.println(queue.element() + "--->> Using Element Method");
                System.out.println(queue.peek() + "--->> Using Peek Method");

                System.out.println("\n");
                System.out.println("Remove Head Of Queue");
                System.out.println(queue.remove(queue.element()));
                for (Student employee : queue) {
                    System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
                }

                System.out.println("\n");
                System.out.println("Head Of Queue After Remove");
                System.out.println(queue.element() + "--->> Using Element Method");
                System.out.println(queue.peek() + "--->> Using Peek Method");

                System.out.println("\n");
                System.out.println("Add data to Queue via offer");
                System.out.println(queue.offer(marySmith));
                for (Student employee : queue) {
                    System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
                }

                System.out.println("\n");
                System.out.println("Get all data Queue");
                Iterator<Student> itr2 = queue.iterator();
                while (itr2.hasNext()) {
                    System.out.println(itr2.next());
                }

                System.out.println("\n\n");
                next();
                break;
            default:
                firstTask();
        }
    }

    public static int linearSearch(String arr[], String x) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i].equalsIgnoreCase(x)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(String arr[], String x) {

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m].equalsIgnoreCase(x)) {
                return m;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void secondTask() {
        int noSoal = 0;
        String arr[] = {"Irfan", "Fauzi", "Gandhi", "Kierkegaard", "Rousseau"};
        Scanner masukanSoal = new Scanner(System.in);
        String soal = "1. Linear Search\n" + "2. Binary Search\n";
        System.out.println(soal);
        System.out.print("Masukan Pilihan : ");
        noSoal = masukanSoal.nextInt();

        switch (noSoal) {
            case 1:
                System.out.println(Arrays.toString(arr));
                System.out.print("pilih nama : ");
                Scanner s = new Scanner(System.in);
                String x = s.nextLine();

                // Function call
                int result = linearSearch(arr, x);
                if (result == -1) {
                    System.out.print(
                            "Nama Tidak Ditemukan!!");
                } else {
                    System.out.println("Nama Berada Pada Urutan array "
                            + result + "(atau Pada Urutan ke " + (result + 1) + ")");
                }
                System.out.println("\n\n");
                next();
                break;
            case 2:
                System.out.println(Arrays.toString(arr));
                System.out.print("pilih nama : ");
                Scanner bs = new Scanner(System.in);
                String bx = bs.nextLine();

                // Function call
                int bresult = binarySearch(arr, bx);
                if (bresult == -1) {
                    System.out.print(
                            "Nama Tidak Ditemukan!!");
                } else {
                    System.out.println("Nama Berada Pada Urutan array "
                            + bresult + "(atau Pada Urutan ke " + (bresult + 1) + ")");
                }
                System.out.println("\n\n");
                next();
                break;
            default:
                secondTask();
        }
    }

    public static void thirdTask() {
        Tree intTree = new Tree();

        intTree.insert(72);
        intTree.insert(43);
        intTree.insert(15);
        intTree.insert(28);
        intTree.insert(33);
        intTree.insert(58);
        intTree.insert(69);
        intTree.insert(81);
        intTree.insert(52);
        intTree.insert(6);
        intTree.insert(7);
        intTree.insert(9);

        intTree.traverseInOrder();
        System.out.println("\nSize of Binary Tree => "+ intTree.size());

        System.out.println(intTree.get(24));
        System.out.println(intTree.get(52));

        System.out.println("Max Data Of Binary Tree => " + intTree.max());
        System.out.println("Min Data Of Binary Tree => " + intTree.min());
    }

    public static void soal() {
        int noSoal = 0;
        Scanner masukanSoal = new Scanner(System.in);
        String soal = "1.	Buat contoh implementasi stack dan queue pada coding program (lakukan show, insert, deletion pada stack dan queue) ?\n"
                + "2.	Buat search program untuk array of string menggunakan (urutan ganjil iterative, urutan genap recursive function) untuk melakukan search pada array of string menggunakan linier search dan binary search\n"
                + "3.	Buat contoh coding binary tree lakukan insert, traversalOrder, max, min dan menghitung element size dari binary tree?";
        System.out.println(soal);
        System.out.print("Masukan Nomor Soal : ");
        noSoal = masukanSoal.nextInt();
        switch (noSoal) {
            case 1:
                firstTask();
                next();
                break;
            case 2:
                secondTask();
                next();
                break;
            case 3:
                thirdTask();
                next();
                break;
            case 4:
                next();
                break;
            default:
                soal();
        }
    }

    static void next() {
        Scanner lanjut = new Scanner(System.in);
        System.out.println("Lanjut Atau Tidak?");
        System.out.println("1. Yes\n" + "2. No");
        System.out.print("Masukan Pilihan Anda : ");
        int next = lanjut.nextInt();
        if (next == 1) {
            System.out.println("\n\n\n\n\n");
            soal();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        soal();
    }
}