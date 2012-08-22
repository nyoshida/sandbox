package bridge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringDisplayImpl implements DisplayImpl {
	private String string;
	private int width;
	private String line;

	public StringDisplayImpl(String string) {
			try {
				FileReader fileReader = new FileReader(string);
				 BufferedReader br = new BufferedReader(fileReader);
				    while ((line = br.readLine()) != null) {
				        System.out.println(line);
				        break;
				    }
				    br.close();
				    fileReader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		
		
		this.string = line;
        System.out.println(line);
		this.width = line.getBytes().length;
	}
	private void printLine() {
		System.out.print("+");
		for ( int i=0;i<width;i++ ){
			System.out.print("-");
		}
		System.out.println("+");
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|"+string+"|");
	}

	@Override
	public void rawClose() {
		printLine();

	}

}
