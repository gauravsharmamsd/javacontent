
public class NamedClassInterFace  implements InterFaceForLambda{

	@Override
	public void m1(int i, int j, String s) {
		System.out.println("named class...."+i+" "+j+" "+s);
	}

}
class names implements InterFaceForLambda2{

	
	@Override
	public void m2(String s) {
		System.out.println(s);
		
	}
	
}
class namesss implements InterFaceForLambda3{

	


	@Override
	public int getInt() {
		// TODO Auto-generated method stub
		return 6;
	}
	
}