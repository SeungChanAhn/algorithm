package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FindQuietplace {

	public static void getCoordinate() {
		Scanner scanner = new Scanner(System.in);
		int constructionSiteX = scanner.nextInt(); // 공사현장의 x좌표
		int constructionSiteY = scanner.nextInt(); // 공사현장의 y좌표
		int noiseLevel = scanner.nextInt(); // 공사장의 소음 크기
		int numberOfShades = scanner.nextInt(); // 나무 그늘의 수
		ArrayList<String> resultList = new ArrayList<String>();

		for (int index = 0; index < numberOfShades; index++) {
			int shadeX = scanner.nextInt(); // index번째 나무그늘의 x좌표
			int shadeY = scanner.nextInt(); // index번째 나무그늘의 y좌표
			int distance = (shadeX - constructionSiteX) ^ 2 + (shadeY - constructionSiteY) ^ 2;
			String result = "";
			
			if (distance >= (noiseLevel ^ 2)) {
				result = "silent";
			} else {
				result = "noisy";
			}
			resultList.add(result);
		}
		
		for (int index = 0; index < numberOfShades; index++) {
			System.out.println(resultList.get(index));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCoordinate();
	}
}
