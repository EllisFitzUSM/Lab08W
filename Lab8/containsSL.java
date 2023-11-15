package Lab8;

public class containsSL extends SkipList{
    
    public containsSL() {
        super();
    }
    

    @Override
    public void insert(Comparable value) {
        // TODO Auto-generated method stub
    }

    /**
     * Author - James Libby
     * @param value
     * @return true or false
     */
    public boolean contains(Comparable value) {
        SkipListNode localHead = this.header;
        Object nodeValue;
        Comparable prev = (Comparable) localHead.value;
        SkipListNode extra = localHead;
        int level = 3;
        boolean check = false;
        for(;;) {
            nodeValue = localHead.value;
            if(prev.compareTo(value) < 0) {
                localHead = extra;
            }
            if(nodeValue.equals(value)) {
                return true;
            }
            Comparable next = (Comparable) localHead.forward[level];
            if(prev.compareTo(nodeValue) < 0 && ((Comparable) localHead.forward[level].value).compareTo(nodeValue) > 0) {
                if(level == 1) {
                    return false;
                }
                else {
                    level--;
                    extra = localHead;
                }
            }
            prev = (Comparable) localHead;
            localHead = localHead.forward[level];
        }
    }

    @Override
    public boolean delete(Comparable value) {
        // TODO Auto-generated method stub
        return false;
    }

}
