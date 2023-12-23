package basicMath;

// 기초수학 - 조합
public class CombinationStudy {

    static int getCombination(int r, int n){
        int pResult = 1;
        for(int i = n; i >= n - r + 1; i--){
            pResult *= i;
        }

        int rResult = 1;
        for(int i = 1; i<=r; i++){
            rResult *= i;
        }

        return pResult / rResult;
    }

    public static void main(String[] args) {
        // 1. 조합
        System.out.println("== 조합 ==");
        // 서로 다른 4명 중 주번 2명 뽑는 경우의 수
        int n = 4;
        int r = 2;

        int pResult = 1;
        for(int i = n; i >= n - r + 1; i--){
            pResult *= i;
        }

        int rResult = 1;
        for(int i = 1; i<=r; i++){
            rResult *= i;
        }
        System.out.println("결과 : " + pResult / rResult);

        // 2. 중복 조합
        System.out.println("== 중복 조합 ==");
        // 후보 2명, 유권자 3명일 때 무기명 투표 경우의 수
        n = 2;
        r = 3;

        System.out.println("결과 : " +getCombination(n + r - 1, r));

    }
}
