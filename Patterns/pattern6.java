public class pattern6 {
    public static void main(String[] args) {
        int row = 5,col = 9;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(j>=row+1-i && j<=row+i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
