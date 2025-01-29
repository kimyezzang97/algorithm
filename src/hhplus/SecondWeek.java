package hhplus;

import java.util.*;

public class SecondWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 자료구조명 대문자 적용 [SET, MAP, LIST]
        System.out.println("저장할 자료명을 입력해주세요.");

        String dataStructure = sc.nextLine();
        dataStructure = dataStructure.toUpperCase();

        // 요리 제목
        System.out.println("요리 제목을 입력해주세요.");
        String title = sc.nextLine();

        // 요리 레시피
        System.out.println("요리 레시피를 한 문장씩 입력해주세요.");
        System.out.println("입력을 마쳤으면 마지막에 “끝” 문자를 입력해주세요.");

        if(dataStructure.equals("SET")){
            LinkedHashSet<String> set = new LinkedHashSet<>(); // 입력 순서대로 저장해줌

            while(true){
                String text = sc.nextLine();
                if(text.equals("끝")) break;
                set.add(text);
            }
            System.out.println("[ " + dataStructure + "(으)로 저장된 " + title + " ]");

            Iterator<String> iterator = set.iterator();
            for (int i = 1; i <= set.size(); i++) {
                System.out.println(i + ". " + iterator.next());
            }

        } else if (dataStructure.equals("MAP")) {
            Map<Integer, String> map = new LinkedHashMap<>();

            int cnt = 1;
            while(true){
                String text = sc.nextLine();
                if(text.equals("끝")) break;
                map.put(cnt, text);
                cnt++;
            }

            System.out.println("[ " + dataStructure + "(으)로 저장된 " + title + " ]");
            for(int i=1; i<=map.size(); i++){
                System.out.println(i + ". " + map.get(i));
            }

        } else if (dataStructure.equals("LIST")) {
            List<String> list = new ArrayList<>();

            while(true){
                String text = sc.nextLine();
                if(text.equals("끝")) break;
                list.add(text);
            }

            System.out.println("[ " + dataStructure + "(으)로 저장된 " + title + " ]");
            for(int i = 0; i < list.size(); i++){
                System.out.println((i+1) + ". " + list.get(i));
            }

        } else {
            System.out.println("=== 그런 자료구조는 사용하지 않습니다. ===");
        }

    }

}

/**
 * Set
 * 백종원 돼지고기 김치찌개 만들기
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
 * 끝
 */