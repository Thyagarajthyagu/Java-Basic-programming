package heraritiacle;

public class University {
	String Universityname="vvtu";
	void CoundectExam(){
		System.out.println("university conduct exam");
	}
}
class Collage extends University{
	String Collagename="ait";
	void Conductinternals(){
		System.out.println("collage conduct internals");
	}
}
class depertment extends Collage{
	String depertmentname="mech";
	void Conductassignment(){
		System.out.println("depertment conduct assignment");
	}	
}
