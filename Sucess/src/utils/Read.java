/**  
* <p>Title: Read.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author Cyc 
* @date 2020年10月9日  
* @version 1.0  

*/
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 * <p>
 * Title: Read
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author Cyc
 * @date 2020年10月9日
 */
public class Read {

	/**
	 * 传入txt路径读取txt文件
	 * 
	 * @param txtPath
	 * @return 返回读取到的内容
	 */
	public static String readTxt(String txtPath) {
		File file = new File(txtPath);
		if (file.isFile() && file.exists()) {
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

				StringBuffer sb = new StringBuffer();
				String text = null;
				while ((text = bufferedReader.readLine()) != null) {
					sb.append(text);
				}
				return sb.toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 使用FileOutputStream来写入txt文件
	 * 
	 * @param txtPath
	 *            txt文件路径
	 * @param content
	 *            需要写入的文本
	 */
	public static void writeTxt(String txtPath, String content) {
		FileOutputStream fileOutputStream = null;
		File file = new File(txtPath);
		try {
			if (file.exists()) {
				file.createNewFile();
			}
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(content.getBytes());
			fileOutputStream.flush();
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
