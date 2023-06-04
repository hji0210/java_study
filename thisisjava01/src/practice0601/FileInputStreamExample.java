package practice0601;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) {
        String filePath = "C:\\Users\\한지인\\Downloads\\hanjiin.txt";

        // 파일 쓰기 코드
        String content = "안녕하세요\n한지인입니다.";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] contentBytes = content.getBytes();
            fos.write(contentBytes);
            System.out.println("파일에 쓰기가 완료되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 파일 읽기 코드 (동일한 부분 유지)
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
