import java.io.File;

public class FileValidatorThread {
	File file;
	FileValidatorThread(File f){
		this.file = f;
	}
	public run() {
		//3 Validations
		//1.ValidateName
		if(isNameValid() && !isLate() && !isDuplicate()) {		
			this.file.renameTo(new File("./inprocess/"+this.file.getName()));
			FileProcessorThread processor = new FileProcessorThread(this.file.getName());	
		}else {
			//Delete File
		}
		//2.Validate InTime
		;
		//3.Validate if it is duplicate
		;
	}
	private boolean isDuplicate() {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean isLate() {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean isNameValid() {
		// TODO Auto-generated method stub
		return false;
	}

}
