package huawei_jishi;

import java.util.Scanner;

class treeNote {
    private int data;
    private treeNote father, son;

    public treeNote() {
//        this (null) ;
    }

    public treeNote(int data, treeNote father, treeNote son) {
        this.data = data;
        this.father = father;
        this.son = son;
    }

    public int getData() {
        return data;
    }

    public treeNote getFather() {
        return father;
    }

    public treeNote getSon() {
        return son;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setFather(treeNote father) {
        this.father = father;
    }

    public void setSon(treeNote son) {
        this.son = son;
    }
}

public class tree {
    private treeNote root;

    public tree() {
        this.root = root;
    }

    public tree(treeNote root) {
        this.root = root;
    }

    public void createtree(Scanner in,treeNote father,treeNote son){
        treeNote note = new treeNote(in.nextInt(),father,son);
        createtree(in,father,note);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int jumpnum = in.nextInt();
        if (jumpnum <= 0 || jumpnum >= 10) System.exit(0);
        int cost[] = new int[jumpnum];
        for (int i = 0; i < jumpnum; i++) {
            int costs = in.nextInt();
            if (costs > 0 && costs < 10000)
                cost[i] = costs;
            else
                System.exit(0);
        }
        int Notenum = in.nextInt();
        int Sidenum = in.nextInt();
        int E = Sidenum * 2;
        if ((Notenum <= 0 || Notenum > 10000) && (Sidenum < 0 || Sidenum >= Notenum - 1))
            System.exit(0);
        for (int j = 0; j < E; j++) {
//            createtree(in,null,null);
        }
    }
}
