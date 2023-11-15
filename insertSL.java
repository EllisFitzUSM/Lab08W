import java.util.Random;

public class insertSL extends SkipList {
    
    static final double LOG2 = Math.log(2.0);
    static final int maxCap = 10;
    
    /**
     * getRandomLevel - Returns a random level in an integer for a new
     * @author Ellis Fitzgerald
     * @return Random level int
     */
    private int getRandomLevel() {
        return new Random().nextInt(MAX_LEVEL);
    }
    
    /**
     * Hypothetical thought process for insert (not finished and purely
     * @param value
     */
//    public void insert(Comparable value) {
//        SkipListNode<Comparable>[] current = header.forward;
//        SkipListNode<Comparable>[] predeccessors = new SkipListNode<Comparable>[MAX_LEVEL];
//        int currentLevel = MAX_LEVEL;
//        while(true) {
//            predeccessors[currentLevel] = current;
//            current = current.forward;
//            while(current[currentLevel] != null) {
//                if(currentLevel != 1) {
//                    int compResult = current.value.compare(value);
//                    if(compResult == 0) {
//                        return;
//                    }
//                    else if(compResult > 0) {
//                        current = current.forward[currentLevel];
//                    }
//                    else {
//                        current = current.forward[--currentLevel];
//                    }
//                }
//                else {
//                    SkipListNode<Comparable> insertedNode = new SkipListNode<Comparable>(value, getRandomLevel());
//                    for(SkipListNode p : predeccessors) {
//                        p.forward = insertedNode;
//                    }
//                }
//            }
//        }
//    }

}
