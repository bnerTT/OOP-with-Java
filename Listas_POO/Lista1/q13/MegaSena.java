class MegaSena{
    public static void main(String[] args){
        for(int i = 1; i <= 60; i++){
            System.out.printf("| %d |", i);
            if(i%6 == 0)
                System.out.print("\n");
            else
                System.out.print("\t");
        }
    }

}
