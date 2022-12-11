package heraritiacle;

class vehicle {
 void Start() {
		System.out.println("vehical");	
	}
}
class car extends vehicle{
	void Start(){
		super.Start();
		System.out.println("starting");
	}
}
class bike extends car{
	void Start(){
		super.Start();
		System.out.println("ending");
	}
}
