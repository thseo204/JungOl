package q1840;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] cheese = new int[row][col];

        for(int i = 0; i < cheese.length; i++){
            for(int j = 0; j < cheese[i].length; j++){
                cheese[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();

        int maxLift = 0;
        int maxRight = 0;
        int maxUp = 0;
        int maxDown = 0;

        //치즈의 좌측
        for(int i = 0; i < cheese.length; i++){
            for(int j = 0; j < cheese[i].length; j++){
                if(cheese[i][j] == 0){
                    continue;
                }
                if(cheese[i][j] == 1){
//                    cheese[i][j] = 0;
                    maxLift = maxLift < j ? j : maxLift;
                    cheese[i][j] = 7;
                    break;
                }

            }
            System.out.println();
        }

        // 치즈의 우측
        for(int i = cheese.length - 1; i >= 0; i--){
            for(int j = cheese[i].length - 1; j >= 0; j--){
                if(cheese[i][j] == 0){
                    continue;
                }
                if(cheese[i][j] == 7){
                    break;
                }
                if(cheese[i][j] == 1){
                    maxRight = maxRight < j ? j : maxRight;
//                    cheese[i][j] = 0;
                    cheese[i][j] = 7;
                    break;
                }
            }
            System.out.println();
        }
        //치즈의 상단
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                if(cheese[j][i] == 0){
                    continue;
                }
                if(cheese[j][i] == 7){
                    break;
                }
                if(cheese[j][i] == 1){
                    maxUp = maxUp < j ? j : maxUp;
                    cheese[j][i] = 7;
//                    cheese[j][i] = 7;
                    break;
                }
            }
            System.out.println();
        }
        //치즈의 하단
        for(int i = col -1; i >= 0; i--){
            for(int j = row-1; j >= 0; j--){
                if(cheese[j][i] == 0){
                    continue;
                }
                if(cheese[j][i] == 7){
                    break;
                }
                if(cheese[j][i] == 1){
                    maxDown = maxDown < j ? j : maxDown;
                    cheese[j][i] = 7;
//                    cheese[j][i] = 7;
                    break;
                }
            }
            System.out.println();
        }

        // 좌측 상단 함께 비교
        for(int i = 0; i < maxRight; i++){
            for(int j = 0; j < maxUp; j++){
                if(cheese[j][i] == 0){
                    if(cheese[j][i+1] == 1){
                        cheese[j][i+1] = 7;
                        break;
                    }
                    continue;
                }
                if(cheese[j][i] == 7){
                    continue;
                }
            }
        }

        // 우측 하단
        for(int i = cheese.length - 1; i > maxLift; i--){
            for(int j = cheese[i].length - 1; j > maxDown; j--){
                if(cheese[j][i] == 0){
                    if(cheese[j][i-1] == 1){
                        cheese[j][i-1] = 7;
                        break;
                    }
                    continue;
                }
                if(cheese[j][i] == 7){
                    continue;
                }
            }
        }

        // 현재 치즈 모양 출력 test
        for(int i = 0; i < cheese.length; i++){
            for(int j = 0; j < cheese[i].length; j++){
                System.out.print(cheese[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        // 공기가 닿은 부분 녹여서 0으로
        for(int i = 0; i < cheese.length; i++){
            for(int j = 0; j < cheese[i].length; j++){
                if(cheese[i][j] == 7){
                    cheese[i][j] = 0;
                }
                System.out.print(cheese[i][j] + " ");
            }
            System.out.println();
        }

        // ---------------------------------------------------
        maxLift = 0;
        maxRight = 0;
        maxUp = 0;
        maxDown = 0;

        //치즈의 좌측
        for(int i = 0; i < cheese.length; i++){
            for(int j = 0; j < cheese[i].length; j++){
                if(cheese[i][j] == 0){
                    continue;
                }
                if(cheese[i][j] == 1){
//                    cheese[i][j] = 0;
                    maxLift = maxLift < j ? j : maxLift;
                    cheese[i][j] = 7;
                    break;
                }

            }
            System.out.println();
        }

        // 치즈의 우측
        for(int i = cheese.length - 1; i >= 0; i--){
            for(int j = cheese[i].length - 1; j >= 0; j--){
                if(cheese[i][j] == 0){
                    continue;
                }
                if(cheese[i][j] == 7){
                    break;
                }
                if(cheese[i][j] == 1){
                    maxRight = maxRight < j ? j : maxRight;
//                    cheese[i][j] = 0;
                    cheese[i][j] = 7;
                    break;
                }
            }
            System.out.println();
        }
        //치즈의 상단
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                if(cheese[j][i] == 0){
                    continue;
                }
                if(cheese[j][i] == 7){
                    break;
                }
                if(cheese[j][i] == 1){
                    maxUp = maxUp < j ? j : maxUp;
                    cheese[j][i] = 7;
//                    cheese[j][i] = 7;
                    break;
                }
            }
            System.out.println();
        }
        //치즈의 하단
        for(int i = col -1; i >= 0; i--){
            for(int j = row-1; j >= 0; j--){
                if(cheese[j][i] == 0){
                    continue;
                }
                if(cheese[j][i] == 7){
                    break;
                }
                if(cheese[j][i] == 1){
                    maxDown = maxDown < j ? j : maxDown;
                    cheese[j][i] = 7;
//                    cheese[j][i] = 7;
                    break;
                }
            }
            System.out.println();
        }

        // 좌측 상단 함께 비교
        for(int i = 0; i < maxUp; i++){
            for(int j = 0; j < maxLift; j++){
                if(cheese[j][i] == 0){
                    if(cheese[j][i+1] == 1){
                        cheese[j][i+1] = 7;
                        break;
                    }
                    if(cheese[j+1][i] == 1){
                        cheese[j+1][i] = 7;
                        break;
                    }
                    continue;
                }
                if(cheese[j][i] == 7){
                    continue;
                }
            }
        }

//        // 우측 하단
//        for(int i = cheese.length - 1; i > maxLift; i--){
//            for(int j = cheese[i].length - 1; j > maxDown; j--){
//                if(cheese[j][i] == 0){
//                    if(cheese[j][i-1] == 1){
//                        cheese[j][i-1] = 7;
//                        break;
//                    }
//                    continue;
//                }
//                if(cheese[j][i] == 7){
//                    continue;
//                }
//            }
//        }

        // 현재 치즈 모양 출력 test
        for(int i = 0; i < cheese.length; i++){
            for(int j = 0; j < cheese[i].length; j++){
                System.out.print(cheese[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        // 공기가 닿은 부분 녹여서 0으로
        for(int i = 0; i < cheese.length; i++){
            for(int j = 0; j < cheese[i].length; j++){
                if(cheese[i][j] == 7){
                    cheese[i][j] = 0;
                }
                System.out.print(cheese[i][j] + " ");
            }
            System.out.println();
        }
    }
}
