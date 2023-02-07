public class Test2 {
    
    public void m2(){
        Test3 t3 = new Test3();
        
        int a [][] = new int[10][10];

        for(int i = 2; i <= 9 ; i++){
            System.out.println("**"+i+"단**");
            for(int j = 1; j <= 9 ; j++){
                
                a[i][j] = t3.m3(i, j);
                System.out.print(i+"*"+j+"="+a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
