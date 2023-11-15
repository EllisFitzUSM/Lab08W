package lab8;

public class InsertSL extends SkipList{

    @Override
    public void insert(Comparable value) {
        /**
         * Search on MAX_LEVEL for current node =< value
         * as long as currentnode.forward =< value do MAX_level - 1
         * when on lowest level you run getRandomLevel
         * fix links of predecessor and sucessor for each level called on getRandomLevel
         * 
         */


        
        
    }

    @Override
    public boolean contains(Comparable value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(Comparable value) {
        // TODO Auto-generated method stub
        return false;
    }

}
