package minggu6.soal3;

class Employee extends Sortable {
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary)
            return -1;
        if (salary > eb.salary)
            return +1;
        return 0;
    }

    public void shell_sort(int staff[]) {
        int n = staff.length;
    
    // Mulai dengan gap besar dan kemudian kurangi gap secara berangsur-angsur
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Lakukan pengurutan untuk setiap "gap" subarray
            for (int i = gap; i < n; i++) {
                int temp = staff[i];
                
                // Pindahkan elemen-elemen dari subarray yang telah diurutkan ke posisi yang benar
                int j;
                for (j = i; j >= gap && staff[j - gap] > temp; j -= gap) {
                    staff[j] = staff[j - gap];
                }
                
                // Masukkan elemen yang sedang diurutkan ke posisi yang benar
                staff[j] = temp;
            }

    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireyear;
    }

    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
}
