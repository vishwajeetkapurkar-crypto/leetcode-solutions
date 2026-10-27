class Solution {
    public String[] createGrid(int m, int n) {

        String []array=new String[m];
        StringBuilder builder = new StringBuilder("");
        StringBuilder builder1 = new StringBuilder("");

        for(int i=0 ; i<n-1 ;  i++){
            builder1.append("#");
        }

        for(int i=0 ; i<n-1 ;  i++){
            builder.append(".");
        }

        StringBuilder builder2 = new StringBuilder("");
        StringBuilder builder3 = new StringBuilder("");

        builder2=builder;
        builder3=builder1;

        builder2=builder2.append(".");
        builder3=builder3.append(".");

        array[0]=builder2.toString(); 

        for(int i=1 ; i<array.length ; i++){
           array[i]=builder3.toString(); 
        }


        return array;
    }
}