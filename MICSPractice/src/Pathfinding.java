public class Pathfinding {

    public static void main(String[] args) {
        System.out.println(GetPaths(3));
    }

    public static int GetPaths(int blocks){
        return GetPathsRec(blocks);
    }

    public static int GetPathsRec(int size){
        //Determines if next positions would be valid
       int length = 0;
       int nextlength = 1;
       int height = 0;
       int nextheight = 1;
       int Paths;

       if(Math.sqrt(nextlength) % 1 == 0 && Math.sqrt(nextheight) % 1 == 0 && Math.sqrt(nextheight + nextlength) % 1 == 0){
            return 0;
       }
       else if(nextlength > size || nextheight > size){
           return 0;
       }
       else{
           GetPathsRec(length, nextheight);
           GetPathsRec(nextlength, height);
       }

       return Paths + 1;
    }

}
