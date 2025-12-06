import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Arrays;

class Student{
	private int solved, year;
	private char name;
	
	Student(int solved, int year, String name) {
		this.solved = solved;
		this.year = year % 100;
		this.name = name.charAt(0);
	}
	
	public String getStrYear() {
		if (year > 9) return String.valueOf(year);
		return "0" + year;
	}
	
	public int getYear() { return year;}
	public int getSolved() {return solved;}
	public char getName() {return name;}
}

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        Student[] stu = new Student[3];
        
        for (int i = 0; i < 3; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	stu[i] = new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), st.nextToken());
        }
        
        
        Arrays.sort(stu, new Comparator<Student>() {
        	public int compare(Student s1, Student s2) {
        		return 	s1.getYear() - s2.getYear();
        	}
        });
        
        for (int i = 0; i < 3; i++) {
        	sb.append(stu[i].getStrYear());
        }
        sb.append("\n");
        
        Arrays.sort(stu, new Comparator<Student>() {
        	public int compare(Student s1, Student s2) {
        		return 	s2.getSolved() - s1.getSolved();
        	}
        });
        
        for (int i = 0; i < 3; i++) {
        	sb.append(stu[i].getName());
        }
        
        System.out.println(sb);
        br.close();
    }
}