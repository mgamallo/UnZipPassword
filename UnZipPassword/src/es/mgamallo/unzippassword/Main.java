package es.mgamallo.unzippassword;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
/*
 * http://stackoverflow.com/questions/11174851/how-to-use-zip4j-to-extract-an-zip-file-with-password-protection
   http://www.vogella.com/tutorials/EclipseGit/article.html
 */

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "prueba.zip";
		String destination = "temp";
		String password = "agua";
		
		System.out.println("Empieza la descomprension");

		try {
		    ZipFile zipFile = new ZipFile(source);
		    if (zipFile.isEncrypted()) {
		        zipFile.setPassword(password);
		    }
		    zipFile.extractAll(destination);
		} catch (ZipException e) {
		    e.printStackTrace();
		}
		
		System.out.println("Descomprimido");
	}
}
