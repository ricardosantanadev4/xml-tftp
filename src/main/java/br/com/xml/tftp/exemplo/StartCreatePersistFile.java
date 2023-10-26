package br.com.xml.tftp.exemplo;

import java.io.IOException;

public class StartCreatePersistFile {

	public static void main(String[] args) throws IOException {

		var nameFile = "SEP08CC68E8CAEC";
		var ipCentral = "18.229.223.172";
		var ramal = "0107";
		var passWord = "esp0s3nd3!0i07";
		new CreatePersistFile().createPersistFile(nameFile, ipCentral, ramal, passWord);
	}

}
