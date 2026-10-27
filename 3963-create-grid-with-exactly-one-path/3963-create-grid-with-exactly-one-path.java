class Solution {
    public String[] createGrid(int m, int n) {

        char [][] array = new char[m][n];
        String []arr=new String[m];

        for(int i=0 ; i<n ; i++){
            array[0][i]='.';
        }
        for(int i=0 ; i<m ;i++){
            array[i][n-1]='.';
        }

        for(int i=0 ; i<m ;  i++){
            String s="";

            for(int j=0 ; j<n ; j++){
                if(array[i][j]=='.'){
                    s=s+".";
                }
                else{
                    s+="#";
                }
            }
            arr[i]=s;
        }

        return arr;
    }
}