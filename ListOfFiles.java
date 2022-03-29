import java.io.File;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
import java.io.IOException;
public class ListOfFiles {
	public static void main(String args[]) throws IOException {
		//Creating a File object for directory
		File directoryPath = new File("C:\\Users\\hishm\\Desktop\\File");

		//List of all files and directories
		File filesList[] = directoryPath.listFiles();

		System.out.println("List of files and directories in the specified directory:");
		System.out.println("Size ::::: "+filesList.length);

		for(int i=0;i<filesList.length;i++) {
			/*System.out.println("File name: "+filesList[i].getName());
			System.out.println("File path: "+filesList[i].getAbsolutePath());
			System.out.println(" ");*/

			if(filesList[i].isDirectory()){

				String path=filesList[i].getAbsolutePath();
				File directoryPath1=new File(path);
				File filesList1[] = directoryPath1.listFiles();

				for(File file1 :filesList1){
					/*System.out.println("File name: "+file1.getName());
					System.out.println("File path: "+file1.getAbsolutePath());
					System.out.println(" ");*/
					
					String fileName = file1.toString();

					String targetFolderImages="C:\\Users\\hishm\\Desktop\\ALL items\\Images";
					String targetFolderVideos="C:\\Users\\hishm\\Desktop\\ALL items\\Videos";
					String targetFolderAudio="C:\\Users\\hishm\\Desktop\\ALL items\\Audio";
					String targetFolderDocument="C:\\Users\\hishm\\Desktop\\ALL items\\Document";
					String targetFolderMalissius="C:\\Users\\hishm\\Desktop\\ALL items\\Malesius";
					
					
					int index = fileName.lastIndexOf('.');
					if(index>0) {
						String extension = fileName.substring(index + 1);
						System.out.println("Extensions: "+ extension);
						if(extension.equals("PNG")||extension.equals("jpg")){
							Files.copy(file1.toPath(), (new File(targetFolderImages + "\\" + file1.getName())).toPath(),StandardCopyOption.REPLACE_EXISTING);
						}
						if(extension.equals("mp4")){
							Files.copy(file1.toPath(), (new File(targetFolderVideos + "\\" + file1.getName())).toPath(),StandardCopyOption.REPLACE_EXISTING);
						}
						if(extension.equals("mp3")){
							Files.copy(file1.toPath(), (new File(targetFolderAudio + "\\" + file1.getName())).toPath(),StandardCopyOption.REPLACE_EXISTING);
						}
						if(extension.equals("pdf")||extension.equals("docx")){
							Files.copy(file1.toPath(), (new File(targetFolderDocument + "\\" + file1.getName())).toPath(),StandardCopyOption.REPLACE_EXISTING);
						}else{
							Files.copy(file1.toPath(), (new File(targetFolderMalissius + "\\" + file1.getName())).toPath(),StandardCopyOption.REPLACE_EXISTING);
						}
						
					}
				}
			}	
		}
	}
}