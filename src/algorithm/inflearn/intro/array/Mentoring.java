package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-12. 멘토링
public class Mentoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 시험 수
        int[][] arr = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0;

        for(int i=1; i<=n; i++){ // 인원 수
            for(int j=1; j<=n; j++){
                int cnt = 0;
                for(int k=0; k<m; k++){ // 시험 수
                    int pi=0, pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
