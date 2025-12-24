public class StudentSorter {

    public static void insertionSortStudent(Student[] students, boolean byGrade) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            if (byGrade) {
                while (j >= 0 && students[j].grade > key.grade) {
                    students[j + 1] = students[j];
                    j--;
                }
            } else {
                while (j >= 0 && students[j].studentId > key.studentId) {
                    students[j + 1] = students[j];
                    j--;
                }
            }
            students[j + 1] = key;
        }
    }

    public static void binaryInsertionSortStudent(Student[] students, boolean byGrade) {
        for (int i = 1; i < students.length; i++) {
            Student keyStudent = students[i];
            int keyVal = byGrade ? keyStudent.grade : keyStudent.studentId;

            int pos = binarySearchInsertPos(students, keyVal, 0, i - 1, byGrade);

            for (int j = i; j > pos; j--) {
                students[j] = students[j - 1];
            }
            students[pos] = keyStudent;
        }
    }

    private static int binarySearchInsertPos(Student[] a, int key, int left, int right, boolean byGrade) {
        int lo = left;
        int hi = right;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int midVal = byGrade ? a[mid].grade : a[mid].studentId;
            if (midVal <= key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }
}
