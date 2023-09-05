
public class Student {
    private String nome;
    private String cognome;
    private String identificatore;
    private double votoMedio;
    Student[] students;

    // Costruttore
    public Student(String nome, String cognome, String identificatore, double votoMedio) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificatore = identificatore;
        this.votoMedio = votoMedio;
    }

    // Getter e Setter per le variabili di istanza
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIdentificatore() {
        return identificatore;
    }

    public void setIdentificatore(String identificatore) {
        this.identificatore = identificatore;
    }

    public double getVotoMedio() {
        return votoMedio;
    }

    public void setVotoMedio(double votoMedio) {
        this.votoMedio = votoMedio;
    }

    // Metodo printIdentifierLastLetter
    public void printIdentifierLastLetter(Student[] students) {
        for (int i = 0; i < students.length; i++) {
           // String id = students[i].identificatore;
            //char lastIdLetter = id.charAt(id.length() - 1);
            System.out.println(identificatore.charAt(students[i].identificatore.length()-1));


        }
    }
}






