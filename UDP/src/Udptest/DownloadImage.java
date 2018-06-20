package Udptest;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String website = "https://www.google.co.kr/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwi4s9zE_OHbAhULi7wKHf5cAtgQjRx6BAgBEAU&url=https%3A%2F%2Fokky.kr%2Farticle%2F430256&psig=AOvVaw0CnvEEPkBGBLftKTI5SrQF&ust=1529574861228763.jpg";
		System.out.println(""+website+"사이트에서 이미지를 다운로드합니다.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		
		try(InputStream in = url.openStream();
				OutputStream out = new FileOutputStream("test.jpg");){
				int length = 0;
				while((length = in.read(buffer))!= -1){
					System.out.println(""+length+"바이트 만큼 읽었음!");
					out.write(buffer, 0, length);
				}
				in.close();
				out.close();
		}
		catch(Exception e){
			System.out.println("예외:" + e.getMessage());
		}

	}

}
