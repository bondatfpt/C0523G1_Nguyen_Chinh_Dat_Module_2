package giaithuat;

public class giaithuat1 {
    public static void main(String[] args) {
        int row = 9;
        int col = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == 4 && i == 0 || j == 5 && i == 0){
                    System.out.print(i+1);
                }

               else if (j==3 && i == 1|| j == 6 && i == 1){
                    System.out.print(i+1);
                }

                else if (j==2 && i== 2 || j==7 && i==2){
                    System.out.print(i+1);
                }

                else if (j==1 && i == 3 || j==8 && i == 3){
                    System.out.print(i+1);
                }

                else if (j == 0 && i == 4 || j == 9 && i == 4){
                    System.out.print(i+1);
                }

                else if (j == 1 && i == 5 || j==8 && i==5){
                    System.out.print(i-1);
                }

                else if(j == 2 && i == 6 || j ==7 && i == 6){
                    System.out.print(i-3);
                }

                else if (j==3 && i == 7 || j ==6 && i == 7){
                    System.out.print(i-5);
                }

                else if(j==4 && i==8 || j==5 && i ==8){
                    System.out.print(i-7);
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }
}

