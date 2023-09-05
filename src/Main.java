// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Creazione di un array di 3 oggetti Student
        //Student[] students = new Student[3];
        //students[0] = new Student("Nome1", "Cognome1", "ID1", 28.5);
        // students[1] = new Student("Nome2", "Cognome2", "ID2", 25.0);
        // students[2] = new Student("Nome3", "Cognome3", "ID3", 30.0);

        Student student1 = new Student("luca ", "grassi", "ID4", 24);
        Student student2 = new Student("luca ", "grassi", "ID4", 24);
        Student student3 = new Student("luca ", "grassi", "ID4", 30);
        Student[] students = {student1, student2, student3};

        student2.printIdentifierLastLetter(students);


        for (Student student : students) {
            String identificatore = student.getIdentificatore();
            char lastLetter = identificatore.charAt(identificatore.length() - 1);
            //System.out.println("Ultima lettera dell'identificatore: " + lastLetter);
        }

            for (Student student : students) {
                if (student.getVotoMedio() > 26.0) {
                    System.out.println("AverageGrade: " + student.getVotoMedio());}


                }

            }
        }



