import java.util.List;


public class Definition extends Statement{
	
	String mNameFirst;
	String mNameSecond;
	List<String> mParams;
	List<Statement> mBody;
	
	public Definition(String nameFirst, List<String> params, List<Statement> body, String nameSecond) {
		if(nameFirst.equals(nameSecond)){
			mNameFirst = nameFirst;
			mNameSecond = nameSecond;
			mParams = params;
			mBody = body;
			
		}else{
			System.err.println("Fehler bei der Funktionsdeklaration. Startname '" + mNameFirst + "' ist nicht gleich Endname '" + mNameSecond + "' !");
			System.exit(1);
		}
	}

	public void execute() throws ReturnException {
	       Environment.putFunction(mNameFirst, this);
	}
	
	public String toString(){
		
		String result = "procedure " + mNameFirst + "(";
		
		if(mParams != null){
			for (int i = 0; i < mParams.size(); i++) {
				result += mParams.get(i);
				
				if(i < (mParams.size()-1)){
					result += ",";
				}
			}
		}
		
		result += ")\n";
		
		if(mBody != null){
			
			for (Statement stmnt : mBody) {
				result += stmnt.toString() + "\n";
			}			
		}
		
		result += "end " + mNameSecond + ";";
			
		
		return result;
	}
}
