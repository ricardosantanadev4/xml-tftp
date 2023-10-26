package br.com.xml.tftp.exemplo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatePersistFile {

	public void createPersistFile(String nameFile, String ipCentral, String ramal, String passWord) throws IOException {

		System.out.printf("Iniciando...");

//	    cria e abre o arquivo
		FileWriter arq = new FileWriter("d:\\" + nameFile + ".cnf.xml");

//	    ativa a funcao de gravar no arquivo
		PrintWriter gravarArq = new PrintWriter(arq);

//      grava a string no arquivo
//		cada variavel esta associada ao %s da string
		gravarArq.printf(new Xml().xmlContent(), ipCentral, ramal, ramal, ramal, ramal, passWord, ramal);

//		necessario para os dados serem persistidos no arquivo
		arq.close();

		System.out.printf("\n Arquivo " + nameFile + ".cnf.xml foi gravado com sucesso em d:\\");
	}
}
