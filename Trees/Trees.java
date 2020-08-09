/*Arkanabytes*/

    public static GTreeIF<Integer> imparDel (GTreeIF<Integer> gTree){
        for (int n=1; n<=gTree.getNumChildren (); n++){
            if(gTree.getChild(n).getRoot()%2 ==1){
                gTree.removeChild (n);;
            }
            imparDel (gTree.getChild (n));
        }
        return gTree;
    }
