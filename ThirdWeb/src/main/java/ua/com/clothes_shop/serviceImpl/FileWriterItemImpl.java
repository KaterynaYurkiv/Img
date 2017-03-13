package ua.com.clothes_shop.serviceImpl;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ua.com.clothes_shop.service.FileWriterItem;

@Service
public class FileWriterItemImpl implements FileWriterItem{
	
	@Override
	public boolean write(Folder folder, MultipartFile file, int id) {
		if(file!=null&&!file.isEmpty()){
			File pathToHome = new File(System.getProperty("catalina.home"));
			// пишемо File.separator, а не просто слеш бо в віндовсі бекслеш, а в браузері слеш в іншу сторону
			File pathToFolder = new File(pathToHome, "images" + File.separator + folder.name().toLowerCase());
			//тепер перевіряємо чи вказана вище директорія існує, якщо ні - створюєм автоматично за допомогою mkdirs у зворотньому порядку
			if(!pathToFolder.exists()){
				pathToFolder.mkdirs();
			}
			//до об'єкта ентіті в БД картинка буде прив'язана за id 
			try {
				InputStream in = new ByteArrayInputStream(file.getBytes());
				BufferedImage image = ImageIO.read(in);
				File pathToFile = new File(pathToFolder, String.valueOf(id)+".jpg");
				ImageIO.write(image, "jpg", pathToFile);
				return true;
			} catch (IOException e) {}
		}
		return false;
	}

}

