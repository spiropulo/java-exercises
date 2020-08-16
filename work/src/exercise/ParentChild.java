package exercise;

class ParentChild{
    public ParentChild(int parent, int child){
        this.parent = parent;
        this.child = child;
    }
    int parent;
    int child;
    public int getParent(){
        return this.parent;
    }

    public int getChild() {
        return child;
    }
}
