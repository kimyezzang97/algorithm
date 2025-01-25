package hhplus;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요리 제목을 입력해주세요.");
        String title = sc.nextLine();

        System.out.println("요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해주세요.");
        float score = sc.nextFloat();
        sc.nextLine();

        System.out.println("요리 레시피를 한 문장씩 10문장을 입력해주세요.");
        ArrayList<String> list = new ArrayList();
        for(int i = 0; i < 10; i++){
            list.add(sc.nextLine());
        }

        System.out.println("[ " + title + " ]");
        System.out.println("별점 : " + (int) score + "("+ ((int)score / 5.0) * 100 + "%)");
        System.out.println();

        for(int i = 0; i < 10; i++){
            System.out.println((i+1) + ". " + list.get(i));
        }
    }
}

/**
 * 백종원 돼지고기 김치찌개 만들기
 * 4.5
 * 돼지고기는 핏물을 빼주세요.
 * 잘익은 김치 한포기를 꺼내서 잘라주세요.
 * 냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.
 * 다진마늘 한스푼, 설탕 한스푼 넣어주세요.
 * 종이컵으로 물 8컵 부어서 센불에 끓여주세요.
 * 핏물 뺀 돼지고기를 넣어주세요.
 * 된장 반스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.
 * 간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼반 넣어주세요.
 * 중불로 줄여서 오래 끓여주세요~!!
 * 마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^
 */