package huawei_jishi;

//        在一个设计良好的分层软件系统内，各服务或模块之间的依赖关系应该是一个树状结构,
//        上层模块依赖下层模块，下层模块不应依赖上层模块。
//        但随着开发的进行，系统功能越来越多，模块间的依赖关系也可能出现混乱，
//        甚至出现循环依赖，此外，随着开发的进行，系统中也可能出现无用模块，
//        即该模块既不依赖其他模块，也不被其他模块所使用。
//
//        现给定系统内两两模块之间的依赖关系，请给这个系统评分，评分规则如下：
//        满分为10分
//        若系统内存在循环依赖（无论有几个依赖环），则扣2分
//        若系统内存在无用模块，则每个无用模块扣1分
//        扣至0分为止，即最低分为0分

import java.util.*;

public class modle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int all, b, k = 0, a = 10, c = 0;
        all = in.nextInt();
        b = in.nextInt();
        c = 2 * b;
        ArrayList<Integer> modle = new ArrayList<Integer>();     //总数列
        ArrayList<Integer> modle1 = new ArrayList<Integer>();    //偶数列
        ArrayList<Integer> modle2 = new ArrayList<Integer>();    //奇数列
        for (int i = 0; i < c; i++) {
            int n = in.nextInt();
            modle.add(n);
            if (i % 2 == 0) {
                modle1.add(n);
            } else {
                modle2.add(n);
            }
        }
        Collections.sort(modle, Collections.reverseOrder());   //将数列有大到小排序，由小到大则这样写：Collections.sort(modle)
        k = all - 1 - modle.get(0);
        a = a - k;
        //aslist()函数将数列集合化，containsAll()函数对比A是否是B的子集
        if (Arrays.asList(modle1).containsAll(Arrays.asList(modle2)) || modle2.containsAll(modle1)) {   //判断奇数的集合和偶数的集合是否互为子集，如果互为子集则有依赖循环
            a = a - 2;
        }
        if (a < 0) {
            System.out.println(0);
        } else
            System.out.println(a);
    }
}
